package com.yp.product.dao;

import com.yp.vo.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductDao {

    /**
     * 查询所有产品
     * @return
     */
    List<Product> queryAll();

    /**
     * 根据产品编码查询产品信息
     * @param itemCode
     * @return
     */
    Product getProductDetail(String itemCode);
}
