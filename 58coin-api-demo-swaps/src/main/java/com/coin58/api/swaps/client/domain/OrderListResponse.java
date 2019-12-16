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
    private Integer type;
    private Integer side;
    private BigDecimal price;
    private BigDecimal avgPrice;
    private Integer size;
    private Integer status;
    private Integer executedSize;
    private Integer close;
    private Integer liquidation;
    private long createdTime;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ",userId=" + userId +
                ",contractId=" + contractId +
                ",type=" + type +
                ",side=" + side +
                ",price=" + price +
                ",size=" + size +
                "executedSize=" + executedSize +
                ",status=" + status +
                ",liquidation=" + liquidation +
                ",close=" + close +
                ",avgPrice=" + avgPrice +
                ",createdTime=" + createdTime +
                "}";
    }
}