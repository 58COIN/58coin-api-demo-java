package com.coin58.future.api.examplesPrivate;


import com.coin58.api.future.client.ApiClientFactory;
import com.coin58.api.future.client.ApiRestClient;
import com.coin58.api.future.client.domain.OrderListResponse;

import java.util.List;

/**
 * @author guozhengMu
 * @version 1.0
 * @description Term Contract - Order - Order List
 * @modify
 */
public class OrderListExample {
    public static void main(String[] args) {
        String apiKey = "6616146f-6fe6-447c-bd31-c346437f201b";
        String apiSecret = "E4199FA0CD19F4996A3D78E226ACAF2D";

        ApiClientFactory factory = ApiClientFactory.newInstance(apiKey, apiSecret);
        ApiRestClient client = factory.newRestClient();

        List<OrderListResponse> orderLists = client.getOrderList(null, 1, 0);

        if(orderLists == null) return;

        orderLists.forEach(orderList -> {
            System.out.println(orderList);
        });
    }
}
