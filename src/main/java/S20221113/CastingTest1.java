package S20221113;

class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (Car)fe;에서 형변환이 생략
        /// car.water(); 참조변수 호출 불가
        fe2 = (FireEngine) car;
        fe2.water();

    }
}


class Car {
    String color;
    int door;

    void  drive(){
        System.out.println("drive, BRRR~");
    }

    void stop(){
        System.out.println("Stop!!!");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("Water!!!!");
    }
}