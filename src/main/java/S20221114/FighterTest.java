package S20221114;

class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if ( f instanceof Unit){
            System.out.println("f는 Unit클래스의 자손입니다.");
        }
        if ( f instanceof Fightable){
            System.out.println("f는 Fightable인터페이스를 구현했습니다..");
        }

        if ( f instanceof Movable){
            System.out.println("f는 Movable인터페이스를 구현했습니다..");
        }

        if ( f instanceof Attackable){
            System.out.println("f는 Attackable인터페이스를 구현했습니다...");
        }

        if ( f instanceof Object){
            System.out.println("f는 Object 클래스의 자손입니다.");
        }
    }

}

class Fighter extends Unit implements Fightable{

    // 여기서 접근 제어자는 반드시 public으로 해얗마.
    public void move(int x, int y){

    }

    public void attack(Unit u){

    }

}

class Unit{
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {
}

interface Movable {

    void move(int x, int y);
}

interface Attackable{
    void attack(Unit u);
}