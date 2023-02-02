package io.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(contextId="UserApiClient", name="${swaggerPetstore.name:swaggerPetstore}", url="${swaggerPetstore.url:https://raw.githubusercontent.com/v3}", configuration = ClientConfiguration.class)
public interface UserApiClient extends UserApi {
}
