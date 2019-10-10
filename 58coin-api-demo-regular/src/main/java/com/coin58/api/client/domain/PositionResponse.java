package com.coin58.api.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/15 15:09
 * @description
 * @modify
 */
@Data
public class PositionResponse {
    private BigDecimal totalUnRealised;
    private BigDecimal totalPositionMargin;
    private Long id;
    private Long userId;
    private Long contractId;
    private BigDecimal leverage;
    private Integer positionType;
    private Integer side;
    private BigDecimal entryPrice;
    private BigDecimal liquidationPrice;
    private BigDecimal unRealised;
    private Integer positionQty;
    private Integer availablePositionQty;
    private BigDecimal positionMargin;
    private BigDecimal closeCommission;
    private BigDecimal bankruptPrice;
    private BigDecimal positionValue;
    private Integer planProfitQty;
    private Integer planLossQty;
    private BigDecimal profitRate;
    private Long createdDate;
    private Long modifyDate;

    @Override
    public String toString() {
        return "Position{" +
                "totalUnRealised=" + totalUnRealised +
                ",totalPositionMargin=" + totalPositionMargin +
                ",id=" + id +
                ",userId=" + userId +
                ",contractId=" + contractId +
                ",leverage=" + leverage +
                ",positionType=" + positionType +
                ",side=" + side +
                ",entryPrice=" + entryPrice +
                ",liquidationPrice=" + liquidationPrice +
                ",unRealised=" + unRealised +
                ",positionQty=" + positionQty +
                ",availablePositionQty=" + availablePositionQty +
                ",positionMargin=" + positionMargin +
                ",closeCommission=" + closeCommission +
                ",bankruptPrice=" + bankruptPrice +
                ",positionValue=" + positionValue +
                ",planProfitQty=" + planProfitQty +
                ",planLossQty=" + planLossQty +
                ",profitRate=" + profitRate +
                ",createdDate=" + createdDate +
                ",modifyDate=" + modifyDate +
                "}";
    }
}
