package day37_a_abstraction.exercise;

public class PushUp extends Exercise{
    public PushUp(){
        super("Push up");
    }

    public void performExercise(){
        System.out.println("Doing push ups");
    }

    public int caloriesBurnt(int min){
        return min*2;
    }




}
