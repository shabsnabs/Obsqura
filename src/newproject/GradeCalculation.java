package newproject;
import java.util.Scanner;
public class GradeCalculation {
	//class GradeCalculation{
		public static void main (String arg []){
			Scanner mark1 =new Scanner(System.in);
			
			System.out.println("Enter grade");
	      int mark = mark1.nextInt();
	      char grade;

	      if(mark>=81 && mark<100){
	         grade = 'A';
	      }else if(mark>=71 && mark<80){
	         grade = 'B';
	      }
	      else if(mark>=61 && mark<70){
	         grade = 'C';
	      }
	      else if(mark>=40 && mark<60){
	         grade = 'D';
	      }
	      else {
	         grade = 'E';
	      }

	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!");
	            break;
	         case 'B' :
	         System.out.println("Good!");
	            break;
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	            break;
	          case 'E' :
	            System.out.println("FAILED");
	            break;
	         default :
	         System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	   mark1.close();
		
		}
	}

