@isTest
private class SwagEnumTestTest {
    @isTest
    private static void equalsSameInstance() {
        SwagEnumTest enumTest1 = SwagEnumTest.getExample();
        SwagEnumTest enumTest2 = enumTest1;
        SwagEnumTest enumTest3 = new SwagEnumTest();
        SwagEnumTest enumTest4 = enumTest3;

        System.assert(enumTest1.equals(enumTest2));
        System.assert(enumTest2.equals(enumTest1));
        System.assert(enumTest1.equals(enumTest1));
        System.assert(enumTest3.equals(enumTest4));
        System.assert(enumTest4.equals(enumTest3));
        System.assert(enumTest3.equals(enumTest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagEnumTest enumTest1 = SwagEnumTest.getExample();
        SwagEnumTest enumTest2 = SwagEnumTest.getExample();
        SwagEnumTest enumTest3 = new SwagEnumTest();
        SwagEnumTest enumTest4 = new SwagEnumTest();

        System.assert(enumTest1.equals(enumTest2));
        System.assert(enumTest2.equals(enumTest1));
        System.assert(enumTest3.equals(enumTest4));
        System.assert(enumTest4.equals(enumTest3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagEnumTest enumTest1 = SwagEnumTest.getExample();
        SwagEnumTest enumTest2 = new SwagEnumTest();

        System.assertEquals(false, enumTest1.equals(enumTest2));
        System.assertEquals(false, enumTest2.equals(enumTest1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagEnumTest enumTest1 = SwagEnumTest.getExample();
        SwagEnumTest enumTest2 = new SwagEnumTest();

        System.assertEquals(false, enumTest1.equals('foo'));
        System.assertEquals(false, enumTest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagEnumTest enumTest1 = SwagEnumTest.getExample();
        SwagEnumTest enumTest2 = new SwagEnumTest();
        SwagEnumTest enumTest3;

        System.assertEquals(false, enumTest1.equals(enumTest3));
        System.assertEquals(false, enumTest2.equals(enumTest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagEnumTest enumTest1 = SwagEnumTest.getExample();
        SwagEnumTest enumTest2 = new SwagEnumTest();

        System.assertEquals(enumTest1.hashCode(), enumTest1.hashCode());
        System.assertEquals(enumTest2.hashCode(), enumTest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagEnumTest enumTest1 = SwagEnumTest.getExample();
        SwagEnumTest enumTest2 = SwagEnumTest.getExample();
        SwagEnumTest enumTest3 = new SwagEnumTest();
        SwagEnumTest enumTest4 = new SwagEnumTest();

        System.assert(enumTest1.equals(enumTest2));
        System.assert(enumTest3.equals(enumTest4));
        System.assertEquals(enumTest1.hashCode(), enumTest2.hashCode());
        System.assertEquals(enumTest3.hashCode(), enumTest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagEnumTest enumTest = new SwagEnumTest();
        Map<String, String> propertyMappings = enumTest.getPropertyMappings();
        System.assertEquals('enumString', propertyMappings.get('enum_string'));
        System.assertEquals('enumStringRequired', propertyMappings.get('enum_string_required'));
        System.assertEquals('enumInteger', propertyMappings.get('enum_integer'));
        System.assertEquals('enumNumber', propertyMappings.get('enum_number'));
    }
}
