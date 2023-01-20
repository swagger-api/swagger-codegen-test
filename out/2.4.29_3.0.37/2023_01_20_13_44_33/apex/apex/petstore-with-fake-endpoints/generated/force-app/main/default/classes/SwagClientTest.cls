@isTest
private class SwagClientTest {
    @isTest
    private static void equalsSameInstance() {
        SwagClient client1 = SwagClient.getExample();
        SwagClient client2 = client1;
        SwagClient client3 = new SwagClient();
        SwagClient client4 = client3;

        System.assert(client1.equals(client2));
        System.assert(client2.equals(client1));
        System.assert(client1.equals(client1));
        System.assert(client3.equals(client4));
        System.assert(client4.equals(client3));
        System.assert(client3.equals(client3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagClient client1 = SwagClient.getExample();
        SwagClient client2 = SwagClient.getExample();
        SwagClient client3 = new SwagClient();
        SwagClient client4 = new SwagClient();

        System.assert(client1.equals(client2));
        System.assert(client2.equals(client1));
        System.assert(client3.equals(client4));
        System.assert(client4.equals(client3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagClient client1 = SwagClient.getExample();
        SwagClient client2 = new SwagClient();

        System.assertEquals(false, client1.equals(client2));
        System.assertEquals(false, client2.equals(client1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagClient client1 = SwagClient.getExample();
        SwagClient client2 = new SwagClient();

        System.assertEquals(false, client1.equals('foo'));
        System.assertEquals(false, client2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagClient client1 = SwagClient.getExample();
        SwagClient client2 = new SwagClient();
        SwagClient client3;

        System.assertEquals(false, client1.equals(client3));
        System.assertEquals(false, client2.equals(client3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagClient client1 = SwagClient.getExample();
        SwagClient client2 = new SwagClient();

        System.assertEquals(client1.hashCode(), client1.hashCode());
        System.assertEquals(client2.hashCode(), client2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagClient client1 = SwagClient.getExample();
        SwagClient client2 = SwagClient.getExample();
        SwagClient client3 = new SwagClient();
        SwagClient client4 = new SwagClient();

        System.assert(client1.equals(client2));
        System.assert(client3.equals(client4));
        System.assertEquals(client1.hashCode(), client2.hashCode());
        System.assertEquals(client3.hashCode(), client4.hashCode());
    }
}
