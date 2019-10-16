package com.coin58.future.api.examplesPublic;

import com.coin58.api.future.client.ApiClientFactory;
import com.coin58.api.future.client.ApiRestClient;
import com.coin58.api.future.client.domain.TickerResponse;

/**
 * @author guozhengMu
 * @version 1.0
 * @description Term Contract - Market Data - Latest Transaction Data List
 * @modify
 */
public class TickerExample {
    public static void main(String[] args) {
        ApiClientFactory factory = ApiClientFactory.newInstance();
        ApiRestClient client = factory.newRestClient();

        TickerResponse tickerResponses = client.getTicker(1001L);

        System.out.println(tickerResponses);
    }
}
