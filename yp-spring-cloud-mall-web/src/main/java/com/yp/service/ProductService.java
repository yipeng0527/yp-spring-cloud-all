package com.yp.service;

import com.yp.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * Created by PP on 2019/9/8.
 */
@FeignClient("yp-spring-cloud-product-service")
public interface ProductService {

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    List<Product> findAll();

    @RequestMapping(value = "/product/{itemCode}", method = RequestMethod.GET)
    Product loadByItemCode(@PathVariable("itemCode") String itemCode);
}
