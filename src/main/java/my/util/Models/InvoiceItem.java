package my.util.Models;

import javax.persistence.*;

@Entity
@Table(name = "invoice_items")
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "InvoiceLineId", nullable = false)
    private Integer invoicelineid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "InvoiceId", nullable = false)
    private Invoice invoiceid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TrackId", nullable = false)
    private Track trackid;

    @Column(name = "UnitPrice", nullable = false)
    private Long unitprice;

    @Column(name = "Quantity", nullable = false)
    private Integer quantity;

    public InvoiceItem(){
    }

    public InvoiceItem(Invoice invoiceid, Track trackid, Long unitprice, Integer quantity) {
        this.invoiceid = invoiceid;
        this.trackid = trackid;
        this.unitprice = unitprice;
        this.quantity = quantity;
    }

    public Integer getInvoicelineid() {
        return invoicelineid;
    }

    public void setInvoicelineid(Integer invoicelineid) {
        this.invoicelineid = invoicelineid;
    }

    public Invoice getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(Invoice invoiceid) {
        this.invoiceid = invoiceid;
    }

    public Track getTrackid() {
        return trackid;
    }

    public void setTrackid(Track trackid) {
        this.trackid = trackid;
    }

    public Long getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Long unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
