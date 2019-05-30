package com.coin58.api.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/14 20:10
 * @description
 * @modify
 */
@Data
public class TickerResponse {
    private long id;
    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal last;
    private BigDecimal buy;
    private BigDecimal sell;
    private BigDecimal change;
    private BigDecimal volume;
    private BigDecimal amount;
    private long productId;
    private long time;
    private long createdDate;

    @Override
    public String toString() {
        return "TickerResponse{" +
                "id=" + id +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", last=" + last +
                ", buy=" + buy +
                ", sell=" + sell +
                ", change=" + change +
                ", volume=" + volume +
                ", amount=" + amount +
                ", productId=" + productId +
                ", time=" + time +
                ", createdDate=" + createdDate +
                '}';
    }
}
