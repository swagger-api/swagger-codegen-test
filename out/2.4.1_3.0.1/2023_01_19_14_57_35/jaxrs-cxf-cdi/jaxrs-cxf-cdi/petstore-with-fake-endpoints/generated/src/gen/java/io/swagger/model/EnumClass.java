package io.swagger.model;

import javax.validation.constraints.*;

@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue("_abc") _ABC(.valueOf("_abc")), @XmlEnumValue("-efg") _EFG(.valueOf("-efg")), @XmlEnumValue("(xyz)") _XYZ_(.valueOf("(xyz)"));


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
        for (EnumClass b : EnumClass.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}


