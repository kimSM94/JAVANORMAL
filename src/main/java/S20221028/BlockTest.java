package S20221028;

class BlockTest {

    static {
        System.out.println("static { }"); // 클래스 초기화 블럭 - 클래스가 처음 로딩될 때 한번만 수행,
    }

    {
        System.out.println("{ }"); // 인스턴스 초기화 블럭 - 생성자와 같이 인스턴스를 생성할때 만들엊미, 생성자보다 먼저 수행됨
    }

    public BlockTest(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new Blocktest() ; ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new Blocktest() ; ");
        BlockTest bt2 = new BlockTest();


    }
}
