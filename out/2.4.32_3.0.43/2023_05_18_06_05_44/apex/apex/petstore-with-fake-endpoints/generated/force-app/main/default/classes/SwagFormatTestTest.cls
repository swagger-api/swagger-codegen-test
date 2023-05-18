@isTest
private class SwagFormatTestTest {
    @isTest
    private static void equalsSameInstance() {
        SwagFormatTest formatTest1 = SwagFormatTest.getExample();
        SwagFormatTest formatTest2 = formatTest1;
        SwagFormatTest formatTest3 = new SwagFormatTest();
        SwagFormatTest formatTest4 = formatTest3;

        System.assert(formatTest1.equals(formatTest2));
        System.assert(formatTest2.equals(formatTest1));
        System.assert(formatTest1.equals(formatTest1));
        System.assert(formatTest3.equals(formatTest4));
        System.assert(formatTest4.equals(formatTest3));
        System.assert(formatTest3.equals(formatTest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagFormatTest formatTest1 = SwagFormatTest.getExample();
        SwagFormatTest formatTest2 = SwagFormatTest.getExample();
        SwagFormatTest formatTest3 = new SwagFormatTest();
        SwagFormatTest formatTest4 = new SwagFormatTest();

        System.assert(formatTest1.equals(formatTest2));
        System.assert(formatTest2.equals(formatTest1));
        System.assert(formatTest3.equals(formatTest4));
        System.assert(formatTest4.equals(formatTest3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagFormatTest formatTest1 = SwagFormatTest.getExample();
        SwagFormatTest formatTest2 = new SwagFormatTest();

        System.assertEquals(false, formatTest1.equals(formatTest2));
        System.assertEquals(false, formatTest2.equals(formatTest1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagFormatTest formatTest1 = SwagFormatTest.getExample();
        SwagFormatTest formatTest2 = new SwagFormatTest();

        System.assertEquals(false, formatTest1.equals('foo'));
        System.assertEquals(false, formatTest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagFormatTest formatTest1 = SwagFormatTest.getExample();
        SwagFormatTest formatTest2 = new SwagFormatTest();
        SwagFormatTest formatTest3;

        System.assertEquals(false, formatTest1.equals(formatTest3));
        System.assertEquals(false, formatTest2.equals(formatTest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagFormatTest formatTest1 = SwagFormatTest.getExample();
        SwagFormatTest formatTest2 = new SwagFormatTest();

        System.assertEquals(formatTest1.hashCode(), formatTest1.hashCode());
        System.assertEquals(formatTest2.hashCode(), formatTest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagFormatTest formatTest1 = SwagFormatTest.getExample();
        SwagFormatTest formatTest2 = SwagFormatTest.getExample();
        SwagFormatTest formatTest3 = new SwagFormatTest();
        SwagFormatTest formatTest4 = new SwagFormatTest();

        System.assert(formatTest1.equals(formatTest2));
        System.assert(formatTest3.equals(formatTest4));
        System.assertEquals(formatTest1.hashCode(), formatTest2.hashCode());
        System.assertEquals(formatTest3.hashCode(), formatTest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagFormatTest formatTest = new SwagFormatTest();
        Map<String, String> propertyMappings = formatTest.getPropertyMappings();
        System.assertEquals('r_number', propertyMappings.get('number'));
        System.assertEquals('r_float', propertyMappings.get('float'));
        System.assertEquals('r_byte', propertyMappings.get('byte'));
        System.assertEquals('r_date', propertyMappings.get('date'));
    }
}
