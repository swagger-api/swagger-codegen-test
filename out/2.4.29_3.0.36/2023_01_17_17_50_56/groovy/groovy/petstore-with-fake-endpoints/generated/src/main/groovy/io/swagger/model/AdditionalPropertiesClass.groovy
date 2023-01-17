package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import java.util.List;
@Canonical
class AdditionalPropertiesClass {

    Map<String, String> mapProperty = new HashMap<String, String>()

    Map<String, Map<String, String>> mapOfMapProperty = new HashMap<String, Map<String, String>>()
  

}

