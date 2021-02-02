package entities;

import box.Events;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PlanInstance {

    private long ID;
    private Employee employee;
    private Events event;
    private String comment;
    private Info info;
    private Absence absence;
    private int yearOfPlanInstance;
    private LocalDateTime dateTimeOfCreate; //в объекте не заполняем, в БД передаем null, а в БД заполняем с помощью функции


    public PlanInstance(Employee employee, Events event, int year) {
        this.employee = employee;
        this.event = event;
        this.yearOfPlanInstance = year;
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

    public Events getEvent() {
        return event;
    }

    public void setEvent(Events event) {
        this.event = event;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public LocalDateTime getDateTimeOfCreate() {
        return dateTimeOfCreate;
    }

    public void setDateTimeOfCreate(LocalDateTime dateTimeOfCreate) {
        this.dateTimeOfCreate = dateTimeOfCreate;
    }

    public Absence getAbsence() {
        return absence;
    }

    public void setAbsence(Absence absence) {
        this.absence = absence;
    }

    public int getYearOfPlanInstance() {
        return yearOfPlanInstance;
    }

    public void setYearOfPlanInstance(int yearOfPlanInstance) {
        this.yearOfPlanInstance = yearOfPlanInstance;
    }
}
