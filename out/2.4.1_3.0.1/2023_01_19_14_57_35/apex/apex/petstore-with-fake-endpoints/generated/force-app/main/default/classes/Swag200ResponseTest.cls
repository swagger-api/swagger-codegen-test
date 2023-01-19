@isTest
private class Swag200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        Swag200Response r_200Response1 = Swag200Response.getExample();
        Swag200Response r_200Response2 = r_200Response1;
        Swag200Response r_200Response3 = new Swag200Response();
        Swag200Response r_200Response4 = r_200Response3;

        System.assert(r_200Response1.equals(r_200Response2));
        System.assert(r_200Response2.equals(r_200Response1));
        System.assert(r_200Response1.equals(r_200Response1));
        System.assert(r_200Response3.equals(r_200Response4));
        System.assert(r_200Response4.equals(r_200Response3));
        System.assert(r_200Response3.equals(r_200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        Swag200Response r_200Response1 = Swag200Response.getExample();
        Swag200Response r_200Response2 = Swag200Response.getExample();
        Swag200Response r_200Response3 = new Swag200Response();
        Swag200Response r_200Response4 = new Swag200Response();

        System.assert(r_200Response1.equals(r_200Response2));
        System.assert(r_200Response2.equals(r_200Response1));
        System.assert(r_200Response3.equals(r_200Response4));
        System.assert(r_200Response4.equals(r_200Response3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        Swag200Response r_200Response1 = Swag200Response.getExample();
        Swag200Response r_200Response2 = new Swag200Response();

        System.assertEquals(false, r_200Response1.equals(r_200Response2));
        System.assertEquals(false, r_200Response2.equals(r_200Response1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        Swag200Response r_200Response1 = Swag200Response.getExample();
        Swag200Response r_200Response2 = new Swag200Response();

        System.assertEquals(false, r_200Response1.equals('foo'));
        System.assertEquals(false, r_200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        Swag200Response r_200Response1 = Swag200Response.getExample();
        Swag200Response r_200Response2 = new Swag200Response();
        Swag200Response r_200Response3;

        System.assertEquals(false, r_200Response1.equals(r_200Response3));
        System.assertEquals(false, r_200Response2.equals(r_200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        Swag200Response r_200Response1 = Swag200Response.getExample();
        Swag200Response r_200Response2 = new Swag200Response();

        System.assertEquals(r_200Response1.hashCode(), r_200Response1.hashCode());
        System.assertEquals(r_200Response2.hashCode(), r_200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        Swag200Response r_200Response1 = Swag200Response.getExample();
        Swag200Response r_200Response2 = Swag200Response.getExample();
        Swag200Response r_200Response3 = new Swag200Response();
        Swag200Response r_200Response4 = new Swag200Response();

        System.assert(r_200Response1.equals(r_200Response2));
        System.assert(r_200Response3.equals(r_200Response4));
        System.assertEquals(r_200Response1.hashCode(), r_200Response2.hashCode());
        System.assertEquals(r_200Response3.hashCode(), r_200Response4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        Swag200Response r_200Response = new Swag200Response();
        Map<String, String> propertyMappings = r_200Response.getPropertyMappings();
        System.assertEquals('propertyClass', propertyMappings.get('class'));
    }
}
