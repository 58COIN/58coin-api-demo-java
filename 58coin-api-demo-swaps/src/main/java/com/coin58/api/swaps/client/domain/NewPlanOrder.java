package com.coin58.api.swaps.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author guozhengMu
 * @version 1.0
 * @description
 * @modify
 */
@Data
public class NewPlanOrder {
    private long contractId;
    private int side;
    private BigDecimal triggerPrice;
    private int size;
    private int mode;
//    private int type;
    private String price;
}
