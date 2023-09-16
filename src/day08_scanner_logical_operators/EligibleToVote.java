package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {

           /*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

    print : $name is eligible to vote: $boolean

 */
        String name = "James Bond";
        boolean isCitizen = true;
        boolean isLawful = true;
        int age = 49;

        boolean eligibleToVote = isCitizen && isLawful && age >= 18;

        System.out.println(name + " is eligible to vote: " + eligibleToVote);


    }
}
