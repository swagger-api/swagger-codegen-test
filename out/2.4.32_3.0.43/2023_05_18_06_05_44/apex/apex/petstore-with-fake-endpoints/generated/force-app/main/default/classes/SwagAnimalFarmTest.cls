@isTest
private class SwagAnimalFarmTest {
    @isTest
    private static void equalsSameInstance() {
        SwagAnimalFarm animalFarm1 = SwagAnimalFarm.getExample();
        SwagAnimalFarm animalFarm2 = animalFarm1;
        SwagAnimalFarm animalFarm3 = new SwagAnimalFarm();
        SwagAnimalFarm animalFarm4 = animalFarm3;

        System.assert(animalFarm1.equals(animalFarm2));
        System.assert(animalFarm2.equals(animalFarm1));
        System.assert(animalFarm1.equals(animalFarm1));
        System.assert(animalFarm3.equals(animalFarm4));
        System.assert(animalFarm4.equals(animalFarm3));
        System.assert(animalFarm3.equals(animalFarm3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagAnimalFarm animalFarm1 = SwagAnimalFarm.getExample();
        SwagAnimalFarm animalFarm2 = SwagAnimalFarm.getExample();
        SwagAnimalFarm animalFarm3 = new SwagAnimalFarm();
        SwagAnimalFarm animalFarm4 = new SwagAnimalFarm();

        System.assert(animalFarm1.equals(animalFarm2));
        System.assert(animalFarm2.equals(animalFarm1));
        System.assert(animalFarm3.equals(animalFarm4));
        System.assert(animalFarm4.equals(animalFarm3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagAnimalFarm animalFarm1 = SwagAnimalFarm.getExample();
        SwagAnimalFarm animalFarm2 = new SwagAnimalFarm();

        System.assertEquals(false, animalFarm1.equals(animalFarm2));
        System.assertEquals(false, animalFarm2.equals(animalFarm1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagAnimalFarm animalFarm1 = SwagAnimalFarm.getExample();
        SwagAnimalFarm animalFarm2 = new SwagAnimalFarm();

        System.assertEquals(false, animalFarm1.equals('foo'));
        System.assertEquals(false, animalFarm2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagAnimalFarm animalFarm1 = SwagAnimalFarm.getExample();
        SwagAnimalFarm animalFarm2 = new SwagAnimalFarm();
        SwagAnimalFarm animalFarm3;

        System.assertEquals(false, animalFarm1.equals(animalFarm3));
        System.assertEquals(false, animalFarm2.equals(animalFarm3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagAnimalFarm animalFarm1 = SwagAnimalFarm.getExample();
        SwagAnimalFarm animalFarm2 = new SwagAnimalFarm();

        System.assertEquals(animalFarm1.hashCode(), animalFarm1.hashCode());
        System.assertEquals(animalFarm2.hashCode(), animalFarm2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagAnimalFarm animalFarm1 = SwagAnimalFarm.getExample();
        SwagAnimalFarm animalFarm2 = SwagAnimalFarm.getExample();
        SwagAnimalFarm animalFarm3 = new SwagAnimalFarm();
        SwagAnimalFarm animalFarm4 = new SwagAnimalFarm();

        System.assert(animalFarm1.equals(animalFarm2));
        System.assert(animalFarm3.equals(animalFarm4));
        System.assertEquals(animalFarm1.hashCode(), animalFarm2.hashCode());
        System.assertEquals(animalFarm3.hashCode(), animalFarm4.hashCode());
    }
}
