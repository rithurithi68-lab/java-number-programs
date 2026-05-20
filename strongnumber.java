import java.util.Scanner;
class strongnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            int digits=temp%10; 
            int fact=1;
            for(int i=1; i<=digits; i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println(num + "is a strong number");
        }
        else{
            System.out.println(num + "is not a strong number");
        }
    }
}
