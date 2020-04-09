
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.TaxeTrimBoissonService ; 
import com.zsmart.communale.dao.TaxeTrimBoissonDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.TaxeTrimBoisson;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.communale.bean.Locale; 
import com.zsmart.communale.service.facade.LocaleService ; 
import com.zsmart.communale.bean.Redevable; 
import com.zsmart.communale.service.facade.RedevableService ; 
import com.zsmart.communale.bean.TauxBoisson; 
import com.zsmart.communale.service.facade.TauxBoissonService ; 
import com.zsmart.communale.bean.TaxeAnnuelBoisson; 
import com.zsmart.communale.service.facade.TaxeAnnuelBoissonService ; 

 @Service  

 public class TaxeTrimBoissonServiceImpl implements TaxeTrimBoissonService  {


 @Autowired 

 private TaxeTrimBoissonDao taxetrimboissonDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private LocaleService localeService; 

 @Autowired 

 private RedevableService redevableService; 

 @Autowired 

 private TauxBoissonService tauxboissonService; 

 @Autowired 

 private TaxeAnnuelBoissonService taxeannuelboissonService; 

 @Override 
public TaxeTrimBoisson  save (TaxeTrimBoisson taxetrimboisson){

if(taxetrimboisson== null){ 
 return null; 
}else {
 taxetrimboissonDao.save(taxetrimboisson);
return taxetrimboisson;
}
}

 @Override 
public List< TaxeTrimBoisson>  findAll(){
 return taxetrimboissonDao.findAll();
}

 @Override 
public TaxeTrimBoisson findById(Long id){
 return taxetrimboissonDao.getOne(id);
}

 @Override 
public int delete(TaxeTrimBoisson taxetrimboisson){
if(taxetrimboisson== null){ 
  return -1; 
}else {
 taxetrimboissonDao.delete(taxetrimboisson);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       taxetrimboissonDao.deleteById(id);
}
public void clone(TaxeTrimBoisson taxetrimboisson,TaxeTrimBoisson taxetrimboissonClone){
if(taxetrimboisson!= null && taxetrimboissonClone != null){
taxetrimboissonClone.setId(taxetrimboisson.getId());
taxetrimboissonClone.setNumeroTrim(taxetrimboisson.getNumeroTrim());
taxetrimboissonClone.setAnnee(taxetrimboisson.getAnnee());
taxetrimboissonClone.setDatePresentation(taxetrimboisson.getDatePresentation());
taxetrimboissonClone.setMontantTotal(taxetrimboisson.getMontantTotal());
taxetrimboissonClone.setMontantBase(taxetrimboisson.getMontantBase());
taxetrimboissonClone.setMontantRetard(taxetrimboisson.getMontantRetard());
taxetrimboissonClone.setMontantMajoration(taxetrimboisson.getMontantMajoration());
taxetrimboissonClone.setMontantPenalite(taxetrimboisson.getMontantPenalite());
taxetrimboissonClone.setNomberMoisRetard(taxetrimboisson.getNomberMoisRetard());
taxetrimboissonClone.setDateValidation(taxetrimboisson.getDateValidation());
taxetrimboissonClone.setDateSoumission(taxetrimboisson.getDateSoumission());
taxetrimboissonClone.setDateAffectationComptable(taxetrimboisson.getDateAffectationComptable());
taxetrimboissonClone.setDateFinalisation(taxetrimboisson.getDateFinalisation());
taxetrimboissonClone.setDateSaisie(taxetrimboisson.getDateSaisie());
taxetrimboissonClone.setLocale(localeService.clone(taxetrimboisson.getLocale()));
taxetrimboissonClone.setRedevable(redevableService.clone(taxetrimboisson.getRedevable()));
taxetrimboissonClone.setTauxBoisson(tauxboissonService.clone(taxetrimboisson.getTauxBoisson()));
taxetrimboissonClone.setTaxeAnnuelBoisson(taxeannuelboissonService.clone(taxetrimboisson.getTaxeAnnuelBoisson()));
}
}
public TaxeTrimBoisson clone(TaxeTrimBoisson taxetrimboisson){
if(taxetrimboisson== null){       return null ;
}else{TaxeTrimBoisson taxetrimboissonClone= new TaxeTrimBoisson();
 clone(taxetrimboisson,taxetrimboissonClone);
return taxetrimboissonClone;
}
}
public List<TaxeTrimBoisson> clone(List<TaxeTrimBoisson>taxetrimboissons){
if(taxetrimboissons== null){
       return null ;
}else{List<TaxeTrimBoisson> taxetrimboissonsClone = new ArrayList();
	 	 	 taxetrimboissons.forEach((taxetrimboisson)->{taxetrimboissonsClone.add(clone(taxetrimboisson));
});return taxetrimboissonsClone;
}
}
 @Override 
 public List< TaxeTrimBoisson>  findByCriteria(Long idMin,Long idMax,Integer numeroTrimMin,Integer numeroTrimMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax){
 return entityManager.createQuery(constructQuery(idMin,idMax,numeroTrimMin,numeroTrimMax,anneeMin,anneeMax,datePresentationMin,datePresentationMax,montantTotalMin,montantTotalMax,montantBaseMin,montantBaseMax,montantRetardMin,montantRetardMax,montantMajorationMin,montantMajorationMax,montantPenaliteMin,montantPenaliteMax,nomberMoisRetardMin,nomberMoisRetardMax,dateValidationMin,dateValidationMax,dateSoumissionMin,dateSoumissionMax,dateAffectationComptableMin,dateAffectationComptableMax,dateFinalisationMin,dateFinalisationMax,dateSaisieMin,dateSaisieMax)).getResultList(); 
 }
private String constructQuery(Long idMin,Long idMax,Integer numeroTrimMin,Integer numeroTrimMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax){
String query = "SELECT t FROM TaxeTrimBoisson t where 1=1 ";
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("t", "numeroTrim", numeroTrimMin, numeroTrimMax);
query += SearchUtil.addConstraintMinMax("t", "annee", anneeMin, anneeMax);
query += SearchUtil.addConstraintMinMaxDate("t"," datePresentation", datePresentationMin, datePresentationMax);
query += SearchUtil.addConstraintMinMax("t", "montantTotal", montantTotalMin, montantTotalMax);
query += SearchUtil.addConstraintMinMax("t", "montantBase", montantBaseMin, montantBaseMax);
query += SearchUtil.addConstraintMinMax("t", "montantRetard", montantRetardMin, montantRetardMax);
query += SearchUtil.addConstraintMinMax("t", "montantMajoration", montantMajorationMin, montantMajorationMax);
query += SearchUtil.addConstraintMinMax("t", "montantPenalite", montantPenaliteMin, montantPenaliteMax);
query += SearchUtil.addConstraintMinMax("t", "nomberMoisRetard", nomberMoisRetardMin, nomberMoisRetardMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateValidation", dateValidationMin, dateValidationMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateSoumission", dateSoumissionMin, dateSoumissionMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateAffectationComptable", dateAffectationComptableMin, dateAffectationComptableMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateFinalisation", dateFinalisationMin, dateFinalisationMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateSaisie", dateSaisieMin, dateSaisieMax);

  return query; 
}
}
