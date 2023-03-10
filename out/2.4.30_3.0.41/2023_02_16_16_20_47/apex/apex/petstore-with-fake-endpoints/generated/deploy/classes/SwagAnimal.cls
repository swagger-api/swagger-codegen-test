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
 * SwagAnimal
 */
public class SwagAnimal {
    /**
     * Get className
     * @return className
     */
    public String className { get; set; }

    /**
     * Get color
     * @return color
     */
    public String color { get; set; }

    public SwagAnimal() {
        color = 'red';
    }

    public static SwagAnimal getExample() {
        SwagAnimal animal = new SwagAnimal();
        animal.className = 'aeiou';
        animal.color = 'aeiou';
        return animal;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof SwagAnimal) {
            SwagAnimal animal = (SwagAnimal) obj;
            return this.className == animal.className
                && this.color == animal.color;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (className == null ? 0 : System.hashCode(className));
        hashCode = (17 * hashCode) + (color == null ? 0 : System.hashCode(color));
        return hashCode;
    }
}

