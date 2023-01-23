package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;   //
/**
* OneOfinlineResponse200ParrotsItems
*/
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
  @JsonSubTypes({
  @JsonSubTypes.Type(value = Macaw.class, name = "Macaw"),
  @JsonSubTypes.Type(value = Parakeet.class, name = "Parakeet")
})
public interface OneOfinlineResponse200ParrotsItems {
}
