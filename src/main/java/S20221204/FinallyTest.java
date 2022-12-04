package S20221204;

class FinallyTest {

    public static void main(String[] args) {
        try{
            startInstall();
            copyFile();
            deleteTempFiles();
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            deleteTempFiles();
        }
    }

    static void startInstall(){

    }

    static void copyFile(){

    }

    static void deleteTempFiles(){

    }

}
