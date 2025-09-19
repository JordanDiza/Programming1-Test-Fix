/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
        
        //get yearOfBirth()
        //return yearofBirth;
        public int getYearOfBirth() {
            return yearOfBirth;
        }

        
        //set hourlyWage()
        //hourlyWage=18.75;
        public void setHourlyWage(double wage){
            this.hourlyWage = wage;
       }
        
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        // to be completed
        // if 
             //age>=16
             //print "Can drive"
            //else
               //return (currentYear-currentAge);
               //print "You'll be able to drive in "years years"
        if (age >= 16){
            System.out.println("Can drive");
            return true;
            
        } else { 
            System.out.Println("You'll be able to drive in" + (16 - age) + "years"); 
            return false;
            
        }
             
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // to be completed
        // set salary to (UnpaidHours x hourlyWage)
        // set taxes to 30%
        // print
        double salary = undpaidHours * hourlyWage;
        double netPay = salary * 0.7;
        return netPay;
        
        
        
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
        //public void paySalary() {
        // set salary to 100
        // set transfer to 70
        // print"John Deere has received a wire transfer of 70CAD"
        
        double netPay = calculatePay();
        System.out.println(fullname + " has received a wire transfer of " + netPay + "CAD");
        

    }
    public void addUnpaidHours(double hours){
     unpaidHours += hours;
    }
    }
}
