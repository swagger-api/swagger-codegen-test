package io.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(contextId="StoreApiClient", name="${swaggerPetstoreOpenAPI30.name:swaggerPetstoreOpenAPI30}", url="${swaggerPetstoreOpenAPI30.url:https://raw.githubusercontent.com/api/v3}", configuration = ClientConfiguration.class)
public interface StoreApiClient extends StoreApi {
}
