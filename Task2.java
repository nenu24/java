public class Task2{

    static int factorial(int a)
    {
        if(a==0)
        return 1;

        return a*factorial(a-1);
    }
    public static void main(String[] args) {
     
        int num;
        System.out.println("Enter number = "+factorial(4));
    }
}