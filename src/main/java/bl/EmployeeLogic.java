package bl;

import dbaccess.DAOAbsenceInfo;
import dbaccess.DAOEmployees;
import dbaccess.DAOPlanInfo;
import entities.Employee;
import entities.PlanInstance;

import java.time.LocalDate;
import java.util.List;

public class EmployeeLogic {


    private DAOEmployees employees;


    //get
    public List<Employee> getAllActualEmployees (){
        //todo: все employees у которых пустая canceledDate

        return null;
    }

    public List<Employee> getAllEmployees (){

        return null;
    }

    public List<Employee> getAllCanceledEmployees (){
        //todo: все employees у которых есть canceledDate

        return null;
    }

    //enter
    public void createEmployee(String name, String secondName, String lastName, LocalDate entryDate, String position) {

        Employee employee = new Employee(lastName, name, secondName, entryDate, position);
        employees.newEmployee(employee);
    }

    public void modifyEmployee(Employee employee) {

        employees.modifyEmployee(employee);
    }

    public void cancelEmployee (Employee employee, LocalDate cancelDate) {

    }

    //remove
    void removeEmployee (Employee employee) {

    }

}
