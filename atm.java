import java.util.Scanner;
public class Atm{
public static void main(String [] args){
int card_no=1002;
int pin=123;
int Balance=10000;
Scanner sc=new Scanner(System.in);
System.out.println("Enter CARD Number:");
int c=sc.nextInt();
if(c==card_no){
System.out.println("Enter PIN Number:");
int p=sc.nextInt();
if(p==pin)
{ 
System.out.println("Choose any Option: ");
 System.out.println("1.w (Withdraw)\n");
System.out.println("2.d (Deposit)\n ");
System.out.println("3.c (Check Balance)\n");
System.out.println("Enter any other Character to Cancel Transaction");
char ch=sc.next().charAt(0);
switch(ch){
case 'w': System.out.println("Enter Withdraw Amount: ");
          int am=sc.nextInt();
          if(am <0){
          System.out.println("invalid");}          
        
        else   if(Balance>=am)
         {
           Balance=Balance-am;
           System.out.println("Amount Withdrew Successfully");
           System.out.println("Balance Amount:"+Balance);
          }
          else
          {
          System.out.println("Not Sufficient Balance");
          }
break;
case 'd': System.out.println("Enter deposit Amount: ");
          int amd=sc.nextInt();
          Balance=Balance+amd;
          System.out.println(" Amount Deposited Successfully");
          System.out.println("Balance Amount:"+Balance);
break;
case 'c': System.out.println("Balance Amount:"+Balance);

break;
default: System.out.println("Transaction Cancelled Successfully");
break;

}

}
else{
System.out.println("Wrong PIN Number");
}
}

else{
System.out.println("Invalid Card Number");
}

}
}
