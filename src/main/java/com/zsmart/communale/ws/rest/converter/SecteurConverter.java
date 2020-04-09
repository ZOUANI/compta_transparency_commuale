package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.Secteur; 
import com.zsmart.communale.ws.rest.vo.SecteurVo; 

 @Component 
public class SecteurConverter extends AbstractConverter<Secteur,SecteurVo>{ 


 @Override 
 public Secteur toItem(SecteurVo vo) {
 if (vo == null) {
    return null;
      } else {
Secteur item = new Secteur();

 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (StringUtil.isNotEmpty(vo.getCode())) {
 item.setCode(vo.getCode());
} 

 if (StringUtil.isNotEmpty(vo.getCodeVille())) {
 item.setCodeVille(vo.getCodeVille());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public SecteurVo toVo(Secteur item) {
 if (item == null) {
    return null;
      } else {
SecteurVo vo = new SecteurVo();

 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (StringUtil.isNotEmpty(item.getCode())) {
 vo.setCode(item.getCode());
} 

 if (StringUtil.isNotEmpty(item.getCodeVille())) {
 vo.setCodeVille(item.getCodeVille());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
