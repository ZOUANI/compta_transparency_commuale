package com.zsmart.communale.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class QuartierVo{

private String id ;
private String libelle ;
private String code ;
private SecteurVo secteurVo ;
private List<RueVo>ruesVo;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getLibelle(){
    return libelle;
}

public void setLibelle(String  libelle){
     this.libelle = libelle;
}

public String  getCode(){
    return code;
}

public void setCode(String  code){
     this.code = code;
}

public SecteurVo  getSecteurVo (){
    return secteurVo ;
}

public void setSecteurVo (SecteurVo  secteurVo ){
     this.secteurVo  = secteurVo ;
}

public List<RueVo> getRuesVo(){
    return ruesVo;
}

public void setRuesVo(List<RueVo> ruesVo){
     this.ruesVo = ruesVo;
}




}