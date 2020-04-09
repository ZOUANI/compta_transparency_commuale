
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.QuartierService ; 
import com.zsmart.communale.dao.QuartierDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.Quartier;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.communale.bean.Secteur; 
import com.zsmart.communale.service.facade.SecteurService ; 
import com.zsmart.communale.service.facade.RueService ; 
import com.zsmart.communale.bean.Rue ; 

 @Service  

 public class QuartierServiceImpl implements QuartierService  {


 @Autowired 

 private QuartierDao quartierDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private RueService rueService; 

 @Autowired 

 private SecteurService secteurService; 

 @Override 
public Quartier  save (Quartier quartier){

if(quartier== null){ 
 return null; 
}else {
 quartierDao.save(quartier);
return quartier;
}
}

 @Override 
public Quartier  saveWithRues (Quartier quartier){

if(quartier== null){ 
        return null; 
}else {
   if(quartier.getRues().isEmpty()){
            return null;
        }else{
quartierDao.save(quartier);
            for (Rue rue : quartier.getRues()) {
rue.setQuartier(quartier);
 rueService.save(  rue);          
            }
return quartier;
}
}
            }

 @Override 
public List< Quartier>  findAll(){
 return quartierDao.findAll();
}

 @Override 
public Quartier findById(Long id){
 return quartierDao.getOne(id);
}

 @Override 
public int delete(Quartier quartier){
if(quartier== null){ 
  return -1; 
}else {
 quartierDao.delete(quartier);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       quartierDao.deleteById(id);
}
public void clone(Quartier quartier,Quartier quartierClone){
if(quartier!= null && quartierClone != null){
quartierClone.setId(quartier.getId());
quartierClone.setLibelle(quartier.getLibelle());
quartierClone.setCode(quartier.getCode());
quartierClone.setSecteur(secteurService.clone(quartier.getSecteur()));
quartierClone.setRues(rueService.clone(quartier.getRues()));
}
}
public Quartier clone(Quartier quartier){
if(quartier== null){       return null ;
}else{Quartier quartierClone= new Quartier();
 clone(quartier,quartierClone);
return quartierClone;
}
}
public List<Quartier> clone(List<Quartier>quartiers){
if(quartiers== null){
       return null ;
}else{List<Quartier> quartiersClone = new ArrayList();
	 	 	 quartiers.forEach((quartier)->{quartiersClone.add(clone(quartier));
});return quartiersClone;
}
}
 @Override 
 public List< Quartier>  findByCriteria(String libelle,String code,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,code,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String code,Long idMin,Long idMax){
String query = "SELECT q FROM Quartier q where 1=1 ";
query += SearchUtil.addConstraint( "q", "libelle","=",libelle);
query += SearchUtil.addConstraint( "q", "code","=",code);
query += SearchUtil.addConstraintMinMax("q", "id", idMin, idMax);

  return query; 
}
}
