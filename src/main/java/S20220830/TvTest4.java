package S20220830;

class TvTest4 {
    public static void main(String[] args) {


    Tv[] tvArr = new Tv[3];

    for(int i = 0; i< tvArr.length; i++){
        tvArr[i] = new Tv();
        tvArr[i].channel = i + 10;
    }

    for(int i = 0 ; i< tvArr.length; i++){
        tvArr[i].channelUp();
        System.out.printf("tvArr[%d].chaneel=%d%n",i,tvArr[i].channel);
    }

}
}