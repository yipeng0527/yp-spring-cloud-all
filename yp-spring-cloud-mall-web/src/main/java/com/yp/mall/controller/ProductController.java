package com.yp.mall.controller;

import com.yp.common.bean.common.vo.BusinessResponse;
import com.yp.common.bean.product.vo.Product;
import com.yp.mall.service.ProductService;
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
public class ProductController {

    private final static Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> list() {
        return this.productService.findAll();
    }

    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public Product detail(@PathVariable String itemCode) {
        return this.productService.loadByItemCode(itemCode);
    }

    @RequestMapping(value = "/saveProduct" ,method = RequestMethod.POST)
    public BusinessResponse saveProduct(@RequestBody Product product){
        log.info("saveProduct param:{}",product);
        return this.productService.saveProduct(product);
    }
}
