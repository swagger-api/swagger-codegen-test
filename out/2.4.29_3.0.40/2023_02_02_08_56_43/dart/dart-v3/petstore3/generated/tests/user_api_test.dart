import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for UserApi
void main() {
  var instance = new UserApi();

  group('tests for UserApi', () {
    // Create user
    //
    // This can only be done by the logged in user.
    //
    //Future<User> createUser({ User body, int id, String username, String firstName, String lastName, String email, String password, String phone, int userStatus }) async
    test('test createUser', () async {
      // TODO
    });

    // Creates list of users with given input array
    //
    // Creates list of users with given input array
    //
    //Future<User> createUsersWithListInput({ List<User> body }) async
    test('test createUsersWithListInput', () async {
      // TODO
    });

    // Delete user
    //
    // This can only be done by the logged in user.
    //
    //Future deleteUser(String username) async
    test('test deleteUser', () async {
      // TODO
    });

    // Get user by user name
    //
    //Future<User> getUserByName(String username) async
    test('test getUserByName', () async {
      // TODO
    });

    // Logs user into the system
    //
    //Future<String> loginUser({ String username, String password }) async
    test('test loginUser', () async {
      // TODO
    });

    // Logs out current logged in user session
    //
    //Future logoutUser() async
    test('test logoutUser', () async {
      // TODO
    });

    // Update user
    //
    // This can only be done by the logged in user.
    //
    //Future updateUser(String username, { User body, int id, String username, String firstName, String lastName, String email, String password, String phone, int userStatus }) async
    test('test updateUser', () async {
      // TODO
    });

  });
}
