<?php
/**
 * ArrayTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Server\Model
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the ArrayTest model.
 *
 * @package Swagger\Server\Model
 * @author  Swagger Codegen team
 */
class ArrayTest 
{
        /**
     * @var string[]|null
     * @SerializedName("array_of_string")
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     */
    protected $arrayOfString;

    /**
     * @var int[]|null
     * @SerializedName("array_array_of_integer")
     * @Assert\All({
     *   @Assert\Type("int")
     * })
     * @Type("array<int>")
     */
    protected $arrayArrayOfInteger;

    /**
     * @var Swagger\Server\Model\ReadOnlyFirst[]|null
     * @SerializedName("array_array_of_model")
     * @Assert\All({
     *   @Assert\Type("Swagger\Server\Model\ReadOnlyFirst")
     * })
     * @Type("array<Swagger\Server\Model\ReadOnlyFirst>")
     */
    protected $arrayArrayOfModel;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->arrayOfString = isset($data['arrayOfString']) ? $data['arrayOfString'] : null;
        $this->arrayArrayOfInteger = isset($data['arrayArrayOfInteger']) ? $data['arrayArrayOfInteger'] : null;
        $this->arrayArrayOfModel = isset($data['arrayArrayOfModel']) ? $data['arrayArrayOfModel'] : null;
    }

    /**
     * Gets arrayOfString.
     *
     * @return string[]|null
     */
    public function getArrayOfString()
    {
        return $this->arrayOfString;
    }

    /**
     * Sets arrayOfString.
     *
     * @param string[]|null $arrayOfString
     *
     * @return $this
     */
    public function setArrayOfString($arrayOfString = null)
    {
        $this->arrayOfString = $arrayOfString;

        return $this;
    }

    /**
     * Gets arrayArrayOfInteger.
     *
     * @return int[]|null
     */
    public function getArrayArrayOfInteger()
    {
        return $this->arrayArrayOfInteger;
    }

    /**
     * Sets arrayArrayOfInteger.
     *
     * @param int[]|null $arrayArrayOfInteger
     *
     * @return $this
     */
    public function setArrayArrayOfInteger($arrayArrayOfInteger = null)
    {
        $this->arrayArrayOfInteger = $arrayArrayOfInteger;

        return $this;
    }

    /**
     * Gets arrayArrayOfModel.
     *
     * @return Swagger\Server\Model\ReadOnlyFirst[]|null
     */
    public function getArrayArrayOfModel()
    {
        return $this->arrayArrayOfModel;
    }

    /**
     * Sets arrayArrayOfModel.
     *
     * @param Swagger\Server\Model\ReadOnlyFirst[]|null $arrayArrayOfModel
     *
     * @return $this
     */
    public function setArrayArrayOfModel(ReadOnlyFirst $arrayArrayOfModel = null)
    {
        $this->arrayArrayOfModel = $arrayArrayOfModel;

        return $this;
    }
}


