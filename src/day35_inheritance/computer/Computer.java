package day35_inheritance.computer;

public class Computer {

   private String os;
    int memory;

    public Computer(String os, int memory){
        this.os = os;
        this.memory = memory;
    }

    private void privato (String os, int memory){
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer info: " +
                "\n\tos: " + os + '\'' +
                "\n\tmemory=" + memory;
    }
}
