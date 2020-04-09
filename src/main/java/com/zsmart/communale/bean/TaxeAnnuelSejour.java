/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.communale.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author MoulaYounes
 */
@Entity
public class TaxeAnnuelSejour implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Locale locale;
    @ManyToOne
    private Redevable redevable;

    private Integer annee;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date datePresentation;

    @Column(precision = 16, scale = 4)
    private BigDecimal montantTotal;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantBase;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantRetard;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantMajoration;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantPenalite;

    private Integer nomberMoisRetard;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateValidation;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateSoumission;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateAffectationComptable;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateFinalisation;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateSaisie;

    @OneToOne
    private TauxSejour tauxSejour;

    @OneToMany(mappedBy = "taxeAnnuelSejour")
    private List<TaxeTrimSejour> taxeTrimSejours;

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Date getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(Date datePresentation) {
        this.datePresentation = datePresentation;
    }

    public BigDecimal getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(BigDecimal montantTotal) {
        this.montantTotal = montantTotal;
    }

    public BigDecimal getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(BigDecimal montantBase) {
        this.montantBase = montantBase;
    }

    public BigDecimal getMontantRetard() {
        return montantRetard;
    }

    public void setMontantRetard(BigDecimal montantRetard) {
        this.montantRetard = montantRetard;
    }

    public BigDecimal getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(BigDecimal montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public BigDecimal getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(BigDecimal montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public Integer getNomberMoisRetard() {
        return nomberMoisRetard;
    }

    public void setNomberMoisRetard(Integer nomberMoisRetard) {
        this.nomberMoisRetard = nomberMoisRetard;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Date getDateSoumission() {
        return dateSoumission;
    }

    public void setDateSoumission(Date dateSoumission) {
        this.dateSoumission = dateSoumission;
    }

    public Date getDateAffectationComptable() {
        return dateAffectationComptable;
    }

    public void setDateAffectationComptable(Date dateAffectationComptable) {
        this.dateAffectationComptable = dateAffectationComptable;
    }

    public Date getDateFinalisation() {
        return dateFinalisation;
    }

    public void setDateFinalisation(Date dateFinalisation) {
        this.dateFinalisation = dateFinalisation;
    }

    public Date getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(Date dateSaisie) {
        this.dateSaisie = dateSaisie;
    }

    public TauxSejour getTauxSejour() {
        return tauxSejour;
    }

    public void setTauxSejour(TauxSejour tauxSejour) {
        this.tauxSejour = tauxSejour;
    }

    public List<TaxeTrimSejour> getTaxeTrimSejours() {
        return taxeTrimSejours;
    }

    public void setTaxeTrimSejours(List<TaxeTrimSejour> taxeTrimSejours) {
        this.taxeTrimSejours = taxeTrimSejours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxeAnnuelSejour)) {
            return false;
        }
        TaxeAnnuelSejour other = (TaxeAnnuelSejour) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zsmart.sejour.bean.TaxeAnnuelSejour[ id=" + id + " ]";
    }

}
