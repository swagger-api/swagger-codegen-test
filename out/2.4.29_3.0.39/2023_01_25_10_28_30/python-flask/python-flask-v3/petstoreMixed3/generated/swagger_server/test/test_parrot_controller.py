# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from swagger_server.models.parrot_body import ParrotBody  # noqa: E501
from swagger_server.models.parrot_body1 import ParrotBody1  # noqa: E501
from swagger_server.test import BaseTestCase


class TestParrotController(BaseTestCase):
    """ParrotController integration test stubs"""

    def test_add_parrot(self):
        """Test case for add_parrot

        Add a new parrow to the store
        """
        body = ParrotBody1()
        response = self.client.open(
            '/v3/parrot',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_parrots(self):
        """Test case for get_parrots

        get Parrots
        """
        response = self.client.open(
            '/v3/parrot',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_parrots(self):
        """Test case for update_parrots

        update parrots
        """
        body = ParrotBody()
        response = self.client.open(
            '/v3/parrot',
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
