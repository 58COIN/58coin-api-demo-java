package com.coin58.api.swaps.client.domain;

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
    private Long contractId;
    private BigDecimal walletBalance;
    private BigDecimal positionBalance;
    private BigDecimal availableBalance;
    private BigDecimal userRight;
    private BigDecimal positionRight;

    @Override
    public String toString() {
        return "AssetResponse{" +
                "userId=" + userId +
                ", contractId=" + contractId +
                ", walletBalance=" + walletBalance +
                ", positionBalance=" + positionBalance +
                ", availableBalance=" + availableBalance +
                ", userRight=" + userRight +
                ", positionRight=" + positionRight +
                '}';
    }
}
