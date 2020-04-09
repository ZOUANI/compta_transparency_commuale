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
import com.zsmart.communale.service.facade.QuartierService;
import com.zsmart.communale.bean.Quartier;
import com.zsmart.communale.ws.rest.vo.QuartierVo;
import com.zsmart.communale.ws.rest.converter.QuartierConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/Quartier")
@CrossOrigin(origins = {"http://localhost:4200"})
public class QuartierRest {

 @Autowired 
 private QuartierService quartierService;

 @Autowired 
private QuartierConverter quartierConverter ;

@PostMapping("/")
public QuartierVo save(@RequestBody QuartierVo quartierVo){
Quartier quartier= quartierConverter.toItem(quartierVo);
return quartierConverter.toVo(quartierService.save(quartier));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
quartierService.deleteById(id);
}
@GetMapping("/")
public List<QuartierVo> findAll(){
return quartierConverter.toVo(quartierService.findAll());
}

 public QuartierConverter getQuartierConverter(){
return quartierConverter;
}
 
 public void setQuartierConverter(QuartierConverter quartierConverter){
this.quartierConverter=quartierConverter;
}

 public QuartierService getQuartierService(){
return quartierService;
}
 
 public void setQuartierService(QuartierService quartierService){
this.quartierService=quartierService;
}

}