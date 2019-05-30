package com.coin58.api.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/13 16:08
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
    private BigDecimal realised;
    private BigDecimal unRealised;
    private BigDecimal liquidationPrice;
    private BigDecimal balanceTransferMax;
    private long positionType;

    @Override
    public String toString() {
        return "AssetResponse{" +
                "userId=" + userId +
                ", current=" + current +
                ", balance=" + balance +
                ", positionFrozen=" + positionFrozen +
                ", orderFrozen=" + orderFrozen +
                ", realised=" + realised +
                ", unRealised=" + unRealised +
                ", liquidationPrice=" + liquidationPrice +
                ", balanceTransferMax=" + balanceTransferMax +
                ", positionType=" + positionType +
                '}';
    }
}
