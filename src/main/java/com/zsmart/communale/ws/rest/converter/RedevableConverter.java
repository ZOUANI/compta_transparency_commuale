package com.zsmart.communale.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.communale.service.util.*;
import com.zsmart.communale.bean.Redevable; 
import com.zsmart.communale.ws.rest.vo.RedevableVo; 

 @Component 
public class RedevableConverter extends AbstractConverter<Redevable,RedevableVo>{ 

private boolean typeRedevable; 

 @Autowired
 private TypeRedevableConverter typeRedevableConverter ; 

 @Override 
 public Redevable toItem(RedevableVo vo) {
 if (vo == null) {
    return null;
      } else {
Redevable item = new Redevable();

 if(typeRedevable&& vo.getTypeRedevableVo() != null) {
 item.setTypeRedevable(typeRedevableConverter.toItem(vo.getTypeRedevableVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (StringUtil.isNotEmpty(vo.getIdentifiant())) {
 item.setIdentifiant(vo.getIdentifiant());
} 

 if (StringUtil.isNotEmpty(vo.getNom())) {
 item.setNom(vo.getNom());
} 

 if (StringUtil.isNotEmpty(vo.getPrenom())) {
 item.setPrenom(vo.getPrenom());
} 

 if (StringUtil.isNotEmpty(vo.getDescription())) {
 item.setDescription(vo.getDescription());
} 

 if (StringUtil.isNotEmpty(vo.getReferenceSociete())) {
 item.setReferenceSociete(vo.getReferenceSociete());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public RedevableVo toVo(Redevable item) {
 if (item == null) {
    return null;
      } else {
RedevableVo vo = new RedevableVo();

 if(typeRedevable&& item.getTypeRedevable() != null) {
 vo.setTypeRedevableVo(typeRedevableConverter.toVo(item.getTypeRedevable()));
} 
 
 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (StringUtil.isNotEmpty(item.getIdentifiant())) {
 vo.setIdentifiant(item.getIdentifiant());
} 

 if (StringUtil.isNotEmpty(item.getNom())) {
 vo.setNom(item.getNom());
} 

 if (StringUtil.isNotEmpty(item.getPrenom())) {
 vo.setPrenom(item.getPrenom());
} 

 if (StringUtil.isNotEmpty(item.getDescription())) {
 vo.setDescription(item.getDescription());
} 

 if (StringUtil.isNotEmpty(item.getReferenceSociete())) {
 vo.setReferenceSociete(item.getReferenceSociete());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 

typeRedevable = true; 
}
 } 
