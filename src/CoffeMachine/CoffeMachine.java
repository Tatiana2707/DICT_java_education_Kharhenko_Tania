import java.util.Scanner;

public class CoffeMachine {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int cups;
        int water;
        int milk;
        int coffe_beans;
        System.out.println("Write how many cups of coffe you will need: ") ;
                cups= in.nextInt();
                water=cups*200;
                milk=cups*50;
                coffe_beans=cups*15;

                System.out.println("For"+cups+"cups of coffe you will need");
                System.out.println(water + "ml of Water");
                System.out.println(milk + "ml of Milk");
                System.out.println(coffe_beans + "g of coffe beans");
    }
}