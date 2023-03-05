package pavelf.demo.homework;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Subscription {
    @GeneratedValue @Id private Long id;
    @Basic private LocalDate startDate;
    @Basic private LocalDate validUntil;
    @OneToOne private Quotation quotation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public Quotation getQuotation() {
        return quotation;
    }

    public void setQuotation(Quotation quotation) {
        this.quotation = quotation;
    }

    @Override public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", validUntil=" + validUntil +
                ", quotation=" + quotation +
                '}';
    }
}