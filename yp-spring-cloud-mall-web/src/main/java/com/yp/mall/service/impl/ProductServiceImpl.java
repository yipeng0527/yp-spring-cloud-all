package com.yp.mall.service.impl;

import com.yp.common.bean.product.vo.Product;
import com.yp.mall.sao.ProductSao;
import com.yp.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: ProductServiceImpl.java, v 0.1 2019/9/10 13:55 ex-yipeng Exp $
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductSao productSao;

    @Override
    public List<Product> findAll() {
        return productSao.findAll();
    }

    @Override
    public Product loadByItemCode(String itemCode) {
        return productSao.loadByItemCode(itemCode);
    }
}
