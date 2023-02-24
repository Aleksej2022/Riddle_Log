package riddlechalanger;

import java.util.Scanner;

public class Riddle_Challanger {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        /*
        * The code lines below are made to ask users three riddle questions using the println() method.
        * The response_1, response_2, response_3 variables are used to store the responses of the riddles from users
        * The riddle questions and the responses are displayed in specific format using the printf() method and String format specifiers
        * */


        System.out.println("I am tall, when I am young, and I am short, when I am old. What am I? ");
        String response_1 = object.nextLine();
        System.out.println("What can you keep after giving to someone? ");
        String response_2 = object.nextLine();
        System.out.println("What cannot talk but will reply when spoken to? ");
        String response_3 = object.nextLine();

        String question_1 = "I am tall, when I am young, and I am short, when I am old. What am I?";
        String question_2 = "What can you keep after giving to someone?";
        String question_3 =  "What cannot talk but will reply when spoken to?";

        System.out.printf("%20s%n", question_1);
        System.out.printf("%25S%n", response_1);

        System.out.printf("%20s%n", question_2);
        System.out.printf("%25S%n", response_2);

        System.out.printf("%20s%n", question_3);
        System.out.printf("%25S%n", response_3);
    }
}
