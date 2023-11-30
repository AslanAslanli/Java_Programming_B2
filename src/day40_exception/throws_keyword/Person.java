package day40_exception.throws_keyword;

public class Person {
   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.isEmpty() || name == null)
            throw new Exception("You can not assign empty string");

        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age<0 || age>120)
            throw new IllegalArgumentException ("Age should be in the 0--120 range");

        this.age = age;
    }
}
