package dbaccess;

import entities.Absence;

import java.time.LocalDate;
import java.util.List;

public interface DAOAbsenceInfo {

    void newAbsence ();
    void modifyAbsence();
    void removeAbsence();
    Absence getAbsence(LocalDate date);
    List<Absence> getAllAbsences();

}
