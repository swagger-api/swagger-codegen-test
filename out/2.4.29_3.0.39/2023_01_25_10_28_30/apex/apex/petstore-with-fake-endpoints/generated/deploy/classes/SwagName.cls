/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: " \
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/**
 * Model for testing model name same as property name
 */
public class SwagName implements Swagger.MappedProperties {
    /**
     * Get name
     * @return name
     */
    public Integer name { get; set; }

    /**
     * Get snakeCase
     * @return snakeCase
     */
    public Integer snakeCase { get; private set; }

    /**
     * Get property
     * @return property
     */
    public String property { get; set; }

    /**
     * Get r_123Number
     * @return r_123Number
     */
    public Integer r_123Number { get; private set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'snake_case' => 'snakeCase',
        '123Number' => 'r_123Number'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static SwagName getExample() {
        SwagName name = new SwagName();
        name.name = 123;
        name.snakeCase = 123;
        name.property = 'aeiou';
        name.r_123Number = 123;
        return name;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof SwagName) {
            SwagName name = (SwagName) obj;
            return this.name == name.name
                && this.snakeCase == name.snakeCase
                && this.property == name.property
                && this.r_123Number == name.r_123Number;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (snakeCase == null ? 0 : System.hashCode(snakeCase));
        hashCode = (17 * hashCode) + (property == null ? 0 : System.hashCode(property));
        hashCode = (17 * hashCode) + (r_123Number == null ? 0 : System.hashCode(r_123Number));
        return hashCode;
    }
}

