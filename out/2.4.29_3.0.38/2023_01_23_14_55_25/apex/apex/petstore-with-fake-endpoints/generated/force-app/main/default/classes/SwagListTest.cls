@isTest
private class SwagListTest {
    @isTest
    private static void equalsSameInstance() {
        SwagList r_list1 = SwagList.getExample();
        SwagList r_list2 = r_list1;
        SwagList r_list3 = new SwagList();
        SwagList r_list4 = r_list3;

        System.assert(r_list1.equals(r_list2));
        System.assert(r_list2.equals(r_list1));
        System.assert(r_list1.equals(r_list1));
        System.assert(r_list3.equals(r_list4));
        System.assert(r_list4.equals(r_list3));
        System.assert(r_list3.equals(r_list3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagList r_list1 = SwagList.getExample();
        SwagList r_list2 = SwagList.getExample();
        SwagList r_list3 = new SwagList();
        SwagList r_list4 = new SwagList();

        System.assert(r_list1.equals(r_list2));
        System.assert(r_list2.equals(r_list1));
        System.assert(r_list3.equals(r_list4));
        System.assert(r_list4.equals(r_list3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagList r_list1 = SwagList.getExample();
        SwagList r_list2 = new SwagList();

        System.assertEquals(false, r_list1.equals(r_list2));
        System.assertEquals(false, r_list2.equals(r_list1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagList r_list1 = SwagList.getExample();
        SwagList r_list2 = new SwagList();

        System.assertEquals(false, r_list1.equals('foo'));
        System.assertEquals(false, r_list2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagList r_list1 = SwagList.getExample();
        SwagList r_list2 = new SwagList();
        SwagList r_list3;

        System.assertEquals(false, r_list1.equals(r_list3));
        System.assertEquals(false, r_list2.equals(r_list3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagList r_list1 = SwagList.getExample();
        SwagList r_list2 = new SwagList();

        System.assertEquals(r_list1.hashCode(), r_list1.hashCode());
        System.assertEquals(r_list2.hashCode(), r_list2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagList r_list1 = SwagList.getExample();
        SwagList r_list2 = SwagList.getExample();
        SwagList r_list3 = new SwagList();
        SwagList r_list4 = new SwagList();

        System.assert(r_list1.equals(r_list2));
        System.assert(r_list3.equals(r_list4));
        System.assertEquals(r_list1.hashCode(), r_list2.hashCode());
        System.assertEquals(r_list3.hashCode(), r_list4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagList r_list = new SwagList();
        Map<String, String> propertyMappings = r_list.getPropertyMappings();
        System.assertEquals('r_123List', propertyMappings.get('123-list'));
    }
}
