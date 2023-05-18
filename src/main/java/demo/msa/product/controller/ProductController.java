package demo.msa.product.controller;

import demo.msa.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
  @Autowired
  private ProductService productService;

  @GetMapping("/")
  public String index() {
    return "hello index...";
  }
}
