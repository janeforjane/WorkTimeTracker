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
    private LocalDateTime dateTimeOfCreate; //в объекте не заполняем, в БД передаем null, а в БД заполняем с помощью функции


}
