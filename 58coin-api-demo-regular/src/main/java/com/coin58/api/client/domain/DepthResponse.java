package com.coin58.api.client.domain;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/14 20:29
 * @description
 * @modify
 */
@Data
public class DepthResponse {
    private JSONArray bids;
    private JSONArray asks;

    @Override
    public String toString() {
        return "Depth{" +
                "bids=" + bids +
                ",asks=" + asks +
                "}";
    }
}
