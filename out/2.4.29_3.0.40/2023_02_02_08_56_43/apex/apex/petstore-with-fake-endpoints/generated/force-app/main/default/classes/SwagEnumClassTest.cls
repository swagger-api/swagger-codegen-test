@isTest
private class SwagEnumClassTest {
    @isTest
    private static void allowableValues() {
        Set<SwagEnumClass> expected = new Set<SwagEnumClass>{
            SwagEnumClass._ABC,
            SwagEnumClass._EFG,
            SwagEnumClass._XYZ_
        };
        Set<SwagEnumClass> actual  = new Set<SwagEnumClass>(SwagEnumClass.values());
        System.assertEquals(expected, actual);
    }
}
