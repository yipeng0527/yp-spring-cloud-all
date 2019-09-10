package com.yp.product.service.impl;

import com.yp.common.bean.common.vo.BusinessResponse;
import com.yp.common.bean.product.vo.Product;
import com.yp.product.dao.ProductDao;
import com.yp.product.service.ProductService;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: ProductServiceImpl.java, v 0.1 2019/9/9 16:59 ex-yipeng Exp $
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final static Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
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

    @Override
    public BusinessResponse saveProduct(Product product) {
        log.info("saveProduct param:{}", product);
        try {
            if (null == product) {
                return BusinessResponse.fail(BusinessResponse.RESPONSE_PARA_ERROR, "param is null");
            }
            if (StringUtils.isAnyBlank(product.getItemCode(), product.getName(), product.getBandName()) || null == product.getPrice()) {
                return BusinessResponse.fail(BusinessResponse.RESPONSE_PARA_ERROR, "param validate error");
            }
            Product existProduct = this.productDao.getProductDetail(product.getItemCode());
            if (null != existProduct) {
                return BusinessResponse.ok(true);
            }
            Integer count = this.productDao.insertProduct(product);
            if (count > 0) {
                return BusinessResponse.ok(true);
            }
        } catch (Exception e) {
            log.error("saveProduct exception param:{}", product, e);
            return BusinessResponse.fail(BusinessResponse.RESPONSE_ERROR, "exception");
        }
        return BusinessResponse.fail(BusinessResponse.RESPONSE_ERROR, "save product fail");
    }
}
