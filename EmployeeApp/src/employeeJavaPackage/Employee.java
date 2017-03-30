
package employeeJavaPackage;

import java.io.Serializable;

/*
 * @author Gavin Gaughran
 */
public class Employee implements Serializable {
    private String name; 
    private int empId;
    
    public Employee(String name, int empId){
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
    public String getDetails(){
        return "Employee Name: "+name+"\nEmployee Id:"+empId;
    }
}
