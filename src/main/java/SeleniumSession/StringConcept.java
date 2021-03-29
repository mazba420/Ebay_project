package SeleniumSession;

public class StringConcept {
    public static void main(String[] args) {
        String s = "my name is iphone x ";

        System.out.println(s.charAt(5));
        System.out.println(s.indexOf("a"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //trim
        String st = " hellow world ";
        System.out.println(st.trim());
        System.out.println(st.trim().replace(" ","+"));

        String message = "welcome to Amazon ";
        System.out.println(message.contains("Amazon"));
        System.out.println(message.equalsIgnoreCase(" amazon"));

        //replace

        String dob = "01-02-2020";
        System.out.println(dob.replace("-","+"));

      //split

        String lang = "java_phython_rubi_C++_C";

        String langValue[] = lang.split("_");

        System.out.println(langValue.length);

        for (String s1 : langValue) {
            System.out.println(s1);
        }

        String as = "your id is 95444";

        System.out.println(as.substring(0,10));
        System.out.println(as.substring(as.indexOf("is")+3,as.length()));

        String myName = "She is my brother in law and i was also 123456";

       // System.out.println(myName.substring(myName.indexOf("brother")+7,myName.length()));
        //System.out.println(myName.substring(myName.indexOf("also")+5));
        System.out.println(myName.split(" ")[10]);

        System.out.println(myName.split(" ")[3]);





        }










    }

