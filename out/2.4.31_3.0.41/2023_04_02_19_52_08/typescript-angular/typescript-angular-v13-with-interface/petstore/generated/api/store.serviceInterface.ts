/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { HttpHeaders }                                       from '@angular/common/http';

import { Observable }                                        from 'rxjs';

import { Order } from '../model/order';


import { Configuration }                                     from '../configuration';


export interface StoreServiceInterface {
    defaultHeaders: HttpHeaders;
    configuration: Configuration;
    

    /**
    * Delete purchase order by ID
    * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
    * @param orderId ID of the order that needs to be deleted
    */
    deleteOrder(orderId: number, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Returns pet inventories by status
    * Returns a map of status codes to quantities
    */
    getInventory(extraHttpRequestParams?: any): Observable<{ [key: string]: number; }>;

    /**
    * Find purchase order by ID
    * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
    * @param orderId ID of pet that needs to be fetched
    */
    getOrderById(orderId: number, extraHttpRequestParams?: any): Observable<Order>;

    /**
    * Place an order for a pet
    * 
    * @param body order placed for purchasing the pet
    */
    placeOrder(body: Order, extraHttpRequestParams?: any): Observable<Order>;

}
