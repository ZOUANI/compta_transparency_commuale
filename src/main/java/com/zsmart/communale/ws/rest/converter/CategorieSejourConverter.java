package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.CategorieSejour; 
import com.zsmart.communale.ws.rest.vo.CategorieSejourVo; 

 @Component 
public class CategorieSejourConverter extends AbstractConverter<CategorieSejour,CategorieSejourVo>{ 


 @Override 
 public CategorieSejour toItem(CategorieSejourVo vo) {
 if (vo == null) {
    return null;
      } else {
CategorieSejour item = new CategorieSejour();

 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (StringUtil.isNotEmpty(vo.getReference())) {
 item.setReference(vo.getReference());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public CategorieSejourVo toVo(CategorieSejour item) {
 if (item == null) {
    return null;
      } else {
CategorieSejourVo vo = new CategorieSejourVo();

 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (StringUtil.isNotEmpty(item.getReference())) {
 vo.setReference(item.getReference());
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
