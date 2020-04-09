package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.CategorieBoisson; 
import com.zsmart.communale.ws.rest.vo.CategorieBoissonVo; 

 @Component 
public class CategorieBoissonConverter extends AbstractConverter<CategorieBoisson,CategorieBoissonVo>{ 


 @Override 
 public CategorieBoisson toItem(CategorieBoissonVo vo) {
 if (vo == null) {
    return null;
      } else {
CategorieBoisson item = new CategorieBoisson();

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
 public CategorieBoissonVo toVo(CategorieBoisson item) {
 if (item == null) {
    return null;
      } else {
CategorieBoissonVo vo = new CategorieBoissonVo();

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
