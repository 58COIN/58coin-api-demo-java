package com.coin58.api.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lhc
 * @version 1.0
 * @date 2019/9/23
 * @description
 */
@Data
public class FinishOrderResponse {
    private Long id;
    private Long userId;
    private Long contractId;
    private String contractName;
    private Integer priceType;
    private Integer side;
    private BigDecimal hold;
    private Integer leverage;
    private BigDecimal price;
    private Integer size;
    private BigDecimal avgPrice;
    private Integer executedSize;
    private Integer status;
    private Integer liquidation;
    private Integer close;
    private BigDecimal askPrice;
    private BigDecimal bidPrice;
    private BigDecimal indexPrice;
    private Long createdDate;

}
