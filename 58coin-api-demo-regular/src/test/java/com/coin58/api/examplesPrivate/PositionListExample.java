package com.coin58.api.examplesPrivate;

import com.alibaba.fastjson.JSONObject;
import com.coin58.api.client.ApiClientFactory;
import com.coin58.api.client.ApiRestClient;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/13 16:38
 * @description Term Contract - Position - User Position List
 * @modify
 */
public class PositionListExample {
    public static void main(String[] args) {
        String apiKey = "6616146f-6fe6-447c-bd31-c346437f201b";
        String apiSecret = "E4199FA0CD19F4996A3D78E226ACAF2D";

        ApiClientFactory factory = ApiClientFactory.newInstance(apiKey, apiSecret);
        ApiRestClient client = factory.newRestClient();

        JSONObject positionList = client.getPositionList(2001L);
        System.out.println(positionList);
    }
}
