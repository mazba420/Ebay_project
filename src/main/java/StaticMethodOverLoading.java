public class StaticMethodOverLoading {


    public static void main(String[] args) {
        getTeam();


    }



    public static void getTeam(){
        getTeam(10);
    }

    public static void getTeam(int i ){
       getTeam(10,25);
    }

    public static void getTeam(int i , int k){

    }

}
