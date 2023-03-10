<?php
/**
 * PetApiInterfaceTest
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Server\Tests\Api
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Swagger Petstore
 *
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Please update the test case below to test the endpoint.
 */

namespace Swagger\Server\Tests\Api;

use Swagger\Server\Configuration;
use Swagger\Server\ApiClient;
use Swagger\Server\ApiException;
use Swagger\Server\ObjectSerializer;
use Symfony\Bundle\FrameworkBundle\Test\WebTestCase;

/**
 * PetApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Server\Tests\Api
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class PetApiInterfaceTest extends WebTestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test case for addPet
     *
     * Add a new pet to the store.
     *
     */
    public function testAddPet()
    {
        $client = static::createClient();

        $path = '/pet';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for deletePet
     *
     * Deletes a pet.
     *
     */
    public function testDeletePet()
    {
        $client = static::createClient();

        $path = '/pet/{petId}';
        $pattern = '{petId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('DELETE', $path);
    }

    /**
     * Test case for findPetsByStatus
     *
     * Finds Pets by status.
     *
     */
    public function testFindPetsByStatus()
    {
        $client = static::createClient();

        $path = '/pet/findByStatus';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for findPetsByTags
     *
     * Finds Pets by tags.
     *
     */
    public function testFindPetsByTags()
    {
        $client = static::createClient();

        $path = '/pet/findByTags';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for getPetById
     *
     * Find pet by ID.
     *
     */
    public function testGetPetById()
    {
        $client = static::createClient();

        $path = '/pet/{petId}';
        $pattern = '{petId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for updatePet
     *
     * Update an existing pet.
     *
     */
    public function testUpdatePet()
    {
        $client = static::createClient();

        $path = '/pet';

        $crawler = $client->request('PUT', $path);
    }

    /**
     * Test case for updatePetWithForm
     *
     * Updates a pet in the store with form data.
     *
     */
    public function testUpdatePetWithForm()
    {
        $client = static::createClient();

        $path = '/pet/{petId}';
        $pattern = '{petId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for uploadFile
     *
     * uploads an image.
     *
     */
    public function testUploadFile()
    {
        $client = static::createClient();

        $path = '/pet/{petId}/uploadImage';
        $pattern = '{petId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path);
    }

    protected function genTestData($regexp)
    {
        $grammar  = new \Hoa\File\Read('hoa://Library/Regex/Grammar.pp');
        $compiler = \Hoa\Compiler\Llk\Llk::load($grammar);
        $ast      = $compiler->parse($regexp);
        $generator = new \Hoa\Regex\Visitor\Isotropic(new \Hoa\Math\Sampler\Random());

        return $generator->visit($ast); 
    }
}
