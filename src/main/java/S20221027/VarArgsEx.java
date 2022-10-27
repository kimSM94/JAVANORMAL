package S20221027;

public class VarArgsEx {

    public static void main(String[] args) {
        // 가변인자는 항상 마지막 매개변수이어야한다.

        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("",strArr));
        System.out.println(concatenate(",",new String[]{"1","2","3"}));
        System.out.println("["+concatenate(",", new String[0])+"]");
        System.out.println("["+concatenate(",")+"]");

    }

    static String concatenate(String delim, String... args){
        String result ="";

        for (String str : args){
            result += str + delim;
        }
        return result;
    }


}
