# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class ReadOnlyFirst(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, bar: str=None, baz: str=None):  # noqa: E501
        """ReadOnlyFirst - a model defined in Swagger

        :param bar: The bar of this ReadOnlyFirst.  # noqa: E501
        :type bar: str
        :param baz: The baz of this ReadOnlyFirst.  # noqa: E501
        :type baz: str
        """
        self.swagger_types = {
            'bar': str,
            'baz': str
        }

        self.attribute_map = {
            'bar': 'bar',
            'baz': 'baz'
        }

        self._bar = bar
        self._baz = baz

    @classmethod
    def from_dict(cls, dikt) -> 'ReadOnlyFirst':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ReadOnlyFirst of this ReadOnlyFirst.  # noqa: E501
        :rtype: ReadOnlyFirst
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bar(self) -> str:
        """Gets the bar of this ReadOnlyFirst.


        :return: The bar of this ReadOnlyFirst.
        :rtype: str
        """
        return self._bar

    @bar.setter
    def bar(self, bar: str):
        """Sets the bar of this ReadOnlyFirst.


        :param bar: The bar of this ReadOnlyFirst.
        :type bar: str
        """

        self._bar = bar

    @property
    def baz(self) -> str:
        """Gets the baz of this ReadOnlyFirst.


        :return: The baz of this ReadOnlyFirst.
        :rtype: str
        """
        return self._baz

    @baz.setter
    def baz(self, baz: str):
        """Sets the baz of this ReadOnlyFirst.


        :param baz: The baz of this ReadOnlyFirst.
        :type baz: str
        """

        self._baz = baz
