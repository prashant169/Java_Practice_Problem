import java.util.Random;
import java.util.*;


public class EmployeeWage{
        public static void main( String []args )
        {
                System.out.println("Welcome");
                Dhoni();
        }

                static void Dhoni(){
                                        int TotalWorkingHour = 8 ;
                                        int TotalWorkingDay  = 20 ;
                                        int RatePerHour = 20 ;
                                        int IsPartTime = 2 ;
                                        int IsFullTime = 1 ;
                                        int RatePerhour = 4 ;


                                        Random rn = new Random();
                                        int rand = rn.nextInt(3);
                                        if (rand == 0)
                                        {
                                                System.out.println("----------This is Full time Work in Month---------");
                                                int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerHour ;
                                                System.out.println("Total Employee Wages is: " + TotaEmployeeWage);
                                        }
                                        else if (rand == 0)
                                        {
                                                System.out.println("-------This is Part Time Work in Month--------");
                                                int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerhour;
                                                System.out.println("Total Employee Wages is: "+ TotaEmployeeWage);
                                        }
                                        else
                                        {
                                                System.out.println("----Employee is Absent------");
                                        }



                           }


}

