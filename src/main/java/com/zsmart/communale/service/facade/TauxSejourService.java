package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.TauxSejour;
import com.zsmart.communale.bean.CategorieSejour; 
public interface TauxSejourService {

public TauxSejour save(TauxSejour tauxsejour); 
public List<TauxSejour>  findAll();
public TauxSejour findById(Long id);
public int delete(TauxSejour tauxsejour);
public void  deleteById(Long id);
public void clone(TauxSejour tauxsejour,TauxSejour tauxsejourClone);
public TauxSejour clone(TauxSejour tauxsejour);
public List<TauxSejour> clone(List<TauxSejour>tauxsejours);
 public List<TauxSejour>  findByCriteria(Long idMin,Long idMax,BigDecimal montantParNuiteMin,BigDecimal montantParNuiteMax,BigDecimal majorationTrimMin,BigDecimal majorationTrimMax,BigDecimal penaliteTrimMin,BigDecimal penaliteTrimMax,BigDecimal majorationAnnuelleMin,BigDecimal majorationAnnuelleMax,BigDecimal penaliteAnnuelleMin,BigDecimal penaliteAnnuelleMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax);

}
