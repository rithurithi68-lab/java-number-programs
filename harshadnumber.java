import java.util.Scanner;
class harshadnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            int digits=temp%10;
            sum=sum+digits;
            temp=temp/10;
        }
        if(num%sum==0){
            System.out.println(num + "is a harshad number");
        }
        else{
            System.out.println(num + "is not an harshad number");
        }

    }
}