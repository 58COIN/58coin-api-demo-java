package com.coin58.api.client.domain.enums;

/**
 * Order type
 */
public enum OrderTypeEnum {

    LIMIT(1), MARKET(2);

    int code;

    OrderTypeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
