package io.swagger.client.api.rxjava;

import io.swagger.client.model.Client;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-17T08:13:14.679Z")
public class FakeClassnameTags123Api {

	private final io.swagger.client.api.FakeClassnameTags123Api delegate;

	public FakeClassnameTags123Api(io.swagger.client.api.FakeClassnameTags123Api delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.FakeClassnameTags123Api getDelegate() {
	    return delegate;
	}

    /**
     * To test class name in snake case
     * To test class name in snake case
     * @param body client model (required)
     * @param resultHandler Asynchronous result handler
     */
    public void testClassname(Client body, Handler<AsyncResult<Client>> resultHandler) {
        delegate.testClassname(body, resultHandler);
    }

    /**
     * To test class name in snake case
     * To test class name in snake case
     * @param body client model (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Client> rxTestClassname(Client body) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.testClassname(body, fut);
        }));
    }

    public static FakeClassnameTags123Api newInstance(io.swagger.client.api.FakeClassnameTags123Api arg) {
        return arg != null ? new FakeClassnameTags123Api(arg) : null;
    }
}
