// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double monthlyRate = (4.85/12);
        double monthlyPaid = (12+ numYears);
        double monthlyPayment = (monthlyRate * (Math.pow(monthlyRate + 1, monthlyPaid))/(Math.pow) );

        System.out.println("principal: $" +principal);
        System.out.println("anaualRate: "    + annualRate +  "%");
        System.out.println("numYears: " +numYears);









        System.out.println();
    }
}

