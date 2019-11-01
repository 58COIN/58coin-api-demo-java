import com.coin58.api.swaps.client.ApiClientFactory;
import com.coin58.api.swaps.client.ApiRestClient;
import com.coin58.api.swaps.client.domain.PositionResponse;

/**
 * @author guozhengMu
 * @version 1.0
 * @description Term Contract - Position - User Position List
 * @modify
 */
public class PositionListExample {
    public static void main(String[] args) {
        String apiKey = "beee446a-4523-42b5-9166-26c835d1b485";
        String apiSecret = "F27BC36ACDDC019B9737A88C456E2266";

        ApiClientFactory factory = ApiClientFactory.newInstance(apiKey, apiSecret);
        ApiRestClient client = factory.newRestClient();

        PositionResponse positionResponse = client.getPositionList(1L);
        System.out.println(positionResponse);
    }
}
