package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * True or False indicator
 **/
@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue("true") TRUE(.valueOf("true")), @XmlEnumValue("false") FALSE(.valueOf("false"));


    private  value;

     ( v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static  fromValue(String v) {
        for (ModelBoolean b : ModelBoolean.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}


