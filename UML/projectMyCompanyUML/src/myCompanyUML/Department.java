package myCompanyUML;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String departmentName;
    private Set employees = new HashSet<>();
    /*
    устанавливаю, что переменная employees является классом HashSet
     */

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addEmployee (Employee newEmployee){
        /*
        создаю метод addEmployee, класс создаваемого объекта - Employee
         */
        employees.add(newEmployee);

        // связываем сотрудника с этим отделом ????????????????????????
        newEmployee.setDepartment(this);
    }
    public Set getEmployees(){
        return employees;
    }

    public void removeEmployee(Employee worker){
        employees.remove(worker);
    }

}