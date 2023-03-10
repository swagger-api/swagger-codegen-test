# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
import re  # noqa: F401,E501
from swagger_server import util


class FormatTest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, integer: int=None, int32: int=None, int64: int=None, number: float=None, _float: float=None, double: float=None, string: str=None, byte: bytearray=None, binary: str=None, _date: date=None, date_time: datetime=None, uuid: str=None, password: str=None):  # noqa: E501
        """FormatTest - a model defined in Swagger

        :param integer: The integer of this FormatTest.  # noqa: E501
        :type integer: int
        :param int32: The int32 of this FormatTest.  # noqa: E501
        :type int32: int
        :param int64: The int64 of this FormatTest.  # noqa: E501
        :type int64: int
        :param number: The number of this FormatTest.  # noqa: E501
        :type number: float
        :param _float: The _float of this FormatTest.  # noqa: E501
        :type _float: float
        :param double: The double of this FormatTest.  # noqa: E501
        :type double: float
        :param string: The string of this FormatTest.  # noqa: E501
        :type string: str
        :param byte: The byte of this FormatTest.  # noqa: E501
        :type byte: bytearray
        :param binary: The binary of this FormatTest.  # noqa: E501
        :type binary: str
        :param _date: The _date of this FormatTest.  # noqa: E501
        :type _date: date
        :param date_time: The date_time of this FormatTest.  # noqa: E501
        :type date_time: datetime
        :param uuid: The uuid of this FormatTest.  # noqa: E501
        :type uuid: str
        :param password: The password of this FormatTest.  # noqa: E501
        :type password: str
        """
        self.swagger_types = {
            'integer': int,
            'int32': int,
            'int64': int,
            'number': float,
            '_float': float,
            'double': float,
            'string': str,
            'byte': bytearray,
            'binary': str,
            '_date': date,
            'date_time': datetime,
            'uuid': str,
            'password': str
        }

        self.attribute_map = {
            'integer': 'integer',
            'int32': 'int32',
            'int64': 'int64',
            'number': 'number',
            '_float': 'float',
            'double': 'double',
            'string': 'string',
            'byte': 'byte',
            'binary': 'binary',
            '_date': 'date',
            'date_time': 'dateTime',
            'uuid': 'uuid',
            'password': 'password'
        }
        self._integer = integer
        self._int32 = int32
        self._int64 = int64
        self._number = number
        self.__float = _float
        self._double = double
        self._string = string
        self._byte = byte
        self._binary = binary
        self.__date = _date
        self._date_time = date_time
        self._uuid = uuid
        self._password = password

    @classmethod
    def from_dict(cls, dikt) -> 'FormatTest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The format_test of this FormatTest.  # noqa: E501
        :rtype: FormatTest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def integer(self) -> int:
        """Gets the integer of this FormatTest.


        :return: The integer of this FormatTest.
        :rtype: int
        """
        return self._integer

    @integer.setter
    def integer(self, integer: int):
        """Sets the integer of this FormatTest.


        :param integer: The integer of this FormatTest.
        :type integer: int
        """

        self._integer = integer

    @property
    def int32(self) -> int:
        """Gets the int32 of this FormatTest.


        :return: The int32 of this FormatTest.
        :rtype: int
        """
        return self._int32

    @int32.setter
    def int32(self, int32: int):
        """Sets the int32 of this FormatTest.


        :param int32: The int32 of this FormatTest.
        :type int32: int
        """

        self._int32 = int32

    @property
    def int64(self) -> int:
        """Gets the int64 of this FormatTest.


        :return: The int64 of this FormatTest.
        :rtype: int
        """
        return self._int64

    @int64.setter
    def int64(self, int64: int):
        """Sets the int64 of this FormatTest.


        :param int64: The int64 of this FormatTest.
        :type int64: int
        """

        self._int64 = int64

    @property
    def number(self) -> float:
        """Gets the number of this FormatTest.


        :return: The number of this FormatTest.
        :rtype: float
        """
        return self._number

    @number.setter
    def number(self, number: float):
        """Sets the number of this FormatTest.


        :param number: The number of this FormatTest.
        :type number: float
        """
        if number is None:
            raise ValueError("Invalid value for `number`, must not be `None`")  # noqa: E501

        self._number = number

    @property
    def _float(self) -> float:
        """Gets the _float of this FormatTest.


        :return: The _float of this FormatTest.
        :rtype: float
        """
        return self.__float

    @_float.setter
    def _float(self, _float: float):
        """Sets the _float of this FormatTest.


        :param _float: The _float of this FormatTest.
        :type _float: float
        """

        self.__float = _float

    @property
    def double(self) -> float:
        """Gets the double of this FormatTest.


        :return: The double of this FormatTest.
        :rtype: float
        """
        return self._double

    @double.setter
    def double(self, double: float):
        """Sets the double of this FormatTest.


        :param double: The double of this FormatTest.
        :type double: float
        """

        self._double = double

    @property
    def string(self) -> str:
        """Gets the string of this FormatTest.


        :return: The string of this FormatTest.
        :rtype: str
        """
        return self._string

    @string.setter
    def string(self, string: str):
        """Sets the string of this FormatTest.


        :param string: The string of this FormatTest.
        :type string: str
        """

        self._string = string

    @property
    def byte(self) -> bytearray:
        """Gets the byte of this FormatTest.


        :return: The byte of this FormatTest.
        :rtype: bytearray
        """
        return self._byte

    @byte.setter
    def byte(self, byte: bytearray):
        """Sets the byte of this FormatTest.


        :param byte: The byte of this FormatTest.
        :type byte: bytearray
        """
        if byte is None:
            raise ValueError("Invalid value for `byte`, must not be `None`")  # noqa: E501

        self._byte = byte

    @property
    def binary(self) -> str:
        """Gets the binary of this FormatTest.


        :return: The binary of this FormatTest.
        :rtype: str
        """
        return self._binary

    @binary.setter
    def binary(self, binary: str):
        """Sets the binary of this FormatTest.


        :param binary: The binary of this FormatTest.
        :type binary: str
        """

        self._binary = binary

    @property
    def _date(self) -> date:
        """Gets the _date of this FormatTest.


        :return: The _date of this FormatTest.
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date: date):
        """Sets the _date of this FormatTest.


        :param _date: The _date of this FormatTest.
        :type _date: date
        """
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def date_time(self) -> datetime:
        """Gets the date_time of this FormatTest.


        :return: The date_time of this FormatTest.
        :rtype: datetime
        """
        return self._date_time

    @date_time.setter
    def date_time(self, date_time: datetime):
        """Sets the date_time of this FormatTest.


        :param date_time: The date_time of this FormatTest.
        :type date_time: datetime
        """

        self._date_time = date_time

    @property
    def uuid(self) -> str:
        """Gets the uuid of this FormatTest.


        :return: The uuid of this FormatTest.
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid: str):
        """Sets the uuid of this FormatTest.


        :param uuid: The uuid of this FormatTest.
        :type uuid: str
        """

        self._uuid = uuid

    @property
    def password(self) -> str:
        """Gets the password of this FormatTest.


        :return: The password of this FormatTest.
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password: str):
        """Sets the password of this FormatTest.


        :param password: The password of this FormatTest.
        :type password: str
        """
        if password is None:
            raise ValueError("Invalid value for `password`, must not be `None`")  # noqa: E501

        self._password = password
