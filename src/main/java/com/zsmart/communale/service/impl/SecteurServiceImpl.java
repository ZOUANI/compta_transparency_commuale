
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.SecteurService ; 
import com.zsmart.communale.dao.SecteurDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.Secteur;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class SecteurServiceImpl implements SecteurService  {


 @Autowired 

 private SecteurDao secteurDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public Secteur  save (Secteur secteur){

if(secteur== null){ 
 return null; 
}else {
 secteurDao.save(secteur);
return secteur;
}
}

 @Override 
public List< Secteur>  findAll(){
 return secteurDao.findAll();
}

 @Override 
public Secteur findById(Long id){
 return secteurDao.getOne(id);
}

 @Override 
public int delete(Secteur secteur){
if(secteur== null){ 
  return -1; 
}else {
 secteurDao.delete(secteur);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       secteurDao.deleteById(id);
}
public void clone(Secteur secteur,Secteur secteurClone){
if(secteur!= null && secteurClone != null){
secteurClone.setId(secteur.getId());
secteurClone.setLibelle(secteur.getLibelle());
secteurClone.setCode(secteur.getCode());
secteurClone.setCodeVille(secteur.getCodeVille());
}
}
public Secteur clone(Secteur secteur){
if(secteur== null){       return null ;
}else{Secteur secteurClone= new Secteur();
 clone(secteur,secteurClone);
return secteurClone;
}
}
public List<Secteur> clone(List<Secteur>secteurs){
if(secteurs== null){
       return null ;
}else{List<Secteur> secteursClone = new ArrayList();
	 	 	 secteurs.forEach((secteur)->{secteursClone.add(clone(secteur));
});return secteursClone;
}
}
 @Override 
 public List< Secteur>  findByCriteria(String libelle,String code,String codeVille,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,code,codeVille,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String code,String codeVille,Long idMin,Long idMax){
String query = "SELECT s FROM Secteur s where 1=1 ";
query += SearchUtil.addConstraint( "s", "libelle","=",libelle);
query += SearchUtil.addConstraint( "s", "code","=",code);
query += SearchUtil.addConstraint( "s", "codeVille","=",codeVille);
query += SearchUtil.addConstraintMinMax("s", "id", idMin, idMax);

  return query; 
}
}
