package com.coin58.api.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/15 14:38
 * @description
 * @modify
 */
@Data
public class FillListResponse {
    private Long id;
    private Long orderId;
    private Long userId;
    private Long contractId;
    private String contractName;
    private Integer priceType;
    private Integer side;
    private BigDecimal price;
    private Integer size;
    private Integer close;
    private BigDecimal fee;
    private BigDecimal profitRate;
    private Integer liquidation;
    private Integer liquidity;
    private Long createdDate;

    @Override
    public String toString() {
        return "OrderFill{" +
                "id=" + id +
                ",orderId=" + orderId +
                ",userId=" + userId +
                ",contractId=" + contractId +
                ",contractName=" + contractName +
                ",priceType=" + priceType +
                ",side=" + side +
                ",price=" + price +
                ",size=" + size +
                ",close=" + close +
                "fee=" + fee +
                ",profitRate=" + profitRate +
                ",liquidation=" + liquidation +
                ",liquidity=" + liquidity +
                ",createdDate=" + createdDate +
                "}";
    }
}
