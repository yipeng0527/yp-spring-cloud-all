package com.yp.mall.sao;

import com.yp.common.bean.common.vo.BusinessResponse;
import com.yp.common.bean.product.vo.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: ProductSaoFallback.java, v 0.1 2019/9/24 13:46 ex-yipeng Exp $
 */
@Component
public class ProductSaoFallback implements ProductSao{
    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Product loadByItemCode(String itemCode) {
        return new Product("error", "未知", "TwoStepsFromJava-Fallback", new BigDecimal("0"));
    }

    @Override
    public BusinessResponse saveProduct(Product product) {
        return BusinessResponse.fail("system error fall back ...");
    }
}
