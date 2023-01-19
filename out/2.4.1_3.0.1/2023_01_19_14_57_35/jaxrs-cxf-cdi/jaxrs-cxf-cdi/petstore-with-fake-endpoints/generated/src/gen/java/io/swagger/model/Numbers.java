package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * some number
 **/
@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue("7") _7(.valueOf("7")), @XmlEnumValue("8") _8(.valueOf("8")), @XmlEnumValue("9") _9(.valueOf("9")), @XmlEnumValue("10") _10(.valueOf("10"));


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
        for (Numbers b : Numbers.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}


