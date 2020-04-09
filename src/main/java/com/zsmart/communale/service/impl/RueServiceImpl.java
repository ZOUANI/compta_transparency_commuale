
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.RueService ; 
import com.zsmart.communale.dao.RueDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.Rue;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.communale.bean.Quartier; 
import com.zsmart.communale.service.facade.QuartierService ; 

 @Service  

 public class RueServiceImpl implements RueService  {


 @Autowired 

 private RueDao rueDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private QuartierService quartierService; 

 @Override 
public Rue  save (Rue rue){

if(rue== null){ 
 return null; 
}else {
 rueDao.save(rue);
return rue;
}
}

 @Override 
public List< Rue>  findAll(){
 return rueDao.findAll();
}

 @Override 
public Rue findById(Long id){
 return rueDao.getOne(id);
}

 @Override 
public int delete(Rue rue){
if(rue== null){ 
  return -1; 
}else {
 rueDao.delete(rue);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       rueDao.deleteById(id);
}
public void clone(Rue rue,Rue rueClone){
if(rue!= null && rueClone != null){
rueClone.setId(rue.getId());
rueClone.setLibelle(rue.getLibelle());
rueClone.setCode(rue.getCode());
rueClone.setQuartier(quartierService.clone(rue.getQuartier()));
}
}
public Rue clone(Rue rue){
if(rue== null){       return null ;
}else{Rue rueClone= new Rue();
 clone(rue,rueClone);
return rueClone;
}
}
public List<Rue> clone(List<Rue>rues){
if(rues== null){
       return null ;
}else{List<Rue> ruesClone = new ArrayList();
	 	 	 rues.forEach((rue)->{ruesClone.add(clone(rue));
});return ruesClone;
}
}
 @Override 
 public List< Rue>  findByCriteria(String libelle,String code,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,code,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String code,Long idMin,Long idMax){
String query = "SELECT r FROM Rue r where 1=1 ";
query += SearchUtil.addConstraint( "r", "libelle","=",libelle);
query += SearchUtil.addConstraint( "r", "code","=",code);
query += SearchUtil.addConstraintMinMax("r", "id", idMin, idMax);

  return query; 
}
}
