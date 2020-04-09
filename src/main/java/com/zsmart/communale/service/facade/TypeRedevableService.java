package com.zsmart.communale.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.communale.bean.TypeRedevable;
public interface TypeRedevableService {

public TypeRedevable save(TypeRedevable typeredevable); 
public List<TypeRedevable>  findAll();
public TypeRedevable findById(Long id);
public TypeRedevable  findByReference(String  reference);
public int delete(TypeRedevable typeredevable);
public void  deleteById(Long id);
public void  deleteByReference(String  reference);
public void clone(TypeRedevable typeredevable,TypeRedevable typeredevableClone);
public TypeRedevable clone(TypeRedevable typeredevable);
public List<TypeRedevable> clone(List<TypeRedevable>typeredevables);
 public List<TypeRedevable>  findByCriteria(String libelle,String reference,Long idMin,Long idMax);

}
