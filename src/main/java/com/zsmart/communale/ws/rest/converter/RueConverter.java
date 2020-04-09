package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.Rue; 
import com.zsmart.communale.ws.rest.vo.RueVo; 

 @Component 
public class RueConverter extends AbstractConverter<Rue,RueVo>{ 

private boolean quartier; 

 @Autowired
 private QuartierConverter quartierConverter ; 

 @Override 
 public Rue toItem(RueVo vo) {
 if (vo == null) {
    return null;
      } else {
Rue item = new Rue();

 if(quartier&& vo.getQuartierVo() != null) {
 item.setQuartier(quartierConverter.toItem(vo.getQuartierVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (StringUtil.isNotEmpty(vo.getCode())) {
 item.setCode(vo.getCode());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public RueVo toVo(Rue item) {
 if (item == null) {
    return null;
      } else {
RueVo vo = new RueVo();

 if(quartier&& item.getQuartier() != null) {
 vo.setQuartierVo(quartierConverter.toVo(item.getQuartier()));
} 
 
 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (StringUtil.isNotEmpty(item.getCode())) {
 vo.setCode(item.getCode());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 

quartier = true; 
}
 } 
