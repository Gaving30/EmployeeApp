
package employeeJavaPackage;

import java.io.Serializable;

/*
 * @author Gavin Gaughran
 */
public class Engineer extends Employee implements Serializable {
    private double salary;
    
    public Engineer (String name, int empId, double salary){
        super(name, empId);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails() + "\nEmployee Salary:"+salary;
    }
}
