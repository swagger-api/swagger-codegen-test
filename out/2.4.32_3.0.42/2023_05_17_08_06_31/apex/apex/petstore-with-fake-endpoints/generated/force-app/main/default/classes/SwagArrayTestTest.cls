@isTest
private class SwagArrayTestTest {
    @isTest
    private static void equalsSameInstance() {
        SwagArrayTest arrayTest1 = SwagArrayTest.getExample();
        SwagArrayTest arrayTest2 = arrayTest1;
        SwagArrayTest arrayTest3 = new SwagArrayTest();
        SwagArrayTest arrayTest4 = arrayTest3;

        System.assert(arrayTest1.equals(arrayTest2));
        System.assert(arrayTest2.equals(arrayTest1));
        System.assert(arrayTest1.equals(arrayTest1));
        System.assert(arrayTest3.equals(arrayTest4));
        System.assert(arrayTest4.equals(arrayTest3));
        System.assert(arrayTest3.equals(arrayTest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagArrayTest arrayTest1 = SwagArrayTest.getExample();
        SwagArrayTest arrayTest2 = SwagArrayTest.getExample();
        SwagArrayTest arrayTest3 = new SwagArrayTest();
        SwagArrayTest arrayTest4 = new SwagArrayTest();

        System.assert(arrayTest1.equals(arrayTest2));
        System.assert(arrayTest2.equals(arrayTest1));
        System.assert(arrayTest3.equals(arrayTest4));
        System.assert(arrayTest4.equals(arrayTest3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagArrayTest arrayTest1 = SwagArrayTest.getExample();
        SwagArrayTest arrayTest2 = new SwagArrayTest();

        System.assertEquals(false, arrayTest1.equals(arrayTest2));
        System.assertEquals(false, arrayTest2.equals(arrayTest1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagArrayTest arrayTest1 = SwagArrayTest.getExample();
        SwagArrayTest arrayTest2 = new SwagArrayTest();

        System.assertEquals(false, arrayTest1.equals('foo'));
        System.assertEquals(false, arrayTest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagArrayTest arrayTest1 = SwagArrayTest.getExample();
        SwagArrayTest arrayTest2 = new SwagArrayTest();
        SwagArrayTest arrayTest3;

        System.assertEquals(false, arrayTest1.equals(arrayTest3));
        System.assertEquals(false, arrayTest2.equals(arrayTest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagArrayTest arrayTest1 = SwagArrayTest.getExample();
        SwagArrayTest arrayTest2 = new SwagArrayTest();

        System.assertEquals(arrayTest1.hashCode(), arrayTest1.hashCode());
        System.assertEquals(arrayTest2.hashCode(), arrayTest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagArrayTest arrayTest1 = SwagArrayTest.getExample();
        SwagArrayTest arrayTest2 = SwagArrayTest.getExample();
        SwagArrayTest arrayTest3 = new SwagArrayTest();
        SwagArrayTest arrayTest4 = new SwagArrayTest();

        System.assert(arrayTest1.equals(arrayTest2));
        System.assert(arrayTest3.equals(arrayTest4));
        System.assertEquals(arrayTest1.hashCode(), arrayTest2.hashCode());
        System.assertEquals(arrayTest3.hashCode(), arrayTest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagArrayTest arrayTest = new SwagArrayTest();
        Map<String, String> propertyMappings = arrayTest.getPropertyMappings();
        System.assertEquals('arrayOfString', propertyMappings.get('array_of_string'));
        System.assertEquals('arrayArrayOfInteger', propertyMappings.get('array_array_of_integer'));
        System.assertEquals('arrayArrayOfModel', propertyMappings.get('array_array_of_model'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagArrayTest arrayTest = new SwagArrayTest();
        System.assertEquals(new List<String>(), arrayTest.arrayOfString);
        System.assertEquals(new List<List<Long>>(), arrayTest.arrayArrayOfInteger);
        System.assertEquals(new List<List<SwagReadOnlyFirst>>(), arrayTest.arrayArrayOfModel);
    }
}
