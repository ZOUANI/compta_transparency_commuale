
package com.zsmart.communale.service.impl ;
import com.zsmart.communale.service.facade.TypeRedevableService ; 
import com.zsmart.communale.dao.TypeRedevableDao ;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.TypeRedevable;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class TypeRedevableServiceImpl implements TypeRedevableService  {


 @Autowired 

 private TypeRedevableDao typeredevableDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public TypeRedevable  save (TypeRedevable typeredevable){

if(typeredevable== null){ 
 return null; 
}else {
 typeredevableDao.save(typeredevable);
return typeredevable;
}
}

 @Override 
public List< TypeRedevable>  findAll(){
 return typeredevableDao.findAll();
}

 @Override 
public TypeRedevable findById(Long id){
 return typeredevableDao.getOne(id);
}

 @Override 
public TypeRedevable  findByReference(String  reference){
 return typeredevableDao.findByReference(reference);
}

 @Override 
public int delete(TypeRedevable typeredevable){
if(typeredevable== null){ 
  return -1; 
}else {
 typeredevableDao.delete(typeredevable);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       typeredevableDao.deleteById(id);
}

 @Override 
public void  deleteByReference(String  reference){
  typeredevableDao.deleteByReference(reference);
}
public void clone(TypeRedevable typeredevable,TypeRedevable typeredevableClone){
if(typeredevable!= null && typeredevableClone != null){
typeredevableClone.setId(typeredevable.getId());
typeredevableClone.setLibelle(typeredevable.getLibelle());
typeredevableClone.setReference(typeredevable.getReference());
}
}
public TypeRedevable clone(TypeRedevable typeredevable){
if(typeredevable== null){       return null ;
}else{TypeRedevable typeredevableClone= new TypeRedevable();
 clone(typeredevable,typeredevableClone);
return typeredevableClone;
}
}
public List<TypeRedevable> clone(List<TypeRedevable>typeredevables){
if(typeredevables== null){
       return null ;
}else{List<TypeRedevable> typeredevablesClone = new ArrayList();
	 	 	 typeredevables.forEach((typeredevable)->{typeredevablesClone.add(clone(typeredevable));
});return typeredevablesClone;
}
}
 @Override 
 public List< TypeRedevable>  findByCriteria(String libelle,String reference,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,reference,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String reference,Long idMin,Long idMax){
String query = "SELECT t FROM TypeRedevable t where 1=1 ";
query += SearchUtil.addConstraint( "t", "libelle","=",libelle);
query += SearchUtil.addConstraint( "t", "reference","=",reference);
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);

  return query; 
}
}
