package io.swagger.server.api.model;

import java.util.Objects;

/**
 * some number
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * some number
 */
public enum Numbers {
  
  _7("7"),
  
  _8("8"),
  
  _9("9"),
  
  _10("10");

  private BigDecimal value;

  Numbers(BigDecimal value) {
    this.value = value;
  }

  @JsonValue
  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Numbers fromValue(String text) {
    for (Numbers b : Numbers.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}