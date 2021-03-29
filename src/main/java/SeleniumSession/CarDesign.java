package SeleniumSession;

public class CarDesign {

    String name ;
    String model ;
    int price  ;
    static int wheel = 4;


    public static void main(String[] args) {

        CarDesign c1 = new CarDesign();
        c1.name="Audi";
        c1.model = "Q3";
        c1.price = 30 ;

        System.out.println(c1.name+" "+c1.model+" "+c1.price+" "+CarDesign.wheel);

        CarDesign c2 = new CarDesign();
        c2.name = "toyota";
        c2.model ="Camry";
        c2.price= 35 ;

        System.out.println(c2.name+" "+c2.model+" "+c2.price+" "+CarDesign.wheel);





    }













}
