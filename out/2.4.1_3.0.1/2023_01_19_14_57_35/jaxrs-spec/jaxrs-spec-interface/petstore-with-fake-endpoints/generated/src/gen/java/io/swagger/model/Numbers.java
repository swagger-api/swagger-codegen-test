package io.swagger.model;

import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;


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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Numbers fromValue(String text) {
    for (Numbers b : Numbers.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


