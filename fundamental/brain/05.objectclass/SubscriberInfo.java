/*
    5.3 클래스 선언의 기초 문법
    - 5.6 두 개의 생성자를 갖는 클래스 - 가입자 정보 클래스
*/

class SubscriberInfo {
    String name, id, password;
    String phoneNo, address;

    SubscriberInfo(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    void changePassword(String password) {
        this.password = password;
    }

    void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    void setAddress(String address) {
        this.address = address;
    }
}
