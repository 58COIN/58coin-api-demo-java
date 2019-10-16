package com.coin58.api.future.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lhc
 * @version 1.0
 * @description Account related - asset query - response entity
 * @modify
 */
@Data
public class AssetResponse {

    private long userId;
    private BigDecimal current;
    private BigDecimal balance;
    private BigDecimal positionFrozen;
    private BigDecimal orderFrozen;
    private BigDecimal unRealised;
    private BigDecimal risk;
    private BigDecimal positionValue;

    @Override
    public String toString() {
        return "AssetResponse{" +
                "userId=" + userId +
                ", current=" + current +
                ", balance=" + balance +
                ", positionFrozen=" + positionFrozen +
                ", orderFrozen=" + orderFrozen +
                ", unRealised=" + unRealised +
                ", risk=" + risk +
                ", positionValue=" + positionValue +
                '}';
    }
}
