package com.coin58.api.examplesPublic;

import com.coin58.api.client.ApiClientFactory;
import com.coin58.api.client.ApiRestClient;
import com.coin58.api.client.domain.SettlementResponse;

import java.util.List;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/12 15:35
 * @description Term Contract - Contract Guide - Settlement List
 * @modify
 */
public class SettlementExample {
    public static void main(String[] args) {
        ApiClientFactory factory = ApiClientFactory.newInstance();
        ApiRestClient client = factory.newRestClient();

        List<SettlementResponse> settlementResponses = client.getSettlementList();

        settlementResponses.forEach(settlement -> {
            System.out.println(settlement);
        });
    }
}
