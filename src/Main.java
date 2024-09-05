/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(add(9, 8));
        System.out.println(add(7, 8, 9, 0));
        System.out.println(morningGreeting("Zhongmou"));
        System.out.println(afternoonGreeting("Zhongmou"));
        System.out.println(triple("hi"));
        System.out.println(half(9));
        System.out.println(roundPositiveValueToNearestInteger(9.49));
        System.out.println(roundNegativeValueToNearestInteger(-9.49));
    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name;
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好， " + name;
    }
    // 5. triple
    public static String triple(String word){
        return word + word + word;
    }
    // 6. half
    public static double half(int a){
        return a / 2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        //plus 0.5 then cast
        return (int) ( a + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        if (a<0){
            return (int) ( a - 0.5);
        }
        else{
            return (int) ( a + 0.5);
        }

    }
}
