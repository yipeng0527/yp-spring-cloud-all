package com.yp.product.service.impl;

import com.yp.product.service.ProductService;
import com.yp.vo.Product;
import org.apache.commons.lang.StringUtils;
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
    @Override
    public List<Product> queryAll() {
        return this.buildProducts();
    }

    @Override
    public Product getProductDetail(String itemCode) {
        List<Product> detailList = this.buildProducts();
        if (CollectionUtils.isEmpty(detailList)) {
            return null;
        }
        for (Product product : detailList) {
            if (StringUtils.equals(product.getItemCode(), itemCode)) {
                return product;
            }
        }
        return null;
    }

    private List<Product> buildProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("item-1", "测试商品-1", "TwoStepsFromJava", 100));
        products.add(new Product("item-2", "测试商品-2", "TwoStepsFromJava", 200));
        products.add(new Product("item-3", "测试商品-3", "TwoStepsFromJava", 300));
        products.add(new Product("item-4", "测试商品-4", "TwoStepsFromJava", 400));
        products.add(new Product("item-5", "测试商品-5", "TwoStepsFromJava", 500));
        products.add(new Product("item-6", "测试商品-6", "TwoStepsFromJava", 600));
        return products;
    }
}
