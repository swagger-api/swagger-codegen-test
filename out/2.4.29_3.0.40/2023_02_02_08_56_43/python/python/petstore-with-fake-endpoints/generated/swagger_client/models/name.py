# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.configuration import Configuration


class Name(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'name': 'int',
        'snake_case': 'int',
        '_property': 'str',
        '_123_number': 'int'
    }

    attribute_map = {
        'name': 'name',
        'snake_case': 'snake_case',
        '_property': 'property',
        '_123_number': '123Number'
    }

    def __init__(self, name=None, snake_case=None, _property=None, _123_number=None, _configuration=None):  # noqa: E501
        """Name - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._name = None
        self._snake_case = None
        self.__property = None
        self.__123_number = None
        self.discriminator = None

        self.name = name
        if snake_case is not None:
            self.snake_case = snake_case
        if _property is not None:
            self._property = _property
        if _123_number is not None:
            self._123_number = _123_number

    @property
    def name(self):
        """Gets the name of this Name.  # noqa: E501


        :return: The name of this Name.  # noqa: E501
        :rtype: int
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Name.


        :param name: The name of this Name.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def snake_case(self):
        """Gets the snake_case of this Name.  # noqa: E501


        :return: The snake_case of this Name.  # noqa: E501
        :rtype: int
        """
        return self._snake_case

    @snake_case.setter
    def snake_case(self, snake_case):
        """Sets the snake_case of this Name.


        :param snake_case: The snake_case of this Name.  # noqa: E501
        :type: int
        """

        self._snake_case = snake_case

    @property
    def _property(self):
        """Gets the _property of this Name.  # noqa: E501


        :return: The _property of this Name.  # noqa: E501
        :rtype: str
        """
        return self.__property

    @_property.setter
    def _property(self, _property):
        """Sets the _property of this Name.


        :param _property: The _property of this Name.  # noqa: E501
        :type: str
        """

        self.__property = _property

    @property
    def _123_number(self):
        """Gets the _123_number of this Name.  # noqa: E501


        :return: The _123_number of this Name.  # noqa: E501
        :rtype: int
        """
        return self.__123_number

    @_123_number.setter
    def _123_number(self, _123_number):
        """Sets the _123_number of this Name.


        :param _123_number: The _123_number of this Name.  # noqa: E501
        :type: int
        """

        self.__123_number = _123_number

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(Name, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Name):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Name):
            return True

        return self.to_dict() != other.to_dict()
