package day37_a_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {

        Running objRun = new Running();
        System.out.println(objRun.name);
        System.out.println();
        System.out.println(objRun.caloriesBurnt(5));
        objRun.generalInfo();


        PushUp objPushup = new PushUp();
        System.out.println(objPushup.name);
        System.out.println(objPushup.caloriesBurnt(5));
        objPushup.generalInfo();


    }


}
