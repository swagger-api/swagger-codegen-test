package io.swagger.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * some number
 **/
@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue(new BigDecimal(7)) NUMBER_7(.valueOf(new BigDecimal(7))), @XmlEnumValue(new BigDecimal(8)) NUMBER_8(.valueOf(new BigDecimal(8))), @XmlEnumValue(new BigDecimal(9)) NUMBER_9(.valueOf(new BigDecimal(9))), @XmlEnumValue(new BigDecimal(10)) NUMBER_10(.valueOf(new BigDecimal(10)));


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


