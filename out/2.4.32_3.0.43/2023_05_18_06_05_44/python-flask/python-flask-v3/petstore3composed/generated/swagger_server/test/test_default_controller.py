# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.test import Test  # noqa: E501
from swagger_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_test_method(self):
        """Test case for test_method

        
        """
        response = self.client.open(
            '/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/test',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
