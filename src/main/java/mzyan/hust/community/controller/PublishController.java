package mzyan.hust.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mzYan on 2020-03-02 01:18
 */
@Controller
public class PublishController {

    @GetMapping("/publish")
    public String publish(){
        return "publish";
    }
}
