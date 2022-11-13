package S20221113;

import java.util.Vector;

class Product{
    int price;
    int bonusPrice;

    Product(int price){
        this.price = price;
        bonusPrice = (int) (price / 10.0);
    }

    Product(){
        price = 0;
        bonusPrice = 0;
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product{
    Audio(){
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0 ;
    Vector item = new Vector();


    void buy(Product p){
        if(money<p.price){
            System.out.println("잔액이 부족하여 물건을 사실 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPrice;
        item.add(p);
        System.out.println(p +"을/를 구입하셨습니다.");
    }

    void refund(Product p){
        if(item.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPrice;
            System.out.println(p + "을/를 반품 하셨습니다.");
        }else{
            System.out.println("구입하신 제품 중 해당 환불제품이 없습니다.");
        }
    }

    void summary(){
        int sum = 0;
        String itemList ="";

        if(item.isEmpty()){
            System.out.println("구입하신 제품이업습니다.");
            return;
        }

        for(int i =0; i<item.size(); i++){

            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? " " + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 "+ sum);
        System.out.println("구입하신 젶품은 "+ itemList);
    }

}

 class PolyArgumentTest {
     public static void main(String[] args) {
         Buyer b = new Buyer();
         Tv tv = new Tv();
         Audio audio = new Audio();
         Computer com = new Computer();

         b.buy(tv);
         b.buy(com);
         b.buy(audio);
         b.summary();
         System.out.println();
         b.refund(com);
         b.summary();

         System.out.println("현재 남은 돈은" + b.money);
         System.out.println("현재 보너스는" + b.bonusPoint);
     }
}
