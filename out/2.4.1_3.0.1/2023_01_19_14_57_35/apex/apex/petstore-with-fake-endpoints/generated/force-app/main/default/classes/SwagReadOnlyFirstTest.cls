@isTest
private class SwagReadOnlyFirstTest {
    @isTest
    private static void equalsSameInstance() {
        SwagReadOnlyFirst readOnlyFirst1 = SwagReadOnlyFirst.getExample();
        SwagReadOnlyFirst readOnlyFirst2 = readOnlyFirst1;
        SwagReadOnlyFirst readOnlyFirst3 = new SwagReadOnlyFirst();
        SwagReadOnlyFirst readOnlyFirst4 = readOnlyFirst3;

        System.assert(readOnlyFirst1.equals(readOnlyFirst2));
        System.assert(readOnlyFirst2.equals(readOnlyFirst1));
        System.assert(readOnlyFirst1.equals(readOnlyFirst1));
        System.assert(readOnlyFirst3.equals(readOnlyFirst4));
        System.assert(readOnlyFirst4.equals(readOnlyFirst3));
        System.assert(readOnlyFirst3.equals(readOnlyFirst3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagReadOnlyFirst readOnlyFirst1 = SwagReadOnlyFirst.getExample();
        SwagReadOnlyFirst readOnlyFirst2 = SwagReadOnlyFirst.getExample();
        SwagReadOnlyFirst readOnlyFirst3 = new SwagReadOnlyFirst();
        SwagReadOnlyFirst readOnlyFirst4 = new SwagReadOnlyFirst();

        System.assert(readOnlyFirst1.equals(readOnlyFirst2));
        System.assert(readOnlyFirst2.equals(readOnlyFirst1));
        System.assert(readOnlyFirst3.equals(readOnlyFirst4));
        System.assert(readOnlyFirst4.equals(readOnlyFirst3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagReadOnlyFirst readOnlyFirst1 = SwagReadOnlyFirst.getExample();
        SwagReadOnlyFirst readOnlyFirst2 = new SwagReadOnlyFirst();

        System.assertEquals(false, readOnlyFirst1.equals(readOnlyFirst2));
        System.assertEquals(false, readOnlyFirst2.equals(readOnlyFirst1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagReadOnlyFirst readOnlyFirst1 = SwagReadOnlyFirst.getExample();
        SwagReadOnlyFirst readOnlyFirst2 = new SwagReadOnlyFirst();

        System.assertEquals(false, readOnlyFirst1.equals('foo'));
        System.assertEquals(false, readOnlyFirst2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagReadOnlyFirst readOnlyFirst1 = SwagReadOnlyFirst.getExample();
        SwagReadOnlyFirst readOnlyFirst2 = new SwagReadOnlyFirst();
        SwagReadOnlyFirst readOnlyFirst3;

        System.assertEquals(false, readOnlyFirst1.equals(readOnlyFirst3));
        System.assertEquals(false, readOnlyFirst2.equals(readOnlyFirst3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagReadOnlyFirst readOnlyFirst1 = SwagReadOnlyFirst.getExample();
        SwagReadOnlyFirst readOnlyFirst2 = new SwagReadOnlyFirst();

        System.assertEquals(readOnlyFirst1.hashCode(), readOnlyFirst1.hashCode());
        System.assertEquals(readOnlyFirst2.hashCode(), readOnlyFirst2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagReadOnlyFirst readOnlyFirst1 = SwagReadOnlyFirst.getExample();
        SwagReadOnlyFirst readOnlyFirst2 = SwagReadOnlyFirst.getExample();
        SwagReadOnlyFirst readOnlyFirst3 = new SwagReadOnlyFirst();
        SwagReadOnlyFirst readOnlyFirst4 = new SwagReadOnlyFirst();

        System.assert(readOnlyFirst1.equals(readOnlyFirst2));
        System.assert(readOnlyFirst3.equals(readOnlyFirst4));
        System.assertEquals(readOnlyFirst1.hashCode(), readOnlyFirst2.hashCode());
        System.assertEquals(readOnlyFirst3.hashCode(), readOnlyFirst4.hashCode());
    }
}
