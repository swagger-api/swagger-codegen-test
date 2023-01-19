package controllers;

import apimodels.Client;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface FakeClassnameTags123ApiControllerImpInterface {
    CompletionStage<Client> testClassname(Client body) throws Exception;

}
