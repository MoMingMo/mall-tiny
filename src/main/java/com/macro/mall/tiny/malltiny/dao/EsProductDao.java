package com.macro.mall.tiny.malltiny.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.macro.mall.tiny.malltiny.nosql.elasticsearch.document.EsProduct;

public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
