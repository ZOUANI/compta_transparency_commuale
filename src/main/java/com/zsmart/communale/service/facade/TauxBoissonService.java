package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.TauxBoisson;
import com.zsmart.communale.bean.CategorieBoisson; 
public interface TauxBoissonService {

public TauxBoisson save(TauxBoisson tauxboisson); 
public List<TauxBoisson>  findAll();
public TauxBoisson findById(Long id);
public int delete(TauxBoisson tauxboisson);
public void  deleteById(Long id);
public void clone(TauxBoisson tauxboisson,TauxBoisson tauxboissonClone);
public TauxBoisson clone(TauxBoisson tauxboisson);
public List<TauxBoisson> clone(List<TauxBoisson>tauxboissons);
 public List<TauxBoisson>  findByCriteria(Long idMin,Long idMax,BigDecimal montantParNuiteMin,BigDecimal montantParNuiteMax,BigDecimal majorationTrimMin,BigDecimal majorationTrimMax,BigDecimal penaliteTrimMin,BigDecimal penaliteTrimMax,BigDecimal majorationAnnuelleMin,BigDecimal majorationAnnuelleMax,BigDecimal penaliteAnnuelleMin,BigDecimal penaliteAnnuelleMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax);

}
