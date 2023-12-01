import java.util.Scanner;
 public class itemDiscount{
 public static void main(String[] args){
 Scanner input=new Scanner(System.in);

 System.out.print("Enter an Item: ");
 String item=input.next();

 System.out.print("Enter the price of item: ");
 double price=input.nextDouble();
 
 double dd= price * 0.1;
 double discount=price - dd;

  if(price>0){
 	System.out.printf("The discount amount is %.2f\n", discount);
  } else{
 	System.out.print("Error Error");
  }
   











}
}