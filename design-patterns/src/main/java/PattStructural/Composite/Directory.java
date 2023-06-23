package PattStructural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee{
    private List<Employee> employeeList=new ArrayList<Employee>();


    @Override
    public void showEmployeeDetails() {
        for(Employee emp:employeeList){
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee e){
        this.employeeList.add(e);
    }

    public void removeEmployee(Employee e){
        this.employeeList.remove(e);
    }
}
