package com.coin58.future.api.examplesPrivate;

import com.coin58.api.future.client.ApiClientFactory;
import com.coin58.api.future.client.ApiRestClient;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/13 17:02
 * @description Term contract - transaction - withdrawal
 * @modify
 */
public class CancelOrderExample {
    public static void main(String[] args) {
        String apiKey = "6616146f-6fe6-447c-bd31-c346437f201b";
        String apiSecret = "E4199FA0CD19F4996A3D78E226ACAF2D";

        ApiClientFactory factory = ApiClientFactory.newInstance(apiKey, apiSecret);
        ApiRestClient client = factory.newRestClient();
        client.cancelOrder(441493728612597760L);
        System.out.println(1);
    }
}
