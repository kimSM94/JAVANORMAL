package S20221114;

class DefaultMethodTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();


    }

}

class Child extends Parent implements  MyInterface, MyInterface2{
    public void method1(){
        System.out.println("method1() in Child");
    }
}


class Parent{
    public void method2(){
        System.out.println("method2() in Parent");
    }
}

interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyINterface");
    }

    default void method2(){
        System.out.println("method2() in MyINterface");
    }

    static void staticMethod(){
        System.out.println("staticMethod() in MyINterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyINterface2");
    }

    static void staticMethod(){
        System.out.println("staticMethod() in MyINterface2");
    }
}