package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.TypeRedevable; 
import com.zsmart.communale.ws.rest.vo.TypeRedevableVo; 

 @Component 
public class TypeRedevableConverter extends AbstractConverter<TypeRedevable,TypeRedevableVo>{ 


 @Override 
 public TypeRedevable toItem(TypeRedevableVo vo) {
 if (vo == null) {
    return null;
      } else {
TypeRedevable item = new TypeRedevable();

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
 public TypeRedevableVo toVo(TypeRedevable item) {
 if (item == null) {
    return null;
      } else {
TypeRedevableVo vo = new TypeRedevableVo();

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
