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
import com.zsmart.communale.service.facade.TaxeTrimSejourService;
import com.zsmart.communale.bean.TaxeTrimSejour;
import com.zsmart.communale.ws.rest.vo.TaxeTrimSejourVo;
import com.zsmart.communale.ws.rest.converter.TaxeTrimSejourConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/TaxeTrimSejour")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TaxeTrimSejourRest {

 @Autowired 
 private TaxeTrimSejourService taxeTrimSejourService;

 @Autowired 
private TaxeTrimSejourConverter taxeTrimSejourConverter ;

@PostMapping("/")
public TaxeTrimSejourVo save(@RequestBody TaxeTrimSejourVo taxeTrimSejourVo){
TaxeTrimSejour taxeTrimSejour= taxeTrimSejourConverter.toItem(taxeTrimSejourVo);
return taxeTrimSejourConverter.toVo(taxeTrimSejourService.save(taxeTrimSejour));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
taxeTrimSejourService.deleteById(id);
}
@GetMapping("/")
public List<TaxeTrimSejourVo> findAll(){
return taxeTrimSejourConverter.toVo(taxeTrimSejourService.findAll());
}

 public TaxeTrimSejourConverter getTaxeTrimSejourConverter(){
return taxeTrimSejourConverter;
}
 
 public void setTaxeTrimSejourConverter(TaxeTrimSejourConverter taxeTrimSejourConverter){
this.taxeTrimSejourConverter=taxeTrimSejourConverter;
}

 public TaxeTrimSejourService getTaxeTrimSejourService(){
return taxeTrimSejourService;
}
 
 public void setTaxeTrimSejourService(TaxeTrimSejourService taxeTrimSejourService){
this.taxeTrimSejourService=taxeTrimSejourService;
}

}