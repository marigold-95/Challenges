import java.util.*;

public class Fibonacci{
public static void main(String[] args){

int num1 =0, num2=1, N, counter =0;

Scanner s = new Scanner(System.in);
System.out.print("Enter a number: ");
N = s.nextInt();

System.out.println(num1+ "\n" +num2);
while(counter != N){

int temp = num1+num2;
System.out.println(temp);

num1 = num2;
num2 = temp;

counter++;


}




}
}
