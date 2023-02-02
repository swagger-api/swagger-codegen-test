package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;   //
/**
* InlineResponse2001
*/
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
  @JsonSubTypes({
  @JsonSubTypes.Type(value = Macaw.class, name = "Macaw"),
  @JsonSubTypes.Type(value = Parakeet.class, name = "Parakeet")
})
public interface InlineResponse2001 {
}
