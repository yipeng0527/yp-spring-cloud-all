package com.yp.product.service.impl;

import com.yp.product.dao.ProductDao;
import com.yp.product.service.ProductService;
import com.yp.vo.Product;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: ProductServiceImpl.java, v 0.1 2019/9/9 16:59 ex-yipeng Exp $
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> queryAll() {
        return this.productDao.queryAll();
    }

    @Override
    public Product getProductDetail(String itemCode) {
        return this.productDao.getProductDetail(itemCode);
    }
}
