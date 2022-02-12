import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;


public class Homeworkday8 {
    /**
     * Write a Java program to allow the user to input his/her age. Then the
     * program will show if the person is eligible to vote. A person who is
     * eligible to vote must be older than or equal to 18 years old.
     *
     * @Satenikgb
     */
    public static void Vote(int age) {
        if (age >= 18) {
            System.out.println("The Person eligble to vote");
        } else
            System.out.println("The Person is not eligble to vote");
    }

    /**
     * Write a Java program to determine whether an input number is an
     * even number.
     * Satenikgb
     */
    public static void EvenNumber(long number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");
    }

    public static void RandomInt(int number) {


    }

    /**
     * Write a Java program to determine whether an input number is a
     * multiple of a 5.
     *
     * @Satenikgb
     */
    public static void Multiple(long num) {
        if (num % 5 == 0) {
            System.out.println("The number is multiple 5");
        } else
            System.out.println("The number is not multiple 5");

    }

    /**
     * Generate and print random integer number between 2 to 7(not using
     * bound)
     */
    public static void RandomNumber(){
        int k=(int)(Math.random()*6)+2;
        System.out.println(k);
    }

    /**
     * Take three numbers from the user and print the greatest number.
     *
     * @Satenikgb
     */
    public static void Maximum(int a, int b, int c) {

        int max;

        if ((a > b) && (a > c)) {
            max = a;
        } else if (b > c) {
            max = b;
        } else
            max = c;
        System.out.println("The maximum is" + " " + max);
    }

    /**
     * Write a Java program that reads a floating-point number and prints
     * &quot;zero&quot; if the number is zero. Otherwise, print &quot;positive&quot; or &quot;negative&quot;.
     * Add &quot;small&quot; if the absolute value of the number is less than 1, or
     * &quot;large&quot; if it exceeds 1,000,000
     * (use Math.abs() for absolute value)
     *
     * @Satenikgb
     */
    public static void ReadNumber(float fnumber) {
        if (fnumber == 0) {
            System.out.println("Zero");
        } else if (fnumber < 0) {
            System.out.println("Negative");
        } else if (fnumber > 0 && fnumber < 1) {
            System.out.println("Small positive");
        } else if (fnumber > 1000000) {
            System.out.println("Large positive");
        }
    }

    /**The ice cream parlor sells three balls and five balls. Can you buy
     exactly k balls of ice cream?
     *
     * @Satenikgb
     */
    public static void IceCream(int k){
        if((k<3)||(k==4)||(k==7)){
            System.out.println("No");
        }else
            System.out.println("Yes");
    }

    /**
     * Write a Java program that keeps a number from the user and generates
     * an integer between 1 and 7 and displays the name of the weekday.
     *
     * @Satenikgb
     **/
    public static void Weekday(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }

    /**Write a Java program that takes a year from the user and print whether
     that year is a leap year or not.
     *
     * @Satenikgb
     */

    public static void LeapYear(int year) {


            if((year%4==0)&&(year%100!=0)||(year%400==0)){

                System.out.println("Year is leap year");
            }
            else
                System.out.println("Year is not leap");

        }




    /**   Generate random integer value, print true if random value
     corresponds these conditions, else print false(use boolean primitive
     type)
     -input number is greater than -1000 and less than 1000
     -input number is multiple of 3 or input number is multiple of 5

     *
     * @Satenikgb
     */

    public static void RandomNum(int rundomnumber) {
        boolean b = true;
        if ((rundomnumber > -1000) && (rundomnumber < 1000)) {
            System.out.println(b);
        } else System.out.println(!b);
        if ((rundomnumber % 3 == 0) && (rundomnumber % 5 == 0)) {
            System.out.println(b);
        } else
            System.out.println(!b);
    }

