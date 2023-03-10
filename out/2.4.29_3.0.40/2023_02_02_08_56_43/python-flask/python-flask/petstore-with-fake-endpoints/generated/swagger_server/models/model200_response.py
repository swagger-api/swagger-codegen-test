# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class Model200Response(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, name: int=None, _class: str=None):  # noqa: E501
        """Model200Response - a model defined in Swagger

        :param name: The name of this Model200Response.  # noqa: E501
        :type name: int
        :param _class: The _class of this Model200Response.  # noqa: E501
        :type _class: str
        """
        self.swagger_types = {
            'name': int,
            '_class': str
        }

        self.attribute_map = {
            'name': 'name',
            '_class': 'class'
        }

        self._name = name
        self.__class = _class

    @classmethod
    def from_dict(cls, dikt) -> 'Model200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The 200_response of this Model200Response.  # noqa: E501
        :rtype: Model200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> int:
        """Gets the name of this Model200Response.


        :return: The name of this Model200Response.
        :rtype: int
        """
        return self._name

    @name.setter
    def name(self, name: int):
        """Sets the name of this Model200Response.


        :param name: The name of this Model200Response.
        :type name: int
        """

        self._name = name

    @property
    def _class(self) -> str:
        """Gets the _class of this Model200Response.


        :return: The _class of this Model200Response.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this Model200Response.


        :param _class: The _class of this Model200Response.
        :type _class: str
        """

        self.__class = _class
