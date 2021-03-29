package SeleniumSession;

public class JavaStaticConcept {
     String name ;
     int age ;
     static int total ;

     public void getName(){
         System.out.println("get Name............");
     }

     public static void getSalary(){
         System.out.println("get salary...........");
     }

    public static void main(String[] args) {
        //how to access static vars and method :
        //1.no need to create the object
        //2.call by class name
        //3.directly call
        JavaStaticConcept.getSalary();
        total = 10 ;

        //how to call non static stuff: create the object :
        JavaStaticConcept js = new JavaStaticConcept();
        js.age = 10 ;
        js.name = "tom";
        js.getName();
        js.getSalary();



    }
}
