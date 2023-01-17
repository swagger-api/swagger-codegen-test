@isTest
private class SwagDogTest {
    @isTest
    private static void equalsSameInstance() {
        SwagDog dog1 = SwagDog.getExample();
        SwagDog dog2 = dog1;
        SwagDog dog3 = new SwagDog();
        SwagDog dog4 = dog3;

        System.assert(dog1.equals(dog2));
        System.assert(dog2.equals(dog1));
        System.assert(dog1.equals(dog1));
        System.assert(dog3.equals(dog4));
        System.assert(dog4.equals(dog3));
        System.assert(dog3.equals(dog3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagDog dog1 = SwagDog.getExample();
        SwagDog dog2 = SwagDog.getExample();
        SwagDog dog3 = new SwagDog();
        SwagDog dog4 = new SwagDog();

        System.assert(dog1.equals(dog2));
        System.assert(dog2.equals(dog1));
        System.assert(dog3.equals(dog4));
        System.assert(dog4.equals(dog3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagDog dog1 = SwagDog.getExample();
        SwagDog dog2 = new SwagDog();

        System.assertEquals(false, dog1.equals(dog2));
        System.assertEquals(false, dog2.equals(dog1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagDog dog1 = SwagDog.getExample();
        SwagDog dog2 = new SwagDog();

        System.assertEquals(false, dog1.equals('foo'));
        System.assertEquals(false, dog2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagDog dog1 = SwagDog.getExample();
        SwagDog dog2 = new SwagDog();
        SwagDog dog3;

        System.assertEquals(false, dog1.equals(dog3));
        System.assertEquals(false, dog2.equals(dog3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagDog dog1 = SwagDog.getExample();
        SwagDog dog2 = new SwagDog();

        System.assertEquals(dog1.hashCode(), dog1.hashCode());
        System.assertEquals(dog2.hashCode(), dog2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagDog dog1 = SwagDog.getExample();
        SwagDog dog2 = SwagDog.getExample();
        SwagDog dog3 = new SwagDog();
        SwagDog dog4 = new SwagDog();

        System.assert(dog1.equals(dog2));
        System.assert(dog3.equals(dog4));
        System.assertEquals(dog1.hashCode(), dog2.hashCode());
        System.assertEquals(dog3.hashCode(), dog4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagDog dog = new SwagDog();
        System.assertEquals(null, dog.breed);
    }
}
