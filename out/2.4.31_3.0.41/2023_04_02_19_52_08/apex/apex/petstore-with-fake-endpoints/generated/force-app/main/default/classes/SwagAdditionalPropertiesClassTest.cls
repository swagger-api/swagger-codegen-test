@isTest
private class SwagAdditionalPropertiesClassTest {
    @isTest
    private static void equalsSameInstance() {
        SwagAdditionalPropertiesClass additionalPropertiesClass1 = SwagAdditionalPropertiesClass.getExample();
        SwagAdditionalPropertiesClass additionalPropertiesClass2 = additionalPropertiesClass1;
        SwagAdditionalPropertiesClass additionalPropertiesClass3 = new SwagAdditionalPropertiesClass();
        SwagAdditionalPropertiesClass additionalPropertiesClass4 = additionalPropertiesClass3;

        System.assert(additionalPropertiesClass1.equals(additionalPropertiesClass2));
        System.assert(additionalPropertiesClass2.equals(additionalPropertiesClass1));
        System.assert(additionalPropertiesClass1.equals(additionalPropertiesClass1));
        System.assert(additionalPropertiesClass3.equals(additionalPropertiesClass4));
        System.assert(additionalPropertiesClass4.equals(additionalPropertiesClass3));
        System.assert(additionalPropertiesClass3.equals(additionalPropertiesClass3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagAdditionalPropertiesClass additionalPropertiesClass1 = SwagAdditionalPropertiesClass.getExample();
        SwagAdditionalPropertiesClass additionalPropertiesClass2 = SwagAdditionalPropertiesClass.getExample();
        SwagAdditionalPropertiesClass additionalPropertiesClass3 = new SwagAdditionalPropertiesClass();
        SwagAdditionalPropertiesClass additionalPropertiesClass4 = new SwagAdditionalPropertiesClass();

        System.assert(additionalPropertiesClass1.equals(additionalPropertiesClass2));
        System.assert(additionalPropertiesClass2.equals(additionalPropertiesClass1));
        System.assert(additionalPropertiesClass3.equals(additionalPropertiesClass4));
        System.assert(additionalPropertiesClass4.equals(additionalPropertiesClass3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagAdditionalPropertiesClass additionalPropertiesClass1 = SwagAdditionalPropertiesClass.getExample();
        SwagAdditionalPropertiesClass additionalPropertiesClass2 = new SwagAdditionalPropertiesClass();

        System.assertEquals(false, additionalPropertiesClass1.equals(additionalPropertiesClass2));
        System.assertEquals(false, additionalPropertiesClass2.equals(additionalPropertiesClass1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagAdditionalPropertiesClass additionalPropertiesClass1 = SwagAdditionalPropertiesClass.getExample();
        SwagAdditionalPropertiesClass additionalPropertiesClass2 = new SwagAdditionalPropertiesClass();

        System.assertEquals(false, additionalPropertiesClass1.equals('foo'));
        System.assertEquals(false, additionalPropertiesClass2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagAdditionalPropertiesClass additionalPropertiesClass1 = SwagAdditionalPropertiesClass.getExample();
        SwagAdditionalPropertiesClass additionalPropertiesClass2 = new SwagAdditionalPropertiesClass();
        SwagAdditionalPropertiesClass additionalPropertiesClass3;

        System.assertEquals(false, additionalPropertiesClass1.equals(additionalPropertiesClass3));
        System.assertEquals(false, additionalPropertiesClass2.equals(additionalPropertiesClass3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagAdditionalPropertiesClass additionalPropertiesClass1 = SwagAdditionalPropertiesClass.getExample();
        SwagAdditionalPropertiesClass additionalPropertiesClass2 = new SwagAdditionalPropertiesClass();

        System.assertEquals(additionalPropertiesClass1.hashCode(), additionalPropertiesClass1.hashCode());
        System.assertEquals(additionalPropertiesClass2.hashCode(), additionalPropertiesClass2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagAdditionalPropertiesClass additionalPropertiesClass1 = SwagAdditionalPropertiesClass.getExample();
        SwagAdditionalPropertiesClass additionalPropertiesClass2 = SwagAdditionalPropertiesClass.getExample();
        SwagAdditionalPropertiesClass additionalPropertiesClass3 = new SwagAdditionalPropertiesClass();
        SwagAdditionalPropertiesClass additionalPropertiesClass4 = new SwagAdditionalPropertiesClass();

        System.assert(additionalPropertiesClass1.equals(additionalPropertiesClass2));
        System.assert(additionalPropertiesClass3.equals(additionalPropertiesClass4));
        System.assertEquals(additionalPropertiesClass1.hashCode(), additionalPropertiesClass2.hashCode());
        System.assertEquals(additionalPropertiesClass3.hashCode(), additionalPropertiesClass4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagAdditionalPropertiesClass additionalPropertiesClass = new SwagAdditionalPropertiesClass();
        Map<String, String> propertyMappings = additionalPropertiesClass.getPropertyMappings();
        System.assertEquals('mapProperty', propertyMappings.get('map_property'));
        System.assertEquals('mapOfMapProperty', propertyMappings.get('map_of_map_property'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagAdditionalPropertiesClass additionalPropertiesClass = new SwagAdditionalPropertiesClass();
        System.assertEquals(new Map<String, String>(), additionalPropertiesClass.mapProperty);
        System.assertEquals(new Map<String, Map<String, String>>(), additionalPropertiesClass.mapOfMapProperty);
    }
}
