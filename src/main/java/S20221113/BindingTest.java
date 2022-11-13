package S20221113;

class BindingTest {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        System.out.println("p,x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c,x = " + c.x);
        c.method();

    }
}


class Parent{
    int x = 100;
     void method(){
         System.out.println("Parent Method");
     }
}

class Child extends Parent {
    int x = 200;

    void method(){
        System.out.println("x=" + x);
        System.out.println("super.x = "+super.x);  // 조상 Pareent 선언된 인스턴스 x
        System.out.println("this.x = "+this.x);
    }

}
