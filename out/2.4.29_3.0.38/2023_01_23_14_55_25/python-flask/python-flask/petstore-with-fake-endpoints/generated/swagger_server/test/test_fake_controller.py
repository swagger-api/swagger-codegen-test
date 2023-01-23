# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.binary import Binary  # noqa: E501
from swagger_server.models.byte_array import ByteArray  # noqa: E501
from swagger_server.models.client import Client  # noqa: E501
from swagger_server.models.outer_boolean import OuterBoolean  # noqa: E501
from swagger_server.models.outer_composite import OuterComposite  # noqa: E501
from swagger_server.models.outer_number import OuterNumber  # noqa: E501
from swagger_server.models.outer_string import OuterString  # noqa: E501
from swagger_server.models.user import User  # noqa: E501
from swagger_server.test import BaseTestCase


class TestFakeController(BaseTestCase):
    """FakeController integration test stubs"""

    def test_fake_outer_boolean_serialize(self):
        """Test case for fake_outer_boolean_serialize

        
        """
        body = OuterBoolean()
        response = self.client.open(
            '/v2/fake/outer/boolean',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fake_outer_composite_serialize(self):
        """Test case for fake_outer_composite_serialize

        
        """
        body = OuterComposite()
        response = self.client.open(
            '/v2/fake/outer/composite',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fake_outer_number_serialize(self):
        """Test case for fake_outer_number_serialize

        
        """
        body = OuterNumber()
        response = self.client.open(
            '/v2/fake/outer/number',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fake_outer_string_serialize(self):
        """Test case for fake_outer_string_serialize

        
        """
        body = OuterString()
        response = self.client.open(
            '/v2/fake/outer/string',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_test_body_with_query_params(self):
        """Test case for test_body_with_query_params

        
        """
        body = User()
        query_string = [('query', 'query_example')]
        response = self.client.open(
            '/v2/fake/body-with-query-params',
            method='PUT',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_test_client_model(self):
        """Test case for test_client_model

        To test \"client\" model
        """
        body = Client()
        response = self.client.open(
            '/v2/fake',
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_test_endpoint_parameters(self):
        """Test case for test_endpoint_parameters

        Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        """
        data = dict(integer=100,
                    int32=200,
                    int64=789,
                    number=32.1,
                    _float=987.6,
                    double=67.8,
                    string='string_example',
                    pattern_without_delimiter='pattern_without_delimiter_example',
                    byte=ByteArray(),
                    binary=Binary(),
                    _date='2013-10-20',
                    dateTime='2013-10-20T19:20:30+01:00',
                    password='password_example',
                    callback='callback_example')
        response = self.client.open(
            '/v2/fake',
            method='POST',
            data=data,
            content_type='application/xml; charset=utf-8')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_test_enum_parameters(self):
        """Test case for test_enum_parameters

        To test enum parameters
        """
        query_string = [('enum_query_string_array', '$'),
                        ('enum_query_string', '-efg'),
                        ('enum_query_integer', 56)]
        headers = [('enum_header_string_array', '$'),
                   ('enum_header_string', '-efg')]
        data = dict(enum_form_string_array='$',
                    enum_form_string='-efg',
                    enum_query_double=1.2)
        response = self.client.open(
            '/v2/fake',
            method='GET',
            headers=headers,
            data=data,
            content_type='*/*',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_test_inline_additional_properties(self):
        """Test case for test_inline_additional_properties

        test inline additionalProperties
        """
        param = None
        response = self.client.open(
            '/v2/fake/inline-additionalProperties',
            method='POST',
            data=json.dumps(param),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_test_json_form_data(self):
        """Test case for test_json_form_data

        test json serialization of form data
        """
        data = dict(param='param_example',
                    param2='param2_example')
        response = self.client.open(
            '/v2/fake/jsonFormData',
            method='GET',
            data=data,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
