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
import com.zsmart.communale.service.facade.RueService;
import com.zsmart.communale.bean.Rue;
import com.zsmart.communale.ws.rest.vo.RueVo;
import com.zsmart.communale.ws.rest.converter.RueConverter;
import com.zsmart.communale.service.util.* ;
@RestController
@RequestMapping("/communale/Rue")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RueRest {

 @Autowired 
 private RueService rueService;

 @Autowired 
private RueConverter rueConverter ;

@PostMapping("/")
public RueVo save(@RequestBody RueVo rueVo){
Rue rue= rueConverter.toItem(rueVo);
return rueConverter.toVo(rueService.save(rue));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
rueService.deleteById(id);
}
@GetMapping("/")
public List<RueVo> findAll(){
return rueConverter.toVo(rueService.findAll());
}

 public RueConverter getRueConverter(){
return rueConverter;
}
 
 public void setRueConverter(RueConverter rueConverter){
this.rueConverter=rueConverter;
}

 public RueService getRueService(){
return rueService;
}
 
 public void setRueService(RueService rueService){
this.rueService=rueService;
}

}