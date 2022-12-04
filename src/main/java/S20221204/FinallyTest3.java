package S20221204;

class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("method1마치고 main으로");
    }

   static void method1(){
        try{
            System.out.println("Method1 이 호출되었습니다.");
            return;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finall 호출");
        }
   }

}
