@isTest
private class SwagMixedPropertiesAndAdditionalPropTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass1 = SwagMixedPropertiesAndAdditionalProp.getExample();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass2 = mixedPropertiesAndAdditionalPropertiesClass1;
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass3 = new SwagMixedPropertiesAndAdditionalProp();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass4 = mixedPropertiesAndAdditionalPropertiesClass3;

        System.assert(mixedPropertiesAndAdditionalPropertiesClass1.equals(mixedPropertiesAndAdditionalPropertiesClass2));
        System.assert(mixedPropertiesAndAdditionalPropertiesClass2.equals(mixedPropertiesAndAdditionalPropertiesClass1));
        System.assert(mixedPropertiesAndAdditionalPropertiesClass1.equals(mixedPropertiesAndAdditionalPropertiesClass1));
        System.assert(mixedPropertiesAndAdditionalPropertiesClass3.equals(mixedPropertiesAndAdditionalPropertiesClass4));
        System.assert(mixedPropertiesAndAdditionalPropertiesClass4.equals(mixedPropertiesAndAdditionalPropertiesClass3));
        System.assert(mixedPropertiesAndAdditionalPropertiesClass3.equals(mixedPropertiesAndAdditionalPropertiesClass3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass1 = SwagMixedPropertiesAndAdditionalProp.getExample();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass2 = SwagMixedPropertiesAndAdditionalProp.getExample();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass3 = new SwagMixedPropertiesAndAdditionalProp();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass4 = new SwagMixedPropertiesAndAdditionalProp();

        System.assert(mixedPropertiesAndAdditionalPropertiesClass1.equals(mixedPropertiesAndAdditionalPropertiesClass2));
        System.assert(mixedPropertiesAndAdditionalPropertiesClass2.equals(mixedPropertiesAndAdditionalPropertiesClass1));
        System.assert(mixedPropertiesAndAdditionalPropertiesClass3.equals(mixedPropertiesAndAdditionalPropertiesClass4));
        System.assert(mixedPropertiesAndAdditionalPropertiesClass4.equals(mixedPropertiesAndAdditionalPropertiesClass3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass1 = SwagMixedPropertiesAndAdditionalProp.getExample();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass2 = new SwagMixedPropertiesAndAdditionalProp();

        System.assertEquals(false, mixedPropertiesAndAdditionalPropertiesClass1.equals(mixedPropertiesAndAdditionalPropertiesClass2));
        System.assertEquals(false, mixedPropertiesAndAdditionalPropertiesClass2.equals(mixedPropertiesAndAdditionalPropertiesClass1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass1 = SwagMixedPropertiesAndAdditionalProp.getExample();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass2 = new SwagMixedPropertiesAndAdditionalProp();

        System.assertEquals(false, mixedPropertiesAndAdditionalPropertiesClass1.equals('foo'));
        System.assertEquals(false, mixedPropertiesAndAdditionalPropertiesClass2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass1 = SwagMixedPropertiesAndAdditionalProp.getExample();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass2 = new SwagMixedPropertiesAndAdditionalProp();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass3;

        System.assertEquals(false, mixedPropertiesAndAdditionalPropertiesClass1.equals(mixedPropertiesAndAdditionalPropertiesClass3));
        System.assertEquals(false, mixedPropertiesAndAdditionalPropertiesClass2.equals(mixedPropertiesAndAdditionalPropertiesClass3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass1 = SwagMixedPropertiesAndAdditionalProp.getExample();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass2 = new SwagMixedPropertiesAndAdditionalProp();

        System.assertEquals(mixedPropertiesAndAdditionalPropertiesClass1.hashCode(), mixedPropertiesAndAdditionalPropertiesClass1.hashCode());
        System.assertEquals(mixedPropertiesAndAdditionalPropertiesClass2.hashCode(), mixedPropertiesAndAdditionalPropertiesClass2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass1 = SwagMixedPropertiesAndAdditionalProp.getExample();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass2 = SwagMixedPropertiesAndAdditionalProp.getExample();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass3 = new SwagMixedPropertiesAndAdditionalProp();
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass4 = new SwagMixedPropertiesAndAdditionalProp();

        System.assert(mixedPropertiesAndAdditionalPropertiesClass1.equals(mixedPropertiesAndAdditionalPropertiesClass2));
        System.assert(mixedPropertiesAndAdditionalPropertiesClass3.equals(mixedPropertiesAndAdditionalPropertiesClass4));
        System.assertEquals(mixedPropertiesAndAdditionalPropertiesClass1.hashCode(), mixedPropertiesAndAdditionalPropertiesClass2.hashCode());
        System.assertEquals(mixedPropertiesAndAdditionalPropertiesClass3.hashCode(), mixedPropertiesAndAdditionalPropertiesClass4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass = new SwagMixedPropertiesAndAdditionalProp();
        Map<String, String> propertyMappings = mixedPropertiesAndAdditionalPropertiesClass.getPropertyMappings();
        System.assertEquals('r_map', propertyMappings.get('map'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagMixedPropertiesAndAdditionalProp mixedPropertiesAndAdditionalPropertiesClass = new SwagMixedPropertiesAndAdditionalProp();
        System.assertEquals(new Map<String, SwagAnimal>(), mixedPropertiesAndAdditionalPropertiesClass.r_map);
        System.assertEquals(null, mixedPropertiesAndAdditionalPropertiesClass.uuid);
        System.assertEquals(null, mixedPropertiesAndAdditionalPropertiesClass.dateTime);
    }
}
