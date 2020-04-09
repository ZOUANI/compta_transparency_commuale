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
import com.zsmart.communale.service.facade.LocaleService;
import com.zsmart.communale.bean.Locale;
import com.zsmart.communale.ws.rest.vo.LocaleVo;
import com.zsmart.communale.ws.rest.converter.LocaleConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/Locale")
@CrossOrigin(origins = {"http://localhost:4200"})
public class LocaleRest {

 @Autowired 
 private LocaleService localeService;

 @Autowired 
private LocaleConverter localeConverter ;

@PostMapping("/")
public LocaleVo save(@RequestBody LocaleVo localeVo){
Locale locale= localeConverter.toItem(localeVo);
return localeConverter.toVo(localeService.save(locale));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
localeService.deleteById(id);
}
@DeleteMapping("/{reference}")
public void  deleteByReference(@PathVariable String  reference){
localeService.deleteByReference(reference);
}
@GetMapping("/")
public List<LocaleVo> findAll(){
return localeConverter.toVo(localeService.findAll());
}

 public LocaleConverter getLocaleConverter(){
return localeConverter;
}
 
 public void setLocaleConverter(LocaleConverter localeConverter){
this.localeConverter=localeConverter;
}

 public LocaleService getLocaleService(){
return localeService;
}
 
 public void setLocaleService(LocaleService localeService){
this.localeService=localeService;
}

}