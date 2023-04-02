@isTest
private class SwagHasOnlyReadOnlyTest {
    @isTest
    private static void equalsSameInstance() {
        SwagHasOnlyReadOnly hasOnlyReadOnly1 = SwagHasOnlyReadOnly.getExample();
        SwagHasOnlyReadOnly hasOnlyReadOnly2 = hasOnlyReadOnly1;
        SwagHasOnlyReadOnly hasOnlyReadOnly3 = new SwagHasOnlyReadOnly();
        SwagHasOnlyReadOnly hasOnlyReadOnly4 = hasOnlyReadOnly3;

        System.assert(hasOnlyReadOnly1.equals(hasOnlyReadOnly2));
        System.assert(hasOnlyReadOnly2.equals(hasOnlyReadOnly1));
        System.assert(hasOnlyReadOnly1.equals(hasOnlyReadOnly1));
        System.assert(hasOnlyReadOnly3.equals(hasOnlyReadOnly4));
        System.assert(hasOnlyReadOnly4.equals(hasOnlyReadOnly3));
        System.assert(hasOnlyReadOnly3.equals(hasOnlyReadOnly3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagHasOnlyReadOnly hasOnlyReadOnly1 = SwagHasOnlyReadOnly.getExample();
        SwagHasOnlyReadOnly hasOnlyReadOnly2 = SwagHasOnlyReadOnly.getExample();
        SwagHasOnlyReadOnly hasOnlyReadOnly3 = new SwagHasOnlyReadOnly();
        SwagHasOnlyReadOnly hasOnlyReadOnly4 = new SwagHasOnlyReadOnly();

        System.assert(hasOnlyReadOnly1.equals(hasOnlyReadOnly2));
        System.assert(hasOnlyReadOnly2.equals(hasOnlyReadOnly1));
        System.assert(hasOnlyReadOnly3.equals(hasOnlyReadOnly4));
        System.assert(hasOnlyReadOnly4.equals(hasOnlyReadOnly3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagHasOnlyReadOnly hasOnlyReadOnly1 = SwagHasOnlyReadOnly.getExample();
        SwagHasOnlyReadOnly hasOnlyReadOnly2 = new SwagHasOnlyReadOnly();

        System.assertEquals(false, hasOnlyReadOnly1.equals(hasOnlyReadOnly2));
        System.assertEquals(false, hasOnlyReadOnly2.equals(hasOnlyReadOnly1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagHasOnlyReadOnly hasOnlyReadOnly1 = SwagHasOnlyReadOnly.getExample();
        SwagHasOnlyReadOnly hasOnlyReadOnly2 = new SwagHasOnlyReadOnly();

        System.assertEquals(false, hasOnlyReadOnly1.equals('foo'));
        System.assertEquals(false, hasOnlyReadOnly2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagHasOnlyReadOnly hasOnlyReadOnly1 = SwagHasOnlyReadOnly.getExample();
        SwagHasOnlyReadOnly hasOnlyReadOnly2 = new SwagHasOnlyReadOnly();
        SwagHasOnlyReadOnly hasOnlyReadOnly3;

        System.assertEquals(false, hasOnlyReadOnly1.equals(hasOnlyReadOnly3));
        System.assertEquals(false, hasOnlyReadOnly2.equals(hasOnlyReadOnly3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagHasOnlyReadOnly hasOnlyReadOnly1 = SwagHasOnlyReadOnly.getExample();
        SwagHasOnlyReadOnly hasOnlyReadOnly2 = new SwagHasOnlyReadOnly();

        System.assertEquals(hasOnlyReadOnly1.hashCode(), hasOnlyReadOnly1.hashCode());
        System.assertEquals(hasOnlyReadOnly2.hashCode(), hasOnlyReadOnly2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagHasOnlyReadOnly hasOnlyReadOnly1 = SwagHasOnlyReadOnly.getExample();
        SwagHasOnlyReadOnly hasOnlyReadOnly2 = SwagHasOnlyReadOnly.getExample();
        SwagHasOnlyReadOnly hasOnlyReadOnly3 = new SwagHasOnlyReadOnly();
        SwagHasOnlyReadOnly hasOnlyReadOnly4 = new SwagHasOnlyReadOnly();

        System.assert(hasOnlyReadOnly1.equals(hasOnlyReadOnly2));
        System.assert(hasOnlyReadOnly3.equals(hasOnlyReadOnly4));
        System.assertEquals(hasOnlyReadOnly1.hashCode(), hasOnlyReadOnly2.hashCode());
        System.assertEquals(hasOnlyReadOnly3.hashCode(), hasOnlyReadOnly4.hashCode());
    }
}
