package com.coin58.api.client.domain;

import lombok.Data;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/13 17:45
 * @description
 * @modify
 */
@Data
public class NewPlanOrder {
    private long contractId;
    private int side;
    private String triggerPrice;
    private int size;
    private int mode;
    private int type;
    private String price;
}
