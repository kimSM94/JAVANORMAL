package S20221017;

class Data {
    int x;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = new Data();
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }

}
