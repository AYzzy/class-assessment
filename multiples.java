import java.util.Scanner;
  public class multiples{
  public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);

  System.out.print("Enter a number from 1-12: ");
  int input=scanner.nextInt();

  int count=1;
   if(input<0 || input>12){
   System.out.print("enter a valid number");
   }else if(input>0||input<12){
   while (count <= 12){
     System.out.printf("%d x %d= %d%n",input,count,input*count);

     count =count+1;
     }
   }

 
  
   
   
    




}

}