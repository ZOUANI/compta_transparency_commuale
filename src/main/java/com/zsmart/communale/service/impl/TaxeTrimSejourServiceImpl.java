
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.TaxeTrimSejourService ; 
import com.zsmart.communale.dao.TaxeTrimSejourDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.TaxeTrimSejour;
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
import com.zsmart.communale.bean.TauxSejour; 
import com.zsmart.communale.service.facade.TauxSejourService ; 
import com.zsmart.communale.bean.TaxeAnnuelSejour; 
import com.zsmart.communale.service.facade.TaxeAnnuelSejourService ; 

 @Service  

 public class TaxeTrimSejourServiceImpl implements TaxeTrimSejourService  {


 @Autowired 

 private TaxeTrimSejourDao taxetrimsejourDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private LocaleService localeService; 

 @Autowired 

 private RedevableService redevableService; 

 @Autowired 

 private TauxSejourService tauxsejourService; 

 @Autowired 

 private TaxeAnnuelSejourService taxeannuelsejourService; 

 @Override 
public TaxeTrimSejour  save (TaxeTrimSejour taxetrimsejour){

if(taxetrimsejour== null){ 
 return null; 
}else {
 taxetrimsejourDao.save(taxetrimsejour);
return taxetrimsejour;
}
}

 @Override 
public List< TaxeTrimSejour>  findAll(){
 return taxetrimsejourDao.findAll();
}

 @Override 
public TaxeTrimSejour findById(Long id){
 return taxetrimsejourDao.getOne(id);
}

 @Override 
public int delete(TaxeTrimSejour taxetrimsejour){
if(taxetrimsejour== null){ 
  return -1; 
}else {
 taxetrimsejourDao.delete(taxetrimsejour);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       taxetrimsejourDao.deleteById(id);
}
public void clone(TaxeTrimSejour taxetrimsejour,TaxeTrimSejour taxetrimsejourClone){
if(taxetrimsejour!= null && taxetrimsejourClone != null){
taxetrimsejourClone.setId(taxetrimsejour.getId());
taxetrimsejourClone.setNombreNuitees(taxetrimsejour.getNombreNuitees());
taxetrimsejourClone.setNombreClient(taxetrimsejour.getNombreClient());
taxetrimsejourClone.setNumeroTrim(taxetrimsejour.getNumeroTrim());
taxetrimsejourClone.setAnnee(taxetrimsejour.getAnnee());
taxetrimsejourClone.setDatePresentation(taxetrimsejour.getDatePresentation());
taxetrimsejourClone.setMontantTotal(taxetrimsejour.getMontantTotal());
taxetrimsejourClone.setMontantBase(taxetrimsejour.getMontantBase());
taxetrimsejourClone.setMontantRetard(taxetrimsejour.getMontantRetard());
taxetrimsejourClone.setMontantMajoration(taxetrimsejour.getMontantMajoration());
taxetrimsejourClone.setMontantPenalite(taxetrimsejour.getMontantPenalite());
taxetrimsejourClone.setNomberMoisRetard(taxetrimsejour.getNomberMoisRetard());
taxetrimsejourClone.setDateValidation(taxetrimsejour.getDateValidation());
taxetrimsejourClone.setDatePaiement(taxetrimsejour.getDatePaiement());
taxetrimsejourClone.setDateSoumission(taxetrimsejour.getDateSoumission());
taxetrimsejourClone.setDateAffectationComptable(taxetrimsejour.getDateAffectationComptable());
taxetrimsejourClone.setDateFinalisation(taxetrimsejour.getDateFinalisation());
taxetrimsejourClone.setDateSaisie(taxetrimsejour.getDateSaisie());
taxetrimsejourClone.setLocale(localeService.clone(taxetrimsejour.getLocale()));
taxetrimsejourClone.setRedevable(redevableService.clone(taxetrimsejour.getRedevable()));
taxetrimsejourClone.setTauxSejour(tauxsejourService.clone(taxetrimsejour.getTauxSejour()));
taxetrimsejourClone.setTaxeAnnuelSejour(taxeannuelsejourService.clone(taxetrimsejour.getTaxeAnnuelSejour()));
}
}
public TaxeTrimSejour clone(TaxeTrimSejour taxetrimsejour){
if(taxetrimsejour== null){       return null ;
}else{TaxeTrimSejour taxetrimsejourClone= new TaxeTrimSejour();
 clone(taxetrimsejour,taxetrimsejourClone);
return taxetrimsejourClone;
}
}
public List<TaxeTrimSejour> clone(List<TaxeTrimSejour>taxetrimsejours){
if(taxetrimsejours== null){
       return null ;
}else{List<TaxeTrimSejour> taxetrimsejoursClone = new ArrayList();
	 	 	 taxetrimsejours.forEach((taxetrimsejour)->{taxetrimsejoursClone.add(clone(taxetrimsejour));
});return taxetrimsejoursClone;
}
}
 @Override 
 public List< TaxeTrimSejour>  findByCriteria(String nombreNuitees,String nombreClient,Long idMin,Long idMax,Integer numeroTrimMin,Integer numeroTrimMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date datePaiementMin,Date datePaiementMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax){
 return entityManager.createQuery(constructQuery(nombreNuitees,nombreClient,idMin,idMax,numeroTrimMin,numeroTrimMax,anneeMin,anneeMax,datePresentationMin,datePresentationMax,montantTotalMin,montantTotalMax,montantBaseMin,montantBaseMax,montantRetardMin,montantRetardMax,montantMajorationMin,montantMajorationMax,montantPenaliteMin,montantPenaliteMax,nomberMoisRetardMin,nomberMoisRetardMax,dateValidationMin,dateValidationMax,datePaiementMin,datePaiementMax,dateSoumissionMin,dateSoumissionMax,dateAffectationComptableMin,dateAffectationComptableMax,dateFinalisationMin,dateFinalisationMax,dateSaisieMin,dateSaisieMax)).getResultList(); 
 }
private String constructQuery(String nombreNuitees,String nombreClient,Long idMin,Long idMax,Integer numeroTrimMin,Integer numeroTrimMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date datePaiementMin,Date datePaiementMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax){
String query = "SELECT t FROM TaxeTrimSejour t where 1=1 ";
query += SearchUtil.addConstraint( "t", "nombreNuitees","=",nombreNuitees);
query += SearchUtil.addConstraint( "t", "nombreClient","=",nombreClient);
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
query += SearchUtil.addConstraintMinMaxDate("t"," datePaiement", datePaiementMin, datePaiementMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateSoumission", dateSoumissionMin, dateSoumissionMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateAffectationComptable", dateAffectationComptableMin, dateAffectationComptableMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateFinalisation", dateFinalisationMin, dateFinalisationMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateSaisie", dateSaisieMin, dateSaisieMax);

  return query; 
}
}
