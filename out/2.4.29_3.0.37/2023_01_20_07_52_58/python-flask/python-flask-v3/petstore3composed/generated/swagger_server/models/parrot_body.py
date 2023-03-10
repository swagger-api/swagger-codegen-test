# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.any_ofparrot_body_parrots_items import AnyOfparrotBodyParrotsItems  # noqa: F401,E501
from swagger_server import util


class ParrotBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, parrots: List[AnyOfparrotBodyParrotsItems]=None):  # noqa: E501
        """ParrotBody - a model defined in Swagger

        :param parrots: The parrots of this ParrotBody.  # noqa: E501
        :type parrots: List[AnyOfparrotBodyParrotsItems]
        """
        self.swagger_types = {
            'parrots': List[AnyOfparrotBodyParrotsItems]
        }

        self.attribute_map = {
            'parrots': 'parrots'
        }
        self._parrots = parrots

    @classmethod
    def from_dict(cls, dikt) -> 'ParrotBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The parrot_body of this ParrotBody.  # noqa: E501
        :rtype: ParrotBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def parrots(self) -> List[AnyOfparrotBodyParrotsItems]:
        """Gets the parrots of this ParrotBody.


        :return: The parrots of this ParrotBody.
        :rtype: List[AnyOfparrotBodyParrotsItems]
        """
        return self._parrots

    @parrots.setter
    def parrots(self, parrots: List[AnyOfparrotBodyParrotsItems]):
        """Sets the parrots of this ParrotBody.


        :param parrots: The parrots of this ParrotBody.
        :type parrots: List[AnyOfparrotBodyParrotsItems]
        """

        self._parrots = parrots
