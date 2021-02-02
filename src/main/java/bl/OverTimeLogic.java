package bl;

import dbaccess.DAOAbsenceInfo;
import dbaccess.DAOEmployees;
import dbaccess.DAOPlanInfo;
import entities.Absence;
import entities.Employee;
import entities.PlanInstance;

import java.time.LocalDate;
import java.util.List;

public class OverTimeLogic {

    private DAOPlanInfo planInfo;
    private DAOAbsenceInfo absenceInfo;
    private DAOEmployees employees;


    //get

    public List<PlanInstance> getAllOvertimeDays (Employee employee, LocalDate dateRangeFrom, LocalDate dateRangeTo){

        return null;
    }

    public List<Absence> getAllAbsencesForOvertimeDays (Employee employee, int year){

        return null;
    }

    //enter

    public void createOvertime (Employee employee, LocalDate overtimeDate ){
        //todo: предложить связать со свободным absence если есть

    }

    //remove

    public void removeOvertime (Employee employee, PlanInstance planInstanceOfOverTime) {
        //todo: удаляется и planInstance и Absence который на него ссылается

    }

}
