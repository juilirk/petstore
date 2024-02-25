package com.itvedant.petstore.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.itvedant.petstore.entities.Product;

//Service will work same as that of @Component annotation
@Service
public class ProductService {
    
    Map<Integer, Product> products = new HashMap<>();

    AtomicInteger atomic = new AtomicInteger();

    public Product addProduct(Product newProduct) {
        newProduct.setId(atomic.incrementAndGet());
        products.put(newProduct.getId(), newProduct);
        return products.get(newProduct.getId());
    }
    
    public List<Product> getAll() {
        return new ArrayList<Product>(products.values());
    }

    public String deleteProduct(Integer id){
        products.remove(id);
        return "Product Deleted";
    }

    public Product getProduct(Integer id){
        return products.get(id);
    }

    public Product updateProduct(Integer id, Product prod){
        prod.setId(id);
        products.put(id, prod);
        return products.get(id);
    }
}
