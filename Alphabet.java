import java .util.Scanner;
class Alphabet{
public static void main(String[]args){
System.out.println("Enter Any Value");
Scanner kb=new Scanner(System.in);
char ch=kb.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
System.out.println("It is a character");
}


else if(ch>='0' || ch<='9'){
System.out.println("It is a digit");
}
else{
System.out.println("It is a special character");

}

}
}

