
package employeeJavaPackage;

import java.io.Serializable;

/*
 * @author Gavin Gaughran
 */
public class Consultant extends Employee implements Serializable {
    private int hours;
    private double rate;
    private double salary;
    
    public Consultant(String name, int empId, int hours, double rate){
        super(name, empId);
        this.hours = hours;
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        salary = hours * rate;
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+"\nEmployee Wage:"+getSalary();
    }
}
