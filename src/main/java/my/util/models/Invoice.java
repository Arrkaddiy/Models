package my.util.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "InvoiceId", nullable = false)
    private Integer invoiceid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CustomerId", nullable = false)
    private Customer customerid;

    @Column(name = "InvoiceDate",  nullable = false)
    private Date invoicedate;

    @Column(name = "BillingAddress", length = 70)
    private String billingaddress;

    @Column(name = "BillingCity", length = 40)
    private String billingcity;

    @Column(name = "BillingState", length = 40)
    private String billingstate;

    @Column(name = "BillingCountry", length = 40)
    private String billingcountry;

    @Column(name = "BillingPostalCode", length = 10)
    private String billingpostalcode;

    @Column(name = "Total", nullable = false)
    private Long total;

    public Invoice(){
    }

    public Invoice(Customer customerid, Date invoicedate, String billingaddress,
                   String billingcity, String billingstate, String billingcountry,
                   String billingpostalcode, Long total) {

        this.customerid = customerid;
        this.invoicedate = invoicedate;
        this.billingaddress = billingaddress;
        this.billingcity = billingcity;
        this.billingstate = billingstate;
        this.billingcountry = billingcountry;
        this.billingpostalcode = billingpostalcode;
        this.total = total;
    }

    public Integer getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(Integer invoiceid) {
        this.invoiceid = invoiceid;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public Date getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    public String getBillingaddress() {
        return billingaddress;
    }

    public void setBillingaddress(String billingaddress) {
        this.billingaddress = billingaddress;
    }

    public String getBillingcity() {
        return billingcity;
    }

    public void setBillingcity(String billingcity) {
        this.billingcity = billingcity;
    }

    public String getBillingstate() {
        return billingstate;
    }

    public void setBillingstate(String billingstate) {
        this.billingstate = billingstate;
    }

    public String getBillingcountry() {
        return billingcountry;
    }

    public void setBillingcountry(String billingcountry) {
        this.billingcountry = billingcountry;
    }

    public String getBillingpostalcode() {
        return billingpostalcode;
    }

    public void setBillingpostalcode(String billingpostalcode) {
        this.billingpostalcode = billingpostalcode;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
