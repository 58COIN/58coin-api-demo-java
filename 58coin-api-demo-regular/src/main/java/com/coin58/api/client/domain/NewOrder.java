package com.coin58.api.client.domain;

import com.coin58.api.client.domain.enums.CloseTypeEnum;
import com.coin58.api.client.domain.enums.OrderTypeEnum;
import com.coin58.api.client.domain.enums.SideEnum;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class NewOrder {

    private long contractId;
    private OrderTypeEnum orderType;
    private SideEnum side;
    private Integer leverage;
    private int size;
    private BigDecimal price;
    private CloseTypeEnum closeType;
}