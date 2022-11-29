package S20221129;

class InnerEx6 {

    Object iv = new Object(){
        void method(){

        }
    };

    static Object cv = new Object(){
        void method9(){

        }
    };

    void myMethod()
    {
        Object lv = new Object(){
            void method(){

            }
        };
    }

}
