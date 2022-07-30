package employee.management.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String maritalStatus;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String email;
    private String ssn;
    private String title;
    private Long salary;
    private String dateOfHire;
    private boolean permanent;
    private boolean healthInsurance;
    private boolean dentalInsurance;
    private boolean retirementPlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;

    public Employee() {
    }

    public Employee(String name, String maritalStatus, String gender, String dateOfBirth, String address, String city, String state, String zipcode, String phoneNumber, String email, String ssn, String title, Long salary, String dateOfHire, boolean permanent, boolean healthInsurance, boolean dentalInsurance, boolean retirementPlan, Department department) {
        this.name = name;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.ssn = ssn;
        this.title = title;
        this.salary = salary;
        this.dateOfHire = dateOfHire;
        this.permanent = permanent;
        this.healthInsurance = healthInsurance;
        this.dentalInsurance = dentalInsurance;
        this.retirementPlan = retirementPlan;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
