
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.RedevableService ; 
import com.zsmart.communale.dao.RedevableDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.Redevable;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.communale.bean.TypeRedevable; 
import com.zsmart.communale.service.facade.TypeRedevableService ; 

 @Service  

 public class RedevableServiceImpl implements RedevableService  {


 @Autowired 

 private RedevableDao redevableDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private TypeRedevableService typeredevableService; 

 @Override 
public Redevable  save (Redevable redevable){

if(redevable== null){ 
 return null; 
}else {
 redevableDao.save(redevable);
return redevable;
}
}

 @Override 
public List< Redevable>  findAll(){
 return redevableDao.findAll();
}

 @Override 
public Redevable findById(Long id){
 return redevableDao.getOne(id);
}

 @Override 
public int delete(Redevable redevable){
if(redevable== null){ 
  return -1; 
}else {
 redevableDao.delete(redevable);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       redevableDao.deleteById(id);
}
public void clone(Redevable redevable,Redevable redevableClone){
if(redevable!= null && redevableClone != null){
redevableClone.setId(redevable.getId());
redevableClone.setLibelle(redevable.getLibelle());
redevableClone.setIdentifiant(redevable.getIdentifiant());
redevableClone.setNom(redevable.getNom());
redevableClone.setPrenom(redevable.getPrenom());
redevableClone.setDescription(redevable.getDescription());
redevableClone.setReferenceSociete(redevable.getReferenceSociete());
redevableClone.setTypeRedevable(typeredevableService.clone(redevable.getTypeRedevable()));
}
}
public Redevable clone(Redevable redevable){
if(redevable== null){       return null ;
}else{Redevable redevableClone= new Redevable();
 clone(redevable,redevableClone);
return redevableClone;
}
}
public List<Redevable> clone(List<Redevable>redevables){
if(redevables== null){
       return null ;
}else{List<Redevable> redevablesClone = new ArrayList();
	 	 	 redevables.forEach((redevable)->{redevablesClone.add(clone(redevable));
});return redevablesClone;
}
}
 @Override 
 public List< Redevable>  findByCriteria(String libelle,String identifiant,String nom,String prenom,String description,String referenceSociete,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,identifiant,nom,prenom,description,referenceSociete,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String identifiant,String nom,String prenom,String description,String referenceSociete,Long idMin,Long idMax){
String query = "SELECT r FROM Redevable r where 1=1 ";
query += SearchUtil.addConstraint( "r", "libelle","=",libelle);
query += SearchUtil.addConstraint( "r", "identifiant","=",identifiant);
query += SearchUtil.addConstraint( "r", "nom","=",nom);
query += SearchUtil.addConstraint( "r", "prenom","=",prenom);
query += SearchUtil.addConstraint( "r", "description","=",description);
query += SearchUtil.addConstraint( "r", "referenceSociete","=",referenceSociete);
query += SearchUtil.addConstraintMinMax("r", "id", idMin, idMax);

  return query; 
}
}
