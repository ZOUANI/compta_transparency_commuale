package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.TaxeTrimBoisson; 
import com.zsmart.communale.ws.rest.vo.TaxeTrimBoissonVo; 

 @Component 
public class TaxeTrimBoissonConverter extends AbstractConverter<TaxeTrimBoisson,TaxeTrimBoissonVo>{ 

private boolean locale; 

 @Autowired
 private LocaleConverter localeConverter ; 
private boolean redevable; 

 @Autowired
 private RedevableConverter redevableConverter ; 
private boolean tauxBoisson; 

 @Autowired
 private TauxBoissonConverter tauxBoissonConverter ; 
private boolean taxeAnnuelBoisson; 

 @Autowired
 private TaxeAnnuelBoissonConverter taxeAnnuelBoissonConverter ; 

 @Override 
 public TaxeTrimBoisson toItem(TaxeTrimBoissonVo vo) {
 if (vo == null) {
    return null;
      } else {
TaxeTrimBoisson item = new TaxeTrimBoisson();

 if(locale&& vo.getLocaleVo() != null) {
 item.setLocale(localeConverter.toItem(vo.getLocaleVo()));
} 
 
 if(redevable&& vo.getRedevableVo() != null) {
 item.setRedevable(redevableConverter.toItem(vo.getRedevableVo()));
} 
 
 if(tauxBoisson&& vo.getTauxBoissonVo() != null) {
 item.setTauxBoisson(tauxBoissonConverter.toItem(vo.getTauxBoissonVo()));
} 
 
 if(taxeAnnuelBoisson&& vo.getTaxeAnnuelBoissonVo() != null) {
 item.setTaxeAnnuelBoisson(taxeAnnuelBoissonConverter.toItem(vo.getTaxeAnnuelBoissonVo()));
} 
 
 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getNumeroTrim() != null) {
 item.setNumeroTrim(NumberUtil.toInt(vo.getNumeroTrim()));
} 

 if (vo.getAnnee() != null) {
 item.setAnnee(NumberUtil.toInt(vo.getAnnee()));
} 

 if (vo.getDatePresentation() != null) {
 item.setDatePresentation(DateUtil.parse(vo.getDatePresentation()));
} 

 if (vo.getMontantTotal() != null) {
 item.setMontantTotal(NumberUtil.toBigDecimal(vo.getMontantTotal()));
} 

 if (vo.getMontantBase() != null) {
 item.setMontantBase(NumberUtil.toBigDecimal(vo.getMontantBase()));
} 

 if (vo.getMontantRetard() != null) {
 item.setMontantRetard(NumberUtil.toBigDecimal(vo.getMontantRetard()));
} 

 if (vo.getMontantMajoration() != null) {
 item.setMontantMajoration(NumberUtil.toBigDecimal(vo.getMontantMajoration()));
} 

 if (vo.getMontantPenalite() != null) {
 item.setMontantPenalite(NumberUtil.toBigDecimal(vo.getMontantPenalite()));
} 

 if (vo.getNomberMoisRetard() != null) {
 item.setNomberMoisRetard(NumberUtil.toInt(vo.getNomberMoisRetard()));
} 

 if (vo.getDateValidation() != null) {
 item.setDateValidation(DateUtil.parse(vo.getDateValidation()));
} 

 if (vo.getDateSoumission() != null) {
 item.setDateSoumission(DateUtil.parse(vo.getDateSoumission()));
} 

 if (vo.getDateAffectationComptable() != null) {
 item.setDateAffectationComptable(DateUtil.parse(vo.getDateAffectationComptable()));
} 

 if (vo.getDateFinalisation() != null) {
 item.setDateFinalisation(DateUtil.parse(vo.getDateFinalisation()));
} 

 if (vo.getDateSaisie() != null) {
 item.setDateSaisie(DateUtil.parse(vo.getDateSaisie()));
} 

return item;
 }
 }

  @Override 
 public TaxeTrimBoissonVo toVo(TaxeTrimBoisson item) {
 if (item == null) {
    return null;
      } else {
TaxeTrimBoissonVo vo = new TaxeTrimBoissonVo();

 if(locale&& item.getLocale() != null) {
 vo.setLocaleVo(localeConverter.toVo(item.getLocale()));
} 
 
 if(redevable&& item.getRedevable() != null) {
 vo.setRedevableVo(redevableConverter.toVo(item.getRedevable()));
} 
 
 if(tauxBoisson&& item.getTauxBoisson() != null) {
 vo.setTauxBoissonVo(tauxBoissonConverter.toVo(item.getTauxBoisson()));
} 
 
 if(taxeAnnuelBoisson&& item.getTaxeAnnuelBoisson() != null) {
 vo.setTaxeAnnuelBoissonVo(taxeAnnuelBoissonConverter.toVo(item.getTaxeAnnuelBoisson()));
} 
 
 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getNumeroTrim() != null) {
 vo.setNumeroTrim(NumberUtil.toString(item.getNumeroTrim()));
} 

 if (item.getAnnee() != null) {
 vo.setAnnee(NumberUtil.toString(item.getAnnee()));
} 

 if (item.getDatePresentation() != null) {
 vo.setDatePresentation(DateUtil.formateDate(item.getDatePresentation()));
} 

 if (item.getMontantTotal() != null) {
 vo.setMontantTotal(NumberUtil.toString(item.getMontantTotal()));
} 

 if (item.getMontantBase() != null) {
 vo.setMontantBase(NumberUtil.toString(item.getMontantBase()));
} 

 if (item.getMontantRetard() != null) {
 vo.setMontantRetard(NumberUtil.toString(item.getMontantRetard()));
} 

 if (item.getMontantMajoration() != null) {
 vo.setMontantMajoration(NumberUtil.toString(item.getMontantMajoration()));
} 

 if (item.getMontantPenalite() != null) {
 vo.setMontantPenalite(NumberUtil.toString(item.getMontantPenalite()));
} 

 if (item.getNomberMoisRetard() != null) {
 vo.setNomberMoisRetard(NumberUtil.toString(item.getNomberMoisRetard()));
} 

 if (item.getDateValidation() != null) {
 vo.setDateValidation(DateUtil.formateDate(item.getDateValidation()));
} 

 if (item.getDateSoumission() != null) {
 vo.setDateSoumission(DateUtil.formateDate(item.getDateSoumission()));
} 

 if (item.getDateAffectationComptable() != null) {
 vo.setDateAffectationComptable(DateUtil.formateDate(item.getDateAffectationComptable()));
} 

 if (item.getDateFinalisation() != null) {
 vo.setDateFinalisation(DateUtil.formateDate(item.getDateFinalisation()));
} 

 if (item.getDateSaisie() != null) {
 vo.setDateSaisie(DateUtil.formateDate(item.getDateSaisie()));
} 

return vo;
 }
 }
public void init() { 

locale = true; 

redevable = true; 

tauxBoisson = true; 

taxeAnnuelBoisson = true; 
}
 } 
