=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.43
=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::DogApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'DogApi' do
  before do
    # run before each test
    @instance = SwaggerClient::DogApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of DogApi' do
    it 'should create an instance of DogApi' do
      expect(@instance).to be_instance_of(SwaggerClient::DogApi)
    end
  end

  # unit tests for add_dog
  # Add a new dog to the store
  # @param body Dog object that needs to be added to the store
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'add_dog test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_dog
  # Deletes a dog
  # @param dog_id Dog id to delete
  # @param [Hash] opts the optional parameters
  # @option opts [String] :api_key 
  # @return [nil]
  describe 'delete_dog test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_dog_by_id
  # Find dog by ID
  # Returns a single dog
  # @param dog_id ID of dog to return
  # @param [Hash] opts the optional parameters
  # @return [Dog]
  describe 'get_dog_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_dog
  # Update an existing dog
  # @param body Dog object that needs to be added.
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'update_dog test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_dog_with_form
  # Updates a dog
  # @param dog_id ID of dog that needs to be updated
  # @param [Hash] opts the optional parameters
  # @option opts [String] :name 
  # @option opts [String] :status 
  # @return [nil]
  describe 'update_dog_with_form test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
