package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private long ID;
    private String lastName;
    private String name;
    private String secondName;
    private LocalDate entryDate;
    private LocalDate cancelDate;
    private String position; //TODO  change in method 'modifyEmployee'
    private LocalDateTime dateTimeOfCreate; //


    public Employee(String lastName, String name, String secondName, LocalDate entryDate, String position) {

        this.lastName = lastName;
        this.name = name;
        this.secondName = secondName;
        this.entryDate = entryDate;
        this.position = position;
    }

    public void setDateTimeOfCreate(LocalDateTime dateTimeOfCreate) {
        this.dateTimeOfCreate = dateTimeOfCreate;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDateTime getDateTimeOfCreate() {
        return dateTimeOfCreate;
    }
}
