package com.yp.product.controller;

import com.yp.common.bean.common.vo.BusinessResponse;
import com.yp.common.bean.product.vo.Product;
import com.yp.product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by PP on 2019/9/8.
 */
@RestController
@RequestMapping("/product")
public class ProductEndpoint {

    private final static Logger log = LoggerFactory.getLogger(ProductEndpoint.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> list() {
        List<Product> productList = this.productService.queryAll();
        log.info("queryAll result:{}", productList);
        return productList;
    }

    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public Product detail(@PathVariable String itemCode) {
        log.info("detail itemCode:{}", itemCode);
        Product product = this.productService.getProductDetail(itemCode);
        return product;
    }

    @RequestMapping(value = "/saveProduct" ,method = RequestMethod.POST)
    public BusinessResponse saveProduct(@RequestBody Product product){
        log.info("saveProduct param:{}",product);
        return this.productService.saveProduct(product);
    }
}
