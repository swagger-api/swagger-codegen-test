package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * True or False indicator
 */
public enum ModelBoolean {
  
  TRUE(true),
  
  FALSE(false);

  private Boolean value;

  ModelBoolean(Boolean value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ModelBoolean fromValue(String text) {
    for (ModelBoolean b : ModelBoolean.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

