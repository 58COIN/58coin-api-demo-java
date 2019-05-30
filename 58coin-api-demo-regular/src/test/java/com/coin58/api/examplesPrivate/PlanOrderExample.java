package com.coin58.api.examplesPrivate;

import com.coin58.api.client.ApiClientFactory;
import com.coin58.api.client.ApiRestClient;
import com.coin58.api.client.domain.NewPlanOrder;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/13 17:45
 * @description Term Contract - Plan Entrustment - Stop Profit Stop Loss Order
 * @modify
 */
public class PlanOrderExample {
    public static void main(String[] args) {
        String apiKey = "6616146f-6fe6-447c-bd31-c346437f201b";
        String apiSecret = "E4199FA0CD19F4996A3D78E226ACAF2D";

        ApiClientFactory factory = ApiClientFactory.newInstance(apiKey, apiSecret);
        ApiRestClient client = factory.newRestClient();

        NewPlanOrder planOrder = new NewPlanOrder();
        planOrder.setContractId(2002);
        planOrder.setSide(1);
        planOrder.setTriggerPrice("3.5");
        planOrder.setSize(10);
        planOrder.setMode(1);
        planOrder.setType(1);
        planOrder.setPrice("3.5");

        System.out.println(client.newPlanOrder(planOrder));
    }
}
