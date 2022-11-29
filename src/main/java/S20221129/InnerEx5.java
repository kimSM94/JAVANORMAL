package S20221129;

class Outer2{
    int value = 10;

    class Inner{
        int value = 20;

        void method1(){
            int value = 30;
            System.out.println("vlaue : "+value);
            System.out.println("vlaue : "+this.value);
            System.out.println("vlaue : " + Outer2.this.value);
        }

    }

}

class InnerEx5 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        inner.method1();
    }
}
