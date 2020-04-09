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
import com.zsmart.communale.service.facade.RedevableService;
import com.zsmart.communale.bean.Redevable;
import com.zsmart.communale.ws.rest.vo.RedevableVo;
import com.zsmart.communale.ws.rest.converter.RedevableConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/Redevable")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RedevableRest {

 @Autowired 
 private RedevableService redevableService;

 @Autowired 
private RedevableConverter redevableConverter ;

@PostMapping("/")
public RedevableVo save(@RequestBody RedevableVo redevableVo){
Redevable redevable= redevableConverter.toItem(redevableVo);
return redevableConverter.toVo(redevableService.save(redevable));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
redevableService.deleteById(id);
}
@GetMapping("/")
public List<RedevableVo> findAll(){
return redevableConverter.toVo(redevableService.findAll());
}

 public RedevableConverter getRedevableConverter(){
return redevableConverter;
}
 
 public void setRedevableConverter(RedevableConverter redevableConverter){
this.redevableConverter=redevableConverter;
}

 public RedevableService getRedevableService(){
return redevableService;
}
 
 public void setRedevableService(RedevableService redevableService){
this.redevableService=redevableService;
}

}