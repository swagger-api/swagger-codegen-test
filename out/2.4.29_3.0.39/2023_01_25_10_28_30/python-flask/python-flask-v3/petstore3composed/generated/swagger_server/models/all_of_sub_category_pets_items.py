# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.pet import Pet  # noqa: F401,E501
from swagger_server import util


class AllOfSubCategoryPetsItems(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, id: int=None, name: str=None, status: str=None, part: List[Object]=None):  # noqa: E501
        """AllOfSubCategoryPetsItems - a model defined in Swagger

        :param id: The id of this AllOfSubCategoryPetsItems.  # noqa: E501
        :type id: int
        :param name: The name of this AllOfSubCategoryPetsItems.  # noqa: E501
        :type name: str
        :param status: The status of this AllOfSubCategoryPetsItems.  # noqa: E501
        :type status: str
        :param part: The part of this AllOfSubCategoryPetsItems.  # noqa: E501
        :type part: List[Object]
        """
        self.swagger_types = {
            'id': int,
            'name': str,
            'status': str,
            'part': List[Object]
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'status': 'status',
            'part': 'part'
        }
        self._id = id
        self._name = name
        self._status = status
        self._part = part

    @classmethod
    def from_dict(cls, dikt) -> 'AllOfSubCategoryPetsItems':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AllOfSubCategoryPetsItems of this AllOfSubCategoryPetsItems.  # noqa: E501
        :rtype: AllOfSubCategoryPetsItems
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this AllOfSubCategoryPetsItems.


        :return: The id of this AllOfSubCategoryPetsItems.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this AllOfSubCategoryPetsItems.


        :param id: The id of this AllOfSubCategoryPetsItems.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this AllOfSubCategoryPetsItems.


        :return: The name of this AllOfSubCategoryPetsItems.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this AllOfSubCategoryPetsItems.


        :param name: The name of this AllOfSubCategoryPetsItems.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def status(self) -> str:
        """Gets the status of this AllOfSubCategoryPetsItems.

        pet status in the store  # noqa: E501

        :return: The status of this AllOfSubCategoryPetsItems.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this AllOfSubCategoryPetsItems.

        pet status in the store  # noqa: E501

        :param status: The status of this AllOfSubCategoryPetsItems.
        :type status: str
        """
        allowed_values = ["available", "pending", "sold"]  # noqa: E501
        if status not in allowed_values:
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"
                .format(status, allowed_values)
            )

        self._status = status

    @property
    def part(self) -> List[Object]:
        """Gets the part of this AllOfSubCategoryPetsItems.


        :return: The part of this AllOfSubCategoryPetsItems.
        :rtype: List[Object]
        """
        return self._part

    @part.setter
    def part(self, part: List[Object]):
        """Sets the part of this AllOfSubCategoryPetsItems.


        :param part: The part of this AllOfSubCategoryPetsItems.
        :type part: List[Object]
        """

        self._part = part
