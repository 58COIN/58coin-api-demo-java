package com.coin58.api.examplesPublic;

import com.coin58.api.client.ApiClientFactory;
import com.coin58.api.client.ApiRestClient;
import com.coin58.api.client.domain.TickerResponse;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/12 18:25
 * @description Term Contract - Market Data - Latest Transaction Data List
 * @modify
 */
public class TickerExample {
    public static void main(String[] args) {
        ApiClientFactory factory = ApiClientFactory.newInstance();
        ApiRestClient client = factory.newRestClient();

        TickerResponse tickerResponses = client.getTicker(2001L);

        System.out.println(tickerResponses);
    }
}
