@isTest
private class SwagReturnTest {
    @isTest
    private static void equalsSameInstance() {
        SwagReturn r_return1 = SwagReturn.getExample();
        SwagReturn r_return2 = r_return1;
        SwagReturn r_return3 = new SwagReturn();
        SwagReturn r_return4 = r_return3;

        System.assert(r_return1.equals(r_return2));
        System.assert(r_return2.equals(r_return1));
        System.assert(r_return1.equals(r_return1));
        System.assert(r_return3.equals(r_return4));
        System.assert(r_return4.equals(r_return3));
        System.assert(r_return3.equals(r_return3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagReturn r_return1 = SwagReturn.getExample();
        SwagReturn r_return2 = SwagReturn.getExample();
        SwagReturn r_return3 = new SwagReturn();
        SwagReturn r_return4 = new SwagReturn();

        System.assert(r_return1.equals(r_return2));
        System.assert(r_return2.equals(r_return1));
        System.assert(r_return3.equals(r_return4));
        System.assert(r_return4.equals(r_return3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagReturn r_return1 = SwagReturn.getExample();
        SwagReturn r_return2 = new SwagReturn();

        System.assertEquals(false, r_return1.equals(r_return2));
        System.assertEquals(false, r_return2.equals(r_return1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagReturn r_return1 = SwagReturn.getExample();
        SwagReturn r_return2 = new SwagReturn();

        System.assertEquals(false, r_return1.equals('foo'));
        System.assertEquals(false, r_return2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagReturn r_return1 = SwagReturn.getExample();
        SwagReturn r_return2 = new SwagReturn();
        SwagReturn r_return3;

        System.assertEquals(false, r_return1.equals(r_return3));
        System.assertEquals(false, r_return2.equals(r_return3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagReturn r_return1 = SwagReturn.getExample();
        SwagReturn r_return2 = new SwagReturn();

        System.assertEquals(r_return1.hashCode(), r_return1.hashCode());
        System.assertEquals(r_return2.hashCode(), r_return2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagReturn r_return1 = SwagReturn.getExample();
        SwagReturn r_return2 = SwagReturn.getExample();
        SwagReturn r_return3 = new SwagReturn();
        SwagReturn r_return4 = new SwagReturn();

        System.assert(r_return1.equals(r_return2));
        System.assert(r_return3.equals(r_return4));
        System.assertEquals(r_return1.hashCode(), r_return2.hashCode());
        System.assertEquals(r_return3.hashCode(), r_return4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagReturn r_return = new SwagReturn();
        Map<String, String> propertyMappings = r_return.getPropertyMappings();
        System.assertEquals('r_return', propertyMappings.get('return'));
    }
}
