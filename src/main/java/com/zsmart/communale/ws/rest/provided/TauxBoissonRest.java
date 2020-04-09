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
import com.zsmart.communale.service.facade.TauxBoissonService;
import com.zsmart.communale.bean.TauxBoisson;
import com.zsmart.communale.ws.rest.vo.TauxBoissonVo;
import com.zsmart.communale.ws.rest.converter.TauxBoissonConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/TauxBoisson")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TauxBoissonRest {

 @Autowired 
 private TauxBoissonService tauxBoissonService;

 @Autowired 
private TauxBoissonConverter tauxBoissonConverter ;

@PostMapping("/")
public TauxBoissonVo save(@RequestBody TauxBoissonVo tauxBoissonVo){
TauxBoisson tauxBoisson= tauxBoissonConverter.toItem(tauxBoissonVo);
return tauxBoissonConverter.toVo(tauxBoissonService.save(tauxBoisson));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
tauxBoissonService.deleteById(id);
}
@GetMapping("/")
public List<TauxBoissonVo> findAll(){
return tauxBoissonConverter.toVo(tauxBoissonService.findAll());
}

 public TauxBoissonConverter getTauxBoissonConverter(){
return tauxBoissonConverter;
}
 
 public void setTauxBoissonConverter(TauxBoissonConverter tauxBoissonConverter){
this.tauxBoissonConverter=tauxBoissonConverter;
}

 public TauxBoissonService getTauxBoissonService(){
return tauxBoissonService;
}
 
 public void setTauxBoissonService(TauxBoissonService tauxBoissonService){
this.tauxBoissonService=tauxBoissonService;
}

}