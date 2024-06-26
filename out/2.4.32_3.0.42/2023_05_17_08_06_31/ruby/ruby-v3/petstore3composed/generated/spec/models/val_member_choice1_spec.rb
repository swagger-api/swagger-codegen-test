=begin
#Swagger Petstore

#This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.42
=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::ValMemberChoice1
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ValMemberChoice1' do
  before do
    # run before each test
    @instance = SwaggerClient::ValMemberChoice1.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ValMemberChoice1' do
    it 'should create an instance of ValMemberChoice1' do
      expect(@instance).to be_instance_of(SwaggerClient::ValMemberChoice1)
    end
  end
  describe 'test attribute "val_date_of_birth"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "val_leaving_date"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
