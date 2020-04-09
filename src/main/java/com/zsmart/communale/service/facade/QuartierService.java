package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.Quartier;
import com.zsmart.communale.bean.Secteur; 
public interface QuartierService {

public Quartier save(Quartier quartier); 
public Quartier  saveWithRues (Quartier quartier);public List<Quartier>  findAll();
public Quartier findById(Long id);
public int delete(Quartier quartier);
public void  deleteById(Long id);
public void clone(Quartier quartier,Quartier quartierClone);
public Quartier clone(Quartier quartier);
public List<Quartier> clone(List<Quartier>quartiers);
 public List<Quartier>  findByCriteria(String libelle,String code,Long idMin,Long idMax);

}
