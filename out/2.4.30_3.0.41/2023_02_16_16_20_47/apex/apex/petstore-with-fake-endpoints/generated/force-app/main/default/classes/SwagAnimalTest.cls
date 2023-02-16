@isTest
private class SwagAnimalTest {
    @isTest
    private static void equalsSameInstance() {
        SwagAnimal animal1 = SwagAnimal.getExample();
        SwagAnimal animal2 = animal1;
        SwagAnimal animal3 = new SwagAnimal();
        SwagAnimal animal4 = animal3;

        System.assert(animal1.equals(animal2));
        System.assert(animal2.equals(animal1));
        System.assert(animal1.equals(animal1));
        System.assert(animal3.equals(animal4));
        System.assert(animal4.equals(animal3));
        System.assert(animal3.equals(animal3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagAnimal animal1 = SwagAnimal.getExample();
        SwagAnimal animal2 = SwagAnimal.getExample();
        SwagAnimal animal3 = new SwagAnimal();
        SwagAnimal animal4 = new SwagAnimal();

        System.assert(animal1.equals(animal2));
        System.assert(animal2.equals(animal1));
        System.assert(animal3.equals(animal4));
        System.assert(animal4.equals(animal3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagAnimal animal1 = SwagAnimal.getExample();
        SwagAnimal animal2 = new SwagAnimal();

        System.assertEquals(false, animal1.equals(animal2));
        System.assertEquals(false, animal2.equals(animal1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagAnimal animal1 = SwagAnimal.getExample();
        SwagAnimal animal2 = new SwagAnimal();

        System.assertEquals(false, animal1.equals('foo'));
        System.assertEquals(false, animal2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagAnimal animal1 = SwagAnimal.getExample();
        SwagAnimal animal2 = new SwagAnimal();
        SwagAnimal animal3;

        System.assertEquals(false, animal1.equals(animal3));
        System.assertEquals(false, animal2.equals(animal3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagAnimal animal1 = SwagAnimal.getExample();
        SwagAnimal animal2 = new SwagAnimal();

        System.assertEquals(animal1.hashCode(), animal1.hashCode());
        System.assertEquals(animal2.hashCode(), animal2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagAnimal animal1 = SwagAnimal.getExample();
        SwagAnimal animal2 = SwagAnimal.getExample();
        SwagAnimal animal3 = new SwagAnimal();
        SwagAnimal animal4 = new SwagAnimal();

        System.assert(animal1.equals(animal2));
        System.assert(animal3.equals(animal4));
        System.assertEquals(animal1.hashCode(), animal2.hashCode());
        System.assertEquals(animal3.hashCode(), animal4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagAnimal animal = new SwagAnimal();
        System.assertEquals('red', animal.color);
        System.assertEquals(null, animal.className);
    }
}
