package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.Quartier; 
import com.zsmart.communale.ws.rest.vo.QuartierVo; 

 @Component 
public class QuartierConverter extends AbstractConverter<Quartier,QuartierVo>{ 

private boolean secteur; 

 @Autowired
 private SecteurConverter secteurConverter ; 
private boolean rues; 

 @Autowired
 private RueConverter rueConverter ; 

 @Override 
 public Quartier toItem(QuartierVo vo) {
 if (vo == null) {
    return null;
      } else {
Quartier item = new Quartier();

 if(secteur&& vo.getSecteurVo() != null) {
 item.setSecteur(secteurConverter.toItem(vo.getSecteurVo()));
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

 if (ListUtil.isNotEmpty(vo.getRuesVo ()) && rues) {
 item.setRues(rueConverter.toItem(vo.getRuesVo())); 
} 

return item;
 }
 }

  @Override 
 public QuartierVo toVo(Quartier item) {
 if (item == null) {
    return null;
      } else {
QuartierVo vo = new QuartierVo();

 if(secteur&& item.getSecteur() != null) {
 vo.setSecteurVo(secteurConverter.toVo(item.getSecteur()));
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

 if(ListUtil.isNotEmpty(item.getRues()) && rues) {
 vo.setRuesVo(rueConverter.toVo(item.getRues()));
} 

return vo;
 }
 }
public void init() { 

secteur = true; 

rues = true; 
}
 } 
