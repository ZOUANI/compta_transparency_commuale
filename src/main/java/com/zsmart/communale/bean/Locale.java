/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.communale.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author MoulaYounes
 */
@Entity
public class Locale implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @ManyToOne
    private Rue rue;
    @ManyToOne
    private Redevable redevable;

    @ManyToOne
    private CategorieSejour categorieSejour;

    @ManyToOne
    private CategorieBoisson categorieBoisson;

    private Integer dernierTrimBoissonPaye;
    private Integer dernierAnneeBoissonPaye;
    private Integer dernierAnneeBoissonDeclare;

    private Integer dernierTrimSejourPaye;
    private Integer dernierAnneeSejourPaye;
    private Integer dernierAnneeSejourDeclare;

    public CategorieBoisson getCategorieBoisson() {
        return categorieBoisson;
    }

    public void setCategorieBoisson(CategorieBoisson categorieBoisson) {
        this.categorieBoisson = categorieBoisson;
    }

    
    public Integer getDernierAnneeBoissonDeclare() {
        return dernierAnneeBoissonDeclare;
    }

    public void setDernierAnneeBoissonDeclare(Integer dernierAnneeBoissonDeclare) {
        this.dernierAnneeBoissonDeclare = dernierAnneeBoissonDeclare;
    }

    public Integer getDernierAnneeSejourDeclare() {
        return dernierAnneeSejourDeclare;
    }

    public void setDernierAnneeSejourDeclare(Integer dernierAnneeSejourDeclare) {
        this.dernierAnneeSejourDeclare = dernierAnneeSejourDeclare;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public CategorieSejour getCategorieSejour() {
        return categorieSejour;
    }

    public void setCategorieSejour(CategorieSejour categorieSejour) {
        this.categorieSejour = categorieSejour;
    }

    public Integer getDernierTrimBoissonPaye() {
        return dernierTrimBoissonPaye;
    }

    public void setDernierTrimBoissonPaye(Integer dernierTrimBoissonPaye) {
        this.dernierTrimBoissonPaye = dernierTrimBoissonPaye;
    }

    public Integer getDernierAnneeBoissonPaye() {
        return dernierAnneeBoissonPaye;
    }

    public void setDernierAnneeBoissonPaye(Integer dernierAnneeBoissonPaye) {
        this.dernierAnneeBoissonPaye = dernierAnneeBoissonPaye;
    }

    public Integer getDernierTrimSejourPaye() {
        return dernierTrimSejourPaye;
    }

    public void setDernierTrimSejourPaye(Integer dernierTrimSejourPaye) {
        this.dernierTrimSejourPaye = dernierTrimSejourPaye;
    }

    public Integer getDernierAnneeSejourPaye() {
        return dernierAnneeSejourPaye;
    }

    public void setDernierAnneeSejourPaye(Integer dernierAnneeSejourPaye) {
        this.dernierAnneeSejourPaye = dernierAnneeSejourPaye;
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
        if (!(object instanceof Locale)) {
            return false;
        }
        Locale other = (Locale) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zsmart.base.taxe.communale.bean.Locale[ id=" + id + " ]";
    }

}
