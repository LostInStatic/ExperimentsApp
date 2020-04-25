package pl.czarczeslaw.experimentsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.czarczeslaw.experimentsapp.model.Product;
import pl.czarczeslaw.experimentsapp.model.dto.AddProductToTrailDto;
import pl.czarczeslaw.experimentsapp.model.dto.CreateProductDto;
import pl.czarczeslaw.experimentsapp.model.dto.UpdateProductDto;
import pl.czarczeslaw.experimentsapp.service.ProductService;
import pl.czarczeslaw.experimentsapp.service.TrialService;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {
    private final ProductService productService;
    private final TrialService trialService;

    @Autowired
    public ProductController(ProductService productService, TrialService trialService) {
        this.productService = productService;
        this.trialService = trialService;
    }

    @GetMapping("/get")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/get/{id}")
    public Product getById(@PathVariable("id") Long id) {
        return productService.getById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody CreateProductDto dto) {
        productService.save(dto);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public Product updateProduct(@RequestBody UpdateProductDto dto) {
        return productService.update(dto);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduct(@PathVariable("id") Long id) {
        productService.delete(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody AddProductToTrailDto dto) {
        trialService.addProductToTrail(dto);
    }
}
