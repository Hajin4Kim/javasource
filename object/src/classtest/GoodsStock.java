package classtest;

// 상품 재고 관리 클래스
public class GoodsStock {
    // 속성
    private String goodsCode;    // 상품코드(goodsCode) : p1015
    private int stockNum;     // 재고수량(stockNum) : 100

    // 생성자
    public GoodsStock(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }

    // 기능
        // 재고 추가(addStock), 재고 감소(subStock)
    public void addStock(int num) {
        stockNum += num;
    }
    public int subStock(int num) {
        stockNum -=num;
        return stockNum;
    }
    
    // 재고수량 반환
    public int getStockNum(){
        return stockNum;
    }
    
    
    
}
