
import java.util.Scanner;


public class AddV {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner kb=new Scanner(System.in);
        int i=kb.nextInt();
        int temp=0,s=0;
        temp=i;
        for(int j=1;i!=0;j++){
            int r;
            r=i%10;
            s=s+r;
            i=i/10;
        }
        System.out.println("The sum of number "+temp+" is "+s);
    } 
}
