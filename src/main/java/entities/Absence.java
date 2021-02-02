package entities;

import java.time.LocalDate;
import java.util.List;

public class Absence {

    private long ID;
    private Employee employee;
    private LocalDate eventDate;
    private PlanInstance relatedPlanInstances;
    private String comment;


    public Absence(Employee employee, LocalDate eventDate) {
        this.employee = employee;
        this.eventDate = eventDate;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public PlanInstance getRelatedPlanInstances() {
        return relatedPlanInstances;
    }

    public void setRelatedPlanInstances(PlanInstance relatedPlanInstances) {
        this.relatedPlanInstances = relatedPlanInstances;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
