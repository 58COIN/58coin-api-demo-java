package com.coin58.api.client.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/14 19:42
 * @description
 * @modify
 */
@Data
public class SettlementResponse {
    private Long seq;
    private String settlementDate;
    private Long contractId;
    private String contractName;
    private Integer settlementType;
    private BigDecimal settlementPrice;
    private BigDecimal overLoss;
    private BigDecimal insuranceFund;
    private BigDecimal shareRate;
    private Date createdDate;

    @Override
    public String toString() {
        return "Settlement{" +
                "seq=" + seq +
                ",settlementDate=" + settlementDate +
                ",contractId=" + contractId +
                ",contractName=" + contractName +
                ",settlementType=" + settlementType +
                ",settlementPrice=" + settlementPrice +
                ",overLoss=" + overLoss +
                ",insuranceFund=" + insuranceFund +
                ",shareRate=" + shareRate +
                ",createdDate=" + createdDate +
                "}";
    }
}
