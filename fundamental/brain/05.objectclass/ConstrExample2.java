/*
    5.3 클래스 선언의 기초 문법
    - 5.7 두 개의 생성자를 갖는 클래스의 객체를 생성하는 프로그램
*/

class ConstrExample2 {
    public static void main(String args[]) {
        SubscriberInfo obj1, obj2;
        obj1 = new SubscriberInfo("연흥부", "poorman", "zebi");
        obj2 = new SubscriberInfo("연놀부", "richman", "money", "02-000-0000", "타워팰리스");

        printSubscriberInfo(obj1);
        printSubscriberInfo(obj2);
    }

    static void printSubscriberInfo(SubscriberInfo obj) {
        System.out.println("이름: " + obj.name);
        System.out.println("아이디: " + obj.id);
        System.out.println("패스워드: " + obj.password);
        System.out.println("전화번호: " + obj.phoneNo);
        System.out.println("주소: " + obj.address);
        System.out.println();
    }
}
