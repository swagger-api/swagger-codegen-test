@isTest
private class SwagClassModelTest {
    @isTest
    private static void equalsSameInstance() {
        SwagClassModel classModel1 = SwagClassModel.getExample();
        SwagClassModel classModel2 = classModel1;
        SwagClassModel classModel3 = new SwagClassModel();
        SwagClassModel classModel4 = classModel3;

        System.assert(classModel1.equals(classModel2));
        System.assert(classModel2.equals(classModel1));
        System.assert(classModel1.equals(classModel1));
        System.assert(classModel3.equals(classModel4));
        System.assert(classModel4.equals(classModel3));
        System.assert(classModel3.equals(classModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagClassModel classModel1 = SwagClassModel.getExample();
        SwagClassModel classModel2 = SwagClassModel.getExample();
        SwagClassModel classModel3 = new SwagClassModel();
        SwagClassModel classModel4 = new SwagClassModel();

        System.assert(classModel1.equals(classModel2));
        System.assert(classModel2.equals(classModel1));
        System.assert(classModel3.equals(classModel4));
        System.assert(classModel4.equals(classModel3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagClassModel classModel1 = SwagClassModel.getExample();
        SwagClassModel classModel2 = new SwagClassModel();

        System.assertEquals(false, classModel1.equals(classModel2));
        System.assertEquals(false, classModel2.equals(classModel1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagClassModel classModel1 = SwagClassModel.getExample();
        SwagClassModel classModel2 = new SwagClassModel();

        System.assertEquals(false, classModel1.equals('foo'));
        System.assertEquals(false, classModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagClassModel classModel1 = SwagClassModel.getExample();
        SwagClassModel classModel2 = new SwagClassModel();
        SwagClassModel classModel3;

        System.assertEquals(false, classModel1.equals(classModel3));
        System.assertEquals(false, classModel2.equals(classModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagClassModel classModel1 = SwagClassModel.getExample();
        SwagClassModel classModel2 = new SwagClassModel();

        System.assertEquals(classModel1.hashCode(), classModel1.hashCode());
        System.assertEquals(classModel2.hashCode(), classModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagClassModel classModel1 = SwagClassModel.getExample();
        SwagClassModel classModel2 = SwagClassModel.getExample();
        SwagClassModel classModel3 = new SwagClassModel();
        SwagClassModel classModel4 = new SwagClassModel();

        System.assert(classModel1.equals(classModel2));
        System.assert(classModel3.equals(classModel4));
        System.assertEquals(classModel1.hashCode(), classModel2.hashCode());
        System.assertEquals(classModel3.hashCode(), classModel4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagClassModel classModel = new SwagClassModel();
        Map<String, String> propertyMappings = classModel.getPropertyMappings();
        System.assertEquals('propertyClass', propertyMappings.get('_class'));
    }
}
