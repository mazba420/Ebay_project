package SeleniumSession;

public class Person {

    //Constructor
    //1.having the same name as the class name
    //2.const.. will never return value
    //3.no return type , no void
    //4.its look like function but its not function
    //5.const overloading possible
    //6.const with zero parameter -- defult const
    //7.consts will call when we create the object of the class


    public Person(){
        System.out.println("0 param const");
    }

    public Person(int i){
        System.out.println("1 param const");

    }
    public Person(int i , int p){
        System.out.println("2 param const");
    }
    public Person(int i , String a){
        System.out.println("2 param const");
    }
    public Person(String a , int i){
        System.out.println("2 param const");
    }

    public static void main(String[] args) {

       Person p1 = new Person(10);

       Person p2 = new Person("BD",10);


    }


}
