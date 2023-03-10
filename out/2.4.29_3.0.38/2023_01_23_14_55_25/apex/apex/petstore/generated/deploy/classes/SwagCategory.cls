/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/**
 * SwagCategory
 */
public class SwagCategory {
    /**
     * Get id
     * @return id
     */
    public Long id { get; set; }

    /**
     * Get name
     * @return name
     */
    public String name { get; set; }

    public static SwagCategory getExample() {
        SwagCategory category = new SwagCategory();
        category.id = 123456789L;
        category.name = 'aeiou';
        return category;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof SwagCategory) {
            SwagCategory category = (SwagCategory) obj;
            return this.id == category.id
                && this.name == category.name;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        return hashCode;
    }
}

