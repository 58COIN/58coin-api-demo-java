package com.coin58.api.swaps.client.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description 币本位合约持仓信息
 * @ClassName PositionResponse
 * @Author gexinghua915@sina.com
 * @Tmie 2019-10-22 14:46
 * @Version 1.0
 */
@Data
public class PositionResponse {

    /**
     * id
     */
    private Long id;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 合约ID
     */
    private Long contractId;
    /**
     * 杠杆
     */
    private Integer leverage;
    /**
     * 仓位类型
     * 0:全仓 1:逐仓
     */
    private Integer positionType;
    /**
     * 仓位方向
     * 1:买 2:卖
     */
    private Integer side;
    /**
     * 开仓均价
     */
    private BigDecimal entryPrice;
    /**
     * 强平价格
     */
    private BigDecimal liquidationPrice;
    /**
     * 持仓数量
     */
    private Integer positionQty;
    /**
     * 净持仓数量
     */
    private Integer netPositionQty;
    /**
     * 仓位保证金
     */
    private BigDecimal positionMargin;
    /**
     * 平仓佣金
     */
    private BigDecimal closeCommission;
    /**
     * 破产价格
     */
    private BigDecimal bankruptPrice;
    /**
     * 创建时间
     */
    private Long createdDate;
    /**
     * 更新时间
     */
    private Long modifyDate;


    @Override
    public String toString() {
        return "Position{" +
                ",id=" + id +
                ",userId=" + userId +
                ",contractId=" + contractId +
                ",leverage=" + leverage +
                ",positionType=" + positionType +
                ",side=" + side +
                ",entryPrice=" + entryPrice +
                ",liquidationPrice=" + liquidationPrice +
                ",positionQty=" + positionQty +
                ",positionMargin=" + positionMargin +
                ",closeCommission=" + closeCommission +
                ",bankruptPrice=" + bankruptPrice +
                ",createdDate=" + createdDate +
                ",modifyDate=" + modifyDate +
                "}";
    }
}
