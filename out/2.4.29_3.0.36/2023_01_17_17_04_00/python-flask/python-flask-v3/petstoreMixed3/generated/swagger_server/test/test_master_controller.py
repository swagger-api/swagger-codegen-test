# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.part_master import PartMaster  # noqa: E501
from swagger_server.test import BaseTestCase


class TestMasterController(BaseTestCase):
    """MasterController integration test stubs"""

    def test_master_operation(self):
        """Test case for master_operation

        
        """
        response = self.client.open(
            '/v3/master',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
