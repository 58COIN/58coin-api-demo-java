package com.coin58.api.future.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/18 17:04
 * @description
 * @modify
 */
@Data
public class AssetsResponse {
    private Long id;
    private Long userId;
    private String currencyName;
    private BigDecimal available;
    private BigDecimal hold;
    private Integer status;

    @Override
    public String toString() {
        return "Assets{" +
                "id=" + id +
                ",userId=" + userId +
                ",currencyName=" + currencyName +
                ",available=" + available +
                ",hold=" + hold +
                ",status=" + status +
                "}";
    }
}
