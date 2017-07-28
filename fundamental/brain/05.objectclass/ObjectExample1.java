/*
    5.2 객체의 생성과 사용
    - 5-1 StringBuffer 객체를 생성하고 사용하는 프로그램
*/
class ObjectExample1 {
    public static void main(String args[]) {
        StringBuffer obj;
        obj = new StringBuffer('Hey, Java');
        obj.deleteCharAt(1);
        obj.deleteChatAt(1);
        obj.insert(1, 'i');
        System.out.println(obj);
    }
}
