package SeleniumSession;

public class Page {

    String title;
    String header ;
    String url ;
    String pageNumber ;

    public Page(String title){
         this.title = title;
    }

    public Page(String title, String header) {
        this.title = title;
        this.header = header;
    }

    public Page(String title, String header, String url) {
        this.title = title;
        this.header = header;
        this.url = url;
    }

    public Page(String title, String header, String url, String pageNumber) {
        this.title = title;
        this.header = header;
        this.url = url;
        this.pageNumber = pageNumber;
    }

    public static void main(String[] args) {
        Page logInPage = new Page("Google");
        System.out.println(logInPage.title);

        Page homepage = new Page("Google","Google.com");
        System.out.println(homepage.title);
        System.out.println(homepage.header);

    }



}
