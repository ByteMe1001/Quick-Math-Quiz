// Name: Gabriel Ho Rui Jie
// Student no.: 7900302
// Tutorial Group: T04F
// JDK: Version 1.8
//
// File name: GabrielHo_55_Lab_5.java
// Declaration: This is my own work, and I have not passed my work to others

import java.util.Random;
import java.util.Scanner;

class MyInteger {

   private int n;

    // Default Constructor
    MyInteger() {

    }

    // Other constructor
    MyInteger(int n
    ){
        this.n = n;
    }

    // Copy constructor
    public MyInteger(MyInteger n) {
        this.n = getInteger();
    }

    // Set statements
    public void setInteger(int n){
        this.n = n;
    }

    // Get statements
    public int getInteger() {
        return this.n;
    }
}


class Math_Test {

    static Random rand = new Random();

    // scanner
    static Scanner input = new Scanner(System.in);

    static void getTwoIntegers(MyInteger m, MyInteger n) {
        m.setInteger(rand.nextInt(9));
        n.setInteger(rand.nextInt(9));
    }
    
    // Create random operator
    public static char getOperator() {

        char oper;
    
        int o = rand.nextInt(3);

        switch (o) {
            case 0: oper = '+';
                break;
            case 1: oper = '-';
                break;
            case 2: oper = '*';
                break;
            default: oper = ' ';
        }

        return oper;
    }

    // Answer checker
    public static boolean checkAnswer(int x, int v, char oper, int answer) {

        if (oper == '+' && answer == x + v) 
        return true;

        else if (oper == '-' && answer == x - v)
        return true;

        else if (oper == '*' && answer == x * v)
        return true;

        else
        return false;
    }

    // Main Method
    public static void main(String[] args) {

        int score = 5;
        int questionNo = 5;

        MyInteger n = new MyInteger();
        MyInteger m = new MyInteger(n);

        System.out.printf("Welcome to CSIT11 Arithmetic World%n");
        System.out.printf("You will solve 5 difficult arithmetic%n%n");

        // Print loop
        for (int i = 1; i < (questionNo + 1); i++){

            getTwoIntegers(m, n);

            char opr = getOperator();

            System.out.printf("Question %d: %d %c %d = ?%n", i, m.getInteger(), opr, n.getInteger());
            System.out.printf("Your answer: ");

            int answer = input.nextInt();
            

            if (checkAnswer(m.getInteger() ,n.getInteger() ,opr, answer) == true) {
                System.out.println("Correct answer\n");
            }
            
            else {
                System.out.println("Wrong answer\n");
                score--;
            }
        }

        if (score <= 2){
            System.out.printf("Your score %d/%d, hope you can score full mark next time%n", score, questionNo);
        }

        else {
            System.out.printf("Your score %d/%d, well done%n", score, questionNo);
        }
        
    }

}


