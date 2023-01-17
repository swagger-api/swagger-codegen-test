@isTest
private class SwagCapitalizationTest {
    @isTest
    private static void equalsSameInstance() {
        SwagCapitalization capitalization1 = SwagCapitalization.getExample();
        SwagCapitalization capitalization2 = capitalization1;
        SwagCapitalization capitalization3 = new SwagCapitalization();
        SwagCapitalization capitalization4 = capitalization3;

        System.assert(capitalization1.equals(capitalization2));
        System.assert(capitalization2.equals(capitalization1));
        System.assert(capitalization1.equals(capitalization1));
        System.assert(capitalization3.equals(capitalization4));
        System.assert(capitalization4.equals(capitalization3));
        System.assert(capitalization3.equals(capitalization3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagCapitalization capitalization1 = SwagCapitalization.getExample();
        SwagCapitalization capitalization2 = SwagCapitalization.getExample();
        SwagCapitalization capitalization3 = new SwagCapitalization();
        SwagCapitalization capitalization4 = new SwagCapitalization();

        System.assert(capitalization1.equals(capitalization2));
        System.assert(capitalization2.equals(capitalization1));
        System.assert(capitalization3.equals(capitalization4));
        System.assert(capitalization4.equals(capitalization3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagCapitalization capitalization1 = SwagCapitalization.getExample();
        SwagCapitalization capitalization2 = new SwagCapitalization();

        System.assertEquals(false, capitalization1.equals(capitalization2));
        System.assertEquals(false, capitalization2.equals(capitalization1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagCapitalization capitalization1 = SwagCapitalization.getExample();
        SwagCapitalization capitalization2 = new SwagCapitalization();

        System.assertEquals(false, capitalization1.equals('foo'));
        System.assertEquals(false, capitalization2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagCapitalization capitalization1 = SwagCapitalization.getExample();
        SwagCapitalization capitalization2 = new SwagCapitalization();
        SwagCapitalization capitalization3;

        System.assertEquals(false, capitalization1.equals(capitalization3));
        System.assertEquals(false, capitalization2.equals(capitalization3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagCapitalization capitalization1 = SwagCapitalization.getExample();
        SwagCapitalization capitalization2 = new SwagCapitalization();

        System.assertEquals(capitalization1.hashCode(), capitalization1.hashCode());
        System.assertEquals(capitalization2.hashCode(), capitalization2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagCapitalization capitalization1 = SwagCapitalization.getExample();
        SwagCapitalization capitalization2 = SwagCapitalization.getExample();
        SwagCapitalization capitalization3 = new SwagCapitalization();
        SwagCapitalization capitalization4 = new SwagCapitalization();

        System.assert(capitalization1.equals(capitalization2));
        System.assert(capitalization3.equals(capitalization4));
        System.assertEquals(capitalization1.hashCode(), capitalization2.hashCode());
        System.assertEquals(capitalization3.hashCode(), capitalization4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagCapitalization capitalization = new SwagCapitalization();
        Map<String, String> propertyMappings = capitalization.getPropertyMappings();
        System.assertEquals('capitalCamel', propertyMappings.get('CapitalCamel'));
        System.assertEquals('smallSnake', propertyMappings.get('small_Snake'));
        System.assertEquals('capitalSnake', propertyMappings.get('Capital_Snake'));
        System.assertEquals('scAETHFlowPoints', propertyMappings.get('SCA_ETH_Flow_Points'));
    }
}
