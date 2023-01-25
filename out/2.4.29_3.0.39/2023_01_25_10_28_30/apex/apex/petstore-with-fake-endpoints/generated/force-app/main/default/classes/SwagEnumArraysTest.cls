@isTest
private class SwagEnumArraysTest {
    @isTest
    private static void equalsSameInstance() {
        SwagEnumArrays enumArrays1 = SwagEnumArrays.getExample();
        SwagEnumArrays enumArrays2 = enumArrays1;
        SwagEnumArrays enumArrays3 = new SwagEnumArrays();
        SwagEnumArrays enumArrays4 = enumArrays3;

        System.assert(enumArrays1.equals(enumArrays2));
        System.assert(enumArrays2.equals(enumArrays1));
        System.assert(enumArrays1.equals(enumArrays1));
        System.assert(enumArrays3.equals(enumArrays4));
        System.assert(enumArrays4.equals(enumArrays3));
        System.assert(enumArrays3.equals(enumArrays3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagEnumArrays enumArrays1 = SwagEnumArrays.getExample();
        SwagEnumArrays enumArrays2 = SwagEnumArrays.getExample();
        SwagEnumArrays enumArrays3 = new SwagEnumArrays();
        SwagEnumArrays enumArrays4 = new SwagEnumArrays();

        System.assert(enumArrays1.equals(enumArrays2));
        System.assert(enumArrays2.equals(enumArrays1));
        System.assert(enumArrays3.equals(enumArrays4));
        System.assert(enumArrays4.equals(enumArrays3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagEnumArrays enumArrays1 = SwagEnumArrays.getExample();
        SwagEnumArrays enumArrays2 = new SwagEnumArrays();

        System.assertEquals(false, enumArrays1.equals(enumArrays2));
        System.assertEquals(false, enumArrays2.equals(enumArrays1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagEnumArrays enumArrays1 = SwagEnumArrays.getExample();
        SwagEnumArrays enumArrays2 = new SwagEnumArrays();

        System.assertEquals(false, enumArrays1.equals('foo'));
        System.assertEquals(false, enumArrays2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagEnumArrays enumArrays1 = SwagEnumArrays.getExample();
        SwagEnumArrays enumArrays2 = new SwagEnumArrays();
        SwagEnumArrays enumArrays3;

        System.assertEquals(false, enumArrays1.equals(enumArrays3));
        System.assertEquals(false, enumArrays2.equals(enumArrays3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagEnumArrays enumArrays1 = SwagEnumArrays.getExample();
        SwagEnumArrays enumArrays2 = new SwagEnumArrays();

        System.assertEquals(enumArrays1.hashCode(), enumArrays1.hashCode());
        System.assertEquals(enumArrays2.hashCode(), enumArrays2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagEnumArrays enumArrays1 = SwagEnumArrays.getExample();
        SwagEnumArrays enumArrays2 = SwagEnumArrays.getExample();
        SwagEnumArrays enumArrays3 = new SwagEnumArrays();
        SwagEnumArrays enumArrays4 = new SwagEnumArrays();

        System.assert(enumArrays1.equals(enumArrays2));
        System.assert(enumArrays3.equals(enumArrays4));
        System.assertEquals(enumArrays1.hashCode(), enumArrays2.hashCode());
        System.assertEquals(enumArrays3.hashCode(), enumArrays4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagEnumArrays enumArrays = new SwagEnumArrays();
        Map<String, String> propertyMappings = enumArrays.getPropertyMappings();
        System.assertEquals('justSymbol', propertyMappings.get('just_symbol'));
        System.assertEquals('arrayEnum', propertyMappings.get('array_enum'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagEnumArrays enumArrays = new SwagEnumArrays();
        System.assertEquals(new List<ArrayEnumEnum>(), enumArrays.arrayEnum);
        System.assertEquals(null, enumArrays.justSymbol);
    }
}
