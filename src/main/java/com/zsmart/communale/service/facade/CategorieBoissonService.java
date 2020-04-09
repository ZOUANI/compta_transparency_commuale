package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.CategorieBoisson;
public interface CategorieBoissonService {

public CategorieBoisson save(CategorieBoisson categorieboisson); 
public List<CategorieBoisson>  findAll();
public CategorieBoisson findById(Long id);
public CategorieBoisson  findByReference(String  reference);
public int delete(CategorieBoisson categorieboisson);
public void  deleteById(Long id);
public void  deleteByReference(String  reference);
public void clone(CategorieBoisson categorieboisson,CategorieBoisson categorieboissonClone);
public CategorieBoisson clone(CategorieBoisson categorieboisson);
public List<CategorieBoisson> clone(List<CategorieBoisson>categorieboissons);
 public List<CategorieBoisson>  findByCriteria(String libelle,String reference,Long idMin,Long idMax);

}
