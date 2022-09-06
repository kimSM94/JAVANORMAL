package S20220906;

public class CallStacktest {

    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod(){
        secondMethod();
    }

    static void secondMethod(){

    }

}
