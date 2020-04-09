/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.communale.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author MoulaYounes
 */
@Entity
public class TauxBoisson implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CategorieBoisson categorieBoisson;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantParNuite;
    @Column(precision = 16, scale = 4)
    private BigDecimal majorationTrim;
    @Column(precision = 16, scale = 4)
    private BigDecimal penaliteTrim;

    @Column(precision = 16, scale = 4)
    private BigDecimal majorationAnnuelle;
    @Column(precision = 16, scale = 4)
    private BigDecimal penaliteAnnuelle;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateApplicationDebut;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateApplicationFin;

    
    public CategorieBoisson getCategorieBoisson() {
		return categorieBoisson;
	}

	public void setCategorieBoisson(CategorieBoisson categorieBoisson) {
		this.categorieBoisson = categorieBoisson;
	}

	public BigDecimal getMontantParNuite() {
        return montantParNuite;
    }

    public void setMontantParNuite(BigDecimal montantParNuite) {
        this.montantParNuite = montantParNuite;
    }

    public BigDecimal getMajorationTrim() {
        return majorationTrim;
    }

    public void setMajorationTrim(BigDecimal majorationTrim) {
        this.majorationTrim = majorationTrim;
    }

    public BigDecimal getPenaliteTrim() {
        return penaliteTrim;
    }

    public void setPenaliteTrim(BigDecimal penaliteTrim) {
        this.penaliteTrim = penaliteTrim;
    }

    public BigDecimal getMajorationAnnuelle() {
        return majorationAnnuelle;
    }

    public void setMajorationAnnuelle(BigDecimal majorationAnnuelle) {
        this.majorationAnnuelle = majorationAnnuelle;
    }

    public BigDecimal getPenaliteAnnuelle() {
        return penaliteAnnuelle;
    }

    public void setPenaliteAnnuelle(BigDecimal penaliteAnnuelle) {
        this.penaliteAnnuelle = penaliteAnnuelle;
    }

    public Date getDateApplicationDebut() {
        return dateApplicationDebut;
    }

    public void setDateApplicationDebut(Date dateApplicationDebut) {
        this.dateApplicationDebut = dateApplicationDebut;
    }

    public Date getDateApplicationFin() {
        return dateApplicationFin;
    }

    public void setDateApplicationFin(Date dateApplicationFin) {
        this.dateApplicationFin = dateApplicationFin;
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
        if (!(object instanceof TauxBoisson)) {
            return false;
        }
        TauxBoisson other = (TauxBoisson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zsmart.sejour.bean.TauxSejour[ id=" + id + " ]";
    }

}
