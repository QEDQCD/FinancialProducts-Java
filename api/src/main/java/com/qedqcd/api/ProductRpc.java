package com.qedqcd.api;

import com.googlecode.jsonrpc4j.JsonRpcService;
import com.qedqcd.api.domain.ParamInf;
import com.qedqcd.api.domain.ProductRpcReq;
import com.qedqcd.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 产品相关的rpc服务
 */
@JsonRpcService
public interface ProductRpc {
    /**
     * 查询多个产品
     *
     * @param req
     * @return
     */
    List<Product> query(ParamInf req);

    /**
     * 查询单个产品
     *
     * @param id
     * @return
     */
    Product findOne(String id);
}