    /**Input from console int a and int b, if a and b corresponds for following
     requirements print “Both a and b legal”, if any of them does not
     correspond print about it like this “a is legal b is illegal &#39;&#39;. or vice versa
     - a &gt; 10 and b is not equal to 10
     - both a and b is positive
     - both a and b is negative
     - a &gt; 10 b &lt; 1 both of them are odd
     - a is a multiple of 5 OR b is a multiple of 5
     - a is not a multiple of 5 but b is a multiple of 5
     *
     * @Satenikgb
     *
     */

    public static void Task91(int num1, int num2) {
        if ((num1 > 10) && (num2 != 10)) {
            System.out.println("Both num1 and num2 legal");
        } else if (num1 > 10) {
            System.out.println("num1 is legal num2 is illegal");

        } else if (num2 != 10) {
            System.out.println("num2 is legal num1 is illegal");

        } else System.out.println("Vice Versa");
    }

    public static void Task92(int num1, int num2) {
        if ((num1 > 0) && (num2 > 0)) {
            System.out.println("Both num1 and num2 legal");
        } else if (num1 > 0) {
            System.out.println("num1 is legal num2 is illegal");

        } else if (num2 > 0) {
            System.out.println("num2 is legal num1 is illegal");

        } else System.out.println("Vice Versa");

    }

    public static void Task93(int num1, int num2) {
        if ((num1 < 0) && (num2 < 0)) {
            System.out.println("Both num1 and num2 legal");
        } else if (num1 < 0) {
            System.out.println("num1 is legal num2 is illegal");

        } else if (num2 < 0) {
            System.out.println("num2 is legal num1 is illegal");

        } else System.out.println("Vice Versa");

    }

    public static void Task94(int num1, int num2) {
        if ((num1 > 10) && (num2 < 1) && (num1 % 2 == 0) && (num2 % 2 == 0)) {
            System.out.println("Both num1 and num2 legal");
        } else if ((num1 > 10) && (num1 % 2 == 0)) {
            System.out.println("num1 is legal num2 is illegal");

        } else if ((num2 < 1) && (num2 % 2 == 0)) {
            System.out.println("num2 is legal num1 is illegal");

        } else System.out.println("Vice Versa");

    }

    public static void Task95(int num1, int num2) {
        if ((num1 % 5 == 0) || (num2 % 5 == 0)) {
            System.out.println("Both num1 and num2 legal");
        } else if ((num1 % 5 == 0) && (num1 % 5 != 0)) {
            System.out.println("num1 is legal num2 is illegal");

        } else if ((num2 % 5 != 0) && (num2 % 5 == 0)) {
            System.out.println("num2 is legal num1 is illegal");

        } else System.out.println("Vice Versa");
    }

    /**Input int values a and b from console
     - if one of them is multiple of 7, and both positive, and a
     greater than b, print all odd values between them
     - else print all even values between them
     *
     *
     * @Satenikgb
     */

