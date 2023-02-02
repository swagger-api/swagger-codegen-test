package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import java.util.List;
@Canonical
class MapTest {

    Map<String, Map<String, String>> mapMapOfString = new HashMap<String, Map<String, String>>()

    Map<String, String> mapOfEnumString = new HashMap<String, InnerEnum>()
  

}

