package io.swagger.model;

import javax.validation.constraints.*;

@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue("placed") PLACED(.valueOf("placed")), @XmlEnumValue("approved") APPROVED(.valueOf("approved")), @XmlEnumValue("delivered") DELIVERED(.valueOf("delivered"));


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
        for (OuterEnum b : OuterEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
