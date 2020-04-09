package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.Locale; 
import com.zsmart.communale.ws.rest.vo.LocaleVo; 

 @Component 
public class LocaleConverter extends AbstractConverter<Locale,LocaleVo>{ 

private boolean rue; 

 @Autowired
 private RueConverter rueConverter ; 
private boolean redevable; 

 @Autowired
 private RedevableConverter redevableConverter ; 
private boolean categorieSejour; 

 @Autowired
 private CategorieSejourConverter categorieSejourConverter ; 
private boolean categorieBoisson; 

 @Autowired
 private CategorieBoissonConverter categorieBoissonConverter ; 

 @Override 
 public Locale toItem(LocaleVo vo) {
 if (vo == null) {
    return null;
      } else {
Locale item = new Locale();

 if(rue&& vo.getRueVo() != null) {
 item.setRue(rueConverter.toItem(vo.getRueVo()));
} 
 
 if(redevable&& vo.getRedevableVo() != null) {
 item.setRedevable(redevableConverter.toItem(vo.getRedevableVo()));
} 
 
 if(categorieSejour&& vo.getCategorieSejourVo() != null) {
 item.setCategorieSejour(categorieSejourConverter.toItem(vo.getCategorieSejourVo()));
} 
 
 if(categorieBoisson&& vo.getCategorieBoissonVo() != null) {
 item.setCategorieBoisson(categorieBoissonConverter.toItem(vo.getCategorieBoissonVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getReference())) {
 item.setReference(vo.getReference());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getDernierTrimBoissonPaye() != null) {
 item.setDernierTrimBoissonPaye(NumberUtil.toInt(vo.getDernierTrimBoissonPaye()));
} 

 if (vo.getDernierAnneeBoissonPaye() != null) {
 item.setDernierAnneeBoissonPaye(NumberUtil.toInt(vo.getDernierAnneeBoissonPaye()));
} 

 if (vo.getDernierAnneeBoissonDeclare() != null) {
 item.setDernierAnneeBoissonDeclare(NumberUtil.toInt(vo.getDernierAnneeBoissonDeclare()));
} 

 if (vo.getDernierTrimSejourPaye() != null) {
 item.setDernierTrimSejourPaye(NumberUtil.toInt(vo.getDernierTrimSejourPaye()));
} 

 if (vo.getDernierAnneeSejourPaye() != null) {
 item.setDernierAnneeSejourPaye(NumberUtil.toInt(vo.getDernierAnneeSejourPaye()));
} 

 if (vo.getDernierAnneeSejourDeclare() != null) {
 item.setDernierAnneeSejourDeclare(NumberUtil.toInt(vo.getDernierAnneeSejourDeclare()));
} 

return item;
 }
 }

  @Override 
 public LocaleVo toVo(Locale item) {
 if (item == null) {
    return null;
      } else {
LocaleVo vo = new LocaleVo();

 if(rue&& item.getRue() != null) {
 vo.setRueVo(rueConverter.toVo(item.getRue()));
} 
 
 if(redevable&& item.getRedevable() != null) {
 vo.setRedevableVo(redevableConverter.toVo(item.getRedevable()));
} 
 
 if(categorieSejour&& item.getCategorieSejour() != null) {
 vo.setCategorieSejourVo(categorieSejourConverter.toVo(item.getCategorieSejour()));
} 
 
 if(categorieBoisson&& item.getCategorieBoisson() != null) {
 vo.setCategorieBoissonVo(categorieBoissonConverter.toVo(item.getCategorieBoisson()));
} 
 
 if (StringUtil.isNotEmpty(item.getReference())) {
 vo.setReference(item.getReference());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getDernierTrimBoissonPaye() != null) {
 vo.setDernierTrimBoissonPaye(NumberUtil.toString(item.getDernierTrimBoissonPaye()));
} 

 if (item.getDernierAnneeBoissonPaye() != null) {
 vo.setDernierAnneeBoissonPaye(NumberUtil.toString(item.getDernierAnneeBoissonPaye()));
} 

 if (item.getDernierAnneeBoissonDeclare() != null) {
 vo.setDernierAnneeBoissonDeclare(NumberUtil.toString(item.getDernierAnneeBoissonDeclare()));
} 

 if (item.getDernierTrimSejourPaye() != null) {
 vo.setDernierTrimSejourPaye(NumberUtil.toString(item.getDernierTrimSejourPaye()));
} 

 if (item.getDernierAnneeSejourPaye() != null) {
 vo.setDernierAnneeSejourPaye(NumberUtil.toString(item.getDernierAnneeSejourPaye()));
} 

 if (item.getDernierAnneeSejourDeclare() != null) {
 vo.setDernierAnneeSejourDeclare(NumberUtil.toString(item.getDernierAnneeSejourDeclare()));
} 

return vo;
 }
 }
public void init() { 

rue = true; 

redevable = true; 

categorieSejour = true; 

categorieBoisson = true; 
}
 } 
