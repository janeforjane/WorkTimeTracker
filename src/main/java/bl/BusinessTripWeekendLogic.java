package bl;

import dbaccess.DAOAbsenceInfo;
import dbaccess.DAOEmployees;
import dbaccess.DAOPlanInfo;
import entities.Absence;
import entities.Employee;
import entities.PlanInstance;

import java.time.LocalDate;
import java.util.List;

public class BusinessTripWeekendLogic {

    private DAOPlanInfo planInfo;
    private DAOAbsenceInfo absenceInfo;
    private DAOEmployees employees;


    //get

    public List<PlanInstance> getAllBTWeekEndDays (Employee employee, LocalDate dateRangeFrom, LocalDate dateRangeTo) {
        //todo: все командировки выходного дня
        return null;
    }

    public List<Absence> getAllAbsencesForBTOnWeekEnd (Employee employee, int year){

        return null;
    }

    //enter

    public void createBTWeekEndDay (Employee employee, LocalDate dateOfBTWeekDay){
        //todo: предложить связать со свободным absence

    }

    public void createAbsenceForBT (Employee employee, PlanInstance planInstanceOfBT, LocalDate dateOfBTWeekDay){

    }


    //remove

    public void removeBTWeekEndDay (Employee employee, PlanInstance planInstanceOfBT){
        //todo: удаляется и planInstance и Absence который на него ссылается

    }

    public void removeAbsenceForBT (Employee employee, Absence absenceForBT){

    }

}
