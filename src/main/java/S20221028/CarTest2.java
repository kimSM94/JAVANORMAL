package S20221028;

class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(String color){
        this(color, "auto", 4);
    }
    // 인스턴스의 복사를 위한 새성자
    Car(Car c){
        this.color = c.color;
        this.gearType = c.gearType;
        this.door = c.door;
    }

    Car(String color, String gearType, int door) {

        // this - 인스턴스 자신을 가리치키는 참조변수, 인스턴스의 주소가 저장되어 있따. 모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다.
        // this(), this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class CarTest2 {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1의 color= "+c1.color + ", gearType=" +c1.gearType + ", door = "+ c1.door);
        System.out.println("c2의 color= "+c2.color + ", gearType=" +c2.gearType + ", door = "+ c2.door);
    }
}
