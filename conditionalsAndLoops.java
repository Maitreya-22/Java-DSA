public class conditionalsAndLoops {
    public static void main(String[] args){
        /*
        syntax of if-else statement 
        if(){
            body
        }
        else if (){
            body
        }
        else{
            body
        }
        */

        int salary=10000;
        if(salary>10000){
            System.out.println("salary is greater than 10000");
        }
        else if(salary==10000){
            System.out.println("salary is equal to 10000");
        }
        else{
            System.out.println("salary is not greater than 10000");
        }

        //for loop
        for(int i=0; i<5;i++){
            System.out.println(i);
        }

        
        //while loops
        int num=1;

        while(num<=8){
            System.out.println(num);
            num+=1;
        }

        // do while loops
        /*

        do{

        }while(condition);

        */ 


        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(num<=8);


    }
}
