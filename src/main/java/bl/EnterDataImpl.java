package bl;

import box.Events;
import dbaccess.DAOAbsenceInfo;
import dbaccess.DAOEmployees;
import dbaccess.DAOPlanInfo;
import entities.Employee;
import entities.Event;

import java.time.LocalDate;

public class EnterDataImpl implements EnterData {

    private DAOPlanInfo planInfo;
    private DAOAbsenceInfo absenceInfo;
    private DAOEmployees employees;

    public void createPlanVacation(Employee employee) {

        planInfo.newPlan(Events.VACATION);

    }

    public void createAbsenceVacation(Employee employee, LocalDate dateOfVacation) {

        //TODO check:
        // dateOfVacation - in Absences
        // VacationPlan without related absence


        planInfo.newPlan(Events.VACATION);
        absenceInfo.newAbsence();
    }

    public void replaceVacation(Employee employee, LocalDate dateOfVacation) {


        //TODO check:
        // если перенос не первый (дата отсутствия, которую надо перенести, ссылается на запись плана,
        // о которой есть информация в комментарии другой записи отсутствия )
        // надо:
        // только скорректировать поле eventDate (поменять значение старое на новое)
        // .
        // если перенос первый - надо:
        // создать новую запись плана PlanInstance (с пометкой ОТМЕНА),
        // включить ее в relatedPlanInstance для старого объекта Absence,
        // создать новый объект Absence, в нем сделать ссылку на старую запись плана


        planInfo.newPlan(Events.VACATION);
        absenceInfo.newAbsence();
    }

    public void createSickday (Employee employee, LocalDate dateOfSickday) {

        planInfo.newPlan(Events.SICKDAY);
        absenceInfo.newAbsence();
    }

    public void createBusinessTripWeekday (Employee employee, LocalDate dateOfTripday) {

        planInfo.newPlan(Events.BUSINESSTRIP_WEEKDAY);
        absenceInfo.newAbsence();
    }

    public void createBusinessTripWeekend (Employee employee, LocalDate dateOfTripday) {

        planInfo.newPlan(Events.BUSINESSTRIP_WEEKEND);
    }

    public void createAbsenceForBusinessTrip (Employee employee, LocalDate dateOfTripday) {

        absenceInfo.newAbsence();
    }

    public void createAbsenceInsteadVacation (Employee employee, LocalDate dateOfAbsence, LocalDate exchangeDay) {

        absenceInfo.getAbsence(exchangeDay);
        planInfo.newPlan(Events.CANCEL);
        absenceInfo.newAbsence();
    }

    public void createAbsence (Employee employee, LocalDate dateOfAbsence) {

        absenceInfo.newAbsence();
    }

    public void createOvertime (Employee employee, LocalDate dateOfOvertime) {

        planInfo.newPlan(Events.OVERTIME);
    }

}
