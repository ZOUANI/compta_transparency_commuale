package com.zsmart.communale.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class RedevableVo{

private String id ;
private String libelle ;
private String identifiant ;
private String nom ;
private String prenom ;
private String description ;
private String referenceSociete ;
private TypeRedevableVo typeRedevableVo ;



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

public String  getIdentifiant(){
    return identifiant;
}

public void setIdentifiant(String  identifiant){
     this.identifiant = identifiant;
}

public String  getNom(){
    return nom;
}

public void setNom(String  nom){
     this.nom = nom;
}

public String  getPrenom(){
    return prenom;
}

public void setPrenom(String  prenom){
     this.prenom = prenom;
}

public String  getDescription(){
    return description;
}

public void setDescription(String  description){
     this.description = description;
}

public String  getReferenceSociete(){
    return referenceSociete;
}

public void setReferenceSociete(String  referenceSociete){
     this.referenceSociete = referenceSociete;
}

public TypeRedevableVo  getTypeRedevableVo (){
    return typeRedevableVo ;
}

public void setTypeRedevableVo (TypeRedevableVo  typeRedevableVo ){
     this.typeRedevableVo  = typeRedevableVo ;
}




}