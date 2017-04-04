
package employeeGUIPackage;

import employeeJavaPackage.Employee;
import employeeJavaPackage.Engineer;
import employeeJavaPackage.Consultant;
import employeeJavaPackage.Manager;
import employeeJavaPackage.Director;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

/*
 * @author Gavin Gaughran
 */
public class EmployeeGUI extends javax.swing.JFrame {

    //Employee emp;
    ArrayList<Employee> empList;

    int empCount = 0;

    /** Creates new form EmployeeGUI */
    public EmployeeGUI() {
        initComponents();
        
        empCount = 0;
        
        // Initialise an empty ArrayList
        empList = new ArrayList<Employee>();
        
        txtSalary.setEnabled(true);
        lblSalary.setEnabled(true);
        
        txtHours.setEnabled(false);
        lblHours.setEnabled(false);
        
        txtRate.setEnabled(false);
        lblRate.setEnabled(false);
        
        txtDepartment.setEnabled(true);
        lblDepartment.setEnabled(true);
        
        txtBudget.setEnabled(false);
        lblBudget.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeBG = new javax.swing.ButtonGroup();
        fileSaveChooser = new javax.swing.JFileChooser();
        fileLoadChooser = new javax.swing.JFileChooser();
        panel = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        radEmployee = new javax.swing.JRadioButton();
        radEngineer = new javax.swing.JRadioButton();
        radConsultant = new javax.swing.JRadioButton();
        radManager = new javax.swing.JRadioButton();
        radDirector = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        txtSalary = new javax.swing.JTextField();
        lblSalary = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        lblHours = new javax.swing.JLabel();
        txtHours = new javax.swing.JTextField();
        lblRate = new javax.swing.JLabel();
        txtRate = new javax.swing.JTextField();
        lblDepartment = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        lblBudget = new javax.swing.JLabel();
        txtBudget = new javax.swing.JTextField();
        lblDeleteDescription = new javax.swing.JLabel();
        lblSearchDescription = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        fileSaveChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        fileSaveChooser.setApproveButtonText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblType.setText("Role:");
        panel.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        typeBG.add(radEmployee);
        radEmployee.setSelected(true);
        radEmployee.setText("Employee");
        radEmployee.setOpaque(false);
        radEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEmployeeActionPerformed(evt);
            }
        });
        panel.add(radEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 176, -1));

        typeBG.add(radEngineer);
        radEngineer.setText("Engineer");
        radEngineer.setOpaque(false);
        radEngineer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEngineerActionPerformed(evt);
            }
        });
        panel.add(radEngineer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 176, -1));

        typeBG.add(radConsultant);
        radConsultant.setText("Consultant");
        radConsultant.setOpaque(false);
        radConsultant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radConsultantActionPerformed(evt);
            }
        });
        panel.add(radConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 176, -1));

        typeBG.add(radManager);
        radManager.setText("Manager");
        radManager.setOpaque(false);
        radManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radManagerActionPerformed(evt);
            }
        });
        panel.add(radManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 176, -1));

        typeBG.add(radDirector);
        radDirector.setText("Director");
        radDirector.setOpaque(false);
        radDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDirectorActionPerformed(evt);
            }
        });
        panel.add(radDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 176, -1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 263, -1, -1));

        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        panel.add(btnViewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        txtSalary.setMaximumSize(new java.awt.Dimension(6, 20));
        panel.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 142, -1));

        lblSalary.setText("Salary:");
        panel.add(lblSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 40, 20));

        txtEmployeeId.setMaximumSize(new java.awt.Dimension(6, 20));
        panel.add(txtEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, -1));

        txtName.setMaximumSize(new java.awt.Dimension(6, 20));
        panel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 22, 177, -1));

        lblName.setText("Name: ");
        panel.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, -1));

        lblEmployeeId.setText("ID:");
        panel.add(lblEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        lblHours.setText("Hours:");
        panel.add(lblHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        txtHours.setMaximumSize(new java.awt.Dimension(6, 20));
        panel.add(txtHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 142, -1));

        lblRate.setText("Rate:");
        panel.add(lblRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        txtRate.setMaximumSize(new java.awt.Dimension(6, 20));
        panel.add(txtRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 142, -1));

        lblDepartment.setText("Department:");
        panel.add(lblDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        txtDepartment.setMaximumSize(new java.awt.Dimension(6, 20));
        panel.add(txtDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 142, -1));

        lblBudget.setText("Budget:");
        panel.add(lblBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        txtBudget.setMaximumSize(new java.awt.Dimension(6, 20));
        panel.add(txtBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 142, -1));

        lblDeleteDescription.setText("To delete enter employee Name AND ID: ");
        panel.add(lblDeleteDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, -1, -1));

        lblSearchDescription.setText("To search enter Employee Name OR id: ");
        panel.add(lblSearchDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 238, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        panel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panel.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        panel.add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void radEngineerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEngineerActionPerformed

        txtSalary.setEnabled(true);
        lblSalary.setEnabled(true);
        
        txtHours.setEnabled(false);
        lblHours.setEnabled(false);
        
        txtRate.setEnabled(false);
        lblRate.setEnabled(false);
        
        txtDepartment.setEnabled(false);
        lblDepartment.setEnabled(false);
        
        txtBudget.setEnabled(false);
        lblBudget.setEnabled(false);
    }//GEN-LAST:event_radEngineerActionPerformed

    private void radConsultantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radConsultantActionPerformed
        
        txtRate.setEnabled(true);
        txtHours.setEnabled(true);
        
        lblRate.setEnabled(true);
        lblHours.setEnabled(true);
        
        txtSalary.setEnabled(false);
        lblSalary.setEnabled(false);
        
        txtDepartment.setEnabled(false);
        lblDepartment.setEnabled(false);
        
        txtBudget.setEnabled(false);
        lblBudget.setEnabled(false);
    }//GEN-LAST:event_radConsultantActionPerformed

    private void radManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radManagerActionPerformed

        txtSalary.setEnabled(true);
        lblSalary.setEnabled(true);
        
        txtDepartment.setEnabled(true);
        lblDepartment.setEnabled(true);
        
        txtHours.setEnabled(false);
        lblHours.setEnabled(false);
        
        txtRate.setEnabled(false);
        lblRate.setEnabled(false);
        
        txtBudget.setEnabled(false);
        lblBudget.setEnabled(false);
    }//GEN-LAST:event_radManagerActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String name, type, dept;
        int empid, hours;
        double salary, rate, budget;
        Employee e;
        
        if(txtEmployeeId.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(panel, "To Add A New User You Must Enter A Name And ID");
            return;
        }
        
        name = txtName.getText();
        empid = Integer.parseInt(txtEmployeeId.getText());
        
        if (radEmployee.isSelected()){
            type="Employee";
            e = new Employee (name, empid);
        }else if (radEngineer.isSelected()){
            type="Engineer";
            salary = Double.parseDouble(txtSalary.getText());
            e = new Engineer (name, empid, salary);
        }else if (radConsultant.isSelected()){
            type="Consultant";
            rate = Double.parseDouble(txtRate.getText());
            hours = Integer.parseInt(txtHours.getText());
            e = new Consultant (name, empid, hours, rate);
        }else if (radManager.isSelected()){
            type="Manager";
            salary = Double.parseDouble(txtSalary.getText());
            dept = txtDepartment.getText();
            e = new Manager(name, empid, salary, dept);
        }else if (radDirector.isSelected()){
            type ="Director";  
            salary = Double.parseDouble(txtSalary.getText());
            dept = txtDepartment.getText();
            budget = Double.parseDouble(txtBudget.getText());
            e = new Director (name, empid, salary, dept, budget);
        }else{
            type = null;
            e = new Employee(name, empid);
        }
        txtName.setText("");
        txtEmployeeId.setText("");
        txtSalary.setText("");
        txtRate.setText("");
        txtHours.setText("");
        txtDepartment.setText("");
        txtBudget.setText(""); 

        JOptionPane.showMessageDialog(panel, "Success Adding " + name + " to Employee list");
        //emp = e;
        //empCount++;
        
        // Add a new element to the Array List
        empList.add(e);
    }//GEN-LAST:event_btnAddActionPerformed

    private void radDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDirectorActionPerformed
        
        txtSalary.setEnabled(true);
        lblSalary.setEnabled(true);
        
        txtDepartment.setEnabled(true);
        lblDepartment.setEnabled(true);
        
        txtBudget.setEnabled(true);
        lblBudget.setEnabled(true);
        
        txtHours.setEnabled(false);
        lblHours.setEnabled(false);
        
        txtRate.setEnabled(false);
        lblRate.setEnabled(false);
}//GEN-LAST:event_radDirectorActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        
        Employee e;
        String name, dept;
        int empid, hours;
        double salary, rate, budget;
        
        empCount = empList.size();
        
        if(empCount == 0) {
            
            JOptionPane.showMessageDialog(panel, "No Records To Show");
            return;
        }
        
        for (int i=0; i < empCount; i++){
            
            //e = emp[i];
            e = empList.get(i);

            name = e.getName();
            empid = e.getEmpId();
            
            if (e instanceof Engineer){
                Engineer eng = (Engineer) e;
                salary = eng.getSalary();
                JOptionPane.showMessageDialog(panel, "Name: "+name+"\nEmpId: "+empid+"\nSalary: "+salary);
            } else if (e instanceof Consultant) {
                Consultant con = (Consultant) e;
                rate = con.getRate();
                hours = con.getHours();
                JOptionPane.showMessageDialog(panel, "Name: "+name+"\nEmpId: "+empid+"\nRate: "+rate+"\nHours: "+hours);
            } else if (e instanceof Manager){
                Manager man = (Manager) e;
                salary = man.getSalary();
                dept = man.getDeptName();
                JOptionPane.showMessageDialog(panel, "Name: "+name+"\nEmpId: "+empid+"\nSalary: "+salary+"\nDept: "+dept);
            } else if (e instanceof Director){
                Director dir = (Director) e;
                salary = dir.getSalary();
                dept = dir.getDeptName();
                budget = dir.getBudget();
                JOptionPane.showMessageDialog(panel, "Name: "+name+"\nEmpId: "+empid+"\nSalary: "+salary+"\nDept: "+dept
                        +"\nBudget: "+budget);
            } else {
                JOptionPane.showMessageDialog(panel, "Name: "+name+"\nEmpid: "+empid);
            }

        }
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String name, id, dept;
        double salary, rate, budget;
        int hours;
        
        name = txtName.getText();
        id = txtEmployeeId.getText();
        //empid = Integer.parseInt(id);
        
        Employee e;
        if (name.equals("") && id.equals("")){
            JOptionPane.showMessageDialog(panel, "To Search Users You Must Enter A Name Or An ID");
        } else {
            empCount = empList.size();
            
            for (int i=0; i<empCount; i++){
                
                //e = emp[i];
                e = empList.get(i);
                
                if (name.equals(e.getName()) || Integer.parseInt(id) == e.getEmpId()){
                    if (e instanceof Engineer){
                        Engineer eng = (Engineer) e;
                        JOptionPane.showMessageDialog(panel, "Name: "+eng.getName()+"\nEmpId: "+eng.getEmpId()+"\nSalary: "
                                +eng.getSalary());
                    } else if (e instanceof Consultant) {
                        Consultant con = (Consultant) e;
                        JOptionPane.showMessageDialog(panel, "Name: "+con.getName()+"\nEmpId: "+con.getEmpId()+"\nSalary: "
                                +con.getSalary());
                    } else if (e instanceof Manager){
                        Manager man = (Manager) e;
                        JOptionPane.showMessageDialog(panel, "Name: "+man.getName()+"\nEmpId: "+man.getEmpId()+"\nSalary: "
                                +man.getSalary()+"\nDept: "+man.getDeptName());
                    } else if (e instanceof Director){
                        Director dir = (Director) e;
                        JOptionPane.showMessageDialog(panel, "Name: "+dir.getName()+"\nEmpId: "+dir.getEmpId()+"\nSalary: "
                                +dir.getSalary()+"\nDept: "+dir.getDeptName()+"\nBudget: "+dir.getBudget());
                    } else {
                        JOptionPane.showMessageDialog(panel, "Name: "+e.getName()+"\nEmpid: "+e.getEmpId());
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String id = txtEmployeeId.getText();
        
        //int deleteIndex = -1;
        
        Employee e;
        
        if (name.equals("") || id.equals("")){
            JOptionPane.showMessageDialog(panel, "To Delete A User You Must Enter A Name And ID!");
        } else {
            for (int i=0; i<empCount; i++){
                   
                //e = emp[i];
                e = empList.get(i);

                if (name.equals(e.getName()) && Integer.parseInt(id) == e.getEmpId()){

                    //emp[i] = emp[empCount-1];
                    //emp[empCount-1] = null;
                    //empCount--;
                    empList.remove(i);
                    empCount = empList.size();

                    JOptionPane.showMessageDialog(panel, "Deleting: "+e.getName()+", "+e.getEmpId()+" from array"
                             + "There are " + empCount + " staff members left");
                    break;
                }
            }
        }   
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        fileSaveChooser = new JFileChooser(System.getProperty("user.dir"));
        
        int result = fileSaveChooser.showSaveDialog(panel);
        
        if(result == JFileChooser.APPROVE_OPTION) {
            
            ObjectOutputStream out;
                    
            try {
                
                String filePath = fileSaveChooser.getSelectedFile().getAbsolutePath();
                out = new ObjectOutputStream(new FileOutputStream(filePath));
                
                if (empList.isEmpty()){    
                    
                    JOptionPane.showMessageDialog(panel, "There Are No Records To Save");
                    
                } else {
                    for(int i = 0; i < empList.size(); i++) {
                        out.writeObject(empList.get(i));
                        
                        JOptionPane.showMessageDialog(panel, "Information Saved To File Successfully");
                    }
                }
                out.close();
            }
            catch(IOException ex) {
                
                JOptionPane.showMessageDialog(panel, "Save Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        
        fileLoadChooser = new JFileChooser(System.getProperty("user.dir"));
        
        int result = fileLoadChooser.showOpenDialog(panel);
        
        if(result == JFileChooser.APPROVE_OPTION) {    
            ObjectInputStream in = null;
            
            // Clear the ArrayList
            empList.clear();
            
            try {
                
                String filePath = fileLoadChooser.getSelectedFile().getAbsolutePath();
                in = new ObjectInputStream(new FileInputStream(filePath));
                
                Employee e;
                
                while(true) {    
                    e = (Employee)in.readObject();
                    empList.add(e);
                }    
            }
            catch (EOFException eofEx) {// Notice that ObjectInputStream detects an end-of-file condition
					// by catching EOFException, instead of testing for an invalid
					// return value.
                if(in != null) {
                    
                    try {
                        
                        in.close();
                    }
                    catch(IOException ex) {
                         JOptionPane.showMessageDialog(panel, "Close Error: " + ex.getMessage());
                    }      
                }                       
            }
            catch(ClassNotFoundException cnfEx) {
                
                JOptionPane.showMessageDialog(panel, "Class Not Found Error: " + cnfEx.getMessage());
            }
            catch(IOException ex) {
                
                JOptionPane.showMessageDialog(panel, "Load Error: " + ex.getMessage());
            }
            finally {
                
                btnViewAllActionPerformed(null);
            }
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void radEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEmployeeActionPerformed
       
        txtSalary.setEnabled(true);
        lblSalary.setEnabled(true);
        
        txtDepartment.setEnabled(true);
        lblDepartment.setEnabled(true);
        
        txtHours.setEnabled(false);
        lblHours.setEnabled(false);
        
        txtRate.setEnabled(false);
        lblRate.setEnabled(false);
        
        txtBudget.setEnabled(false);
        lblBudget.setEnabled(false);
        
    }//GEN-LAST:event_radEmployeeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new EmployeeGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JFileChooser fileLoadChooser;
    private javax.swing.JFileChooser fileSaveChooser;
    private javax.swing.JLabel lblBudget;
    private javax.swing.JLabel lblDeleteDescription;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRate;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblSearchDescription;
    private javax.swing.JLabel lblType;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton radConsultant;
    private javax.swing.JRadioButton radDirector;
    private javax.swing.JRadioButton radEmployee;
    private javax.swing.JRadioButton radEngineer;
    private javax.swing.JRadioButton radManager;
    private javax.swing.JTextField txtBudget;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtSalary;
    private javax.swing.ButtonGroup typeBG;
    // End of variables declaration//GEN-END:variables
}
