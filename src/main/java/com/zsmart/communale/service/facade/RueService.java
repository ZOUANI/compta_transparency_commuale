package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.Rue;
import com.zsmart.communale.bean.Quartier; 
public interface RueService {

public Rue save(Rue rue); 
public List<Rue>  findAll();
public Rue findById(Long id);
public int delete(Rue rue);
public void  deleteById(Long id);
public void clone(Rue rue,Rue rueClone);
public Rue clone(Rue rue);
public List<Rue> clone(List<Rue>rues);
 public List<Rue>  findByCriteria(String libelle,String code,Long idMin,Long idMax);

}
