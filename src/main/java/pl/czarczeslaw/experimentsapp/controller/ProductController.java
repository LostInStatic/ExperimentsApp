package pl.czarczeslaw.experimentsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.czarczeslaw.experimentsapp.model.Product;
import pl.czarczeslaw.experimentsapp.model.dto.CreateProductDto;
import pl.czarczeslaw.experimentsapp.model.dto.UpdateProductDto;
import pl.czarczeslaw.experimentsapp.service.ProductService;
import pl.czarczeslaw.experimentsapp.service.TrialService;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping(path = "/product")
@Validated
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
    public Product getById(@PathVariable("id")@Min(1) Long id) {
        return productService.getById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@Valid @RequestBody CreateProductDto dto) {
        productService.save(dto);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public Product updateProduct(@Valid @RequestBody UpdateProductDto dto) {
        return productService.update(dto);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduct(@PathVariable("id")@Min(1) Long id) {
        productService.delete(id);
    }
}
