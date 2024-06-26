package io.swagger.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;

import java.util.Set;
import java.util.HashSet;

import io.swagger.api.impl.AllPetsApiServiceImpl;
import io.swagger.api.impl.AnimalApiServiceImpl;
import io.swagger.api.impl.AnotherFakeApiServiceImpl;
import io.swagger.api.impl.DogApiServiceImpl;
import io.swagger.api.impl.FakeApiServiceImpl;
import io.swagger.api.impl.FakeClassnameTestApiServiceImpl;
import io.swagger.api.impl.MasterApiServiceImpl;
import io.swagger.api.impl.ParrotApiServiceImpl;
import io.swagger.api.impl.PetApiServiceImpl;
import io.swagger.api.impl.RandomPetApiServiceImpl;
import io.swagger.api.impl.StoreApiServiceImpl;
import io.swagger.api.impl.UserApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(AllPetsApiServiceImpl.class);
        resources.add(AnimalApiServiceImpl.class);
        resources.add(AnotherFakeApiServiceImpl.class);
        resources.add(DogApiServiceImpl.class);
        resources.add(FakeApiServiceImpl.class);
        resources.add(FakeClassnameTestApiServiceImpl.class);
        resources.add(MasterApiServiceImpl.class);
        resources.add(ParrotApiServiceImpl.class);
        resources.add(PetApiServiceImpl.class);
        resources.add(RandomPetApiServiceImpl.class);
        resources.add(StoreApiServiceImpl.class);
        resources.add(UserApiServiceImpl.class);


        return resources;
    }




}
