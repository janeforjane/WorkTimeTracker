package bl;

import box.Events;
import dbaccess.DAOAbsenceInfo;
import dbaccess.DAOEmployees;
import dbaccess.DAOPlanInfo;
import entities.Absence;
import entities.Employee;
import entities.PlanInstance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SickdayLogic {

    private DAOPlanInfo planInfo;
    private DAOAbsenceInfo absenceInfo;
    private DAOEmployees employees;

    private AbsenceLogic absenceLogic;

    //get

    public List<Absence> getAllSickDays(Employee employee, LocalDate dateRangeFrom, LocalDate dateRangeTo) {

        absenceLogic.getAllEmployeeAbsencesForEvent(employee, Events.SICKDAY, dateRangeTo.getYear());

        return new ArrayList<Absence>();
    }

    //enter

    public void createSickday (Employee employee, LocalDate dateOfSickday) {
        //todo: проверить свободна ли дата,
        // если занята - отмена этого события (уведомление)


        planInfo.newPlan(Events.SICKDAY, employee);
        absenceInfo.newAbsence();
    }


    //remove

    public void removeSickday (Employee employee, PlanInstance planInstanceOfSickday) {
        //todo: удаляется и planInstance и Absence который на него ссылается

    }
}
