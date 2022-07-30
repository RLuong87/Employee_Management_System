package employee.management.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sickDays;
    private Long personalTime;
    private Long vacationHours;

}
