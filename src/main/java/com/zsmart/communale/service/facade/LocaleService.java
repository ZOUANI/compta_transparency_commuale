package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.Locale;
import com.zsmart.communale.bean.Rue; 
import com.zsmart.communale.bean.Redevable; 
import com.zsmart.communale.bean.CategorieSejour; 
import com.zsmart.communale.bean.CategorieBoisson; 
public interface LocaleService {

public Locale save(Locale locale); 
public List<Locale>  findAll();
public Locale findById(Long id);
public Locale  findByReference(String  reference);
public int delete(Locale locale);
public void  deleteById(Long id);
public void  deleteByReference(String  reference);
public void clone(Locale locale,Locale localeClone);
public Locale clone(Locale locale);
public List<Locale> clone(List<Locale>locales);
 public List<Locale>  findByCriteria(String reference,Long idMin,Long idMax,Integer dernierTrimBoissonPayeMin,Integer dernierTrimBoissonPayeMax,Integer dernierAnneeBoissonPayeMin,Integer dernierAnneeBoissonPayeMax,Integer dernierAnneeBoissonDeclareMin,Integer dernierAnneeBoissonDeclareMax,Integer dernierTrimSejourPayeMin,Integer dernierTrimSejourPayeMax,Integer dernierAnneeSejourPayeMin,Integer dernierAnneeSejourPayeMax,Integer dernierAnneeSejourDeclareMin,Integer dernierAnneeSejourDeclareMax);

}
