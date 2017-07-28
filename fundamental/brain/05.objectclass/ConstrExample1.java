/*
    5.3 클래스 선언의 기초 문법
    - 5.5 선언된 생성자를 이용하여 객체를 생성하는 프로그램
*/

class ConstrExample1 {
    public static void main(String args[]) {
        GoodStock2 obj;
        obj = new GoodsStock2("52135", 200);

        System.out.println("상품코드: " + obj.goodsCode);
        System.out.println("재고수량: " + obj.stockNum);

        obj.addStock(1000);
        System.out.println("상품코드: " + obj.goodsCode);
        System.out.println("재고수량: " + obj.stockNum);
    }
}
