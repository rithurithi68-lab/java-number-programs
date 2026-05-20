import java.util.Scanner;
class swapnumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number:");
        int a=4;
        System.out.println("Enter a second number:");
        int b=8;
        System.out.println("before swapping:a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping:a="+a+",b="+b);
    }
}
