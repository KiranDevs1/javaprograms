public class tryingatm {
    public static void main (String[]args)
    {
        int card=123456;
        int password=123;
        int Balance=100000;

        System.out.println("enter the card number");
        int b=sc.nextInt();
        if (b==card) {
        System.out.println("enter the pin");
        int a=sc.nextInt();
        }
        if (b==password) 
        {
            System.out.println("w for withdraw");
            System.out.println("d for deposit\n");
            System.out.println("b for balance\n");
            System.out.println("");   
        }
        
            
        }
    }
}
