import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/order.dart';


part 'store_api.jretro.dart';

@GenApiClient()
class StoreApi extends _$StoreApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    StoreApi({this.base, this.serializers});

    /// Delete purchase order by ID
    ///
    /// For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
    @DeleteReq(path: "/store/order/:orderId")
    Future<void> deleteOrder(
            @PathParam("orderId") int orderId
    );

    /// Returns pet inventories by status
    ///
    /// Returns a map of status codes to quantities
    @GetReq(path: "/store/inventory", metadata: {"auth": [ {"type": "apiKey", "name": "api_key", "keyName": "api_key", "where": "header" }]})
    Future<Map<String, int>> getInventory(
    );

    /// Find purchase order by ID
    ///
    /// For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
    @GetReq(path: "/store/order/:orderId")
    Future<Order> getOrderById(
            @PathParam("orderId") int orderId
    );

    /// Place an order for a pet
    ///
    /// 
    @PostReq(path: "/store/order")
    Future<Order> placeOrder(
        
        @AsJson() Order body
    );


}
