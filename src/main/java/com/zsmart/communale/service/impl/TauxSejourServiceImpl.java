
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.TauxSejourService ; 
import com.zsmart.communale.dao.TauxSejourDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.TauxSejour;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.communale.bean.CategorieSejour; 
import com.zsmart.communale.service.facade.CategorieSejourService ; 

 @Service  

 public class TauxSejourServiceImpl implements TauxSejourService  {


 @Autowired 

 private TauxSejourDao tauxsejourDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private CategorieSejourService categoriesejourService; 

 @Override 
public TauxSejour  save (TauxSejour tauxsejour){

if(tauxsejour== null){ 
 return null; 
}else {
 tauxsejourDao.save(tauxsejour);
return tauxsejour;
}
}

 @Override 
public List< TauxSejour>  findAll(){
 return tauxsejourDao.findAll();
}

 @Override 
public TauxSejour findById(Long id){
 return tauxsejourDao.getOne(id);
}

 @Override 
public int delete(TauxSejour tauxsejour){
if(tauxsejour== null){ 
  return -1; 
}else {
 tauxsejourDao.delete(tauxsejour);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       tauxsejourDao.deleteById(id);
}
public void clone(TauxSejour tauxsejour,TauxSejour tauxsejourClone){
if(tauxsejour!= null && tauxsejourClone != null){
tauxsejourClone.setId(tauxsejour.getId());
tauxsejourClone.setMontantParNuite(tauxsejour.getMontantParNuite());
tauxsejourClone.setMajorationTrim(tauxsejour.getMajorationTrim());
tauxsejourClone.setPenaliteTrim(tauxsejour.getPenaliteTrim());
tauxsejourClone.setMajorationAnnuelle(tauxsejour.getMajorationAnnuelle());
tauxsejourClone.setPenaliteAnnuelle(tauxsejour.getPenaliteAnnuelle());
tauxsejourClone.setDateApplicationDebut(tauxsejour.getDateApplicationDebut());
tauxsejourClone.setDateApplicationFin(tauxsejour.getDateApplicationFin());
tauxsejourClone.setCategorieSejour(categoriesejourService.clone(tauxsejour.getCategorieSejour()));
}
}
public TauxSejour clone(TauxSejour tauxsejour){
if(tauxsejour== null){       return null ;
}else{TauxSejour tauxsejourClone= new TauxSejour();
 clone(tauxsejour,tauxsejourClone);
return tauxsejourClone;
}
}
public List<TauxSejour> clone(List<TauxSejour>tauxsejours){
if(tauxsejours== null){
       return null ;
}else{List<TauxSejour> tauxsejoursClone = new ArrayList();
	 	 	 tauxsejours.forEach((tauxsejour)->{tauxsejoursClone.add(clone(tauxsejour));
});return tauxsejoursClone;
}
}
 @Override 
 public List< TauxSejour>  findByCriteria(Long idMin,Long idMax,BigDecimal montantParNuiteMin,BigDecimal montantParNuiteMax,BigDecimal majorationTrimMin,BigDecimal majorationTrimMax,BigDecimal penaliteTrimMin,BigDecimal penaliteTrimMax,BigDecimal majorationAnnuelleMin,BigDecimal majorationAnnuelleMax,BigDecimal penaliteAnnuelleMin,BigDecimal penaliteAnnuelleMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax){
 return entityManager.createQuery(constructQuery(idMin,idMax,montantParNuiteMin,montantParNuiteMax,majorationTrimMin,majorationTrimMax,penaliteTrimMin,penaliteTrimMax,majorationAnnuelleMin,majorationAnnuelleMax,penaliteAnnuelleMin,penaliteAnnuelleMax,dateApplicationDebutMin,dateApplicationDebutMax,dateApplicationFinMin,dateApplicationFinMax)).getResultList(); 
 }
private String constructQuery(Long idMin,Long idMax,BigDecimal montantParNuiteMin,BigDecimal montantParNuiteMax,BigDecimal majorationTrimMin,BigDecimal majorationTrimMax,BigDecimal penaliteTrimMin,BigDecimal penaliteTrimMax,BigDecimal majorationAnnuelleMin,BigDecimal majorationAnnuelleMax,BigDecimal penaliteAnnuelleMin,BigDecimal penaliteAnnuelleMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax){
String query = "SELECT t FROM TauxSejour t where 1=1 ";
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("t", "montantParNuite", montantParNuiteMin, montantParNuiteMax);
query += SearchUtil.addConstraintMinMax("t", "majorationTrim", majorationTrimMin, majorationTrimMax);
query += SearchUtil.addConstraintMinMax("t", "penaliteTrim", penaliteTrimMin, penaliteTrimMax);
query += SearchUtil.addConstraintMinMax("t", "majorationAnnuelle", majorationAnnuelleMin, majorationAnnuelleMax);
query += SearchUtil.addConstraintMinMax("t", "penaliteAnnuelle", penaliteAnnuelleMin, penaliteAnnuelleMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateApplicationDebut", dateApplicationDebutMin, dateApplicationDebutMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateApplicationFin", dateApplicationFinMin, dateApplicationFinMax);

  return query; 
}
}
