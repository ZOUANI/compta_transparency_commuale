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
import com.zsmart.communale.service.facade.CategorieSejourService;
import com.zsmart.communale.bean.CategorieSejour;
import com.zsmart.communale.ws.rest.vo.CategorieSejourVo;
import com.zsmart.communale.ws.rest.converter.CategorieSejourConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/CategorieSejour")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CategorieSejourRest {

 @Autowired 
 private CategorieSejourService categorieSejourService;

 @Autowired 
private CategorieSejourConverter categorieSejourConverter ;

@PostMapping("/")
public CategorieSejourVo save(@RequestBody CategorieSejourVo categorieSejourVo){
CategorieSejour categorieSejour= categorieSejourConverter.toItem(categorieSejourVo);
return categorieSejourConverter.toVo(categorieSejourService.save(categorieSejour));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
categorieSejourService.deleteById(id);
}
@DeleteMapping("/{reference}")
public void  deleteByReference(@PathVariable String  reference){
categorieSejourService.deleteByReference(reference);
}
@GetMapping("/")
public List<CategorieSejourVo> findAll(){
return categorieSejourConverter.toVo(categorieSejourService.findAll());
}

 public CategorieSejourConverter getCategorieSejourConverter(){
return categorieSejourConverter;
}
 
 public void setCategorieSejourConverter(CategorieSejourConverter categorieSejourConverter){
this.categorieSejourConverter=categorieSejourConverter;
}

 public CategorieSejourService getCategorieSejourService(){
return categorieSejourService;
}
 
 public void setCategorieSejourService(CategorieSejourService categorieSejourService){
this.categorieSejourService=categorieSejourService;
}

}