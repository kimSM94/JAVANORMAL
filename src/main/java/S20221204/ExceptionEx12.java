package S20221204;

class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1();
    }


    static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리가 되었습니다.");
            e.printStackTrace();
        }
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
