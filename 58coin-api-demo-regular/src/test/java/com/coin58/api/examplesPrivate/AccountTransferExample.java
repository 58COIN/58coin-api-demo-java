package com.coin58.api.examplesPrivate;

import com.alibaba.fastjson.JSONObject;
import com.coin58.api.client.ApiClientFactory;
import com.coin58.api.client.ApiRestClient;

import java.math.BigDecimal;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/18 15:14
 * @description Account related - transfer
 * @modify
 */
public class AccountTransferExample {

    public static void main(String[] args) {
        String apiKey = "6616146f-6fe6-447c-bd31-c346437f201b";
        String apiSecret = "E4199FA0CD19F4996A3D78E226ACAF2D";

        ApiClientFactory factory = ApiClientFactory.newInstance(apiKey, apiSecret);
        ApiRestClient client = factory.newRestClient();

        JSONObject transferResult = client.accountTransfer(2001L, 1L, new BigDecimal("333.22"));
        System.out.println(transferResult);
    }
}
