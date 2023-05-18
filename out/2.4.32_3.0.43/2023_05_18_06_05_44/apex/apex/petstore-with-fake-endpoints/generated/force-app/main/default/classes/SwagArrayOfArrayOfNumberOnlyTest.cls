@isTest
private class SwagArrayOfArrayOfNumberOnlyTest {
    @isTest
    private static void equalsSameInstance() {
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly1 = SwagArrayOfArrayOfNumberOnly.getExample();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly2 = arrayOfArrayOfNumberOnly1;
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly3 = new SwagArrayOfArrayOfNumberOnly();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly4 = arrayOfArrayOfNumberOnly3;

        System.assert(arrayOfArrayOfNumberOnly1.equals(arrayOfArrayOfNumberOnly2));
        System.assert(arrayOfArrayOfNumberOnly2.equals(arrayOfArrayOfNumberOnly1));
        System.assert(arrayOfArrayOfNumberOnly1.equals(arrayOfArrayOfNumberOnly1));
        System.assert(arrayOfArrayOfNumberOnly3.equals(arrayOfArrayOfNumberOnly4));
        System.assert(arrayOfArrayOfNumberOnly4.equals(arrayOfArrayOfNumberOnly3));
        System.assert(arrayOfArrayOfNumberOnly3.equals(arrayOfArrayOfNumberOnly3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly1 = SwagArrayOfArrayOfNumberOnly.getExample();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly2 = SwagArrayOfArrayOfNumberOnly.getExample();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly3 = new SwagArrayOfArrayOfNumberOnly();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly4 = new SwagArrayOfArrayOfNumberOnly();

        System.assert(arrayOfArrayOfNumberOnly1.equals(arrayOfArrayOfNumberOnly2));
        System.assert(arrayOfArrayOfNumberOnly2.equals(arrayOfArrayOfNumberOnly1));
        System.assert(arrayOfArrayOfNumberOnly3.equals(arrayOfArrayOfNumberOnly4));
        System.assert(arrayOfArrayOfNumberOnly4.equals(arrayOfArrayOfNumberOnly3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly1 = SwagArrayOfArrayOfNumberOnly.getExample();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly2 = new SwagArrayOfArrayOfNumberOnly();

        System.assertEquals(false, arrayOfArrayOfNumberOnly1.equals(arrayOfArrayOfNumberOnly2));
        System.assertEquals(false, arrayOfArrayOfNumberOnly2.equals(arrayOfArrayOfNumberOnly1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly1 = SwagArrayOfArrayOfNumberOnly.getExample();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly2 = new SwagArrayOfArrayOfNumberOnly();

        System.assertEquals(false, arrayOfArrayOfNumberOnly1.equals('foo'));
        System.assertEquals(false, arrayOfArrayOfNumberOnly2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly1 = SwagArrayOfArrayOfNumberOnly.getExample();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly2 = new SwagArrayOfArrayOfNumberOnly();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly3;

        System.assertEquals(false, arrayOfArrayOfNumberOnly1.equals(arrayOfArrayOfNumberOnly3));
        System.assertEquals(false, arrayOfArrayOfNumberOnly2.equals(arrayOfArrayOfNumberOnly3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly1 = SwagArrayOfArrayOfNumberOnly.getExample();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly2 = new SwagArrayOfArrayOfNumberOnly();

        System.assertEquals(arrayOfArrayOfNumberOnly1.hashCode(), arrayOfArrayOfNumberOnly1.hashCode());
        System.assertEquals(arrayOfArrayOfNumberOnly2.hashCode(), arrayOfArrayOfNumberOnly2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly1 = SwagArrayOfArrayOfNumberOnly.getExample();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly2 = SwagArrayOfArrayOfNumberOnly.getExample();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly3 = new SwagArrayOfArrayOfNumberOnly();
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly4 = new SwagArrayOfArrayOfNumberOnly();

        System.assert(arrayOfArrayOfNumberOnly1.equals(arrayOfArrayOfNumberOnly2));
        System.assert(arrayOfArrayOfNumberOnly3.equals(arrayOfArrayOfNumberOnly4));
        System.assertEquals(arrayOfArrayOfNumberOnly1.hashCode(), arrayOfArrayOfNumberOnly2.hashCode());
        System.assertEquals(arrayOfArrayOfNumberOnly3.hashCode(), arrayOfArrayOfNumberOnly4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly = new SwagArrayOfArrayOfNumberOnly();
        Map<String, String> propertyMappings = arrayOfArrayOfNumberOnly.getPropertyMappings();
        System.assertEquals('arrayArrayNumber', propertyMappings.get('ArrayArrayNumber'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly = new SwagArrayOfArrayOfNumberOnly();
        System.assertEquals(new List<List<Double>>(), arrayOfArrayOfNumberOnly.arrayArrayNumber);
    }
}
