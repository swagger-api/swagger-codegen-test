@isTest
private class SwagIntsTest {
    @isTest
    private static void allowableValues() {
        Set<SwagInts> expected = new Set<SwagInts>{
            SwagInts.NUMBER_0,
            SwagInts.NUMBER_1,
            SwagInts.NUMBER_2,
            SwagInts.NUMBER_3,
            SwagInts.NUMBER_4,
            SwagInts.NUMBER_5,
            SwagInts.NUMBER_6
        };
        Set<SwagInts> actual  = new Set<SwagInts>(SwagInts.values());
        System.assertEquals(expected, actual);
    }
}
