package bl;

import bl.main.CommonLogic;
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

public class VacationLogic {


    private DAOPlanInfo planInfo;
    private DAOAbsenceInfo absenceInfo;
    private DAOEmployees employees;

    private AbsenceLogic absenceLogic;
    private CommonLogic commonLogic;


//    Calendar calendar = Calendar.getInstance();
//    private int currentYear = calendar.get(Calendar.YEAR);

    //enter

    public void createPlanVacation(Employee employee, int year) {

        PlanInstance newPlanInstance = new PlanInstance(employee, Events.VACATION, year);
        planInfo.newPlan(newPlanInstance);

    }

    public void createAbsenceVacation(Employee employee, LocalDate dateOfVacation) {

        //TODO check:
        // dateOfVacation - in Absences
        // VacationPlan without related absence

        List<Absence> allEmployeeAbsences = absenceLogic.getAllEmployeeAbsences(employee, dateOfVacation.getYear());
        boolean isDateFree = true;

        for (int i = 0; i < allEmployeeAbsences.size(); i++) {

            if (allEmployeeAbsences.get(i).getEventDate().equals(dateOfVacation)) {
                isDateFree = false;
            }
        }// если дата не свободна - исключение


        //TODO если есть свободные planInstance - новый absence и ссылка на этот planInstance,
        // если нет свободных - новый planInstance  и новый absence со ссылкой на него


        List<PlanInstance> allEmployeePlanInfoForVacation = commonLogic.getAllEmployeePlanInfoForEvent(employee, Events.VACATION, dateOfVacation.getYear());
        List<Absence> allFactVacationDays = this.getAllFactVacationDays(employee, dateOfVacation.getYear());

        Absence newAbsence = new Absence(employee, dateOfVacation);
        PlanInstance newPlanInstance = new PlanInstance(employee, Events.VACATION, dateOfVacation.getYear());

        if (allEmployeePlanInfoForVacation.size() == allFactVacationDays.size()) {

            //TODO новый planInstance  и новый absence со ссылкой на него

//            newPlanInstance.setAbsence(newAbsence);
//            newAbsence.setRelatedPlanInstances(newPlanInstance);
//
//            planInfo.newPlan(newPlanInstance);
//            absenceInfo.newAbsence(newAbsence);

        } else {

            for (int i = 0; i < allEmployeePlanInfoForVacation.size(); i++) {

                PlanInstance planInstance = allEmployeePlanInfoForVacation.get(i);

                if (planInstance.getAbsence() == null) {

                        newPlanInstance = planInstance;
                        break;
                    }
            }
//            newAbsence.setRelatedPlanInstances(newPlanInstance);
//            newPlanInstance.setAbsence(newAbsence);
//
//            absenceInfo.newAbsence(newAbsence);
//            planInfo.modifyPlan(newPlanInstance);
        }
        newAbsence.setRelatedPlanInstances(newPlanInstance);
        newPlanInstance.setAbsence(newAbsence);

        absenceInfo.newAbsence(newAbsence);
        planInfo.modifyPlan(newPlanInstance);

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
        // создать новый объект Absence (предложить закрыть существующим свободным absence если есть),
        // в нем сделать ссылку на старую запись плана


        planInfo.newPlan(Events.VACATION, employee);
        absenceInfo.newAbsence();
    }

    //get

    public int getCountPlanVacationDays(Employee employee) {

        planInfo.getAllPlan();

        return 0;
    }

    public List<Absence> getAllPlanVacationDays(Employee employee, LocalDate dateRangeFrom, LocalDate dateRangeTo) {

        absenceInfo.getAllAbsences();
        planInfo.getAllPlan();


        return new ArrayList<Absence>();
    }

    public List<Absence> getAllFactVacationDays(Employee employee, int year) {

        // исключение на даты (д.б.одного года)

        List<Absence> allEmployeeAbsencesForVacation = absenceLogic.getAllEmployeeAbsencesForEvent(employee, Events.VACATION, year);
        List<Absence> allEmployeeAbsencesForCancel = absenceLogic.getAllEmployeeAbsencesForEvent(employee, Events.CANCEL, year);



        //поиск только absence без ОТМЕНА

        for (int i = 0; i < allEmployeeAbsencesForVacation.size(); i++) {

            Absence absence = allEmployeeAbsencesForVacation.get(i);

            for (int j = 0; j < allEmployeeAbsencesForCancel.size(); j++) {

                if (absence.getID() == allEmployeeAbsencesForCancel.get(j).getID()){

                    allEmployeeAbsencesForVacation.remove(absence);
                    break;
                }
            }
        }

        return allEmployeeAbsencesForVacation;
    }

    //remove

    public void removePlanInstanceVacation (Employee employee, PlanInstance planInstanceOfVacation) {
        //todo: удалять только если есть planInstance без связей с absence,
        // иначе - отказ с уведомление что сначала надо удалить absence
    }

    void removeAbsenceVacation (Employee employee, Absence absenceOfVacation){
        //todo:удаляется только absence
    }
}
