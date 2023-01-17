part of swagger.api;

class PetIdUploadImageBody {
  /* Additional data to pass to server */
  String additionalMetadata = null;
/* file to upload */
  String file = null;

  PetIdUploadImageBody();

  @override
  String toString() {
    return 'PetIdUploadImageBody[additionalMetadata=$additionalMetadata, file=$file, ]';
  }

  PetIdUploadImageBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    additionalMetadata = json['additionalMetadata'];
    file = json['file'];
  }

  Map<String, dynamic> toJson() {
    return {
      'additionalMetadata': additionalMetadata,
      'file': file
     };
  }

  static List<PetIdUploadImageBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<PetIdUploadImageBody>() : json.map((value) => new PetIdUploadImageBody.fromJson(value)).toList();
  }

  static Map<String, PetIdUploadImageBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PetIdUploadImageBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PetIdUploadImageBody.fromJson(value));
    }
    return map;
  }
}
