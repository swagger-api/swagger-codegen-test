@isTest
private class SwagSpecialModelNameTest {
    @isTest
    private static void equalsSameInstance() {
        SwagSpecialModelName specialModelName1 = SwagSpecialModelName.getExample();
        SwagSpecialModelName specialModelName2 = specialModelName1;
        SwagSpecialModelName specialModelName3 = new SwagSpecialModelName();
        SwagSpecialModelName specialModelName4 = specialModelName3;

        System.assert(specialModelName1.equals(specialModelName2));
        System.assert(specialModelName2.equals(specialModelName1));
        System.assert(specialModelName1.equals(specialModelName1));
        System.assert(specialModelName3.equals(specialModelName4));
        System.assert(specialModelName4.equals(specialModelName3));
        System.assert(specialModelName3.equals(specialModelName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagSpecialModelName specialModelName1 = SwagSpecialModelName.getExample();
        SwagSpecialModelName specialModelName2 = SwagSpecialModelName.getExample();
        SwagSpecialModelName specialModelName3 = new SwagSpecialModelName();
        SwagSpecialModelName specialModelName4 = new SwagSpecialModelName();

        System.assert(specialModelName1.equals(specialModelName2));
        System.assert(specialModelName2.equals(specialModelName1));
        System.assert(specialModelName3.equals(specialModelName4));
        System.assert(specialModelName4.equals(specialModelName3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagSpecialModelName specialModelName1 = SwagSpecialModelName.getExample();
        SwagSpecialModelName specialModelName2 = new SwagSpecialModelName();

        System.assertEquals(false, specialModelName1.equals(specialModelName2));
        System.assertEquals(false, specialModelName2.equals(specialModelName1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagSpecialModelName specialModelName1 = SwagSpecialModelName.getExample();
        SwagSpecialModelName specialModelName2 = new SwagSpecialModelName();

        System.assertEquals(false, specialModelName1.equals('foo'));
        System.assertEquals(false, specialModelName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagSpecialModelName specialModelName1 = SwagSpecialModelName.getExample();
        SwagSpecialModelName specialModelName2 = new SwagSpecialModelName();
        SwagSpecialModelName specialModelName3;

        System.assertEquals(false, specialModelName1.equals(specialModelName3));
        System.assertEquals(false, specialModelName2.equals(specialModelName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagSpecialModelName specialModelName1 = SwagSpecialModelName.getExample();
        SwagSpecialModelName specialModelName2 = new SwagSpecialModelName();

        System.assertEquals(specialModelName1.hashCode(), specialModelName1.hashCode());
        System.assertEquals(specialModelName2.hashCode(), specialModelName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagSpecialModelName specialModelName1 = SwagSpecialModelName.getExample();
        SwagSpecialModelName specialModelName2 = SwagSpecialModelName.getExample();
        SwagSpecialModelName specialModelName3 = new SwagSpecialModelName();
        SwagSpecialModelName specialModelName4 = new SwagSpecialModelName();

        System.assert(specialModelName1.equals(specialModelName2));
        System.assert(specialModelName3.equals(specialModelName4));
        System.assertEquals(specialModelName1.hashCode(), specialModelName2.hashCode());
        System.assertEquals(specialModelName3.hashCode(), specialModelName4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagSpecialModelName specialModelName = new SwagSpecialModelName();
        Map<String, String> propertyMappings = specialModelName.getPropertyMappings();
        System.assertEquals('specialPropertyName', propertyMappings.get('$special[property.name]'));
    }
}
