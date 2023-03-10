# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class EnumArrays(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, just_symbol: str=None, array_enum: List[str]=None):  # noqa: E501
        """EnumArrays - a model defined in Swagger

        :param just_symbol: The just_symbol of this EnumArrays.  # noqa: E501
        :type just_symbol: str
        :param array_enum: The array_enum of this EnumArrays.  # noqa: E501
        :type array_enum: List[str]
        """
        self.swagger_types = {
            'just_symbol': str,
            'array_enum': List[str]
        }

        self.attribute_map = {
            'just_symbol': 'just_symbol',
            'array_enum': 'array_enum'
        }

        self._just_symbol = just_symbol
        self._array_enum = array_enum

    @classmethod
    def from_dict(cls, dikt) -> 'EnumArrays':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EnumArrays of this EnumArrays.  # noqa: E501
        :rtype: EnumArrays
        """
        return util.deserialize_model(dikt, cls)

    @property
    def just_symbol(self) -> str:
        """Gets the just_symbol of this EnumArrays.


        :return: The just_symbol of this EnumArrays.
        :rtype: str
        """
        return self._just_symbol

    @just_symbol.setter
    def just_symbol(self, just_symbol: str):
        """Sets the just_symbol of this EnumArrays.


        :param just_symbol: The just_symbol of this EnumArrays.
        :type just_symbol: str
        """
        allowed_values = [">=", "$"]  # noqa: E501
        if just_symbol not in allowed_values:
            raise ValueError(
                "Invalid value for `just_symbol` ({0}), must be one of {1}"
                .format(just_symbol, allowed_values)
            )

        self._just_symbol = just_symbol

    @property
    def array_enum(self) -> List[str]:
        """Gets the array_enum of this EnumArrays.


        :return: The array_enum of this EnumArrays.
        :rtype: List[str]
        """
        return self._array_enum

    @array_enum.setter
    def array_enum(self, array_enum: List[str]):
        """Sets the array_enum of this EnumArrays.


        :param array_enum: The array_enum of this EnumArrays.
        :type array_enum: List[str]
        """
        allowed_values = ["fish", "crab"]  # noqa: E501
        if not set(array_enum).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `array_enum` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(array_enum) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._array_enum = array_enum
