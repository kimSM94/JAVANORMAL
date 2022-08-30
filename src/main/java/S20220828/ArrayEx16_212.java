package S20220828;

public class ArrayEx16_212 {

    public static void main(String[] args) {



        System.out.println("매개변수의 개수 : " +args.length);


        if(args!=null)
        for(int i = 0 ; i <args.length; i ++){
            System.out.println("args["+i+"] = \"" + args[i] + "\"");
        }

    }
}
