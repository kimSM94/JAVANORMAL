package S20221129;

class InnerEx3 {

    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner{
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
//        int siv = outerIv
        static int scv = outerCv;
    }
       void myMethod(){

           int lv = 0;
           final int LV = 0;

           class LocalInner{
               int liv = outerIv;
               int liv2 = outerCv;
               // 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다. -> 메서드가 수행을 마쳐서 짖역변수가 소멸된 시점에도,
               // 지역 클래스의 인스턴스가 소멸된 지역변수를 참조하려는 경우가 발생할 수 있기 때문에. JDK 1.8부터는 자동으로로//               int liv3 = lv;
               int liv4 = LV;
           }
       }



    }



