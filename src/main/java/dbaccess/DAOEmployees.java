package dbaccess;

import entities.Employee;

import java.util.List;

public interface DAOEmployees {

    void newEmployee (Employee employee);
    void modifyEmployee(Employee employee);
    void removeEmployee(Employee employee);
    Employee getEmployee(String param, String paramValue); //TODO is it ok ? enum ?
    List <Employee> getEmployees(String param, String paramValue); //TODO is it ok ?

//    TODO: List <Employee> getFilterEmployees(); - здесь или в бл?
}
