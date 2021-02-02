package dbaccess;

import entities.Absence;
import entities.Employee;

import java.time.LocalDate;
import java.util.List;

public interface DAOAbsenceInfo {

    void newAbsence (Absence absence);
    void modifyAbsence(Absence absence);
    void removeAbsence(Absence absence);
    Absence getAbsence(LocalDate date);
    List<Absence> getAllAbsences();

}
