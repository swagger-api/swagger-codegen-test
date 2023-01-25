@isTest
private class SwagNameTest {
    @isTest
    private static void equalsSameInstance() {
        SwagName name1 = SwagName.getExample();
        SwagName name2 = name1;
        SwagName name3 = new SwagName();
        SwagName name4 = name3;

        System.assert(name1.equals(name2));
        System.assert(name2.equals(name1));
        System.assert(name1.equals(name1));
        System.assert(name3.equals(name4));
        System.assert(name4.equals(name3));
        System.assert(name3.equals(name3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagName name1 = SwagName.getExample();
        SwagName name2 = SwagName.getExample();
        SwagName name3 = new SwagName();
        SwagName name4 = new SwagName();

        System.assert(name1.equals(name2));
        System.assert(name2.equals(name1));
        System.assert(name3.equals(name4));
        System.assert(name4.equals(name3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagName name1 = SwagName.getExample();
        SwagName name2 = new SwagName();

        System.assertEquals(false, name1.equals(name2));
        System.assertEquals(false, name2.equals(name1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagName name1 = SwagName.getExample();
        SwagName name2 = new SwagName();

        System.assertEquals(false, name1.equals('foo'));
        System.assertEquals(false, name2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagName name1 = SwagName.getExample();
        SwagName name2 = new SwagName();
        SwagName name3;

        System.assertEquals(false, name1.equals(name3));
        System.assertEquals(false, name2.equals(name3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagName name1 = SwagName.getExample();
        SwagName name2 = new SwagName();

        System.assertEquals(name1.hashCode(), name1.hashCode());
        System.assertEquals(name2.hashCode(), name2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagName name1 = SwagName.getExample();
        SwagName name2 = SwagName.getExample();
        SwagName name3 = new SwagName();
        SwagName name4 = new SwagName();

        System.assert(name1.equals(name2));
        System.assert(name3.equals(name4));
        System.assertEquals(name1.hashCode(), name2.hashCode());
        System.assertEquals(name3.hashCode(), name4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagName name = new SwagName();
        Map<String, String> propertyMappings = name.getPropertyMappings();
        System.assertEquals('snakeCase', propertyMappings.get('snake_case'));
        System.assertEquals('r_123Number', propertyMappings.get('123Number'));
    }
}
