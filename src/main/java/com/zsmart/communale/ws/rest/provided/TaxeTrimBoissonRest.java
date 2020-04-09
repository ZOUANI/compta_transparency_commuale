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
import com.zsmart.communale.service.facade.TaxeTrimBoissonService;
import com.zsmart.communale.bean.TaxeTrimBoisson;
import com.zsmart.communale.ws.rest.vo.TaxeTrimBoissonVo;
import com.zsmart.communale.ws.rest.converter.TaxeTrimBoissonConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/TaxeTrimBoisson")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TaxeTrimBoissonRest {

 @Autowired 
 private TaxeTrimBoissonService taxeTrimBoissonService;

 @Autowired 
private TaxeTrimBoissonConverter taxeTrimBoissonConverter ;

@PostMapping("/")
public TaxeTrimBoissonVo save(@RequestBody TaxeTrimBoissonVo taxeTrimBoissonVo){
TaxeTrimBoisson taxeTrimBoisson= taxeTrimBoissonConverter.toItem(taxeTrimBoissonVo);
return taxeTrimBoissonConverter.toVo(taxeTrimBoissonService.save(taxeTrimBoisson));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
taxeTrimBoissonService.deleteById(id);
}
@GetMapping("/")
public List<TaxeTrimBoissonVo> findAll(){
return taxeTrimBoissonConverter.toVo(taxeTrimBoissonService.findAll());
}

 public TaxeTrimBoissonConverter getTaxeTrimBoissonConverter(){
return taxeTrimBoissonConverter;
}
 
 public void setTaxeTrimBoissonConverter(TaxeTrimBoissonConverter taxeTrimBoissonConverter){
this.taxeTrimBoissonConverter=taxeTrimBoissonConverter;
}

 public TaxeTrimBoissonService getTaxeTrimBoissonService(){
return taxeTrimBoissonService;
}
 
 public void setTaxeTrimBoissonService(TaxeTrimBoissonService taxeTrimBoissonService){
this.taxeTrimBoissonService=taxeTrimBoissonService;
}

}