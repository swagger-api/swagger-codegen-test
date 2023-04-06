package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Client;
import io.swagger.server.api.MainApiException;

import rx.Completable;
import rx.Single;

import java.util.List;
import java.util.Map;

public interface AnotherFakeApi  {
    //test_special_tags
    public Single<Client> testSpecialTags(Client body);
    
}
