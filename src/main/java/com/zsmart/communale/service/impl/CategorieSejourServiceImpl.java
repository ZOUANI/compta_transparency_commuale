
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.CategorieSejourService ; 
import com.zsmart.communale.dao.CategorieSejourDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.CategorieSejour;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class CategorieSejourServiceImpl implements CategorieSejourService  {


 @Autowired 

 private CategorieSejourDao categoriesejourDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public CategorieSejour  save (CategorieSejour categoriesejour){

if(categoriesejour== null){ 
 return null; 
}else {
 categoriesejourDao.save(categoriesejour);
return categoriesejour;
}
}

 @Override 
public List< CategorieSejour>  findAll(){
 return categoriesejourDao.findAll();
}

 @Override 
public CategorieSejour findById(Long id){
 return categoriesejourDao.getOne(id);
}

 @Override 
public CategorieSejour  findByReference(String  reference){
 return categoriesejourDao.findByReference(reference);
}

 @Override 
public int delete(CategorieSejour categoriesejour){
if(categoriesejour== null){ 
  return -1; 
}else {
 categoriesejourDao.delete(categoriesejour);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       categoriesejourDao.deleteById(id);
}

 @Override 
public void  deleteByReference(String  reference){
  categoriesejourDao.deleteByReference(reference);
}
public void clone(CategorieSejour categoriesejour,CategorieSejour categoriesejourClone){
if(categoriesejour!= null && categoriesejourClone != null){
categoriesejourClone.setId(categoriesejour.getId());
categoriesejourClone.setLibelle(categoriesejour.getLibelle());
categoriesejourClone.setReference(categoriesejour.getReference());
}
}
public CategorieSejour clone(CategorieSejour categoriesejour){
if(categoriesejour== null){       return null ;
}else{CategorieSejour categoriesejourClone= new CategorieSejour();
 clone(categoriesejour,categoriesejourClone);
return categoriesejourClone;
}
}
public List<CategorieSejour> clone(List<CategorieSejour>categoriesejours){
if(categoriesejours== null){
       return null ;
}else{List<CategorieSejour> categoriesejoursClone = new ArrayList();
	 	 	 categoriesejours.forEach((categoriesejour)->{categoriesejoursClone.add(clone(categoriesejour));
});return categoriesejoursClone;
}
}
 @Override 
 public List< CategorieSejour>  findByCriteria(String libelle,String reference,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,reference,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String reference,Long idMin,Long idMax){
String query = "SELECT c FROM CategorieSejour c where 1=1 ";
query += SearchUtil.addConstraint( "c", "libelle","=",libelle);
query += SearchUtil.addConstraint( "c", "reference","=",reference);
query += SearchUtil.addConstraintMinMax("c", "id", idMin, idMax);

  return query; 
}
}
