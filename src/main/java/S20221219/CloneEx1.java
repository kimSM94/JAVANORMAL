package S20221219;

class Point implements Cloneable{
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x=" + x + ",y = " + y;
    }

    public Object clone(){
        Object obj = null;

        try{
            // 반드시 예오처리 해줘야함.
            obj = super.clone();

        }catch(CloneNotSupportedException e){
            e.getMessage();
        }
        return obj;
    }

}


class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone();
        System.out.println(original);
        System.out.println(copy);

    }

}
