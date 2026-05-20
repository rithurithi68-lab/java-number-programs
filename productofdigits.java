import java.util.Scanner;
class productofdigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int product=1;
        while(n!=0){
            int digits=n%10;
            product=product*digits;
            n=n/10;
        }
        System.out.println("product" + product);
    }
}