package com.example.sweetcake.tools.service.admin;

import com.example.sweetcake.model.Product;
import com.example.sweetcake.model.ProductDetails;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> getListProduct(String maLoai1);
    List<Product> getListProduct(String maLoai1, String maLoai2);
    List<Product> getListProduct(String maLoai1, String maLoai2, String maLoai3);
    boolean addProduct(Product product, ProductDetails details);
    public boolean delete(String id);
    public boolean updateProduct(Product product);
    public Product getProductById(String id);
}
