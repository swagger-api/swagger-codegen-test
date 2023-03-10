/* 
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing ParrotApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ParrotApiTests
    {
        private ParrotApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ParrotApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ParrotApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ParrotApi
            //Assert.IsInstanceOfType(typeof(ParrotApi), instance, "instance is a ParrotApi");
        }

        /// <summary>
        /// Test AddParrot
        /// </summary>
        [Test]
        public void AddParrotTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ParrotBody1 body = null;
            //var response = instance.AddParrot(body);
            //Assert.IsInstanceOf<InlineResponse2001> (response, "response is InlineResponse2001");
        }
        /// <summary>
        /// Test GetParrots
        /// </summary>
        [Test]
        public void GetParrotsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetParrots();
            //Assert.IsInstanceOf<List<Object>> (response, "response is List<Object>");
        }
        /// <summary>
        /// Test UpdateParrots
        /// </summary>
        [Test]
        public void UpdateParrotsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ParrotBody body = null;
            //var response = instance.UpdateParrots(body);
            //Assert.IsInstanceOf<InlineResponse200> (response, "response is InlineResponse200");
        }
    }

}
