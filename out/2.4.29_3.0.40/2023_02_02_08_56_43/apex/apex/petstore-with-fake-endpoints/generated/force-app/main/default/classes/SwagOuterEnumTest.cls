@isTest
private class SwagOuterEnumTest {
    @isTest
    private static void allowableValues() {
        Set<SwagOuterEnum> expected = new Set<SwagOuterEnum>{
            SwagOuterEnum.PLACED,
            SwagOuterEnum.APPROVED,
            SwagOuterEnum.DELIVERED
        };
        Set<SwagOuterEnum> actual  = new Set<SwagOuterEnum>(SwagOuterEnum.values());
        System.assertEquals(expected, actual);
    }
}
