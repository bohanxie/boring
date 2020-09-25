package pri.working.boring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pri.working.boring.entity.Jj;
import pri.working.boring.service.JjService;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName JjController.java
 * @Description TODO
 * @createTime 2020年09月25日 10:59:00
 */
@RestController
public class JjController {

    @Autowired
    private JjService jjService;

    @GetMapping("/hello")
    public String helloWorld(){
        StringBuilder sb = new StringBuilder();
        for (Jj single: jjService.getAll()) {
            sb.append(single.toString() + "\n");
        }
        return sb.toString();
    }
}
