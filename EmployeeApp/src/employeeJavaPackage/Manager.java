
package employeeJavaPackage;

import java.io.Serializable;

/*
 * @author Gavin Gaughran
 */
public class Manager extends Employee implements Serializable {
    private String deptName;
    private double salary;
    
    public Manager(String name, int empId, double salary, String deptName){
        super(name, empId);
        this.deptName = deptName;
        this.salary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String getDetails (){
        return super.getDetails() + "\nEmployee Salary:"+salary+
                "\nDept Name:"+deptName;
    }   
}
