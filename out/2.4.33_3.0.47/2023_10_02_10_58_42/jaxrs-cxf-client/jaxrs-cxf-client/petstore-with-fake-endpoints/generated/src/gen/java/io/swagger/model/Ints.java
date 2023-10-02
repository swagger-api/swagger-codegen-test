package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * True or False indicator
 */
public enum Ints {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_5(5),
  
  NUMBER_6(6);

  private Integer value;

  Ints(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Ints fromValue(String text) {
    for (Ints b : Ints.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

