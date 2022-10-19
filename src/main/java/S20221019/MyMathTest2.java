package S20221019;

public class MyMathTest2 {

    long a, b;

    // 인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
    long add() {
        return a + b;
    }
    long subtract() {
        return a - b;
    }
    long multiply() {
        return a * b;
    }
    double divide() {
        return a / b;
    }

    // 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b){
        return a+b;
    }

}
