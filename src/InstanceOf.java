class Organization{}
class Hospital extends Organization{}
class Pulmonology extends Hospital{}
class Cardiology extends Hospital{}

class Eurotorg extends Organization{}
class Evroopt extends Eurotorg{}
class Hit extends Evroopt{}
class Groshyk extends Evroopt{}

public class InstanceOf {
    public static void Test (Organization a){
        if (a instanceof Hospital){
            System.out.println("Hospital");
        }else if(a instanceof Eurotorg){
            System.out.println("Eurotorg");
        }else {
            System.out.println("Organization not found");
        }
    }

    public static void main(String[] args) {
    Eurotorg market50 = new Groshyk();
    Test(market50);
    }
    // Instanceof - оператор принадлежности к типу.
    // Дает значение true, в случае принадлежности объекта к необходимому классу.





}
