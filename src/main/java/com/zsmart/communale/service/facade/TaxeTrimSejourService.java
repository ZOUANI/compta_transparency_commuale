package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.TaxeTrimSejour;
import com.zsmart.communale.bean.Locale; 
import com.zsmart.communale.bean.Redevable; 
import com.zsmart.communale.bean.TauxSejour; 
import com.zsmart.communale.bean.TaxeAnnuelSejour; 
public interface TaxeTrimSejourService {

public TaxeTrimSejour save(TaxeTrimSejour taxetrimsejour); 
public List<TaxeTrimSejour>  findAll();
public TaxeTrimSejour findById(Long id);
public int delete(TaxeTrimSejour taxetrimsejour);
public void  deleteById(Long id);
public void clone(TaxeTrimSejour taxetrimsejour,TaxeTrimSejour taxetrimsejourClone);
public TaxeTrimSejour clone(TaxeTrimSejour taxetrimsejour);
public List<TaxeTrimSejour> clone(List<TaxeTrimSejour>taxetrimsejours);
 public List<TaxeTrimSejour>  findByCriteria(String nombreNuitees,String nombreClient,Long idMin,Long idMax,Integer numeroTrimMin,Integer numeroTrimMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date datePaiementMin,Date datePaiementMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax);

}
