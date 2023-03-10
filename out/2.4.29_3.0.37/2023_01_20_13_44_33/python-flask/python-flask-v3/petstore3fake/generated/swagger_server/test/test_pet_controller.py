# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.all_pets_response import AllPetsResponse  # noqa: E501
from swagger_server.models.api_response import ApiResponse  # noqa: E501
from swagger_server.models.pet import Pet  # noqa: E501
from swagger_server.models.single_pet_response import SinglePetResponse  # noqa: E501
from swagger_server.models.sub_category import SubCategory  # noqa: E501
from swagger_server.test import BaseTestCase


class TestPetController(BaseTestCase):
    """PetController integration test stubs"""

    def test_add_pet(self):
        """Test case for add_pet

        Add a new pet to the store
        """
        body = Pet()
        response = self.client.open(
            '/v2/pet',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_pet(self):
        """Test case for delete_pet

        Deletes a pet
        """
        headers = [('api_key', 'api_key_example')]
        response = self.client.open(
            '/v2/pet/{petId}'.format(pet_id=789),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_do_category_stuff(self):
        """Test case for do_category_stuff

        
        """
        body = SubCategory()
        response = self.client.open(
            '/v2/pet/category',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_pets_by_status(self):
        """Test case for find_pets_by_status

        Finds Pets by status
        """
        query_string = [('status', 'available')]
        response = self.client.open(
            '/v2/pet/findByStatus',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_pets_by_tags(self):
        """Test case for find_pets_by_tags

        Finds Pets by tags
        """
        query_string = [('tags', 'tags_example')]
        response = self.client.open(
            '/v2/pet/findByTags',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_pets(self):
        """Test case for get_all_pets

        
        """
        response = self.client.open(
            '/v2/allPets',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_pet_by_id(self):
        """Test case for get_pet_by_id

        Find pet by ID
        """
        response = self.client.open(
            '/v2/pet/{petId}'.format(pet_id=789),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_random_pet(self):
        """Test case for get_random_pet

        
        """
        response = self.client.open(
            '/v2/randomPet',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_pet(self):
        """Test case for update_pet

        Update an existing pet
        """
        body = Pet()
        response = self.client.open(
            '/v2/pet',
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_pet_with_form(self):
        """Test case for update_pet_with_form

        Updates a pet in the store with form data
        """
        data = dict(name='name_example',
                    status='status_example')
        response = self.client.open(
            '/v2/pet/{petId}'.format(pet_id=789),
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_upload_file(self):
        """Test case for upload_file

        uploads an image
        """
        data = dict(additional_metadata='additional_metadata_example',
                    file='file_example')
        response = self.client.open(
            '/v2/pet/{petId}/uploadImage'.format(pet_id=789),
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
