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
 * SwagPet
 */
public class SwagPet {
    /**
     * Get id
     * @return id
     */
    public Long id { get; set; }

    /**
     * Get category
     * @return category
     */
    public SwagCategory category { get; set; }

    /**
     * Get name
     * @return name
     */
    public String name { get; set; }

    /**
     * Get photoUrls
     * @return photoUrls
     */
    public List<String> photoUrls { get; set; }

    /**
     * Get tags
     * @return tags
     */
    public List<SwagTag> tags { get; set; }

    /**
     * pet status in the store
     */
    public enum StatusEnum {
        AVAILABLE,
        PENDING,
        SOLD
    }

    /**
     * pet status in the store
     * @return status
     */
    public StatusEnum status { get; set; }

    public SwagPet() {
        photoUrls = new List<String>();
        tags = new List<SwagTag>();
    }

    public static SwagPet getExample() {
        SwagPet pet = new SwagPet();
        pet.id = 123456789L;
        pet.category = SwagCategory.getExample();
        pet.name = 'doggie';
        pet.photoUrls = new List<String>{'aeiou'};
        pet.tags = new List<SwagTag>{SwagTag.getExample()};
        pet.status = StatusEnum.AVAILABLE;
        return pet;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof SwagPet) {
            SwagPet pet = (SwagPet) obj;
            return this.id == pet.id
                && this.category == pet.category
                && this.name == pet.name
                && this.photoUrls == pet.photoUrls
                && this.tags == pet.tags
                && this.status == pet.status;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (category == null ? 0 : System.hashCode(category));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (photoUrls == null ? 0 : System.hashCode(photoUrls));
        hashCode = (17 * hashCode) + (tags == null ? 0 : System.hashCode(tags));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        return hashCode;
    }
}

