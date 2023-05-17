import connexion
import six

from swagger_server.models.binary import Binary  # noqa: E501
from swagger_server.models.byte_array import ByteArray  # noqa: E501
from swagger_server.models.client import Client  # noqa: E501
from swagger_server.models.outer_boolean import OuterBoolean  # noqa: E501
from swagger_server.models.outer_composite import OuterComposite  # noqa: E501
from swagger_server.models.outer_number import OuterNumber  # noqa: E501
from swagger_server.models.outer_string import OuterString  # noqa: E501
from swagger_server.models.user import User  # noqa: E501
from swagger_server import util


def fake_outer_boolean_serialize(body=None):  # noqa: E501
    """fake_outer_boolean_serialize

    Test serialization of outer boolean types # noqa: E501

    :param body: Input boolean as post body
    :type body: dict | bytes

    :rtype: OuterBoolean
    """
    if connexion.request.is_json:
        body = OuterBoolean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def fake_outer_composite_serialize(body=None):  # noqa: E501
    """fake_outer_composite_serialize

    Test serialization of object with outer number type # noqa: E501

    :param body: Input composite as post body
    :type body: dict | bytes

    :rtype: OuterComposite
    """
    if connexion.request.is_json:
        body = OuterComposite.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def fake_outer_number_serialize(body=None):  # noqa: E501
    """fake_outer_number_serialize

    Test serialization of outer number types # noqa: E501

    :param body: Input number as post body
    :type body: dict | bytes

    :rtype: OuterNumber
    """
    if connexion.request.is_json:
        body = OuterNumber.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def fake_outer_string_serialize(body=None):  # noqa: E501
    """fake_outer_string_serialize

    Test serialization of outer string types # noqa: E501

    :param body: Input string as post body
    :type body: dict | bytes

    :rtype: OuterString
    """
    if connexion.request.is_json:
        body = OuterString.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def test_body_with_query_params(body, query):  # noqa: E501
    """test_body_with_query_params

     # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param query: 
    :type query: str

    :rtype: None
    """
    if connexion.request.is_json:
        body = User.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def test_client_model(body):  # noqa: E501
    """To test \&quot;client\&quot; model

    To test \&quot;client\&quot; model # noqa: E501

    :param body: client model
    :type body: dict | bytes

    :rtype: Client
    """
    if connexion.request.is_json:
        body = Client.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def test_endpoint_parameters(number, double, pattern_without_delimiter, byte, integer=None, int32=None, int64=None, _float=None, string=None, binary=None, _date=None, dateTime=None, password=None, callback=None):  # noqa: E501
    """Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

    Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트  # noqa: E501

    :param number: None
    :type number: 
    :param double: None
    :type double: float
    :param pattern_without_delimiter: None
    :type pattern_without_delimiter: str
    :param byte: None
    :type byte: str
    :param integer: None
    :type integer: int
    :param int32: None
    :type int32: int
    :param int64: None
    :type int64: int
    :param _float: None
    :type _float: float
    :param string: None
    :type string: str
    :param binary: None
    :type binary: str
    :param _date: None
    :type _date: str
    :param dateTime: None
    :type dateTime: str
    :param password: None
    :type password: str
    :param callback: None
    :type callback: str

    :rtype: None
    """
    _date = util.deserialize_date(_date)
    dateTime = util.deserialize_datetime(dateTime)
    return 'do some magic!'


def test_enum_parameters(enum_form_string_array=None, enum_form_string=None, enum_header_string_array=None, enum_header_string=None, enum_query_string_array=None, enum_query_string=None, enum_query_integer=None, enum_query_double=None):  # noqa: E501
    """To test enum parameters

    To test enum parameters # noqa: E501

    :param enum_form_string_array: Form parameter enum test (string array)
    :type enum_form_string_array: List[str]
    :param enum_form_string: Form parameter enum test (string)
    :type enum_form_string: str
    :param enum_header_string_array: Header parameter enum test (string array)
    :type enum_header_string_array: List[str]
    :param enum_header_string: Header parameter enum test (string)
    :type enum_header_string: str
    :param enum_query_string_array: Query parameter enum test (string array)
    :type enum_query_string_array: List[str]
    :param enum_query_string: Query parameter enum test (string)
    :type enum_query_string: str
    :param enum_query_integer: Query parameter enum test (double)
    :type enum_query_integer: int
    :param enum_query_double: Query parameter enum test (double)
    :type enum_query_double: float

    :rtype: None
    """
    return 'do some magic!'


def test_inline_additional_properties(param):  # noqa: E501
    """test inline additionalProperties

     # noqa: E501

    :param param: request body
    :type param: 

    :rtype: None
    """
    return 'do some magic!'


def test_json_form_data(param, param2):  # noqa: E501
    """test json serialization of form data

     # noqa: E501

    :param param: field1
    :type param: str
    :param param2: field2
    :type param2: str

    :rtype: None
    """
    return 'do some magic!'
