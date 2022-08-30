package S20220830;

class Tv {
    String color;
    boolean power;
    int channel;

    // Method
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}


class TvTest_235 {

    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1 의 채널값은 " + t1.channel);
        System.out.println("t2 의 채널값은 " + t2.channel);

        t1.channel = 7;
        System.out.println("t1의 갑 ㅅ변경");


    }
}
