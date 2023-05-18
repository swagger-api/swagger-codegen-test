package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
/** o.O
* Gets or Sets OuterEnum
*/
public enum OuterEnum {
    PLACED("placed"),
    APPROVED("approved"),
    DELIVERED("delivered");
    private String value;

    OuterEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
}