package com.coin58.api.swaps.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lhc
 * @version 1.0
 * @description
 * @modify
 */
@Data
public class OrderListResponse {
    private Long id;
    private Long userId;
    private Long contractId;
    private String contractName;
    private Integer priceType;
    private Integer side;
    private BigDecimal hold;
    private BigDecimal leverage;
    private BigDecimal price;
    private Integer size;
    private Integer executedSize;
    private Integer status;
    private Integer liquidation;
    private Integer close;
    private BigDecimal askPrice;
    private BigDecimal bidPrice;
    private BigDecimal indexPrice;
    private long createdDate;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ",userId=" + userId +
                ",contractId=" + contractId +
                ",contractName=" + contractName +
                ",priceType=" + priceType +
                ",side=" + side +
                ",hold=" + hold +
                ",leverage=" + leverage +
                ",price=" + price +
                ",size=" + size +
                "executedSize=" + executedSize +
                ",status=" + status +
                ",liquidation=" + liquidation +
                ",close=" + close +
                ",askPrice=" + askPrice +
                ",bidPrice=" + bidPrice +
                ",indexPrice=" + indexPrice +
                ",createdDate=" + createdDate +
                "}";
    }
}