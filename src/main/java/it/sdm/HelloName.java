package it.sdm;

public class HelloName {

    public void main(String... args) {
        if (args.length == 0) {
            System.out.println("Hello stranger!");
        } else {
            System.out.println("Hello " + args[0] + "!");
        }
    }
    
}
