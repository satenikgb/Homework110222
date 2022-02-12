import java.util.Scanner;
import java.util.SortedMap;


public class Homeworkday9 {
    /*
    14.The program will read three types of scores(quiz, mid-term, and final scores) and determine the
grade based on the following rules:
-if the average score &gt;= 80% =&gt;grade=A
-if the average score &gt;= 60% and &lt;80% =&gt; grade=B
-if the average score&gt;=40% and &lt; 60% =&gt;grade=C
-else =&gt;grade=F
     */
    public static void determineGrade(int quiz, int midterm, int finals) {
        int average = (int) (quiz + midterm + finals) / 3;
        switch (average / 10) {
            case 8:
            case 9:
            case 10:
                System.out.println("Your grade is A");
                break;
            case 6:
            case 7:
                System.out.println("Your grade is B");
                break;
            case 4:
            case 5:
                System.out.println("Your grade is C");
                break;
            default:
                System.out.println("Your grade is F");


        }
    }

    /*
    Program to make a calculator using switch case in Java
In this Program we are making a simple calculator that performs addition, subtraction, multiplication and
division based on the user input. The program takes the value of both the numbers (entered by user) and
then user is asked to enter the operation (+, -, * and /), based on the input program performs the selected
operation on the entered numbers using switch case.
     */
    public static void calculator(int num1, int num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The addition of number=" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The subtraction of number=" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The multiplication of number=" + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("The division of number=" + result);
                break;
            default:
                System.out.println("Error");

        }

    }

    /*
    13.Given the String variable day holding the name of the weekday Sunday, Monday, etc., set an int variable to 1, 2,
     */
    public static void weekday(String day) {
        int i;
        switch (day) {
            case "Monday":
                i = 1;
                break;
            case "Thuesday":
                i = 2;
                break;
            case "Wednesday":
                i = 3;
                break;
            case "Thursday":
                i = 4;
                break;
            case "Friday":
                i = 5;
                break;
            case "Saturday":
                i = 6;
                break;
            case "Sunday":
                i = 7;
                break;
            default:
                System.out.println("Error");
        }
    }

    /*
    Write a java program to find maximum from a given 3 integer numbers using ternary
operator.Input
     */
    public static void maximumwithTernary(int a, int b, int c) {
        int maximum;
        maximum = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(maximum);
    }
    /*
    10.Write Java Program to check Vowel or Consonant using Switch Case.
     */

    public static void vowelorConsonant(char character) {
        char character1 = Character.toUpperCase(character);
        switch (character1) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The character is Vowel");
            default:
                System.out.println("The character is Consonant");

        }
    }

    /*
    11.Using switch statements determine if the number is even or odd.
     */
    public static void evenOrOdd(int number) {
        switch (number % 2) {
            case 0:
                System.out.println("The number is even");
                break;
            case 1:
                System.out.println("The number is odd");
                break;
        }
    }

    /*
    If the user pressed number keys( from 0 to 9), the program will tell the number that is
pressed, otherwise, the program will show &quot;Not allowed&quot;.
     */
    public static void pressedNumber(int num) {
        switch (num) {
            case 0:
                System.out.println("The pressed number is zero");
                break;
            case 1:
                System.out.println("The pressed number is one");
                break;
            case 2:
                System.out.println("The pressed number is two");
                break;
            case 3:
                System.out.println("The pressed number is three");
                break;
            case 4:
                System.out.println("The pressed number is four");
                break;
            case 5:
                System.out.println("The pressed number is five");
                break;
            case 6:
                System.out.println("The pressed number is six");
                break;
            case 7:
                System.out.println("The pressed number is seven");
                break;
            case 8:
                System.out.println("The pressed number is eight");
                break;
            case 9:
                System.out.println("The pressed number is nine");
                break;
            default:
                System.out.println("Not allowed");

        }
    }

    /*
    9.Write a Java program that allows the user to choose the correct answer of a question.If
he choose correct answer Print “Congratulation”,
in case of illegal choice print “Invalide choice”.
     */
    public static void answerQuestion(char ch) {
        String question = "What is the correct way to declare a variable to store an integer value in Java?";
        switch (ch) {
            case 'a':
                System.out.println("Congratulation");
                break;
            case 'b':
                System.out.println("Invalid choice");
                break;
            case 'c':
                System.out.println("Invalid choice");
                break;
            case 'd':
                System.out.println("Invalid choice");
                break;
        }
    }

    /*
    Write a java program, which has 2 String variables, initialize them from console.
- - Compare them with == assignment

     */
    public static void equalsString(String s1, String s2) {
        boolean b = ((s1 == s2) ? true : false);
        System.out.println(b);
    }

    /*
    Write a java program, which has 2 String variables, initialize them from console.
     Compare them with equals to
     */
    public static void equaltoStrwitheq(String str1, String str2) {
        System.out.println(str1.equals(str2));
    }

    /*
    Input integer value from console, if value greater than 0 print n positive, else
    print negative.
     */
    public static void positiveOrNegative(int value) {
        String result = (value > 0) ? "Value is positive" : "Value is negative";
        System.out.println(result);
    }

    /*
    Input integer value from console, if value greater than 0 print positive, else
print negative, else if 0 print 0;
     */
    public static void positiveOrNegativeorZero(int value1) {
        String result1 = (value1 > 0) ? "Value is positive" : (value1 < 0) ? "Value is negative" : "Value is zero";
        System.out.println(result1);
    }

    public static void checkString(String str) {
        String checkstr = (str == null) ? "-1" : "0";
        System.out.println(checkstr);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Quiz score");
        int quiz = scanner.nextInt();
        System.out.println("Enter mid-term score");
        int midterm = scanner.nextInt();
        System.out.println("Enter final score");
        int finals = scanner.nextInt();
        determineGrade(quiz, midterm, finals);

        System.out.println("Enter number 1");
        int num1 = scanner.nextInt();
        ;
        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();
        ;
        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);
        calculator(num1, num2, operator);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        maximumwithTernary(a, b, c);

        String day = scanner.next();
        weekday(day);

        String str = scanner.next();
        checkString(str);

        System.out.println("Enter character");
        char character = scanner.next().charAt(0);
        vowelorConsonant(character);

        int number = scanner.nextInt();
        evenOrOdd(number);

        int num = scanner.nextInt();
        pressedNumber(num);

        char ch = scanner.next().charAt(0);
        answerQuestion(ch);


        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        equalsString(s1, s2);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        equalsString(str1, str2);

        int value = scanner.nextInt();
        positiveOrNegative(value);

        int value1 = scanner.nextInt();
        ;
        positiveOrNegativeorZero(value1);
    }

}


