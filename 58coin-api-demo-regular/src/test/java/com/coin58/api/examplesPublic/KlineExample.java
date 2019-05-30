package com.coin58.api.examplesPublic;

import com.coin58.api.client.ApiClientFactory;
import com.coin58.api.client.ApiRestClient;
import com.coin58.api.client.domain.KlineResponse;

import java.util.List;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/3/12 18:12
 * @description Term Contract - Market Quotes - K Line Data
 * @modify
 */
public class KlineExample {
    public static void main(String[] args) {
        ApiClientFactory factory = ApiClientFactory.newInstance();
        ApiRestClient client = factory.newRestClient();

        List<KlineResponse> klineResponses = client.getKline("2001", "1", 10);

        klineResponses.forEach(klineResponse -> {
            System.out.println(klineResponse);
        });

    }
}
