package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AdditionalPropertiesClass".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdditionalPropertiesClass>>(){}.getType();
    }
    
    if ("Animal".equalsIgnoreCase(className)) {
      return new TypeToken<List<Animal>>(){}.getType();
    }
    
    if ("AnimalFarm".equalsIgnoreCase(className)) {
      return new TypeToken<List<AnimalFarm>>(){}.getType();
    }
    
    if ("ApiResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiResponse>>(){}.getType();
    }
    
    if ("ArrayOfArrayOfNumberOnly".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArrayOfArrayOfNumberOnly>>(){}.getType();
    }
    
    if ("ArrayOfNumberOnly".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArrayOfNumberOnly>>(){}.getType();
    }
    
    if ("ArrayTest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArrayTest>>(){}.getType();
    }
    
    if ("Capitalization".equalsIgnoreCase(className)) {
      return new TypeToken<List<Capitalization>>(){}.getType();
    }
    
    if ("Cat".equalsIgnoreCase(className)) {
      return new TypeToken<List<Cat>>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<List<Category>>(){}.getType();
    }
    
    if ("ClassModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<ClassModel>>(){}.getType();
    }
    
    if ("Client".equalsIgnoreCase(className)) {
      return new TypeToken<List<Client>>(){}.getType();
    }
    
    if ("Dog".equalsIgnoreCase(className)) {
      return new TypeToken<List<Dog>>(){}.getType();
    }
    
    if ("EnumArrays".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnumArrays>>(){}.getType();
    }
    
    if ("EnumClass".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnumClass>>(){}.getType();
    }
    
    if ("EnumTest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnumTest>>(){}.getType();
    }
    
    if ("FormatTest".equalsIgnoreCase(className)) {
      return new TypeToken<List<FormatTest>>(){}.getType();
    }
    
    if ("HasOnlyReadOnly".equalsIgnoreCase(className)) {
      return new TypeToken<List<HasOnlyReadOnly>>(){}.getType();
    }
    
    if ("Ints".equalsIgnoreCase(className)) {
      return new TypeToken<List<Ints>>(){}.getType();
    }
    
    if ("MapTest".equalsIgnoreCase(className)) {
      return new TypeToken<List<MapTest>>(){}.getType();
    }
    
    if ("MixedPropertiesAndAdditionalPropertiesClass".equalsIgnoreCase(className)) {
      return new TypeToken<List<MixedPropertiesAndAdditionalPropertiesClass>>(){}.getType();
    }
    
    if ("Model200Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<Model200Response>>(){}.getType();
    }
    
    if ("ModelBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelBoolean>>(){}.getType();
    }
    
    if ("ModelReturn".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelReturn>>(){}.getType();
    }
    
    if ("Name".equalsIgnoreCase(className)) {
      return new TypeToken<List<Name>>(){}.getType();
    }
    
    if ("NumberOnly".equalsIgnoreCase(className)) {
      return new TypeToken<List<NumberOnly>>(){}.getType();
    }
    
    if ("Numbers".equalsIgnoreCase(className)) {
      return new TypeToken<List<Numbers>>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<List<Order>>(){}.getType();
    }
    
    if ("OuterBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<List<OuterBoolean>>(){}.getType();
    }
    
    if ("OuterComposite".equalsIgnoreCase(className)) {
      return new TypeToken<List<OuterComposite>>(){}.getType();
    }
    
    if ("OuterEnum".equalsIgnoreCase(className)) {
      return new TypeToken<List<OuterEnum>>(){}.getType();
    }
    
    if ("OuterNumber".equalsIgnoreCase(className)) {
      return new TypeToken<List<OuterNumber>>(){}.getType();
    }
    
    if ("OuterString".equalsIgnoreCase(className)) {
      return new TypeToken<List<OuterString>>(){}.getType();
    }
    
    if ("Pet".equalsIgnoreCase(className)) {
      return new TypeToken<List<Pet>>(){}.getType();
    }
    
    if ("ReadOnlyFirst".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReadOnlyFirst>>(){}.getType();
    }
    
    if ("SpecialModelName".equalsIgnoreCase(className)) {
      return new TypeToken<List<SpecialModelName>>(){}.getType();
    }
    
    if ("Tag".equalsIgnoreCase(className)) {
      return new TypeToken<List<Tag>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AdditionalPropertiesClass".equalsIgnoreCase(className)) {
      return new TypeToken<AdditionalPropertiesClass>(){}.getType();
    }
    
    if ("Animal".equalsIgnoreCase(className)) {
      return new TypeToken<Animal>(){}.getType();
    }
    
    if ("AnimalFarm".equalsIgnoreCase(className)) {
      return new TypeToken<AnimalFarm>(){}.getType();
    }
    
    if ("ApiResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ApiResponse>(){}.getType();
    }
    
    if ("ArrayOfArrayOfNumberOnly".equalsIgnoreCase(className)) {
      return new TypeToken<ArrayOfArrayOfNumberOnly>(){}.getType();
    }
    
    if ("ArrayOfNumberOnly".equalsIgnoreCase(className)) {
      return new TypeToken<ArrayOfNumberOnly>(){}.getType();
    }
    
    if ("ArrayTest".equalsIgnoreCase(className)) {
      return new TypeToken<ArrayTest>(){}.getType();
    }
    
    if ("Capitalization".equalsIgnoreCase(className)) {
      return new TypeToken<Capitalization>(){}.getType();
    }
    
    if ("Cat".equalsIgnoreCase(className)) {
      return new TypeToken<Cat>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<Category>(){}.getType();
    }
    
    if ("ClassModel".equalsIgnoreCase(className)) {
      return new TypeToken<ClassModel>(){}.getType();
    }
    
    if ("Client".equalsIgnoreCase(className)) {
      return new TypeToken<Client>(){}.getType();
    }
    
    if ("Dog".equalsIgnoreCase(className)) {
      return new TypeToken<Dog>(){}.getType();
    }
    
    if ("EnumArrays".equalsIgnoreCase(className)) {
      return new TypeToken<EnumArrays>(){}.getType();
    }
    
    if ("EnumClass".equalsIgnoreCase(className)) {
      return new TypeToken<EnumClass>(){}.getType();
    }
    
    if ("EnumTest".equalsIgnoreCase(className)) {
      return new TypeToken<EnumTest>(){}.getType();
    }
    
    if ("FormatTest".equalsIgnoreCase(className)) {
      return new TypeToken<FormatTest>(){}.getType();
    }
    
    if ("HasOnlyReadOnly".equalsIgnoreCase(className)) {
      return new TypeToken<HasOnlyReadOnly>(){}.getType();
    }
    
    if ("Ints".equalsIgnoreCase(className)) {
      return new TypeToken<Ints>(){}.getType();
    }
    
    if ("MapTest".equalsIgnoreCase(className)) {
      return new TypeToken<MapTest>(){}.getType();
    }
    
    if ("MixedPropertiesAndAdditionalPropertiesClass".equalsIgnoreCase(className)) {
      return new TypeToken<MixedPropertiesAndAdditionalPropertiesClass>(){}.getType();
    }
    
    if ("Model200Response".equalsIgnoreCase(className)) {
      return new TypeToken<Model200Response>(){}.getType();
    }
    
    if ("ModelBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<ModelBoolean>(){}.getType();
    }
    
    if ("ModelReturn".equalsIgnoreCase(className)) {
      return new TypeToken<ModelReturn>(){}.getType();
    }
    
    if ("Name".equalsIgnoreCase(className)) {
      return new TypeToken<Name>(){}.getType();
    }
    
    if ("NumberOnly".equalsIgnoreCase(className)) {
      return new TypeToken<NumberOnly>(){}.getType();
    }
    
    if ("Numbers".equalsIgnoreCase(className)) {
      return new TypeToken<Numbers>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<Order>(){}.getType();
    }
    
    if ("OuterBoolean".equalsIgnoreCase(className)) {
      return new TypeToken<OuterBoolean>(){}.getType();
    }
    
    if ("OuterComposite".equalsIgnoreCase(className)) {
      return new TypeToken<OuterComposite>(){}.getType();
    }
    
    if ("OuterEnum".equalsIgnoreCase(className)) {
      return new TypeToken<OuterEnum>(){}.getType();
    }
    
    if ("OuterNumber".equalsIgnoreCase(className)) {
      return new TypeToken<OuterNumber>(){}.getType();
    }
    
    if ("OuterString".equalsIgnoreCase(className)) {
      return new TypeToken<OuterString>(){}.getType();
    }
    
    if ("Pet".equalsIgnoreCase(className)) {
      return new TypeToken<Pet>(){}.getType();
    }
    
    if ("ReadOnlyFirst".equalsIgnoreCase(className)) {
      return new TypeToken<ReadOnlyFirst>(){}.getType();
    }
    
    if ("SpecialModelName".equalsIgnoreCase(className)) {
      return new TypeToken<SpecialModelName>(){}.getType();
    }
    
    if ("Tag".equalsIgnoreCase(className)) {
      return new TypeToken<Tag>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
