/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OuterEnum
 */
@JsonAdapter(OuterEnum.Adapter.class)
public enum OuterEnum {
  PLACED("placed"),
  APPROVED("approved"),
  DELIVERED("delivered");

  private String value;

  OuterEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OuterEnum fromValue(String input) {
    for (OuterEnum b : OuterEnum.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OuterEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final OuterEnum enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public OuterEnum read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return OuterEnum.fromValue((String)(value));
    }
  }
}
