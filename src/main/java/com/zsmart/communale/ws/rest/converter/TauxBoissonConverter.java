package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.TauxBoisson; 
import com.zsmart.communale.ws.rest.vo.TauxBoissonVo; 

 @Component 
public class TauxBoissonConverter extends AbstractConverter<TauxBoisson,TauxBoissonVo>{ 

private boolean categorieBoisson; 

 @Autowired
 private CategorieBoissonConverter categorieBoissonConverter ; 

 @Override 
 public TauxBoisson toItem(TauxBoissonVo vo) {
 if (vo == null) {
    return null;
      } else {
TauxBoisson item = new TauxBoisson();

 if(categorieBoisson&& vo.getCategorieBoissonVo() != null) {
 item.setCategorieBoisson(categorieBoissonConverter.toItem(vo.getCategorieBoissonVo()));
} 
 
 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getMontantParNuite() != null) {
 item.setMontantParNuite(NumberUtil.toBigDecimal(vo.getMontantParNuite()));
} 

 if (vo.getMajorationTrim() != null) {
 item.setMajorationTrim(NumberUtil.toBigDecimal(vo.getMajorationTrim()));
} 

 if (vo.getPenaliteTrim() != null) {
 item.setPenaliteTrim(NumberUtil.toBigDecimal(vo.getPenaliteTrim()));
} 

 if (vo.getMajorationAnnuelle() != null) {
 item.setMajorationAnnuelle(NumberUtil.toBigDecimal(vo.getMajorationAnnuelle()));
} 

 if (vo.getPenaliteAnnuelle() != null) {
 item.setPenaliteAnnuelle(NumberUtil.toBigDecimal(vo.getPenaliteAnnuelle()));
} 

 if (vo.getDateApplicationDebut() != null) {
 item.setDateApplicationDebut(DateUtil.parse(vo.getDateApplicationDebut()));
} 

 if (vo.getDateApplicationFin() != null) {
 item.setDateApplicationFin(DateUtil.parse(vo.getDateApplicationFin()));
} 

return item;
 }
 }

  @Override 
 public TauxBoissonVo toVo(TauxBoisson item) {
 if (item == null) {
    return null;
      } else {
TauxBoissonVo vo = new TauxBoissonVo();

 if(categorieBoisson&& item.getCategorieBoisson() != null) {
 vo.setCategorieBoissonVo(categorieBoissonConverter.toVo(item.getCategorieBoisson()));
} 
 
 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getMontantParNuite() != null) {
 vo.setMontantParNuite(NumberUtil.toString(item.getMontantParNuite()));
} 

 if (item.getMajorationTrim() != null) {
 vo.setMajorationTrim(NumberUtil.toString(item.getMajorationTrim()));
} 

 if (item.getPenaliteTrim() != null) {
 vo.setPenaliteTrim(NumberUtil.toString(item.getPenaliteTrim()));
} 

 if (item.getMajorationAnnuelle() != null) {
 vo.setMajorationAnnuelle(NumberUtil.toString(item.getMajorationAnnuelle()));
} 

 if (item.getPenaliteAnnuelle() != null) {
 vo.setPenaliteAnnuelle(NumberUtil.toString(item.getPenaliteAnnuelle()));
} 

 if (item.getDateApplicationDebut() != null) {
 vo.setDateApplicationDebut(DateUtil.formateDate(item.getDateApplicationDebut()));
} 

 if (item.getDateApplicationFin() != null) {
 vo.setDateApplicationFin(DateUtil.formateDate(item.getDateApplicationFin()));
} 

return vo;
 }
 }
public void init() { 

categorieBoisson = true; 
}
 } 
