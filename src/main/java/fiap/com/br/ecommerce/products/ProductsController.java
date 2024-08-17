package fiap.com.br.ecommerce.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductsService service;

    @GetMapping
    public List<Products> findAll(){
        return service.findAll();
    }





}
