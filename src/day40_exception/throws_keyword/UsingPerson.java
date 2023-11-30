package day40_exception.throws_keyword;

public class UsingPerson {
    public static void main(String[] args) throws Exception {

        Person obj = new Person();
        obj.setName("");

        try{
            obj.setName("");
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            obj.setAge(-50);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}
