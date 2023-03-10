# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.one_of_part_master_destination import OneOfPartMasterDestination  # noqa: F401,E501
from swagger_server.models.one_of_part_master_origin import OneOfPartMasterOrigin  # noqa: F401,E501
from swagger_server import util


class PartMaster(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, destination: OneOfPartMasterDestination=None, origin: OneOfPartMasterOrigin=None):  # noqa: E501
        """PartMaster - a model defined in Swagger

        :param destination: The destination of this PartMaster.  # noqa: E501
        :type destination: OneOfPartMasterDestination
        :param origin: The origin of this PartMaster.  # noqa: E501
        :type origin: OneOfPartMasterOrigin
        """
        self.swagger_types = {
            'destination': OneOfPartMasterDestination,
            'origin': OneOfPartMasterOrigin
        }

        self.attribute_map = {
            'destination': 'destination',
            'origin': 'origin'
        }
        self._destination = destination
        self._origin = origin

    @classmethod
    def from_dict(cls, dikt) -> 'PartMaster':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PartMaster of this PartMaster.  # noqa: E501
        :rtype: PartMaster
        """
        return util.deserialize_model(dikt, cls)

    @property
    def destination(self) -> OneOfPartMasterDestination:
        """Gets the destination of this PartMaster.


        :return: The destination of this PartMaster.
        :rtype: OneOfPartMasterDestination
        """
        return self._destination

    @destination.setter
    def destination(self, destination: OneOfPartMasterDestination):
        """Sets the destination of this PartMaster.


        :param destination: The destination of this PartMaster.
        :type destination: OneOfPartMasterDestination
        """

        self._destination = destination

    @property
    def origin(self) -> OneOfPartMasterOrigin:
        """Gets the origin of this PartMaster.


        :return: The origin of this PartMaster.
        :rtype: OneOfPartMasterOrigin
        """
        return self._origin

    @origin.setter
    def origin(self, origin: OneOfPartMasterOrigin):
        """Sets the origin of this PartMaster.


        :param origin: The origin of this PartMaster.
        :type origin: OneOfPartMasterOrigin
        """

        self._origin = origin
