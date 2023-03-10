package io.swagger.handler;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;

public class PathHandlerProvider implements HandlerProvider {

    public HttpHandler getHandler() {
        HttpHandler handler = Handlers.routing()


            .add(Methods.PATCH, "/v2/another-fake/dummy", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("testSpecialTags");
                        }
                    })


            .add(Methods.POST, "/v2/fake/outer/boolean", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("fakeOuterBooleanSerialize");
                        }
                    })


            .add(Methods.POST, "/v2/fake/outer/composite", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("fakeOuterCompositeSerialize");
                        }
                    })


            .add(Methods.POST, "/v2/fake/outer/number", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("fakeOuterNumberSerialize");
                        }
                    })


            .add(Methods.POST, "/v2/fake/outer/string", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("fakeOuterStringSerialize");
                        }
                    })


            .add(Methods.PUT, "/v2/fake/body-with-query-params", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("testBodyWithQueryParams");
                        }
                    })


            .add(Methods.PATCH, "/v2/fake", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("testClientModel");
                        }
                    })


            .add(Methods.POST, "/v2/fake", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("testEndpointParameters");
                        }
                    })


            .add(Methods.GET, "/v2/fake", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("testEnumParameters");
                        }
                    })


            .add(Methods.POST, "/v2/fake/inline-additionalProperties", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("testInlineAdditionalProperties");
                        }
                    })


            .add(Methods.GET, "/v2/fake/jsonFormData", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("testJsonFormData");
                        }
                    })


            .add(Methods.PATCH, "/v2/fake_classname_test", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("testClassname");
                        }
                    })


            .add(Methods.POST, "/v2/pet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("addPet");
                        }
                    })


            .add(Methods.DELETE, "/v2/pet/{petId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deletePet");
                        }
                    })


            .add(Methods.GET, "/v2/pet/findByStatus", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("findPetsByStatus");
                        }
                    })


            .add(Methods.GET, "/v2/pet/findByTags", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("findPetsByTags");
                        }
                    })


            .add(Methods.GET, "/v2/pet/{petId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getPetById");
                        }
                    })


            .add(Methods.PUT, "/v2/pet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("updatePet");
                        }
                    })


            .add(Methods.POST, "/v2/pet/{petId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("updatePetWithForm");
                        }
                    })


            .add(Methods.POST, "/v2/pet/{petId}/uploadImage", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("uploadFile");
                        }
                    })


            .add(Methods.DELETE, "/v2/store/order/{order_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteOrder");
                        }
                    })


            .add(Methods.GET, "/v2/store/inventory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getInventory");
                        }
                    })


            .add(Methods.GET, "/v2/store/order/{order_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getOrderById");
                        }
                    })


            .add(Methods.POST, "/v2/store/order", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("placeOrder");
                        }
                    })


            .add(Methods.POST, "/v2/user", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createUser");
                        }
                    })


            .add(Methods.POST, "/v2/user/createWithArray", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createUsersWithArrayInput");
                        }
                    })


            .add(Methods.POST, "/v2/user/createWithList", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createUsersWithListInput");
                        }
                    })


            .add(Methods.DELETE, "/v2/user/{username}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteUser");
                        }
                    })


            .add(Methods.GET, "/v2/user/{username}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getUserByName");
                        }
                    })


            .add(Methods.GET, "/v2/user/login", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("loginUser");
                        }
                    })


            .add(Methods.GET, "/v2/user/logout", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("logoutUser");
                        }
                    })


            .add(Methods.PUT, "/v2/user/{username}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("updateUser");
                        }
                    })

        ;
        return handler;
    }
}

