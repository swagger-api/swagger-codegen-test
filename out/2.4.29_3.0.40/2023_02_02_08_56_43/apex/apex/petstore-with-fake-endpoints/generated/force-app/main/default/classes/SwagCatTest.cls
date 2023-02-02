@isTest
private class SwagCatTest {
    @isTest
    private static void equalsSameInstance() {
        SwagCat cat1 = SwagCat.getExample();
        SwagCat cat2 = cat1;
        SwagCat cat3 = new SwagCat();
        SwagCat cat4 = cat3;

        System.assert(cat1.equals(cat2));
        System.assert(cat2.equals(cat1));
        System.assert(cat1.equals(cat1));
        System.assert(cat3.equals(cat4));
        System.assert(cat4.equals(cat3));
        System.assert(cat3.equals(cat3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagCat cat1 = SwagCat.getExample();
        SwagCat cat2 = SwagCat.getExample();
        SwagCat cat3 = new SwagCat();
        SwagCat cat4 = new SwagCat();

        System.assert(cat1.equals(cat2));
        System.assert(cat2.equals(cat1));
        System.assert(cat3.equals(cat4));
        System.assert(cat4.equals(cat3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagCat cat1 = SwagCat.getExample();
        SwagCat cat2 = new SwagCat();

        System.assertEquals(false, cat1.equals(cat2));
        System.assertEquals(false, cat2.equals(cat1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagCat cat1 = SwagCat.getExample();
        SwagCat cat2 = new SwagCat();

        System.assertEquals(false, cat1.equals('foo'));
        System.assertEquals(false, cat2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagCat cat1 = SwagCat.getExample();
        SwagCat cat2 = new SwagCat();
        SwagCat cat3;

        System.assertEquals(false, cat1.equals(cat3));
        System.assertEquals(false, cat2.equals(cat3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagCat cat1 = SwagCat.getExample();
        SwagCat cat2 = new SwagCat();

        System.assertEquals(cat1.hashCode(), cat1.hashCode());
        System.assertEquals(cat2.hashCode(), cat2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagCat cat1 = SwagCat.getExample();
        SwagCat cat2 = SwagCat.getExample();
        SwagCat cat3 = new SwagCat();
        SwagCat cat4 = new SwagCat();

        System.assert(cat1.equals(cat2));
        System.assert(cat3.equals(cat4));
        System.assertEquals(cat1.hashCode(), cat2.hashCode());
        System.assertEquals(cat3.hashCode(), cat4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagCat cat = new SwagCat();
        System.assertEquals(null, cat.declawed);
    }
}
