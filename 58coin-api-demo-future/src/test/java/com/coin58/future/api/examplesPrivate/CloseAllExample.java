package com.coin58.future.api.examplesPrivate;

import com.coin58.api.future.client.ApiClientFactory;
import com.coin58.api.future.client.ApiRestClient;

/**
 * @author lhc
 * @version 1.0
 * @description Term contract - transaction - one button all flat
 * @modify
 */
public class CloseAllExample {
    public static void main(String[] args) {
        String apiKey = "6616146f-6fe6-447c-bd31-c346437f201b";
        String apiSecret = "E4199FA0CD19F4996A3D78E226ACAF2D";

        ApiClientFactory factory = ApiClientFactory.newInstance(apiKey, apiSecret);
        ApiRestClient client = factory.newRestClient();

        System.out.println(client.closeAll());
    }
}
