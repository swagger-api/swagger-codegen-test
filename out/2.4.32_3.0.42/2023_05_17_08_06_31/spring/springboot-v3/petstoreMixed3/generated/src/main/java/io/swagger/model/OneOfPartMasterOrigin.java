package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfPartMasterOrigin
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = PartThree.class, name = "PartThree"),
  @JsonSubTypes.Type(value = PartFour.class, name = "PartFour")
})
public interface OneOfPartMasterOrigin {

}
