package com.coin58.api.swaps.client.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author guozhengMu
 * @version 1.0
 * @description
 * @modify
 */
@Data
public class FillListResponse {
    private Long id;
    private Long orderId;
    private Long userId;
    private Long targetOrderId;
    private Long contractId;
    private BigDecimal price;
    private BigDecimal size;
    private Integer side;
    private Integer type;
    private Integer liquidity;
    private String fee;
    private String profit;
    private Date createdDate;

    @Override
    public String toString() {
        return "OrderFill{" +
                "id=" + id +
                ",orderId=" + orderId +
                ",userId=" + userId +
                ",contractId=" + contractId +
                ",targetOrderId=" + targetOrderId +
                ",type=" + type +
                ",side=" + side +
                ",price=" + price +
                ",size=" + size +
                "fee=" + fee +
                ",profit=" + profit +
                ",liquidity=" + liquidity +
                ",createdDate=" + createdDate +
                "}";
    }
}
