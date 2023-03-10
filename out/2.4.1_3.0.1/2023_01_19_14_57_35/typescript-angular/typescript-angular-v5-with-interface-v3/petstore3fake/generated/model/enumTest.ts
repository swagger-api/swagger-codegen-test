/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */import { OuterEnum } from './outerEnum';


export interface EnumTest { 
    enumString?: EnumTest.EnumStringEnum;
    enumInteger?: EnumTest.EnumIntegerEnum;
    enumNumber?: EnumTest.EnumNumberEnum;
    outerEnum?: OuterEnum;
}
export namespace EnumTest {
    export type EnumStringEnum = 'UPPER' | 'lower' | '';
    export const EnumStringEnum = {
        UPPER: 'UPPER' as EnumStringEnum,
        Lower: 'lower' as EnumStringEnum,
        Empty: '' as EnumStringEnum
    };
    export type EnumIntegerEnum = 1 | -1;
    export const EnumIntegerEnum = {
        NUMBER_1: 1 as EnumIntegerEnum,
        NUMBER_MINUS_1: -1 as EnumIntegerEnum
    };
    export type EnumNumberEnum = 1.1 | -1.2;
    export const EnumNumberEnum = {
        NUMBER_1_DOT_1: 1.1 as EnumNumberEnum,
        NUMBER_MINUS_1_DOT_2: -1.2 as EnumNumberEnum
    };
}