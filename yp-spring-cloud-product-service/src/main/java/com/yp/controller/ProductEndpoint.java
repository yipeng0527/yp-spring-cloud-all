package com.yp.controller;

import com.yp.service.ProductService;
import com.yp.vo.Product;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
}
