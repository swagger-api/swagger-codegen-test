<?php
/**
 * Capitalization
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
 * Class representing the Capitalization model.
 *
 * @package Swagger\Server\Model
 * @author  Swagger Codegen team
 */
class Capitalization 
{
        /**
     * @var string|null
     * @SerializedName("smallCamel")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $smallCamel;

    /**
     * @var string|null
     * @SerializedName("CapitalCamel")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $capitalCamel;

    /**
     * @var string|null
     * @SerializedName("small_Snake")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $smallSnake;

    /**
     * @var string|null
     * @SerializedName("Capital_Snake")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $capitalSnake;

    /**
     * @var string|null
     * @SerializedName("SCA_ETH_Flow_Points")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $sCAETHFlowPoints;

    /**
     * Name of the pet
     *
     * @var string|null
     * @SerializedName("ATT_NAME")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $aTTNAME;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->smallCamel = isset($data['smallCamel']) ? $data['smallCamel'] : null;
        $this->capitalCamel = isset($data['capitalCamel']) ? $data['capitalCamel'] : null;
        $this->smallSnake = isset($data['smallSnake']) ? $data['smallSnake'] : null;
        $this->capitalSnake = isset($data['capitalSnake']) ? $data['capitalSnake'] : null;
        $this->sCAETHFlowPoints = isset($data['sCAETHFlowPoints']) ? $data['sCAETHFlowPoints'] : null;
        $this->aTTNAME = isset($data['aTTNAME']) ? $data['aTTNAME'] : null;
    }

    /**
     * Gets smallCamel.
     *
     * @return string|null
     */
    public function getSmallCamel()
    {
        return $this->smallCamel;
    }

    /**
     * Sets smallCamel.
     *
     * @param string|null $smallCamel
     *
     * @return $this
     */
    public function setSmallCamel($smallCamel = null)
    {
        $this->smallCamel = $smallCamel;

        return $this;
    }

    /**
     * Gets capitalCamel.
     *
     * @return string|null
     */
    public function getCapitalCamel()
    {
        return $this->capitalCamel;
    }

    /**
     * Sets capitalCamel.
     *
     * @param string|null $capitalCamel
     *
     * @return $this
     */
    public function setCapitalCamel($capitalCamel = null)
    {
        $this->capitalCamel = $capitalCamel;

        return $this;
    }

    /**
     * Gets smallSnake.
     *
     * @return string|null
     */
    public function getSmallSnake()
    {
        return $this->smallSnake;
    }

    /**
     * Sets smallSnake.
     *
     * @param string|null $smallSnake
     *
     * @return $this
     */
    public function setSmallSnake($smallSnake = null)
    {
        $this->smallSnake = $smallSnake;

        return $this;
    }

    /**
     * Gets capitalSnake.
     *
     * @return string|null
     */
    public function getCapitalSnake()
    {
        return $this->capitalSnake;
    }

    /**
     * Sets capitalSnake.
     *
     * @param string|null $capitalSnake
     *
     * @return $this
     */
    public function setCapitalSnake($capitalSnake = null)
    {
        $this->capitalSnake = $capitalSnake;

        return $this;
    }

    /**
     * Gets sCAETHFlowPoints.
     *
     * @return string|null
     */
    public function getSCAETHFlowPoints()
    {
        return $this->sCAETHFlowPoints;
    }

    /**
     * Sets sCAETHFlowPoints.
     *
     * @param string|null $sCAETHFlowPoints
     *
     * @return $this
     */
    public function setSCAETHFlowPoints($sCAETHFlowPoints = null)
    {
        $this->sCAETHFlowPoints = $sCAETHFlowPoints;

        return $this;
    }

    /**
     * Gets aTTNAME.
     *
     * @return string|null
     */
    public function getATTNAME()
    {
        return $this->aTTNAME;
    }

    /**
     * Sets aTTNAME.
     *
     * @param string|null $aTTNAME  Name of the pet
     *
     * @return $this
     */
    public function setATTNAME($aTTNAME = null)
    {
        $this->aTTNAME = $aTTNAME;

        return $this;
    }
}


