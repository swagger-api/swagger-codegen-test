package controllers;

import apimodels.Client;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-04-02T19:54:33.048Z")

public class FakeClassnameTags123ApiControllerImp implements FakeClassnameTags123ApiControllerImpInterface {
    @Override
    public CompletionStage<Client> testClassname(Client body) throws Exception {
        //Do your magic!!!
        return CompletableFuture.supplyAsync(() -> {
           return new Client();
        });
    }

}
