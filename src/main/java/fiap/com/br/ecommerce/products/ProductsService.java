package fiap.com.br.ecommerce.products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    ProductsRepository repository;

    public List<Products> findAll(){
        return repository.findAll();
    }

}
