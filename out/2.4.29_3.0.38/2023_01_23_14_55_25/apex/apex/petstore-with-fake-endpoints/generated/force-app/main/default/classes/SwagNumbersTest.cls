@isTest
private class SwagNumbersTest {
    @isTest
    private static void allowableValues() {
        Set<SwagNumbers> expected = new Set<SwagNumbers>{
            SwagNumbers.NUMBER_7,
            SwagNumbers.NUMBER_8,
            SwagNumbers.NUMBER_9,
            SwagNumbers.NUMBER_10
        };
        Set<SwagNumbers> actual  = new Set<SwagNumbers>(SwagNumbers.values());
        System.assertEquals(expected, actual);
    }
}
