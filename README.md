# 파일 업로드 예제 코드

### Description
커피 이미지 파일을 업로드 하기 위한 예제 코드입니다.

### 예제 코드 설명
* CoffeeController(src/main/java/com/springboot/coffee/controller)
  * `postCoffee()`에서는 Multipart form-data 형태로 커피 정보(커피 이름, 커피 가격 등)와 커피 이미지 파일을 전달받습니다.
* CoffeeService(src/main/java/com/springboot/coffee/service)
  * `createCoffee()`에서 커피 정보와 커피 이미지를 전달 받습니다.
  * 커피 정보는 CoffeeRepository를 이용해 DB에 저장합니다.
  * 커피 이미지는 StorageService(인터페이스)를 이용해 별도의 공간에 저장합니다.
    * StorageService의 구현 클래스가 FileSystemStorageService라면 로컬 디스크에 저장합니다.
    * StorageService의 구현 클래스가 S3StorageService라면 AWS의 S3 스토리지 서버에 전송 및 저장합니다.
* StorageService(src/main/java/com/springboot/config)
  * CoffeeService로 부터 전달 받은 커피 이미지 파일을 특정 공간에 저장하는 역할을 합니다.
  * FileSystemStorageService
    * StorageService 인터페이스의 구현 클래스 중 하나이며, 로컬 디스크에 커피 이미지를 저장하는 역할을 합니다.
  * S3StorageService
    * StorageService 인터페이스의 구현 클래스 중 하나이며, AWS의 S3 스토리지 서버에 커피 이미지를 전송 및 저장하는 역할을 합니다.
* StorageConfiguration(src/main/java/com/springboot/coffee/service)
  * StorageService 인터페이스를 구현하는 클래스의 인스턴스를 Spring 컨테이너의 Bean object로 등록합니다.

### HTTP Request 요청 예시
아래 경로의 이미지를 참고하세요.
* src/main/resources/images/postman1.png
* src/main/resources/images/postman2.png


