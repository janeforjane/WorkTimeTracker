package bl;

import dbaccess.DAOAbsenceInfo;
import dbaccess.DAOEmployees;
import dbaccess.DAOPlanInfo;
import entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class GetData {

    private DAOPlanInfo planInfo;
    private DAOAbsenceInfo absenceInfo;
    private DAOEmployees employees;

    //TODO можно здесь найти нужное из списка всех записей, а можно делать сложные запросы к БД. Как лучше?

    int getCountVacationDays (Employee employee) {

        planInfo.getAllPlan();

        return 0;
    }

    List<DAOPlanInfo> getAllVacationDays (Employee employee) {

        absenceInfo.getAllAbsences();
        planInfo.getAllPlan();


        return new ArrayList<DAOPlanInfo>();
    }

    List<DAOPlanInfo> getAllSickDays (Employee employee) {

        planInfo.getAllPlan();
        absenceInfo.getAllAbsences();


        return new ArrayList<DAOPlanInfo>();
    }


}
