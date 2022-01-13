import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        //System.out.println(args[0]);
        Scanner input = new Scanner(System.in);

        int a=Integer.parseInt(input.nextLine());
        String str=input.nextLine();
        System.out.println(a);
        System.out.println(str);
        //type casting
        int num=(int) (57.76f);
        System.out.println(num);
        float z=257f;
        byte b=(byte) (z);
        System.out.println(b);
        int number='A';
        System.out.println(number);

     }
}



//public - class can be  accessed from anywhere

//static - 

//String[] args - command-line argument (array of strings)


