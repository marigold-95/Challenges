import java.util.*;

class MenuDrivenCalculator{
    public static void main(String[] args){

        int num1,num2,operator,sum;

        Scanner s = new Scanner(System.in);

        do{
            System.out.println("Options for maths operators");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter First number: ");
            num1 = s.nextInt();

            System.out.print("Enter operator to perform claculations :");
            operator = s.nextInt();

            System.out.print("Enter Second number: ");
            num2 = s.nextInt();



            if(operator ==1){
                sum = num1+num2;
                System.out.println("sum of "+num1+ " and " +num2+" is "+ sum);
            }
            else if(operator ==2){
                int difference = num1-num2;
                System.out.println("Difference of "+num1+ " and " +num2+" is "+ difference);
            }
            else if(operator ==3){
                int product = num1*num2;
                System.out.println("Product of "+num1+ " and " +num2+" is "+ product);
            }
            else if(operator == 4){
                //int division;
                if(num2 == 0){
                    System.out.println("Maths Error!");
                }else {
                    int division = num1 / num2;
                    System.out.println("division of " + num1 + " and " + num2 + " is " + division);
                }
            }
            else{
                System.out.println("Invalid Maths operator. Try again!");
            }



            System.out.println("*******************************************************");
        }while(operator != 5);

        System.out.println("THANK YOU!");

    }
}