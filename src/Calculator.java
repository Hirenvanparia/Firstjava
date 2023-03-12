public class Calculator {
    // global static/class variables
    static int a=120;
    static int b = 30;
    static int answer;
    // main method
    public static void main(String[] args) {
        addition();
        subtraction();
        division();
        multiplication();
    }
    // no return type no parameter user defined method
    static void addition (){
        answer= a + b;
        System.out.println(answer);
    }
    static void subtraction (){
        answer = a - b;
        System.out.println(answer);
    }
    static void division (){
        answer = a / b;
        System.out.println(answer);
    }
    static void multiplication (){
        answer = a * b;
        System.out.println(answer);
    }
}
