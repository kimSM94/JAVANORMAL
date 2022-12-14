package S20221214;

class Person {
    long id;

    public boolean equals(Object obj){
        if (obj instanceof Person) {
            return id == ((Person) obj).id;
        } else {
           return false;
        }
    }

    Person(long id){
        this.id = id;
    }

}


class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(801108L);
        Person p2 = new Person(801108L);

        if (p1 == p2) {
            System.out.println("==");
        }else{
            System.out.println("!=");
        }

        if (p1.equals(p2)) {
            System.out.println("==");
        }else{
            System.out.println("!=");
        }
    }



}
