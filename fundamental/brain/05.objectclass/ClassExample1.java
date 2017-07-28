/*
    5.3 클래스 선언의 기초 문법
    - 5.3 GoodsStock 클래스의 객체를 생성해서 사용하는 프로그램
*/

class ClassExample1 {
    public static void main(String args[]) {
        GoodsStock obj;
        obj = new GoodStock();
        obj.goodsCode = "52135";
        obj.stockNum = 200;

        System.out.println("상품코드: " + obj.goodsCode);
        System.out.println("재고수량:" + obj.stockNum);

        obj.addStock(1000);
        System.out.println("상품코드: " + obj.goodsCode);
        System.out.println("재고수량:" + obj.stockNum);
    }
}
