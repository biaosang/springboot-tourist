package org.example.controller;

import org.example.model.User;
import org.example.result.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("1")
    public R<String> test1(){
        return R.success("string value");
    }

    @GetMapping("2")
    public R<User> test2(){
        return R.success(User.builder()
                        .name("张三")
                        .age(11111)
                        .height(60d)
                .build());
    }

    @GetMapping("3")
    public R<?> test3(){
        return R.success();
    }

}
