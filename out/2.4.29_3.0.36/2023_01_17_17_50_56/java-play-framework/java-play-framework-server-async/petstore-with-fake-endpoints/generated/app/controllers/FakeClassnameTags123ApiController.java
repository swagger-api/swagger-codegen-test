package controllers;

import apimodels.Client;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import swagger.SwaggerUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import javax.validation.constraints.*;
import play.Configuration;

import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T17:55:25.505Z")

public class FakeClassnameTags123ApiController extends Controller {

    private final FakeClassnameTags123ApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private FakeClassnameTags123ApiController(Configuration configuration, FakeClassnameTags123ApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public CompletionStage<Result> testClassname() throws Exception {
        JsonNode nodebody = request().body().asJson();
        Client body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Client.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                SwaggerUtils.validate(body);
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        CompletionStage<Client> stage = imp.testClassname(body).thenApply(obj -> { 
            if (configuration.getBoolean("useOutputBeanValidation")) {
                SwaggerUtils.validate(obj);
            }
            return obj;
        });
        stage.thenApply(obj -> {
            JsonNode result = mapper.valueToTree(obj);
            return ok(result);
        });
    }
}
