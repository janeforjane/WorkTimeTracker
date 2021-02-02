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

public class BusinessTripWeekdayLogic {


    private DAOPlanInfo planInfo;
    private DAOAbsenceInfo absenceInfo;
    private DAOEmployees employees;

    private AbsenceLogic absenceLogic;


    //get

    public List<Absence> getAllBTWeekDays (Employee employee, LocalDate dateRangeFrom, LocalDate dateRangeTo) {

        absenceLogic.getAllEmployeeAbsencesForEvent(employee, Events.BUSINESSTRIP_WEEKDAY, dateRangeFrom.getYear());

        return new ArrayList<Absence>();
    }


    //enter

    public void createBTWeekDay (Employee employee, LocalDate dateOfBTWeekDay) {
        //todo: проверить свободна ли дата,
        // если занята - отмена этого события (уведомление)


        planInfo.newPlan(Events.BUSINESSTRIP_WEEKDAY, employee);
        absenceInfo.newAbsence();
    }
    //remove

    public void removeBTWeekDay (Employee employee, PlanInstance planInstanceOfBT) {
        //todo: удаляется и planInstance и Absence который на него ссылается

    }


}
