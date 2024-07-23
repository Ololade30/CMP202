package Encapsulation;

public class Main {
    
    public static void main(String[] args) {

        Person student = new Person("Bingham","Isaac","may","bhu/22/04/09/0058", 0);
        Person staff = new Person("Bingham","Isaac","may","bhu/22/04/09/0058", 0);
        
        // person.setName("I");
        // person.setPassword("may");
        System.out.println(staff);

        Physics calvelocity = new Physics();
        System.out.println(calvelocity.calculateVelocity(50,10));
        System.out.println(calvelocity.calculateVelocity(50,20,10));



    }
}
