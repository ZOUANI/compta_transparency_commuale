package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.CategorieSejour;
public interface CategorieSejourService {

public CategorieSejour save(CategorieSejour categoriesejour); 
public List<CategorieSejour>  findAll();
public CategorieSejour findById(Long id);
public CategorieSejour  findByReference(String  reference);
public int delete(CategorieSejour categoriesejour);
public void  deleteById(Long id);
public void  deleteByReference(String  reference);
public void clone(CategorieSejour categoriesejour,CategorieSejour categoriesejourClone);
public CategorieSejour clone(CategorieSejour categoriesejour);
public List<CategorieSejour> clone(List<CategorieSejour>categoriesejours);
 public List<CategorieSejour>  findByCriteria(String libelle,String reference,Long idMin,Long idMax);

}
