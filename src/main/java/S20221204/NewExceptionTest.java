package S20221204;

class NewExceptionTest {
    public static void main(String[] args) {

        try{
            startInstall();
            copyFiles();
        }catch (SpaceException e){
            System.out.println("에러 메시지 :" + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보후에 부탁드립니다.");
        }catch (MemoryException me){
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();      //Garbage Collection을 수행하여 메모리를 늘려준다.
            System.out.println("다시 설치를 시도하세요.");
        }finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException{
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간 부족");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리 공간 부족");
        }
    }

    static void copyFiles(){

    }

    static void deleteTempFiles(){
        System.out.println("거구마");
    }

    static boolean enoughSpace(){
        return false;
    }

    static boolean enoughMemory(){
        return false;
    }
}

class SpaceException extends Exception{
    SpaceException(String msg) {
        super(msg);
    }
}
class MemoryException extends Exception{
    MemoryException(String msg) {
        super(msg);
    }
}