School Management System
########################-
Technology Stack : Spring Boot, Spring Data JPA with MySQL.

1. Created Rest controller[StudentController.java] to access below API
 ##http://localhost:8080/rest/student/all >> to get all student details [GET Request]
 ##http://localhost:8080/rest/student/{rollNo} >> to get particular student detail [GET Request]
 ##http://localhost:8080/rest/student/save >> to save student details [POST Request]
 ##http://localhost:8080/rest/student/update >> to update student details [POST Request]
 ##http://localhost:8080/rest/student/delete >> to delete student details [DELETE Request]

2. Created DTO objects to map request JSON Payload values [StudentDto.java, AddressDto.java].

3. Created Entity to store student details [Student.java, Address.java], added address as seperate table and referenced in student table with address_id.

4. Created repository and managed to select and delete by rollNo.

5. below are the Json payloads to save and delete 

##Json payload to insert new student
{ 
   "firstName":"Manic",
   "lastName":"M",
   "dob":"2008-06-06",
   "gender":"M",
   "standard":"12",
   "address":{ 
      "street":"Balan Nagar 3rd street",
      "city":"Coimbatore",
      "state":"Tamilnadu",
      "country":"India",
      "postalCode":"641004"
   },
   "phoneNo":9677503182
}

##Json payload to update existing student

{ 
   "rollNo":1,
   "firstName":"Manic",
   "lastName":"Manoharan",
   "dob":"2008-06-06",
   "gender":"M",
   "standard":"12",
   "address":{ 
      "street":"Balan Nagar 3rd street",
      "city":"Coimbatore",
      "state":"Tamilnadu",
      "country":"India",
      "postalCode":"641004"
   },
   "phoneNo":9677503182
}


