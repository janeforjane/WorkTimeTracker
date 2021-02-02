package dbaccess;

import box.Events;
import entities.Employee;
import entities.PlanInstance;

import java.util.List;

public interface DAOPlanInfo {

    void newPlan (PlanInstance planInstance);
    void modifyPlan(PlanInstance planInstance);
    void removePlan(PlanInstance planInstance);
    PlanInstance getPlanInstance();
    List<PlanInstance> getAllPlan();
}
