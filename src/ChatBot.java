package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        //Part1
        String bot_name = "Smile";
        int birth_year = 2002;
        System.out.println("Hello! My name is " + bot_name + ".\n" + "I was created in " + birth_year + ".");
        //Part2
        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String your_name = scanner.nextLine();
        System.out.println("What a great name you have, " + your_name + "!");
        //Part3
        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int your_age = (remainder3*70+remainder5*21+remainder7*15)%105;
        System.out.println("Your age is "+ your_age+" ; s a good time to start programming!");
        //Part4
        System.out.println("I can count. Enter the number and I will count to it.");
        int number = scanner.nextInt();
        for (int a=0; a<number+1; a++) {
            System.out.println(a + "!");
            if (a == number) {
                System.out.println("Готово!");}
        }
        //Part5
        System.out.println("Let's check your knowledge of French. You need to choose the correct answer to my question.\nQuestion: how is the word BOOK translated into French?");
        System.out.println("\n1.Книга\n2.Carte\n3.Livre\n4.Pencil");
        while (true) {
            int user_answer = scanner.nextInt();
            if(user_answer==3){
                System.out.println("Well done, "+your_name+"!\n Develop further the French language! Goodbye, have a nice day!");
                break;}
            else {
                System.out.println("Please, try again!");}
        }
    }
}
