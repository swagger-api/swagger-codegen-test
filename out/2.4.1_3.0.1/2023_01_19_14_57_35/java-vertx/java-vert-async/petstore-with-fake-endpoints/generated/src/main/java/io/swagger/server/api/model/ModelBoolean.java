package io.swagger.server.api.model;

import java.util.Objects;

/**
 * True or False indicator
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * True or False indicator
 */
public enum ModelBoolean {
  
  TRUE("true"),
  
  FALSE("false");

  private Boolean value;

  ModelBoolean(Boolean value) {
    this.value = value;
  }

  @JsonValue
  public Boolean getValue() {
    return value;
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