package com.yp.product.service;

import com.yp.common.bean.common.vo.BusinessResponse;
import com.yp.common.bean.product.vo.Product;

import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: ProductService.java, v 0.1 2019/9/9 16:59 ex-yipeng Exp $
 */
public interface ProductService {
    /**
     * 查询所有产品信息
     * @return
     */
    List<Product> queryAll();

    /**
     * 通过产品编码得到产品详情
     * @param itemCode
     * @return
     */
    Product getProductDetail(String itemCode);

    /**
     * 新增产品类型
     * @param product
     * @return
     */
    BusinessResponse saveProduct(Product product);
}
