package Package07;

class Product {
    int price; //제품의 가격
    int bonusPoint; //제품 구매시 제공하는 보너스점수
    Product(){

    }
    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
