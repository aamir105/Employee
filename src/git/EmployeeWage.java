package git;

public class EmployeeWage {
    public static void UC2(){
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR=20;
        int empHrs=0;
        int empWage=0;
        double empCheck= Math.floor(Math.random()*10)%2;
        if (empCheck == IS_FULL_TIME){
            empHrs=8;
        }
        else {
            empHrs=0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage : "+empWage);
    }

    public static void UC1(){
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present.");
        } else {
            System.out.println("Employee is Abscent.");
        }
    }
    public static void UC3(){
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HRS = 20;

        int empHrs = 0;
        int empWage = 0;

        double empCheck= Math.floor(Math.random()*10)%3;
        if (empCheck == IS_PART_TIME){
            empHrs = 4;
        } else if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
        }
        else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HRS;
        System.out.println("Employee Wage: "+ empWage);
    }
    public static void main(String[] args) {
        UC1();
        UC2();
        UC3();
    }
}