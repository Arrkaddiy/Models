package my.util.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "EmployeeId", nullable = false)
    private Integer employeeid;

    @Column(name = "LastName", length = 20, nullable = false)
    private String lastname;

    @Column(name = "FirstName", length = 20, nullable = false)
    private String firstname;

    @Column(name = "Title", length = 30)
    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ReportsTo")
    private Employee reportsto;

    @Column(name = "BirthDate")
    private Date birthdate;

    @Column(name = "HireDate")
    private Date hiredate;

    @Column(name = "Address", length = 70)
    private String address;

    @Column(name = "City", length = 40)
    private String city;

    @Column(name = "State", length = 40)
    private String state;

    @Column(name = "Country", length = 40)
    private String country;

    @Column(name = "PostalCode", length = 10)
    private String postalcode;

    @Column(name = "Phone", length = 24)
    private String phone;

    @Column(name = "Fax", length = 24)
    private String fax;

    @Column(name = "Email", length = 60)
    private String email;

    @Column(name = "Password", length = 40)
    private String password;

    @Column(name = "Active")
    private boolean active;

    public Employee() {
    }

    public Employee(String lastname, String firstname, String title,
                    Employee reportsto, Date birthdate, Date hiredate,
                    String address, String city, String state, String country,
                    String postalcode, String phone, String fax, String email,
                    String password, boolean active) {

        this.lastname = lastname;
        this.firstname = firstname;
        this.title = title;
        this.reportsto = reportsto;
        this.birthdate = birthdate;
        this.hiredate = hiredate;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalcode = postalcode;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.password = password;
        this.active = active;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employee getReportsto() {
        return reportsto;
    }

    public void setReportsto(Employee reportsto) {
        this.reportsto = reportsto;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
