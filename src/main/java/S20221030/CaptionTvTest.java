package S20221030;

class Tv{
    boolean power;
    int channel;

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

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}


class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();

        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, Word");

        ctv.caption = true;
        ctv.displayCaption("Hello, Word");


    }


}
