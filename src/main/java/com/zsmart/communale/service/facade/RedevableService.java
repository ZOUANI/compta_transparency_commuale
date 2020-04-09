package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.Redevable;
import com.zsmart.communale.bean.TypeRedevable; 
public interface RedevableService {

public Redevable save(Redevable redevable); 
public List<Redevable>  findAll();
public Redevable findById(Long id);
public int delete(Redevable redevable);
public void  deleteById(Long id);
public void clone(Redevable redevable,Redevable redevableClone);
public Redevable clone(Redevable redevable);
public List<Redevable> clone(List<Redevable>redevables);
 public List<Redevable>  findByCriteria(String libelle,String identifiant,String nom,String prenom,String description,String referenceSociete,Long idMin,Long idMax);

}
