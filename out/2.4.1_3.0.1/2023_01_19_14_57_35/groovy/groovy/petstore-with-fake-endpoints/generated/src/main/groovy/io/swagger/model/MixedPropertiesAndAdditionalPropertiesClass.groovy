package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Animal;
import io.swagger.model.Date;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.UUID;
import java.util.List;
@Canonical
class MixedPropertiesAndAdditionalPropertiesClass {

    UUID uuid = null

    Date dateTime = null

    Map<String, Animal> map = new HashMap<String, Animal>()
  

}

