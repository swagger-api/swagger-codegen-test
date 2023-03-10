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
 * SwagDog
 */
public class SwagDog extends SwagAnimal {
    /**
     * Get breed
     * @return breed
     */
    public String breed { get; set; }

    public SwagDog() {
    }

    public static SwagDog getExample() {
        SwagDog dog = new SwagDog();
        dog.breed = 'aeiou';
        return dog;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof SwagDog) {
            SwagDog dog = (SwagDog) obj;
            return this.breed == dog.breed;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (breed == null ? 0 : System.hashCode(breed));
        return hashCode;
    }
}

