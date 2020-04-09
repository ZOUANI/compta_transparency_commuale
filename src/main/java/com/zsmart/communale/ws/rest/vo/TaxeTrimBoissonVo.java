package com.zsmart.communale.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class TaxeTrimBoissonVo{

private String id ;
private String numeroTrim;
private String numeroTrimMin ;
private String numeroTrimMax ;
private String annee;
private String anneeMin ;
private String anneeMax ;
private String datePresentation;
private String datePresentationMin ;
private String datePresentationMax ;
private String montantTotal;
private String montantTotalMin ;
private String montantTotalMax ;
private String montantBase;
private String montantBaseMin ;
private String montantBaseMax ;
private String montantRetard;
private String montantRetardMin ;
private String montantRetardMax ;
private String montantMajoration;
private String montantMajorationMin ;
private String montantMajorationMax ;
private String montantPenalite;
private String montantPenaliteMin ;
private String montantPenaliteMax ;
private String nomberMoisRetard;
private String nomberMoisRetardMin ;
private String nomberMoisRetardMax ;
private String dateValidation;
private String dateValidationMin ;
private String dateValidationMax ;
private String dateSoumission;
private String dateSoumissionMin ;
private String dateSoumissionMax ;
private String dateAffectationComptable;
private String dateAffectationComptableMin ;
private String dateAffectationComptableMax ;
private String dateFinalisation;
private String dateFinalisationMin ;
private String dateFinalisationMax ;
private String dateSaisie;
private String dateSaisieMin ;
private String dateSaisieMax ;
private LocaleVo localeVo ;
private RedevableVo redevableVo ;
private TauxBoissonVo tauxBoissonVo ;
private TaxeAnnuelBoissonVo taxeAnnuelBoissonVo ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getNumeroTrim(){
    return numeroTrim;
}

public void setNumeroTrim(String  numeroTrim){
     this.numeroTrim = numeroTrim;
}

public String  getNumeroTrimMin(){
    return numeroTrimMin;
}

public void setNumeroTrimMin(String  numeroTrimMin){
     this.numeroTrimMin = numeroTrimMin;
}

public String  getNumeroTrimMax(){
    return numeroTrimMax;
}

public void setNumeroTrimMax(String  numeroTrimMax){
     this.numeroTrimMax = numeroTrimMax;
}

public String  getAnnee(){
    return annee;
}

public void setAnnee(String  annee){
     this.annee = annee;
}

public String  getAnneeMin(){
    return anneeMin;
}

public void setAnneeMin(String  anneeMin){
     this.anneeMin = anneeMin;
}

public String  getAnneeMax(){
    return anneeMax;
}

public void setAnneeMax(String  anneeMax){
     this.anneeMax = anneeMax;
}

public String  getDatePresentation(){
    return datePresentation;
}

public void setDatePresentation(String  datePresentation){
     this.datePresentation = datePresentation;
}

public String  getDatePresentationMin(){
    return datePresentationMin;
}

public void setDatePresentationMin(String  datePresentationMin){
     this.datePresentationMin = datePresentationMin;
}

public String  getDatePresentationMax(){
    return datePresentationMax;
}

public void setDatePresentationMax(String  datePresentationMax){
     this.datePresentationMax = datePresentationMax;
}

public String  getMontantTotal(){
    return montantTotal;
}

public void setMontantTotal(String  montantTotal){
     this.montantTotal = montantTotal;
}

public String  getMontantTotalMin(){
    return montantTotalMin;
}

public void setMontantTotalMin(String  montantTotalMin){
     this.montantTotalMin = montantTotalMin;
}

public String  getMontantTotalMax(){
    return montantTotalMax;
}

public void setMontantTotalMax(String  montantTotalMax){
     this.montantTotalMax = montantTotalMax;
}

public String  getMontantBase(){
    return montantBase;
}

public void setMontantBase(String  montantBase){
     this.montantBase = montantBase;
}

public String  getMontantBaseMin(){
    return montantBaseMin;
}

public void setMontantBaseMin(String  montantBaseMin){
     this.montantBaseMin = montantBaseMin;
}

public String  getMontantBaseMax(){
    return montantBaseMax;
}

public void setMontantBaseMax(String  montantBaseMax){
     this.montantBaseMax = montantBaseMax;
}

public String  getMontantRetard(){
    return montantRetard;
}

public void setMontantRetard(String  montantRetard){
     this.montantRetard = montantRetard;
}

public String  getMontantRetardMin(){
    return montantRetardMin;
}

public void setMontantRetardMin(String  montantRetardMin){
     this.montantRetardMin = montantRetardMin;
}

public String  getMontantRetardMax(){
    return montantRetardMax;
}

public void setMontantRetardMax(String  montantRetardMax){
     this.montantRetardMax = montantRetardMax;
}

public String  getMontantMajoration(){
    return montantMajoration;
}

public void setMontantMajoration(String  montantMajoration){
     this.montantMajoration = montantMajoration;
}

public String  getMontantMajorationMin(){
    return montantMajorationMin;
}

public void setMontantMajorationMin(String  montantMajorationMin){
     this.montantMajorationMin = montantMajorationMin;
}

public String  getMontantMajorationMax(){
    return montantMajorationMax;
}

public void setMontantMajorationMax(String  montantMajorationMax){
     this.montantMajorationMax = montantMajorationMax;
}

public String  getMontantPenalite(){
    return montantPenalite;
}

public void setMontantPenalite(String  montantPenalite){
     this.montantPenalite = montantPenalite;
}

public String  getMontantPenaliteMin(){
    return montantPenaliteMin;
}

public void setMontantPenaliteMin(String  montantPenaliteMin){
     this.montantPenaliteMin = montantPenaliteMin;
}

public String  getMontantPenaliteMax(){
    return montantPenaliteMax;
}

public void setMontantPenaliteMax(String  montantPenaliteMax){
     this.montantPenaliteMax = montantPenaliteMax;
}

public String  getNomberMoisRetard(){
    return nomberMoisRetard;
}

public void setNomberMoisRetard(String  nomberMoisRetard){
     this.nomberMoisRetard = nomberMoisRetard;
}

public String  getNomberMoisRetardMin(){
    return nomberMoisRetardMin;
}

public void setNomberMoisRetardMin(String  nomberMoisRetardMin){
     this.nomberMoisRetardMin = nomberMoisRetardMin;
}

public String  getNomberMoisRetardMax(){
    return nomberMoisRetardMax;
}

public void setNomberMoisRetardMax(String  nomberMoisRetardMax){
     this.nomberMoisRetardMax = nomberMoisRetardMax;
}

public String  getDateValidation(){
    return dateValidation;
}

public void setDateValidation(String  dateValidation){
     this.dateValidation = dateValidation;
}

public String  getDateValidationMin(){
    return dateValidationMin;
}

public void setDateValidationMin(String  dateValidationMin){
     this.dateValidationMin = dateValidationMin;
}

public String  getDateValidationMax(){
    return dateValidationMax;
}

public void setDateValidationMax(String  dateValidationMax){
     this.dateValidationMax = dateValidationMax;
}

public String  getDateSoumission(){
    return dateSoumission;
}

public void setDateSoumission(String  dateSoumission){
     this.dateSoumission = dateSoumission;
}

public String  getDateSoumissionMin(){
    return dateSoumissionMin;
}

public void setDateSoumissionMin(String  dateSoumissionMin){
     this.dateSoumissionMin = dateSoumissionMin;
}

public String  getDateSoumissionMax(){
    return dateSoumissionMax;
}

public void setDateSoumissionMax(String  dateSoumissionMax){
     this.dateSoumissionMax = dateSoumissionMax;
}

public String  getDateAffectationComptable(){
    return dateAffectationComptable;
}

public void setDateAffectationComptable(String  dateAffectationComptable){
     this.dateAffectationComptable = dateAffectationComptable;
}

public String  getDateAffectationComptableMin(){
    return dateAffectationComptableMin;
}

public void setDateAffectationComptableMin(String  dateAffectationComptableMin){
     this.dateAffectationComptableMin = dateAffectationComptableMin;
}

public String  getDateAffectationComptableMax(){
    return dateAffectationComptableMax;
}

public void setDateAffectationComptableMax(String  dateAffectationComptableMax){
     this.dateAffectationComptableMax = dateAffectationComptableMax;
}

public String  getDateFinalisation(){
    return dateFinalisation;
}

public void setDateFinalisation(String  dateFinalisation){
     this.dateFinalisation = dateFinalisation;
}

public String  getDateFinalisationMin(){
    return dateFinalisationMin;
}

public void setDateFinalisationMin(String  dateFinalisationMin){
     this.dateFinalisationMin = dateFinalisationMin;
}

public String  getDateFinalisationMax(){
    return dateFinalisationMax;
}

public void setDateFinalisationMax(String  dateFinalisationMax){
     this.dateFinalisationMax = dateFinalisationMax;
}

public String  getDateSaisie(){
    return dateSaisie;
}

public void setDateSaisie(String  dateSaisie){
     this.dateSaisie = dateSaisie;
}

public String  getDateSaisieMin(){
    return dateSaisieMin;
}

public void setDateSaisieMin(String  dateSaisieMin){
     this.dateSaisieMin = dateSaisieMin;
}

public String  getDateSaisieMax(){
    return dateSaisieMax;
}

public void setDateSaisieMax(String  dateSaisieMax){
     this.dateSaisieMax = dateSaisieMax;
}

public LocaleVo  getLocaleVo (){
    return localeVo ;
}

public void setLocaleVo (LocaleVo  localeVo ){
     this.localeVo  = localeVo ;
}

public RedevableVo  getRedevableVo (){
    return redevableVo ;
}

public void setRedevableVo (RedevableVo  redevableVo ){
     this.redevableVo  = redevableVo ;
}

public TauxBoissonVo  getTauxBoissonVo (){
    return tauxBoissonVo ;
}

public void setTauxBoissonVo (TauxBoissonVo  tauxBoissonVo ){
     this.tauxBoissonVo  = tauxBoissonVo ;
}

public TaxeAnnuelBoissonVo  getTaxeAnnuelBoissonVo (){
    return taxeAnnuelBoissonVo ;
}

public void setTaxeAnnuelBoissonVo (TaxeAnnuelBoissonVo  taxeAnnuelBoissonVo ){
     this.taxeAnnuelBoissonVo  = taxeAnnuelBoissonVo ;
}




}