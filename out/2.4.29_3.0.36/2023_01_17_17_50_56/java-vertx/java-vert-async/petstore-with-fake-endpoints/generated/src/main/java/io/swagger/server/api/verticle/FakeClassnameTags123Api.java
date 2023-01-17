package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Client;
import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface FakeClassnameTags123Api  {
    //testClassname
    void testClassname(Client body, Handler<AsyncResult<Client>> handler);
    
}
