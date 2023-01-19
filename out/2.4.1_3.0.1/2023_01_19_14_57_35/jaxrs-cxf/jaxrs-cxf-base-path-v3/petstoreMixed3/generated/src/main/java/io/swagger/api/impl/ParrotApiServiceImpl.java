package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.Body8;
import io.swagger.model.InlineResponse200;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Swagger Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 */
public class ParrotApiServiceImpl implements ParrotApi {
    /**
     * Add a new parrow to the store
     *
     */
    public Object addParrot(Object body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * get Parrots
     *
     */
    public List<Object> getParrots() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * update parrots
     *
     */
    public InlineResponse200 updateParrots(Body8 body) {
        // TODO: Implement...
        
        return null;
    }
    
}

