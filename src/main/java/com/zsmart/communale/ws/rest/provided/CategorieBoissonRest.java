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
import com.zsmart.communale.service.facade.CategorieBoissonService;
import com.zsmart.communale.bean.CategorieBoisson;
import com.zsmart.communale.ws.rest.vo.CategorieBoissonVo;
import com.zsmart.communale.ws.rest.converter.CategorieBoissonConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/CategorieBoisson")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CategorieBoissonRest {

 @Autowired 
 private CategorieBoissonService categorieBoissonService;

 @Autowired 
private CategorieBoissonConverter categorieBoissonConverter ;

@PostMapping("/")
public CategorieBoissonVo save(@RequestBody CategorieBoissonVo categorieBoissonVo){
CategorieBoisson categorieBoisson= categorieBoissonConverter.toItem(categorieBoissonVo);
return categorieBoissonConverter.toVo(categorieBoissonService.save(categorieBoisson));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
categorieBoissonService.deleteById(id);
}
@DeleteMapping("/{reference}")
public void  deleteByReference(@PathVariable String  reference){
categorieBoissonService.deleteByReference(reference);
}
@GetMapping("/")
public List<CategorieBoissonVo> findAll(){
return categorieBoissonConverter.toVo(categorieBoissonService.findAll());
}

 public CategorieBoissonConverter getCategorieBoissonConverter(){
return categorieBoissonConverter;
}
 
 public void setCategorieBoissonConverter(CategorieBoissonConverter categorieBoissonConverter){
this.categorieBoissonConverter=categorieBoissonConverter;
}

 public CategorieBoissonService getCategorieBoissonService(){
return categorieBoissonService;
}
 
 public void setCategorieBoissonService(CategorieBoissonService categorieBoissonService){
this.categorieBoissonService=categorieBoissonService;
}

}