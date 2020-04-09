package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.TaxeTrimBoisson;
import com.zsmart.communale.bean.Locale; 
import com.zsmart.communale.bean.Redevable; 
import com.zsmart.communale.bean.TauxBoisson; 
import com.zsmart.communale.bean.TaxeAnnuelBoisson; 
public interface TaxeTrimBoissonService {

public TaxeTrimBoisson save(TaxeTrimBoisson taxetrimboisson); 
public List<TaxeTrimBoisson>  findAll();
public TaxeTrimBoisson findById(Long id);
public int delete(TaxeTrimBoisson taxetrimboisson);
public void  deleteById(Long id);
public void clone(TaxeTrimBoisson taxetrimboisson,TaxeTrimBoisson taxetrimboissonClone);
public TaxeTrimBoisson clone(TaxeTrimBoisson taxetrimboisson);
public List<TaxeTrimBoisson> clone(List<TaxeTrimBoisson>taxetrimboissons);
 public List<TaxeTrimBoisson>  findByCriteria(Long idMin,Long idMax,Integer numeroTrimMin,Integer numeroTrimMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax);

}
