=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.42
=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::ParrotApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ParrotApi' do
  before do
    # run before each test
    @instance = SwaggerClient::ParrotApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ParrotApi' do
    it 'should create an instance of ParrotApi' do
      expect(@instance).to be_instance_of(SwaggerClient::ParrotApi)
    end
  end

  # unit tests for add_parrot
  # Add a new parrow to the store
  # @param [Hash] opts the optional parameters
  # @option opts [ParrotBody1] :body 
  # @return [InlineResponse2001]
  describe 'add_parrot test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_parrots
  # get Parrots
  # @param [Hash] opts the optional parameters
  # @return [Array<null>]
  describe 'get_parrots test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_parrots
  # update parrots
  # @param [Hash] opts the optional parameters
  # @option opts [ParrotBody] :body 
  # @return [InlineResponse200]
  describe 'update_parrots test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
