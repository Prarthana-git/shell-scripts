public class EmplWageBuilderUc1 
  {
          public static void main(String args[])
    {  

     final int IS_FULL_TIME = 2;
     final int IS_PART_TIME = 1;
     final int WAGE_PER_HOUR=20;
     final int NUM_WORKING_DAYS=20;
     final int MAX_HRS_IN_MONTH=100;
     int salary=0;
     int totalemphrs=0;
     int totalWorkingDays=0;
     int emphrs=0;     
 System.out.println("Welcome to Employee Wage Computation"); 

 while (totalemphrs < MAX_HRS_IN_MONTH  && totalWorkingDays< NUM_WORKING_DAYS)
     totalWorkingDays++;    
    int empCheck = (int )Math.floor(Math.random() * 10) % 3;
 
    {
        switch(empCheck)
            {
                case  IS_FULL_TIME:   
                                                      emphrs =10;
                                                      break;
               case  IS_PART_TIME:
                                                      emphrs=8;
                                                      break;
                                             
                                             default:
                                                       emphrs=0;
                                                       break;     
          }  
           totalemphrs=totalemphrs+emphrs;
   }
System.out.println("Day: " + totalWorkingDays + " Employee Hours: " + emphrs);
salary= totalemphrs * WAGE_PER_HOUR ;
 
     System.out.println("Total Salary is = "+salary);
  }
}