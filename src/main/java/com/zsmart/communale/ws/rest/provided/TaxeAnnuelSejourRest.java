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
import com.zsmart.communale.service.facade.TaxeAnnuelSejourService;
import com.zsmart.communale.bean.TaxeAnnuelSejour;
import com.zsmart.communale.ws.rest.vo.TaxeAnnuelSejourVo;
import com.zsmart.communale.ws.rest.converter.TaxeAnnuelSejourConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/TaxeAnnuelSejour")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TaxeAnnuelSejourRest {

 @Autowired 
 private TaxeAnnuelSejourService taxeAnnuelSejourService;

 @Autowired 
private TaxeAnnuelSejourConverter taxeAnnuelSejourConverter ;

@PostMapping("/")
public TaxeAnnuelSejourVo save(@RequestBody TaxeAnnuelSejourVo taxeAnnuelSejourVo){
TaxeAnnuelSejour taxeAnnuelSejour= taxeAnnuelSejourConverter.toItem(taxeAnnuelSejourVo);
return taxeAnnuelSejourConverter.toVo(taxeAnnuelSejourService.save(taxeAnnuelSejour));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
taxeAnnuelSejourService.deleteById(id);
}
@GetMapping("/")
public List<TaxeAnnuelSejourVo> findAll(){
return taxeAnnuelSejourConverter.toVo(taxeAnnuelSejourService.findAll());
}

 public TaxeAnnuelSejourConverter getTaxeAnnuelSejourConverter(){
return taxeAnnuelSejourConverter;
}
 
 public void setTaxeAnnuelSejourConverter(TaxeAnnuelSejourConverter taxeAnnuelSejourConverter){
this.taxeAnnuelSejourConverter=taxeAnnuelSejourConverter;
}

 public TaxeAnnuelSejourService getTaxeAnnuelSejourService(){
return taxeAnnuelSejourService;
}
 
 public void setTaxeAnnuelSejourService(TaxeAnnuelSejourService taxeAnnuelSejourService){
this.taxeAnnuelSejourService=taxeAnnuelSejourService;
}

}