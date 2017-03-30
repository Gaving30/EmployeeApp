
package employeeJavaPackage;

import java.io.Serializable;

/*
 * @author Gavin Gaughran
 */
public class Director extends Manager implements Serializable {
    private double budget;
    
    public Director(String name, int empId, double salary, String deptName, double budget){
        super(name, empId, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    public String getDetails(){
        return super.getDetails()+"\n Budget:"+budget;
    }
    
}
