package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.Secteur;
public interface SecteurService {

public Secteur save(Secteur secteur); 
public List<Secteur>  findAll();
public Secteur findById(Long id);
public int delete(Secteur secteur);
public void  deleteById(Long id);
public void clone(Secteur secteur,Secteur secteurClone);
public Secteur clone(Secteur secteur);
public List<Secteur> clone(List<Secteur>secteurs);
 public List<Secteur>  findByCriteria(String libelle,String code,String codeVille,Long idMin,Long idMax);

}
