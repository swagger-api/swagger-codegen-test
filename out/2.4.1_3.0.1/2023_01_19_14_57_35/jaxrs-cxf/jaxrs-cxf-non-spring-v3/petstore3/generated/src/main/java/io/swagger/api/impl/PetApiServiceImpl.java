package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.Tag;

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
 * Swagger Petstore - OpenAPI 3.0
 *
 * <p>This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 */
public class PetApiServiceImpl implements PetApi {
    /**
     * Add a new pet to the store
     *
     * Add a new pet to the store
     *
     */
    public Pet addPet(Long id, String name, Category category, List<String> photoUrls, List<Tag> tags, String status) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Deletes a pet
     *
     */
    public void deletePet(Long petId, String apiKey) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     */
    public List<Pet> findPetsByStatus(String status) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     */
    public List<Pet> findPetsByTags(List<String> tags) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     */
    public Pet getPetById(Long petId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Update an existing pet
     *
     * Update an existing pet by Id
     *
     */
    public Pet updatePet(Long id, String name, Category category, List<String> photoUrls, List<Tag> tags, String status) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Updates a pet in the store with form data
     *
     */
    public void updatePetWithForm(Long petId, String name, String status) {
        // TODO: Implement...
        
        
    }
    
    /**
     * uploads an image
     *
     */
    public ModelApiResponse uploadFile(Long petId, Object body, String additionalMetadata) {
        // TODO: Implement...
        
        return null;
    }
    
}

