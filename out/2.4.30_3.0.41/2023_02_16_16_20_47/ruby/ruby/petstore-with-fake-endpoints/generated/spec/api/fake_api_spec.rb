=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.30

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::FakeApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'FakeApi' do
  before do
    # run before each test
    @instance = SwaggerClient::FakeApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of FakeApi' do
    it 'should create an instance of FakeApi' do
      expect(@instance).to be_instance_of(SwaggerClient::FakeApi)
    end
  end

  # unit tests for fake_outer_boolean_serialize
  # Test serialization of outer boolean types
  # @param [Hash] opts the optional parameters
  # @option opts [OuterBoolean] :body Input boolean as post body
  # @return [OuterBoolean]
  describe 'fake_outer_boolean_serialize test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for fake_outer_composite_serialize
  # Test serialization of object with outer number type
  # @param [Hash] opts the optional parameters
  # @option opts [OuterComposite] :body Input composite as post body
  # @return [OuterComposite]
  describe 'fake_outer_composite_serialize test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for fake_outer_number_serialize
  # Test serialization of outer number types
  # @param [Hash] opts the optional parameters
  # @option opts [OuterNumber] :body Input number as post body
  # @return [OuterNumber]
  describe 'fake_outer_number_serialize test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for fake_outer_string_serialize
  # Test serialization of outer string types
  # @param [Hash] opts the optional parameters
  # @option opts [OuterString] :body Input string as post body
  # @return [OuterString]
  describe 'fake_outer_string_serialize test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for test_body_with_query_params
  # @param body 
  # @param query 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'test_body_with_query_params test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for test_client_model
  # To test \&quot;client\&quot; model
  # To test \&quot;client\&quot; model
  # @param body client model
  # @param [Hash] opts the optional parameters
  # @return [Client]
  describe 'test_client_model test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for test_endpoint_parameters
  # Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  # Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  # @param number None
  # @param double None
  # @param pattern_without_delimiter None
  # @param byte None
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :integer None
  # @option opts [Integer] :int32 None
  # @option opts [Integer] :int64 None
  # @option opts [Float] :float None
  # @option opts [String] :string None
  # @option opts [String] :binary None
  # @option opts [Date] :date None
  # @option opts [DateTime] :date_time None
  # @option opts [String] :password None
  # @option opts [String] :callback None
  # @return [nil]
  describe 'test_endpoint_parameters test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for test_enum_parameters
  # To test enum parameters
  # To test enum parameters
  # @param [Hash] opts the optional parameters
  # @option opts [Array<String>] :enum_form_string_array Form parameter enum test (string array)
  # @option opts [String] :enum_form_string Form parameter enum test (string)
  # @option opts [Array<String>] :enum_header_string_array Header parameter enum test (string array)
  # @option opts [String] :enum_header_string Header parameter enum test (string)
  # @option opts [Array<String>] :enum_query_string_array Query parameter enum test (string array)
  # @option opts [String] :enum_query_string Query parameter enum test (string)
  # @option opts [Integer] :enum_query_integer Query parameter enum test (double)
  # @option opts [Float] :enum_query_double Query parameter enum test (double)
  # @return [nil]
  describe 'test_enum_parameters test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for test_inline_additional_properties
  # test inline additionalProperties
  # 
  # @param param request body
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'test_inline_additional_properties test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for test_json_form_data
  # test json serialization of form data
  # 
  # @param param field1
  # @param param2 field2
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'test_json_form_data test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
