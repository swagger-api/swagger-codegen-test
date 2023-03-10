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
 * SwagArrayOfNumberOnly
 */
public class SwagArrayOfNumberOnly implements Swagger.MappedProperties {
    /**
     * Get arrayNumber
     * @return arrayNumber
     */
    public List<Double> arrayNumber { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ArrayNumber' => 'arrayNumber'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public SwagArrayOfNumberOnly() {
        arrayNumber = new List<Double>();
    }

    public static SwagArrayOfNumberOnly getExample() {
        SwagArrayOfNumberOnly arrayOfNumberOnly = new SwagArrayOfNumberOnly();
        arrayOfNumberOnly.arrayNumber = new List<Double>{1.3579};
        return arrayOfNumberOnly;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof SwagArrayOfNumberOnly) {
            SwagArrayOfNumberOnly arrayOfNumberOnly = (SwagArrayOfNumberOnly) obj;
            return this.arrayNumber == arrayOfNumberOnly.arrayNumber;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (arrayNumber == null ? 0 : System.hashCode(arrayNumber));
        return hashCode;
    }
}

