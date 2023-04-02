import connexion
import six

from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from swagger_server.models.parrot_body import ParrotBody  # noqa: E501
from swagger_server.models.parrot_body1 import ParrotBody1  # noqa: E501
from swagger_server import util


def add_parrot(body=None):  # noqa: E501
    """Add a new parrow to the store

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: InlineResponse2001
    """
    if connexion.request.is_json:
        body = ParrotBody1.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_parrots():  # noqa: E501
    """get Parrots

     # noqa: E501


    :rtype: List[Object]
    """
    return 'do some magic!'


def update_parrots(body=None):  # noqa: E501
    """update parrots

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: InlineResponse200
    """
    if connexion.request.is_json:
        body = ParrotBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
