/*
    5.3 클래스 선언의 기초 문법
    - 5.2 GoodsStock 클래스 - 상품 재고 클래스
*/

class GoodsStock {
    // Field
    String goodsCode;
    int stockNum;

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
