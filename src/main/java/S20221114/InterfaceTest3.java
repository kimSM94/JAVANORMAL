package S20221114;

class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a3 = new A3();
        a3.methodA();
    }
}


class A3{
    void methodA(){
        I3 i3 = InstanceManager.getInstance();
        i3.methodB();
        System.out.println(i3.toString());

    }
}
interface I3{
    public abstract void methodB();
}


class B3 implements I3{
    public void methodB(){
        System.out.println("methodB in B class");
    }

    public String toString(){
        return "class b";
    }
}
class InstanceManager{
    public static I3 getInstance(){
        return new B3();
    }
}
