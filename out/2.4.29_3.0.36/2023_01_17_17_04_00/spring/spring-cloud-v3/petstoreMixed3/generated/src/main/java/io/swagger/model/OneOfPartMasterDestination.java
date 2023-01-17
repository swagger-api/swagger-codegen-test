package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfPartMasterDestination
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = PartOne.class, name = "PartOne"),
  @JsonSubTypes.Type(value = PartTwo.class, name = "PartTwo")
})
public interface OneOfPartMasterDestination {

}
