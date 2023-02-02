@isTest
private class SwagArrayOfNumberOnlyTest {
    @isTest
    private static void equalsSameInstance() {
        SwagArrayOfNumberOnly arrayOfNumberOnly1 = SwagArrayOfNumberOnly.getExample();
        SwagArrayOfNumberOnly arrayOfNumberOnly2 = arrayOfNumberOnly1;
        SwagArrayOfNumberOnly arrayOfNumberOnly3 = new SwagArrayOfNumberOnly();
        SwagArrayOfNumberOnly arrayOfNumberOnly4 = arrayOfNumberOnly3;

        System.assert(arrayOfNumberOnly1.equals(arrayOfNumberOnly2));
        System.assert(arrayOfNumberOnly2.equals(arrayOfNumberOnly1));
        System.assert(arrayOfNumberOnly1.equals(arrayOfNumberOnly1));
        System.assert(arrayOfNumberOnly3.equals(arrayOfNumberOnly4));
        System.assert(arrayOfNumberOnly4.equals(arrayOfNumberOnly3));
        System.assert(arrayOfNumberOnly3.equals(arrayOfNumberOnly3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagArrayOfNumberOnly arrayOfNumberOnly1 = SwagArrayOfNumberOnly.getExample();
        SwagArrayOfNumberOnly arrayOfNumberOnly2 = SwagArrayOfNumberOnly.getExample();
        SwagArrayOfNumberOnly arrayOfNumberOnly3 = new SwagArrayOfNumberOnly();
        SwagArrayOfNumberOnly arrayOfNumberOnly4 = new SwagArrayOfNumberOnly();

        System.assert(arrayOfNumberOnly1.equals(arrayOfNumberOnly2));
        System.assert(arrayOfNumberOnly2.equals(arrayOfNumberOnly1));
        System.assert(arrayOfNumberOnly3.equals(arrayOfNumberOnly4));
        System.assert(arrayOfNumberOnly4.equals(arrayOfNumberOnly3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagArrayOfNumberOnly arrayOfNumberOnly1 = SwagArrayOfNumberOnly.getExample();
        SwagArrayOfNumberOnly arrayOfNumberOnly2 = new SwagArrayOfNumberOnly();

        System.assertEquals(false, arrayOfNumberOnly1.equals(arrayOfNumberOnly2));
        System.assertEquals(false, arrayOfNumberOnly2.equals(arrayOfNumberOnly1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagArrayOfNumberOnly arrayOfNumberOnly1 = SwagArrayOfNumberOnly.getExample();
        SwagArrayOfNumberOnly arrayOfNumberOnly2 = new SwagArrayOfNumberOnly();

        System.assertEquals(false, arrayOfNumberOnly1.equals('foo'));
        System.assertEquals(false, arrayOfNumberOnly2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagArrayOfNumberOnly arrayOfNumberOnly1 = SwagArrayOfNumberOnly.getExample();
        SwagArrayOfNumberOnly arrayOfNumberOnly2 = new SwagArrayOfNumberOnly();
        SwagArrayOfNumberOnly arrayOfNumberOnly3;

        System.assertEquals(false, arrayOfNumberOnly1.equals(arrayOfNumberOnly3));
        System.assertEquals(false, arrayOfNumberOnly2.equals(arrayOfNumberOnly3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagArrayOfNumberOnly arrayOfNumberOnly1 = SwagArrayOfNumberOnly.getExample();
        SwagArrayOfNumberOnly arrayOfNumberOnly2 = new SwagArrayOfNumberOnly();

        System.assertEquals(arrayOfNumberOnly1.hashCode(), arrayOfNumberOnly1.hashCode());
        System.assertEquals(arrayOfNumberOnly2.hashCode(), arrayOfNumberOnly2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagArrayOfNumberOnly arrayOfNumberOnly1 = SwagArrayOfNumberOnly.getExample();
        SwagArrayOfNumberOnly arrayOfNumberOnly2 = SwagArrayOfNumberOnly.getExample();
        SwagArrayOfNumberOnly arrayOfNumberOnly3 = new SwagArrayOfNumberOnly();
        SwagArrayOfNumberOnly arrayOfNumberOnly4 = new SwagArrayOfNumberOnly();

        System.assert(arrayOfNumberOnly1.equals(arrayOfNumberOnly2));
        System.assert(arrayOfNumberOnly3.equals(arrayOfNumberOnly4));
        System.assertEquals(arrayOfNumberOnly1.hashCode(), arrayOfNumberOnly2.hashCode());
        System.assertEquals(arrayOfNumberOnly3.hashCode(), arrayOfNumberOnly4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagArrayOfNumberOnly arrayOfNumberOnly = new SwagArrayOfNumberOnly();
        Map<String, String> propertyMappings = arrayOfNumberOnly.getPropertyMappings();
        System.assertEquals('arrayNumber', propertyMappings.get('ArrayNumber'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagArrayOfNumberOnly arrayOfNumberOnly = new SwagArrayOfNumberOnly();
        System.assertEquals(new List<Double>(), arrayOfNumberOnly.arrayNumber);
    }
}
