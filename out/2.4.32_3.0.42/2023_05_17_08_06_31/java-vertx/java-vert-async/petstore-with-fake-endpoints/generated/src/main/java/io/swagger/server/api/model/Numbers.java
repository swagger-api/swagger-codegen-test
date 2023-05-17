package io.swagger.server.api.model;

import java.util.Objects;
import java.math.BigDecimal;

/**
 * some number
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * some number
 */
public enum Numbers {
  
  NUMBER_7(new BigDecimal(7)),
  
  NUMBER_8(new BigDecimal(8)),
  
  NUMBER_9(new BigDecimal(9)),
  
  NUMBER_10(new BigDecimal(10));

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

  public static Numbers fromValue(BigDecimal value) {
    for (Numbers b : Numbers.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
