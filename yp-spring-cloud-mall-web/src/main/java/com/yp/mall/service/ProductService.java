package com.yp.mall.service;

import com.yp.common.bean.common.vo.BusinessResponse;
import com.yp.common.bean.product.vo.Product;

import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: ProductService.java, v 0.1 2019/9/10 13:54 ex-yipeng Exp $
 */
public interface ProductService {
    List<Product> findAll();

    Product loadByItemCode(String itemCode);

    BusinessResponse saveProduct(Product product);
}
