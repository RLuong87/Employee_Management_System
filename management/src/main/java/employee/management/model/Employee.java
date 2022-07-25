package employee.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String email;
    private String ssn;
    private String title;
    private Long salary;
    private boolean healthInsurance;
    private boolean dentalInsurance;
    private boolean retirementPlan;

    public Employee() {
    }

    public Employee(String firstName,
                    String lastName,
                    String gender,
                    String address,
                    String city,
                    String state,
                    String zipcode,
                    String phoneNumber,
                    String email,
                    String ssn,
                    String title,
                    Long salary,
                    boolean healthInsurance,
                    boolean dentalInsurance,
                    boolean retirementPlan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.title = title;
        this.ssn = ssn;
        this.salary = salary;
        this.healthInsurance = healthInsurance;
        this.dentalInsurance = dentalInsurance;
        this.retirementPlan = retirementPlan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public boolean isHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(boolean healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public boolean isDentalInsurance() {
        return dentalInsurance;
    }

    public void setDentalInsurance(boolean dentalInsurance) {
        this.dentalInsurance = dentalInsurance;
    }

    public boolean isRetirementPlan() {
        return retirementPlan;
    }

    public void setRetirementPlan(boolean retirementPlan) {
        this.retirementPlan = retirementPlan;
    }
}
