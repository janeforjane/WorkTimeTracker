package entities;

import java.time.LocalDate;
import java.util.List;

public class Absence {

    private long ID;
    private Employee employee;
    private LocalDate eventDate;
    private List <PlanInstance> relatedPlanInstances;
    private String comment;

}
