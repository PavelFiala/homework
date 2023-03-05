package pavelf.demo.homework;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Quotation {

    @Id
    @GeneratedValue
    private Long id;
    @Basic private LocalDate beginningOfInsurance;
    @Basic private Long insuredAmount;
    @Basic private LocalDate dateOfSigningMortgage;
    @OneToOne private Customer customer;

    public Quotation() {

    }

    public Quotation(Long id, LocalDate beginningOfInsurance, Long insuredAmount, LocalDate dateOfSigningMortgage, Customer customer) {
        this.id = id;
        this.beginningOfInsurance = beginningOfInsurance;
        this.insuredAmount = insuredAmount;
        this.dateOfSigningMortgage = dateOfSigningMortgage;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBeginningOfInsurance() {
        return beginningOfInsurance;
    }

    public void setBeginningOfInsurance(LocalDate beginningOfInsurance) {
        this.beginningOfInsurance = beginningOfInsurance;
    }

    public Long getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(Long insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public LocalDate getDateOfSigningMortgage() {
        return dateOfSigningMortgage;
    }

    public void setDateOfSigningMortgage(LocalDate dateOfSigningMortgage) {
        this.dateOfSigningMortgage = dateOfSigningMortgage;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override public String toString() {
        return "Quotation{" +
                "id=" + id +
                ", beginningOfInsurance=" + beginningOfInsurance +
                ", insuredAmount=" + insuredAmount +
                ", dateOfSigningMortgage=" + dateOfSigningMortgage +
                ", customer=" + customer +
                '}';
    }
}