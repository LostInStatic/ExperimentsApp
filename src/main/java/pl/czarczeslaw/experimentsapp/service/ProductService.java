package pl.czarczeslaw.experimentsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.czarczeslaw.experimentsapp.mapper.ProductMapper;
import pl.czarczeslaw.experimentsapp.model.Product;
import pl.czarczeslaw.experimentsapp.model.dto.CreateProductDto;
import pl.czarczeslaw.experimentsapp.model.dto.UpdateProductDto;
import pl.czarczeslaw.experimentsapp.repository.ProductRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getById(Long productId) {
        Optional<Product> optional = productRepository.findById(productId);
        if (optional.isPresent()) {
            return optional.get();
        }
        throw new EntityNotFoundException("student, id:" + productId);
    }

    public Long save(CreateProductDto dto) {
        Product product = productMapper.createProductFromDto(dto);
        return productRepository.save(product).getId();
    }

    public Product update(UpdateProductDto dto) {
        Optional<Product> optional = productRepository.findById(dto.getProductId());
        if (optional.isPresent()) {
            Product product = optional.get();

            if (dto.getName() != null) {
                product.setName(dto.getName());
            }
            if (dto.getRooms() != null) {
                product.setRooms(dto.getRooms());
            }
            return productRepository.save(product);
        } else {
            throw new EntityNotFoundException("trial, id:" + dto.getProductId());
        }
    }

    public void delete(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("trial, id:" + id);
        }
    }
}
