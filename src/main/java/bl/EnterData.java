package bl;

import box.Events;
import entities.Employee;

import java.time.LocalDate;

public interface EnterData {

    void createPlanVacation (Employee employee);
    void createAbsenceVacation (Employee employee, LocalDate dateOfVacation);
    void replaceVacation (Employee employee, LocalDate dateOfVacation);
    void createSickday (Employee employee, LocalDate dateOfSickday);
    void createBusinessTripWeekday (Employee employee, LocalDate dateOfTripday);
    void createBusinessTripWeekend (Employee employee, LocalDate dateOfTripday);
    void createAbsenceForBusinessTrip (Employee employee, LocalDate dateOfTripday);
    void createAbsenceInsteadVacation (Employee employee, LocalDate dateOfAbsence, LocalDate exchangeDay);
    void createAbsence (Employee employee, LocalDate dateOfAbsence);
    void createOvertime (Employee employee, LocalDate dateOfOvertime);

}
