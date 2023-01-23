package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Client;
import io.swagger.server.api.MainApiException;

import rx.Completable;
import rx.Single;

import java.util.List;
import java.util.Map;

public interface FakeClassnameTags123Api  {
    //testClassname
    public Single<Client> testClassname(Client body);
    
}
