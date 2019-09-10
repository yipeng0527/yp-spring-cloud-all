package com.yp.mall.sao;

import com.yp.common.bean.product.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: ProductSao.java, v 0.1 2019/9/10 13:52 ex-yipeng Exp $
 */
@FeignClient("yp-spring-cloud-product-service")
public interface ProductSao {

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    List<Product> findAll();

    @RequestMapping(value = "/product/{itemCode}", method = RequestMethod.GET)
    Product loadByItemCode(@PathVariable("itemCode") String itemCode);
}
