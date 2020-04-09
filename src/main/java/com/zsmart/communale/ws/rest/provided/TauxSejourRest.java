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
import com.zsmart.communale.service.facade.TauxSejourService;
import com.zsmart.communale.bean.TauxSejour;
import com.zsmart.communale.ws.rest.vo.TauxSejourVo;
import com.zsmart.communale.ws.rest.converter.TauxSejourConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/TauxSejour")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TauxSejourRest {

 @Autowired 
 private TauxSejourService tauxSejourService;

 @Autowired 
private TauxSejourConverter tauxSejourConverter ;

@PostMapping("/")
public TauxSejourVo save(@RequestBody TauxSejourVo tauxSejourVo){
TauxSejour tauxSejour= tauxSejourConverter.toItem(tauxSejourVo);
return tauxSejourConverter.toVo(tauxSejourService.save(tauxSejour));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
tauxSejourService.deleteById(id);
}
@GetMapping("/")
public List<TauxSejourVo> findAll(){
return tauxSejourConverter.toVo(tauxSejourService.findAll());
}

 public TauxSejourConverter getTauxSejourConverter(){
return tauxSejourConverter;
}
 
 public void setTauxSejourConverter(TauxSejourConverter tauxSejourConverter){
this.tauxSejourConverter=tauxSejourConverter;
}

 public TauxSejourService getTauxSejourService(){
return tauxSejourService;
}
 
 public void setTauxSejourService(TauxSejourService tauxSejourService){
this.tauxSejourService=tauxSejourService;
}

}