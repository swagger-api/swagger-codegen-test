@isTest
private class SwagMapTestTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMapTest mapTest1 = SwagMapTest.getExample();
        SwagMapTest mapTest2 = mapTest1;
        SwagMapTest mapTest3 = new SwagMapTest();
        SwagMapTest mapTest4 = mapTest3;

        System.assert(mapTest1.equals(mapTest2));
        System.assert(mapTest2.equals(mapTest1));
        System.assert(mapTest1.equals(mapTest1));
        System.assert(mapTest3.equals(mapTest4));
        System.assert(mapTest4.equals(mapTest3));
        System.assert(mapTest3.equals(mapTest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMapTest mapTest1 = SwagMapTest.getExample();
        SwagMapTest mapTest2 = SwagMapTest.getExample();
        SwagMapTest mapTest3 = new SwagMapTest();
        SwagMapTest mapTest4 = new SwagMapTest();

        System.assert(mapTest1.equals(mapTest2));
        System.assert(mapTest2.equals(mapTest1));
        System.assert(mapTest3.equals(mapTest4));
        System.assert(mapTest4.equals(mapTest3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMapTest mapTest1 = SwagMapTest.getExample();
        SwagMapTest mapTest2 = new SwagMapTest();

        System.assertEquals(false, mapTest1.equals(mapTest2));
        System.assertEquals(false, mapTest2.equals(mapTest1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMapTest mapTest1 = SwagMapTest.getExample();
        SwagMapTest mapTest2 = new SwagMapTest();

        System.assertEquals(false, mapTest1.equals('foo'));
        System.assertEquals(false, mapTest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMapTest mapTest1 = SwagMapTest.getExample();
        SwagMapTest mapTest2 = new SwagMapTest();
        SwagMapTest mapTest3;

        System.assertEquals(false, mapTest1.equals(mapTest3));
        System.assertEquals(false, mapTest2.equals(mapTest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMapTest mapTest1 = SwagMapTest.getExample();
        SwagMapTest mapTest2 = new SwagMapTest();

        System.assertEquals(mapTest1.hashCode(), mapTest1.hashCode());
        System.assertEquals(mapTest2.hashCode(), mapTest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMapTest mapTest1 = SwagMapTest.getExample();
        SwagMapTest mapTest2 = SwagMapTest.getExample();
        SwagMapTest mapTest3 = new SwagMapTest();
        SwagMapTest mapTest4 = new SwagMapTest();

        System.assert(mapTest1.equals(mapTest2));
        System.assert(mapTest3.equals(mapTest4));
        System.assertEquals(mapTest1.hashCode(), mapTest2.hashCode());
        System.assertEquals(mapTest3.hashCode(), mapTest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagMapTest mapTest = new SwagMapTest();
        Map<String, String> propertyMappings = mapTest.getPropertyMappings();
        System.assertEquals('mapMapOfString', propertyMappings.get('map_map_of_string'));
        System.assertEquals('mapOfEnumString', propertyMappings.get('map_of_enum_string'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagMapTest mapTest = new SwagMapTest();
        System.assertEquals(new Map<String, Map<String, String>>(), mapTest.mapMapOfString);
        System.assertEquals(new Map<String, RInnerEnum>(), mapTest.mapOfEnumString);
    }
}
