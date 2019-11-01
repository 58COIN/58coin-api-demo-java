package com.coin58.api.swaps.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/18 16:37
 * @description
 * @modify
 */
@Data
public class PlanListResponse {
    private Long id;
    private Long userId;
    private Long contractId;
    private String contractName;
    private Integer priceType;
    private Integer side;
    private Integer mode;
    private Integer size;
    private BigDecimal triggerPrice;
    private BigDecimal price;
    private BigDecimal indexPrice;
    private Integer status;
    private Integer close;
    private Long createdDate;
    private Long modifyDate;

    @Override
    public String toString() {
        return "PlanOrder{" +
                "id=" + id +
                ",userId=" + userId +
                ",contractId=" + contractId +
                ",contractName=" + contractName +
                ",priceType=" + priceType +
                ",side=" + side +
                ",mode=" + mode +
                ",size=" + size +
                ",triggerPrice=" + triggerPrice +
                ",price=" + price +
                ",indexPrice=" + indexPrice +
                ",status=" + status +
                ",close=" + close +
                ",createdDate=" + createdDate +
                ",modifyDate=" + modifyDate +
                "}";
    }
}