    public static void Task10(int number1, int number2) {
        if ((number1 % 7 == 0) || (number2 % 7 == 0) && (number1 > 0) && (number2 > 0) && (number1 > number2)) {
            for (int i = number2; i <= number1; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }

    /**Given 3 positive numbers different from 0, Determine if there is
     a non-degenerate triangle with such sides.
     - Input numbers from console
     *
     * @Satenikgb
     *
     *
     */
    public static void Triangle(int leg1,int leg2,int leg3){
        if((leg1>0)&&(leg2>0)&&(leg3>0)){
            if(((leg1+leg2)>leg3)&&((leg2+leg3)>leg1)&&((leg1+leg3)>leg2)){
                System.out.println("Yes there is non-degenerate triangle");
            } else
                System.out.println("No, there isnt non degenerate triangle");
        }
    }

    /**13.Given 3 numbers, print count of numbers that equals to each
     other.(Input numbers from console)
     *
     * @Satenikgb
     */
    public static void Count(int x1,int x2,int x3){

        int count=0;
        if((x1==x2)){
            count+=2;
        }
        if(x1==x3){
            count+=1;
        }else
        if(x2==x3){
            count+=1;
        }
        System.out.println(count);
    }

    /**15.Given 3 integer values arrange them in non-decreasing order.
     *
     * @Satenikgb
     */

    public static void NonDecreasing(int x,int y,int z){
        if((x<=y)&&(y<=z)){
            System.out.println(x+" "+y+" "+z);
        } else
            if((x<=z)&&(z<=y)){
                System.out.println(x+" "+z+" "+y);
            }else
                if((y<=x)&&(z<=x)){
                    System.out.println(y+" "+z+" "+x);
                }
    }

    /**Given coordinates of two points in the coordinate plane.Write
     java program to check if the points lie in the same plane?(quarter)
     - Print In the same quarter , else print Not in the same quarter.
     - Input 4 coordinates from console, all 4 coordinates != 0.
     *
     *
     * @Satenikgb
     */
    public static void DetermineQuadrant(int p1,int p2,int p3, int p4){
        if((p1>0)&&(p2>0)&&(p3>0)&&(p4>0)){
            System.out.println("The points lies in First quadrant");
        }else
            if((p1>0)&&(p2<0)&&(p3>0)&&(p4<0)){
                System.out.println("The points lies in Second quadrant");
            }else
                if((p1<0)&&(p2<0)&&(p3<0)&&(p4<0)) {
            System.out.println("The points lies in Third quadrant");
                }
                else
                    if((p1>0)&&(p2<0)&&(p3<0)&&(p4>0))
                    {
                        System.out.println("The points lies in Third quadrant");
                    }
                    else
                        System.out.println("Not in the same quadrant");

    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter integer age");
        int age = scanner.nextInt();
        Vote(age);

        System.out.println("Enter long type number");
        long number = scanner.nextLong();
        EvenNumber(number);

        System.out.println("Enter long type number");
        long num = scanner.nextLong();
        Multiple(num);

        RandomNumber();

        System.out.println("Enter int type a");
        System.out.println("Enter int type b");
        System.out.println("Enter int type c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        Maximum(a, b, c);

        System.out.println("Enter float fnumber ");
        float fnumber = scanner.nextFloat();
        ReadNumber(fnumber);

        System.out.println("Enter Integer k");
        int k=scanner.nextInt();
        IceCream(k);

        System.out.println("Enter integer day");
        int day = scanner.nextInt();
        Weekday(day);

        System.out.println("Enter integer year");
        int year = scanner.nextInt();
        LeapYear((year));

        System.out.println("Enter random number");
        int randomnumber = random.nextInt();
        RandomNum(randomnumber);

        System.out.println("Enter integer num1");
        System.out.println("Enter integer num2");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Task91(num1, num2);
        Task92(num1, num2);
        Task93(num1, num2);
        Task94(num1, num2);
        Task95(num1, num2);

        System.out.println("Enter integer number1");
        System.out.println("Enter integer number2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        Task10(number1, number2);

        System.out.println("Enter int triangle leg1");
        int leg1=scanner.nextInt();
        System.out.println("Enter int triangle leg2");
        int leg2=scanner.nextInt();
        System.out.println("Enter int triangle leg3");
        int leg3=scanner.nextInt();
        Triangle(leg1,leg2,leg3);

        System.out.println("Enter x1, x2,x3 number");
        int x1=scanner.nextInt();
        int x2=scanner.nextInt();
        int x3=scanner.nextInt();
        Count(x1,x2,x3);

        System.out.println("Enter integer x");
        int x= scanner.nextInt();
        System.out.println("Enter integer y");
        int y= scanner.nextInt();
        System.out.println("Enter integer z");
        int z= scanner.nextInt();
        NonDecreasing(x,y,z);

        System.out.println("Enter coordinat of two points");
        int p1= scanner.nextInt();
        int p2= scanner.nextInt();
        int p3= scanner.nextInt();
        int p4= scanner.nextInt();
        DetermineQuadrant(p1,p2,p3,p4);




    }


}

