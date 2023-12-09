package day36_inheritance.app;

public class AppStore {
    public static void main(String[] args) {

        Instagram insta1 = new Instagram(4.0);
        insta1.download();
        insta1.follow();

        System.out.println();
        Youtube yt1 = new Youtube(3.4);
        yt1.download();
        yt1.subscribe();


    }
}
