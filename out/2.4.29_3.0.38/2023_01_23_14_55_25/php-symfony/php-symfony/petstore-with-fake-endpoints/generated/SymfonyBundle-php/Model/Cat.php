<?php
/**
 * Cat
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
 * Class representing the Cat model.
 *
 * @package Swagger\Server\Model
 * @author  Swagger Codegen team
 */
class Cat extends Animal 
{
        /**
     * @var bool|null
     * @SerializedName("declawed")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $declawed;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        parent::__construct($data);

        $this->declawed = isset($data['declawed']) ? $data['declawed'] : null;
    }

    /**
     * Gets declawed.
     *
     * @return bool|null
     */
    public function isDeclawed()
    {
        return $this->declawed;
    }

    /**
     * Sets declawed.
     *
     * @param bool|null $declawed
     *
     * @return $this
     */
    public function setDeclawed($declawed = null)
    {
        $this->declawed = $declawed;

        return $this;
    }
}


