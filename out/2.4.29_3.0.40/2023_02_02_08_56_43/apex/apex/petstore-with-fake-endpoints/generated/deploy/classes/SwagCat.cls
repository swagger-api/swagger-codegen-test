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
 * SwagCat
 */
public class SwagCat extends SwagAnimal {
    /**
     * Get declawed
     * @return declawed
     */
    public Boolean declawed { get; set; }

    public SwagCat() {
    }

    public static SwagCat getExample() {
        SwagCat cat = new SwagCat();
        cat.declawed = true;
        return cat;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof SwagCat) {
            SwagCat cat = (SwagCat) obj;
            return this.declawed == cat.declawed;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (declawed == null ? 0 : System.hashCode(declawed));
        return hashCode;
    }
}

