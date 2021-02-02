package bl;

import box.Events;
import dbaccess.DAOAbsenceInfo;
import dbaccess.DAOEmployees;
import dbaccess.DAOPlanInfo;
import entities.Absence;
import entities.Employee;

import java.time.LocalDate;
import java.util.List;

public class AbsenceLogic {

    private DAOPlanInfo planInfo;
    private DAOAbsenceInfo absenceInfo;
    private DAOEmployees employees;


    //get

    public List<Absence> getAllEmployeeAbsences(Employee employee, int year) {
        absenceInfo.getAllAbsences();
        return null;
    }

    public List<Absence> getAllEmployeeAbsencesForEvent (Employee employee, Events events, int year) {
        return null;
    }

    //enter

    public void createAbsence (Employee employee, LocalDate overtimeDate ){

    }

    //remove

    public void removeAbsence (Employee employee, Absence absence){
        //todo: проверить что нет PlanInstance связанного с absence,
        // если есть - уведомить и подтвердить удаление

    }
}
