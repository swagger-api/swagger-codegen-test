package controllers;

import java.io.InputStream;
import apimodels.ModelApiResponse;
import apimodels.Pet;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-05-18T06:12:35.620Z")

public class PetApiControllerImp implements PetApiControllerImpInterface {
    @Override
    public void addPet(Pet body)  {
        //Do your magic!!!
    }

    @Override
    public void deletePet(Long petId, String apiKey)  {
        //Do your magic!!!
    }

    @Override
    public List<Pet> findPetsByStatus( @NotNull List<String> status)  {
        //Do your magic!!!
        return new ArrayList<Pet>();
    }

    @Override
    public List<Pet> findPetsByTags( @NotNull List<String> tags)  {
        //Do your magic!!!
        return new ArrayList<Pet>();
    }

    @Override
    public Pet getPetById(Long petId)  {
        //Do your magic!!!
        return new Pet();
    }

    @Override
    public void updatePet(Pet body)  {
        //Do your magic!!!
    }

    @Override
    public void updatePetWithForm(Long petId, String name, String status)  {
        //Do your magic!!!
    }

    @Override
    public ModelApiResponse uploadFile(Long petId, String additionalMetadata, Http.MultipartFormData.FilePart file)  {
        //Do your magic!!!
        return new ModelApiResponse();
    }

}
