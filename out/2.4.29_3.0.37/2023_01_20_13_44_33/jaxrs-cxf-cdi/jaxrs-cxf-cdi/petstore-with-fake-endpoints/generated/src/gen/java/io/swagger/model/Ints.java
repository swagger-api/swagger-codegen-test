package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * True or False indicator
 **/
@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue(0) NUMBER_0(.valueOf(0)), @XmlEnumValue(1) NUMBER_1(.valueOf(1)), @XmlEnumValue(2) NUMBER_2(.valueOf(2)), @XmlEnumValue(3) NUMBER_3(.valueOf(3)), @XmlEnumValue(4) NUMBER_4(.valueOf(4)), @XmlEnumValue(5) NUMBER_5(.valueOf(5)), @XmlEnumValue(6) NUMBER_6(.valueOf(6));


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
        for (Ints b : Ints.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}


