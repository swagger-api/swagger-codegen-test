@isTest
private class SwagBooleanTest {
    @isTest
    private static void allowableValues() {
        Set<SwagBoolean> expected = new Set<SwagBoolean>{
            SwagBoolean.TRUE,
            SwagBoolean.FALSE
        };
        Set<SwagBoolean> actual  = new Set<SwagBoolean>(SwagBoolean.values());
        System.assertEquals(expected, actual);
    }
}
