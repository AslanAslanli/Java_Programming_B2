package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "DEV", "Developer", "PO", "Devops", "QA", "QE", "BA", "SM", "PM",
                "SH", "Team Lead", "Client", "SME"));

        System.out.println("Original Job Titles: " + allJobs);

        ArrayList <String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("SM", "BA", "Client"));
        System.out.println(jobs1);

        System.out.println("---------------------");
        ArrayList <String> jobs2 = new ArrayList<>(allJobs);
        System.out.println(jobs2);
        jobs2.retainAll(Arrays.asList("SDET", "QA", "DEV"));
        System.out.println(jobs2);


        System.out.println("---------------------");
        ArrayList <String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3);
        System.out.println(jobs3.containsAll(Arrays.asList("SDET", "PM", "SME")));
        System.out.println(jobs3.containsAll(Arrays.asList("Doctor", "PM", "SME")));


    }
}
