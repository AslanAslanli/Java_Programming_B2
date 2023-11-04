package day30_b_custom_classes;

public class UsingApp {
    public static void main(String[] args) {

        App appOne = new App();
        appOne.name = "Etsy";
        appOne.version = 5.7;
        appOne.isFree = true;

        System.out.println(appOne.name);
        appOne.run();

        App appTwo = new App();
        appTwo.run();
        System.out.println(appTwo.version);
        appOne.update();
        System.out.println(appOne.version);
        System.out.println(appOne.isFree);

        System.out.println(appOne);

        new App().run();
        System.out.println(new App().name);



    }

}
