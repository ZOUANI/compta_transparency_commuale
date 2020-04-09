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
import com.zsmart.communale.service.facade.TaxeAnnuelBoissonService;
import com.zsmart.communale.bean.TaxeAnnuelBoisson;
import com.zsmart.communale.ws.rest.vo.TaxeAnnuelBoissonVo;
import com.zsmart.communale.ws.rest.converter.TaxeAnnuelBoissonConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/TaxeAnnuelBoisson")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TaxeAnnuelBoissonRest {

 @Autowired 
 private TaxeAnnuelBoissonService taxeAnnuelBoissonService;

 @Autowired 
private TaxeAnnuelBoissonConverter taxeAnnuelBoissonConverter ;

@PostMapping("/")
public TaxeAnnuelBoissonVo save(@RequestBody TaxeAnnuelBoissonVo taxeAnnuelBoissonVo){
TaxeAnnuelBoisson taxeAnnuelBoisson= taxeAnnuelBoissonConverter.toItem(taxeAnnuelBoissonVo);
return taxeAnnuelBoissonConverter.toVo(taxeAnnuelBoissonService.save(taxeAnnuelBoisson));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
taxeAnnuelBoissonService.deleteById(id);
}
@GetMapping("/")
public List<TaxeAnnuelBoissonVo> findAll(){
return taxeAnnuelBoissonConverter.toVo(taxeAnnuelBoissonService.findAll());
}

 public TaxeAnnuelBoissonConverter getTaxeAnnuelBoissonConverter(){
return taxeAnnuelBoissonConverter;
}
 
 public void setTaxeAnnuelBoissonConverter(TaxeAnnuelBoissonConverter taxeAnnuelBoissonConverter){
this.taxeAnnuelBoissonConverter=taxeAnnuelBoissonConverter;
}

 public TaxeAnnuelBoissonService getTaxeAnnuelBoissonService(){
return taxeAnnuelBoissonService;
}
 
 public void setTaxeAnnuelBoissonService(TaxeAnnuelBoissonService taxeAnnuelBoissonService){
this.taxeAnnuelBoissonService=taxeAnnuelBoissonService;
}

}