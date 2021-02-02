package bl.main;

import box.Events;
import dbaccess.DAOAbsenceInfo;
import dbaccess.DAOEmployees;
import dbaccess.DAOPlanInfo;
import entities.Absence;
import entities.Employee;
import entities.PlanInstance;

import java.util.List;

public class CommonLogic {

    private DAOPlanInfo planInfo;
    private DAOAbsenceInfo absenceInfo;
    private DAOEmployees employees;






    public List<PlanInstance> getAllEmployeePlanInfo(Employee employee, int year) {
        return null;
    }

    public List<PlanInstance> getAllEmployeePlanInfoForEvent(Employee employee, Events events, int year) {
        return null;
    }

//    public List<Object> getAllBusinessTripDays (Employee employee, Events events, int year) {
//        return null;
//    }




}
