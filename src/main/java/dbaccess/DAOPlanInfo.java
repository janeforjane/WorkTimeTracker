package dbaccess;

import box.Events;
import entities.Event;
import entities.PlanInstance;

import java.util.List;

public interface DAOPlanInfo {

    void newPlan (Events event);
    void modifyPlan();
    void removePlan();
    PlanInstance getPlanInstance();
    List<PlanInstance> getAllPlan();
}
