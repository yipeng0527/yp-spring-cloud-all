package com.yp.mall.sao;

import com.yp.common.bean.common.vo.BusinessResponse;
import com.yp.common.bean.product.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: ProductSao.java, v 0.1 2019/9/10 13:52 ex-yipeng Exp $
 */
@FeignClient(name = "yp-spring-cloud-product-service", fallback = ProductSaoFallback.class)
public interface ProductSao {

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    List<Product> findAll();

    @RequestMapping(value = "/product/{itemCode}", method = RequestMethod.GET)
    Product loadByItemCode(@PathVariable("itemCode") String itemCode);

    @PostMapping(value = "/product/saveProduct",produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    BusinessResponse saveProduct(@RequestBody Product product);
}
