package top.cloudev.doc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 我写的第一个REST控制器接口，仅用于演示
 * Created by Mac.Manon on 2018/04/04
 */
@RestController
public class HomeController {

    /**
     * hello spring cloud
     * GET: /hello
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return "hello, spring cloud!";
    }
}