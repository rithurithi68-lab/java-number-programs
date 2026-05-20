import java.util.Scanner;
class automorphicnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int square=num*num;
        while(temp>0){
            if(temp%10!=square%10){
                System.out.println(num + "is not a automorphic number");
                return;
            }
            temp=temp/10;
            square=square/10;
        }
        System.out.println(num + "is a automorphic number");
    }
}