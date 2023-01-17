@isTest
private class SwagOuterCompositeTest {
    @isTest
    private static void equalsSameInstance() {
        SwagOuterComposite outerComposite1 = SwagOuterComposite.getExample();
        SwagOuterComposite outerComposite2 = outerComposite1;
        SwagOuterComposite outerComposite3 = new SwagOuterComposite();
        SwagOuterComposite outerComposite4 = outerComposite3;

        System.assert(outerComposite1.equals(outerComposite2));
        System.assert(outerComposite2.equals(outerComposite1));
        System.assert(outerComposite1.equals(outerComposite1));
        System.assert(outerComposite3.equals(outerComposite4));
        System.assert(outerComposite4.equals(outerComposite3));
        System.assert(outerComposite3.equals(outerComposite3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagOuterComposite outerComposite1 = SwagOuterComposite.getExample();
        SwagOuterComposite outerComposite2 = SwagOuterComposite.getExample();
        SwagOuterComposite outerComposite3 = new SwagOuterComposite();
        SwagOuterComposite outerComposite4 = new SwagOuterComposite();

        System.assert(outerComposite1.equals(outerComposite2));
        System.assert(outerComposite2.equals(outerComposite1));
        System.assert(outerComposite3.equals(outerComposite4));
        System.assert(outerComposite4.equals(outerComposite3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagOuterComposite outerComposite1 = SwagOuterComposite.getExample();
        SwagOuterComposite outerComposite2 = new SwagOuterComposite();

        System.assertEquals(false, outerComposite1.equals(outerComposite2));
        System.assertEquals(false, outerComposite2.equals(outerComposite1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagOuterComposite outerComposite1 = SwagOuterComposite.getExample();
        SwagOuterComposite outerComposite2 = new SwagOuterComposite();

        System.assertEquals(false, outerComposite1.equals('foo'));
        System.assertEquals(false, outerComposite2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagOuterComposite outerComposite1 = SwagOuterComposite.getExample();
        SwagOuterComposite outerComposite2 = new SwagOuterComposite();
        SwagOuterComposite outerComposite3;

        System.assertEquals(false, outerComposite1.equals(outerComposite3));
        System.assertEquals(false, outerComposite2.equals(outerComposite3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagOuterComposite outerComposite1 = SwagOuterComposite.getExample();
        SwagOuterComposite outerComposite2 = new SwagOuterComposite();

        System.assertEquals(outerComposite1.hashCode(), outerComposite1.hashCode());
        System.assertEquals(outerComposite2.hashCode(), outerComposite2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagOuterComposite outerComposite1 = SwagOuterComposite.getExample();
        SwagOuterComposite outerComposite2 = SwagOuterComposite.getExample();
        SwagOuterComposite outerComposite3 = new SwagOuterComposite();
        SwagOuterComposite outerComposite4 = new SwagOuterComposite();

        System.assert(outerComposite1.equals(outerComposite2));
        System.assert(outerComposite3.equals(outerComposite4));
        System.assertEquals(outerComposite1.hashCode(), outerComposite2.hashCode());
        System.assertEquals(outerComposite3.hashCode(), outerComposite4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagOuterComposite outerComposite = new SwagOuterComposite();
        Map<String, String> propertyMappings = outerComposite.getPropertyMappings();
        System.assertEquals('myNumber', propertyMappings.get('my_number'));
        System.assertEquals('myString', propertyMappings.get('my_string'));
        System.assertEquals('myBoolean', propertyMappings.get('my_boolean'));
    }
}
