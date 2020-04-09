
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.CategorieBoissonService ; 
import com.zsmart.communale.dao.CategorieBoissonDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.CategorieBoisson;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class CategorieBoissonServiceImpl implements CategorieBoissonService  {


 @Autowired 

 private CategorieBoissonDao categorieboissonDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public CategorieBoisson  save (CategorieBoisson categorieboisson){

if(categorieboisson== null){ 
 return null; 
}else {
 categorieboissonDao.save(categorieboisson);
return categorieboisson;
}
}

 @Override 
public List< CategorieBoisson>  findAll(){
 return categorieboissonDao.findAll();
}

 @Override 
public CategorieBoisson findById(Long id){
 return categorieboissonDao.getOne(id);
}

 @Override 
public CategorieBoisson  findByReference(String  reference){
 return categorieboissonDao.findByReference(reference);
}

 @Override 
public int delete(CategorieBoisson categorieboisson){
if(categorieboisson== null){ 
  return -1; 
}else {
 categorieboissonDao.delete(categorieboisson);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       categorieboissonDao.deleteById(id);
}

 @Override 
public void  deleteByReference(String  reference){
  categorieboissonDao.deleteByReference(reference);
}
public void clone(CategorieBoisson categorieboisson,CategorieBoisson categorieboissonClone){
if(categorieboisson!= null && categorieboissonClone != null){
categorieboissonClone.setId(categorieboisson.getId());
categorieboissonClone.setLibelle(categorieboisson.getLibelle());
categorieboissonClone.setReference(categorieboisson.getReference());
}
}
public CategorieBoisson clone(CategorieBoisson categorieboisson){
if(categorieboisson== null){       return null ;
}else{CategorieBoisson categorieboissonClone= new CategorieBoisson();
 clone(categorieboisson,categorieboissonClone);
return categorieboissonClone;
}
}
public List<CategorieBoisson> clone(List<CategorieBoisson>categorieboissons){
if(categorieboissons== null){
       return null ;
}else{List<CategorieBoisson> categorieboissonsClone = new ArrayList();
	 	 	 categorieboissons.forEach((categorieboisson)->{categorieboissonsClone.add(clone(categorieboisson));
});return categorieboissonsClone;
}
}
 @Override 
 public List< CategorieBoisson>  findByCriteria(String libelle,String reference,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,reference,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String reference,Long idMin,Long idMax){
String query = "SELECT c FROM CategorieBoisson c where 1=1 ";
query += SearchUtil.addConstraint( "c", "libelle","=",libelle);
query += SearchUtil.addConstraint( "c", "reference","=",reference);
query += SearchUtil.addConstraintMinMax("c", "id", idMin, idMax);

  return query; 
}
}
