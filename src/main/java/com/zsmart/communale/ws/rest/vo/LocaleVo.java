package com.zsmart.communale.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class LocaleVo{

private String id ;
private String reference ;
private String dernierTrimBoissonPaye;
private String dernierTrimBoissonPayeMin ;
private String dernierTrimBoissonPayeMax ;
private String dernierAnneeBoissonPaye;
private String dernierAnneeBoissonPayeMin ;
private String dernierAnneeBoissonPayeMax ;
private String dernierAnneeBoissonDeclare;
private String dernierAnneeBoissonDeclareMin ;
private String dernierAnneeBoissonDeclareMax ;
private String dernierTrimSejourPaye;
private String dernierTrimSejourPayeMin ;
private String dernierTrimSejourPayeMax ;
private String dernierAnneeSejourPaye;
private String dernierAnneeSejourPayeMin ;
private String dernierAnneeSejourPayeMax ;
private String dernierAnneeSejourDeclare;
private String dernierAnneeSejourDeclareMin ;
private String dernierAnneeSejourDeclareMax ;
private RueVo rueVo ;
private RedevableVo redevableVo ;
private CategorieSejourVo categorieSejourVo ;
private CategorieBoissonVo categorieBoissonVo ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getReference(){
    return reference;
}

public void setReference(String  reference){
     this.reference = reference;
}

public String  getDernierTrimBoissonPaye(){
    return dernierTrimBoissonPaye;
}

public void setDernierTrimBoissonPaye(String  dernierTrimBoissonPaye){
     this.dernierTrimBoissonPaye = dernierTrimBoissonPaye;
}

public String  getDernierTrimBoissonPayeMin(){
    return dernierTrimBoissonPayeMin;
}

public void setDernierTrimBoissonPayeMin(String  dernierTrimBoissonPayeMin){
     this.dernierTrimBoissonPayeMin = dernierTrimBoissonPayeMin;
}

public String  getDernierTrimBoissonPayeMax(){
    return dernierTrimBoissonPayeMax;
}

public void setDernierTrimBoissonPayeMax(String  dernierTrimBoissonPayeMax){
     this.dernierTrimBoissonPayeMax = dernierTrimBoissonPayeMax;
}

public String  getDernierAnneeBoissonPaye(){
    return dernierAnneeBoissonPaye;
}

public void setDernierAnneeBoissonPaye(String  dernierAnneeBoissonPaye){
     this.dernierAnneeBoissonPaye = dernierAnneeBoissonPaye;
}

public String  getDernierAnneeBoissonPayeMin(){
    return dernierAnneeBoissonPayeMin;
}

public void setDernierAnneeBoissonPayeMin(String  dernierAnneeBoissonPayeMin){
     this.dernierAnneeBoissonPayeMin = dernierAnneeBoissonPayeMin;
}

public String  getDernierAnneeBoissonPayeMax(){
    return dernierAnneeBoissonPayeMax;
}

public void setDernierAnneeBoissonPayeMax(String  dernierAnneeBoissonPayeMax){
     this.dernierAnneeBoissonPayeMax = dernierAnneeBoissonPayeMax;
}

public String  getDernierAnneeBoissonDeclare(){
    return dernierAnneeBoissonDeclare;
}

public void setDernierAnneeBoissonDeclare(String  dernierAnneeBoissonDeclare){
     this.dernierAnneeBoissonDeclare = dernierAnneeBoissonDeclare;
}

public String  getDernierAnneeBoissonDeclareMin(){
    return dernierAnneeBoissonDeclareMin;
}

public void setDernierAnneeBoissonDeclareMin(String  dernierAnneeBoissonDeclareMin){
     this.dernierAnneeBoissonDeclareMin = dernierAnneeBoissonDeclareMin;
}

public String  getDernierAnneeBoissonDeclareMax(){
    return dernierAnneeBoissonDeclareMax;
}

public void setDernierAnneeBoissonDeclareMax(String  dernierAnneeBoissonDeclareMax){
     this.dernierAnneeBoissonDeclareMax = dernierAnneeBoissonDeclareMax;
}

public String  getDernierTrimSejourPaye(){
    return dernierTrimSejourPaye;
}

public void setDernierTrimSejourPaye(String  dernierTrimSejourPaye){
     this.dernierTrimSejourPaye = dernierTrimSejourPaye;
}

public String  getDernierTrimSejourPayeMin(){
    return dernierTrimSejourPayeMin;
}

public void setDernierTrimSejourPayeMin(String  dernierTrimSejourPayeMin){
     this.dernierTrimSejourPayeMin = dernierTrimSejourPayeMin;
}

public String  getDernierTrimSejourPayeMax(){
    return dernierTrimSejourPayeMax;
}

public void setDernierTrimSejourPayeMax(String  dernierTrimSejourPayeMax){
     this.dernierTrimSejourPayeMax = dernierTrimSejourPayeMax;
}

public String  getDernierAnneeSejourPaye(){
    return dernierAnneeSejourPaye;
}

public void setDernierAnneeSejourPaye(String  dernierAnneeSejourPaye){
     this.dernierAnneeSejourPaye = dernierAnneeSejourPaye;
}

public String  getDernierAnneeSejourPayeMin(){
    return dernierAnneeSejourPayeMin;
}

public void setDernierAnneeSejourPayeMin(String  dernierAnneeSejourPayeMin){
     this.dernierAnneeSejourPayeMin = dernierAnneeSejourPayeMin;
}

public String  getDernierAnneeSejourPayeMax(){
    return dernierAnneeSejourPayeMax;
}

public void setDernierAnneeSejourPayeMax(String  dernierAnneeSejourPayeMax){
     this.dernierAnneeSejourPayeMax = dernierAnneeSejourPayeMax;
}

public String  getDernierAnneeSejourDeclare(){
    return dernierAnneeSejourDeclare;
}

public void setDernierAnneeSejourDeclare(String  dernierAnneeSejourDeclare){
     this.dernierAnneeSejourDeclare = dernierAnneeSejourDeclare;
}

public String  getDernierAnneeSejourDeclareMin(){
    return dernierAnneeSejourDeclareMin;
}

public void setDernierAnneeSejourDeclareMin(String  dernierAnneeSejourDeclareMin){
     this.dernierAnneeSejourDeclareMin = dernierAnneeSejourDeclareMin;
}

public String  getDernierAnneeSejourDeclareMax(){
    return dernierAnneeSejourDeclareMax;
}

public void setDernierAnneeSejourDeclareMax(String  dernierAnneeSejourDeclareMax){
     this.dernierAnneeSejourDeclareMax = dernierAnneeSejourDeclareMax;
}

public RueVo  getRueVo (){
    return rueVo ;
}

public void setRueVo (RueVo  rueVo ){
     this.rueVo  = rueVo ;
}

public RedevableVo  getRedevableVo (){
    return redevableVo ;
}

public void setRedevableVo (RedevableVo  redevableVo ){
     this.redevableVo  = redevableVo ;
}

public CategorieSejourVo  getCategorieSejourVo (){
    return categorieSejourVo ;
}

public void setCategorieSejourVo (CategorieSejourVo  categorieSejourVo ){
     this.categorieSejourVo  = categorieSejourVo ;
}

public CategorieBoissonVo  getCategorieBoissonVo (){
    return categorieBoissonVo ;
}

public void setCategorieBoissonVo (CategorieBoissonVo  categorieBoissonVo ){
     this.categorieBoissonVo  = categorieBoissonVo ;
}




}