@isTest
private class SwagNumberOnlyTest {
    @isTest
    private static void equalsSameInstance() {
        SwagNumberOnly numberOnly1 = SwagNumberOnly.getExample();
        SwagNumberOnly numberOnly2 = numberOnly1;
        SwagNumberOnly numberOnly3 = new SwagNumberOnly();
        SwagNumberOnly numberOnly4 = numberOnly3;

        System.assert(numberOnly1.equals(numberOnly2));
        System.assert(numberOnly2.equals(numberOnly1));
        System.assert(numberOnly1.equals(numberOnly1));
        System.assert(numberOnly3.equals(numberOnly4));
        System.assert(numberOnly4.equals(numberOnly3));
        System.assert(numberOnly3.equals(numberOnly3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagNumberOnly numberOnly1 = SwagNumberOnly.getExample();
        SwagNumberOnly numberOnly2 = SwagNumberOnly.getExample();
        SwagNumberOnly numberOnly3 = new SwagNumberOnly();
        SwagNumberOnly numberOnly4 = new SwagNumberOnly();

        System.assert(numberOnly1.equals(numberOnly2));
        System.assert(numberOnly2.equals(numberOnly1));
        System.assert(numberOnly3.equals(numberOnly4));
        System.assert(numberOnly4.equals(numberOnly3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagNumberOnly numberOnly1 = SwagNumberOnly.getExample();
        SwagNumberOnly numberOnly2 = new SwagNumberOnly();

        System.assertEquals(false, numberOnly1.equals(numberOnly2));
        System.assertEquals(false, numberOnly2.equals(numberOnly1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagNumberOnly numberOnly1 = SwagNumberOnly.getExample();
        SwagNumberOnly numberOnly2 = new SwagNumberOnly();

        System.assertEquals(false, numberOnly1.equals('foo'));
        System.assertEquals(false, numberOnly2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagNumberOnly numberOnly1 = SwagNumberOnly.getExample();
        SwagNumberOnly numberOnly2 = new SwagNumberOnly();
        SwagNumberOnly numberOnly3;

        System.assertEquals(false, numberOnly1.equals(numberOnly3));
        System.assertEquals(false, numberOnly2.equals(numberOnly3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagNumberOnly numberOnly1 = SwagNumberOnly.getExample();
        SwagNumberOnly numberOnly2 = new SwagNumberOnly();

        System.assertEquals(numberOnly1.hashCode(), numberOnly1.hashCode());
        System.assertEquals(numberOnly2.hashCode(), numberOnly2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagNumberOnly numberOnly1 = SwagNumberOnly.getExample();
        SwagNumberOnly numberOnly2 = SwagNumberOnly.getExample();
        SwagNumberOnly numberOnly3 = new SwagNumberOnly();
        SwagNumberOnly numberOnly4 = new SwagNumberOnly();

        System.assert(numberOnly1.equals(numberOnly2));
        System.assert(numberOnly3.equals(numberOnly4));
        System.assertEquals(numberOnly1.hashCode(), numberOnly2.hashCode());
        System.assertEquals(numberOnly3.hashCode(), numberOnly4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagNumberOnly numberOnly = new SwagNumberOnly();
        Map<String, String> propertyMappings = numberOnly.getPropertyMappings();
        System.assertEquals('justNumber', propertyMappings.get('JustNumber'));
    }
}
