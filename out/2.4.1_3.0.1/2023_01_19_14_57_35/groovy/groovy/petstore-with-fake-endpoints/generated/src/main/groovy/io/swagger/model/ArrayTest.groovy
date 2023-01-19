package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ReadOnlyFirst;
import java.util.List;
@Canonical
class ArrayTest {

    List<String> arrayOfString = new ArrayList<String>()

    List<List<Long>> arrayArrayOfInteger = new ArrayList<List<Long>>()

    List<List<ReadOnlyFirst>> arrayArrayOfModel = new ArrayList<List<ReadOnlyFirst>>()
  

}

