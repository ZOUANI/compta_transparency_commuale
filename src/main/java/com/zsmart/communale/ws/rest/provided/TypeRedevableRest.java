package com.zsmart.communale.ws.rest.provided ;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.zsmart.communale.service.facade.TypeRedevableService;
import com.zsmart.communale.bean.TypeRedevable;
import com.zsmart.communale.ws.rest.vo.TypeRedevableVo;
import com.zsmart.communale.ws.rest.converter.TypeRedevableConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/TypeRedevable")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TypeRedevableRest {

 @Autowired 
 private TypeRedevableService typeRedevableService;

 @Autowired 
private TypeRedevableConverter typeRedevableConverter ;

@PostMapping("/")
public TypeRedevableVo save(@RequestBody TypeRedevableVo typeRedevableVo){
TypeRedevable typeRedevable= typeRedevableConverter.toItem(typeRedevableVo);
return typeRedevableConverter.toVo(typeRedevableService.save(typeRedevable));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
typeRedevableService.deleteById(id);
}
@DeleteMapping("/{reference}")
public void  deleteByReference(@PathVariable String  reference){
typeRedevableService.deleteByReference(reference);
}
@GetMapping("/")
public List<TypeRedevableVo> findAll(){
return typeRedevableConverter.toVo(typeRedevableService.findAll());
}

 public TypeRedevableConverter getTypeRedevableConverter(){
return typeRedevableConverter;
}
 
 public void setTypeRedevableConverter(TypeRedevableConverter typeRedevableConverter){
this.typeRedevableConverter=typeRedevableConverter;
}

 public TypeRedevableService getTypeRedevableService(){
return typeRedevableService;
}
 
 public void setTypeRedevableService(TypeRedevableService typeRedevableService){
this.typeRedevableService=typeRedevableService;
}

}