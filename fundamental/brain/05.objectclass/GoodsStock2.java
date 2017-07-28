/*
    5.3 클래스 선언의 기초 문법
    - 5.4 생성자를 추가한 GoodsStock 클래스 - 상품 재고 클래스
*/

class GoodsStock2 {
    // Field
    String goodsCode;
    int stockNum;

    // Constructor
    GoodsStock2(String code, int num) {
        goodsCode = code;
        stockNum = num;
    }

    // Method
    void addStock(int amount) {
        stockNum += amount;
    }

    int subtractStock(int amount) {
        if (stockNum < amount) {
            return 0;
        }

        stockNum -= amount;
        return amount;
    }
}
