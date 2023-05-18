package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfvalMembersValMemberItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = ValMemberChoice1.class, name = "ValMemberChoice1"),
  @JsonSubTypes.Type(value = ValMemberChoice2.class, name = "ValMemberChoice2")
})
public interface OneOfvalMembersValMemberItems {

}
