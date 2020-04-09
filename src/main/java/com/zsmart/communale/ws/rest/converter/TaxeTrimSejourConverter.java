package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.TaxeTrimSejour; 
import com.zsmart.communale.ws.rest.vo.TaxeTrimSejourVo; 

 @Component 
public class TaxeTrimSejourConverter extends AbstractConverter<TaxeTrimSejour,TaxeTrimSejourVo>{ 

private boolean locale; 

 @Autowired
 private LocaleConverter localeConverter ; 
private boolean redevable; 

 @Autowired
 private RedevableConverter redevableConverter ; 
private boolean tauxSejour; 

 @Autowired
 private TauxSejourConverter tauxSejourConverter ; 
private boolean taxeAnnuelSejour; 

 @Autowired
 private TaxeAnnuelSejourConverter taxeAnnuelSejourConverter ; 

 @Override 
 public TaxeTrimSejour toItem(TaxeTrimSejourVo vo) {
 if (vo == null) {
    return null;
      } else {
TaxeTrimSejour item = new TaxeTrimSejour();

 if(locale&& vo.getLocaleVo() != null) {
 item.setLocale(localeConverter.toItem(vo.getLocaleVo()));
} 
 
 if(redevable&& vo.getRedevableVo() != null) {
 item.setRedevable(redevableConverter.toItem(vo.getRedevableVo()));
} 
 
 if(tauxSejour&& vo.getTauxSejourVo() != null) {
 item.setTauxSejour(tauxSejourConverter.toItem(vo.getTauxSejourVo()));
} 
 
 if(taxeAnnuelSejour&& vo.getTaxeAnnuelSejourVo() != null) {
 item.setTaxeAnnuelSejour(taxeAnnuelSejourConverter.toItem(vo.getTaxeAnnuelSejourVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getNombreNuitees())) {
 item.setNombreNuitees(vo.getNombreNuitees());
} 

 if (StringUtil.isNotEmpty(vo.getNombreClient())) {
 item.setNombreClient(vo.getNombreClient());
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

 if (vo.getDatePaiement() != null) {
 item.setDatePaiement(DateUtil.parse(vo.getDatePaiement()));
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
 public TaxeTrimSejourVo toVo(TaxeTrimSejour item) {
 if (item == null) {
    return null;
      } else {
TaxeTrimSejourVo vo = new TaxeTrimSejourVo();

 if(locale&& item.getLocale() != null) {
 vo.setLocaleVo(localeConverter.toVo(item.getLocale()));
} 
 
 if(redevable&& item.getRedevable() != null) {
 vo.setRedevableVo(redevableConverter.toVo(item.getRedevable()));
} 
 
 if(tauxSejour&& item.getTauxSejour() != null) {
 vo.setTauxSejourVo(tauxSejourConverter.toVo(item.getTauxSejour()));
} 
 
 if(taxeAnnuelSejour&& item.getTaxeAnnuelSejour() != null) {
 vo.setTaxeAnnuelSejourVo(taxeAnnuelSejourConverter.toVo(item.getTaxeAnnuelSejour()));
} 
 
 if (StringUtil.isNotEmpty(item.getNombreNuitees())) {
 vo.setNombreNuitees(item.getNombreNuitees());
} 

 if (StringUtil.isNotEmpty(item.getNombreClient())) {
 vo.setNombreClient(item.getNombreClient());
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

 if (item.getDatePaiement() != null) {
 vo.setDatePaiement(DateUtil.formateDate(item.getDatePaiement()));
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

tauxSejour = true; 

taxeAnnuelSejour = true; 
}
 } 
