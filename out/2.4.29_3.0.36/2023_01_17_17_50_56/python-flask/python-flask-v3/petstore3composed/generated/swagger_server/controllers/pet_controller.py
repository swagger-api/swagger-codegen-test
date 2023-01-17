import connexion
import six

from swagger_server.models.api_response import ApiResponse  # noqa: E501
from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from swagger_server.models.parrot_body import ParrotBody  # noqa: E501
from swagger_server.models.parrot_body1 import ParrotBody1  # noqa: E501
from swagger_server.models.pet import Pet  # noqa: E501
from swagger_server.models.sub_category import SubCategory  # noqa: E501
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


def add_pet(body):  # noqa: E501
    """Add a new pet to the store

     # noqa: E501

    :param body: Pet object that needs to be added to the store
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = Pet.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_pet(pet_id, api_key=None):  # noqa: E501
    """Deletes a pet

     # noqa: E501

    :param pet_id: Pet id to delete
    :type pet_id: int
    :param api_key: 
    :type api_key: str

    :rtype: None
    """
    return 'do some magic!'


def do_category_stuff(body=None):  # noqa: E501
    """do_category_stuff

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: ApiResponse
    """
    if connexion.request.is_json:
        body = SubCategory.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def feed_pet(body, token, pet_type, status, pet_id, session_id):  # noqa: E501
    """Find pet by ID

    schedule pet feeding # noqa: E501

    :param body: Pet object that needs to be added to the store
    :type body: dict | bytes
    :param token: status
    :type token: str
    :param pet_type: type of food
    :type pet_type: str
    :param status: status
    :type status: str
    :param pet_id: ID of pet to return
    :type pet_id: int
    :param session_id: session id
    :type session_id: str

    :rtype: None
    """
    if connexion.request.is_json:
        body = Pet.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def find_pets_by_status(status):  # noqa: E501
    """Finds Pets by status

    Multiple status values can be provided with comma separated strings # noqa: E501

    :param status: Status values that need to be considered for filter
    :type status: List[str]

    :rtype: List[Pet]
    """
    return 'do some magic!'


def find_pets_by_tags(tags):  # noqa: E501
    """Finds Pets by tags

    Muliple tags can be provided with comma separated strings. Use\\ \\ tag1, tag2, tag3 for testing. # noqa: E501

    :param tags: Tags to filter by
    :type tags: List[str]

    :rtype: List[Pet]
    """
    return 'do some magic!'


def get_parrots():  # noqa: E501
    """get Parrots

     # noqa: E501


    :rtype: List[Object]
    """
    return 'do some magic!'


def get_pet_by_id(pet_id):  # noqa: E501
    """Find pet by ID

    Returns a single pet # noqa: E501

    :param pet_id: ID of pet to return
    :type pet_id: int

    :rtype: Pet
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


def update_pet(body):  # noqa: E501
    """Update an existing pet

     # noqa: E501

    :param body: Pet object that needs to be added to the store
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = Pet.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_pet_with_form(pet_id, name=None, status=None):  # noqa: E501
    """Updates a pet in the store with form data

     # noqa: E501

    :param pet_id: ID of pet that needs to be updated
    :type pet_id: int
    :param name: 
    :type name: str
    :param status: 
    :type status: str

    :rtype: None
    """
    return 'do some magic!'


def upload_file(pet_id, body=None):  # noqa: E501
    """uploads an image

     # noqa: E501

    :param pet_id: ID of pet to update
    :type pet_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: ApiResponse
    """
    if connexion.request.is_json:
        body = Object.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
