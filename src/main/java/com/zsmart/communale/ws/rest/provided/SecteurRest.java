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
import com.zsmart.communale.service.facade.SecteurService;
import com.zsmart.communale.bean.Secteur;
import com.zsmart.communale.ws.rest.vo.SecteurVo;
import com.zsmart.communale.ws.rest.converter.SecteurConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/Secteur")
@CrossOrigin(origins = {"http://localhost:4200"})
public class SecteurRest {

 @Autowired 
 private SecteurService secteurService;

 @Autowired 
private SecteurConverter secteurConverter ;

@PostMapping("/")
public SecteurVo save(@RequestBody SecteurVo secteurVo){
Secteur secteur= secteurConverter.toItem(secteurVo);
return secteurConverter.toVo(secteurService.save(secteur));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
secteurService.deleteById(id);
}
@GetMapping("/")
public List<SecteurVo> findAll(){
return secteurConverter.toVo(secteurService.findAll());
}

 public SecteurConverter getSecteurConverter(){
return secteurConverter;
}
 
 public void setSecteurConverter(SecteurConverter secteurConverter){
this.secteurConverter=secteurConverter;
}

 public SecteurService getSecteurService(){
return secteurService;
}
 
 public void setSecteurService(SecteurService secteurService){
this.secteurService=secteurService;
}

}