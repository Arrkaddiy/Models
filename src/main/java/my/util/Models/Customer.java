package my.util.Models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "CustomerId", nullable = false)
    private Integer customerid;

    @Column(name = "FirstName", length = 40, nullable = false)
    private String firstname;

    @Column(name = "LastName", length = 20, nullable = false)
    private String lastname;

    @Column(name = "Company", length = 80)
    private String company;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SupportRepId")
    private Employee supportrepid;

    @Column(name = "Password", length = 40)
    private String password;

    @Column(name = "Active")
    private boolean active;

    public Customer(){
    }

    public Customer(String firstname, String lastname, String company,
                    String address, String city, String state, String country,
                    String postalcode, String phone, String fax, String email,
                    Employee supportrepid, String password, boolean active) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalcode = postalcode;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.supportrepid = supportrepid;
        this.password = password;
        this.active = active;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public Employee getSupportrepid() {
        return supportrepid;
    }

    public void setSupportrepid(Employee supportrepid) {
        this.supportrepid = supportrepid;
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
