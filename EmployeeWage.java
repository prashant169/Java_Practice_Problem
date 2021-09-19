import java.util.Random;
import java.util.Scanner;


public class EmployeeWage{
        public static void main( String []args )
        {
                System.out.println("Welcome");
                Jadeja();
        }
        static void Jadeja(){
                Scanner in = new Scanner(System.in);
                int PartTimeHour = 4;
                int RatePerHour = 20;
                int FullDayHour = 8;
                int Day = 0 ;
                Random rn = new Random ();
                int rand =rn.nextInt(3);
                        switch(rand){
                                        case 1:
                                                System.out.println("IT's Full Time Wages: ");
                                                System.out.println("Enter NUmber Of Working Day's: ");
                                                Day = in.nextInt();
                                                int FullTimeWages = RatePerHour * (FullDayHour * Day);
                                                System.out.println("FullTimeWages for " + Day +" Days: " + "Rs." + FullTimeWages);
                                                break;
                       
                                        case 2:
                                                System.out.println("IT's Part Time Wages: ");
                                                System.out.println("Enter Number Of Working Day's: ");
                                                Day = in.nextInt();
                                                int PartTimeWages = Day * PartTimeHour * FullDayHour;
                                                System.out.println("PartTimeWages for " + Day +" days: " + "Rs." + PartTimeWages);
                                                break;
                                        default:
                                                System.out.println("Employee is Absent..........!");
                                                break;
                                     }
                        in.close();
        		}
        }
