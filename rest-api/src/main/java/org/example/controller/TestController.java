package org.example.controller;

import org.example.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    //GET请求

    /** 不带参数的HTTP GET请求
     *<a href="http://localhost:8080/api/test/v1">访问url</a>
     */
    @GetMapping("v1")
    public String getTest(){

        return "hello test";
    }

    /** 带参数的HTTP GET请求(参数作为url路径的一部分)
     *<a href="http://localhost:8080/api/test/v1/zhangsan">访问url</a>
     */
    @GetMapping("v1/{name}")
    public String getTest2(@PathVariable("name") String nameParam){

        return nameParam;
    }

    /** 带参数的HTTP GET请求
     *<a href="http://localhost:8080/api/test/v2?name=zhangsan">访问url</a>
     */
    @GetMapping("v2")
    public String getTest3(@RequestParam("name") String nameParam){

        return "hello, my name is " + nameParam;
    }

    /** 带参数的HTTP GET请求
     *<a href="http://localhost:8080/api/test/v3?name=zhangsan&age=12">访问url</a>
     */
    @GetMapping("v3")
    public String getTest4(@RequestParam("name") String nameParam,@RequestParam("age") String ageParam){

        return "hello, my name is " + nameParam + ", age is " + ageParam;
    }

    /** 带参数的HTTP GET请求,用实体对象接收参数
     *<a href="http://localhost:8080/api/test/v4?name=zhangsan&age=12">访问url</a>
     */
    @GetMapping("v4")
    public String getTest4(User user){

        return "hello, from object, my name is " + user.getName() + ", age is " + user.getAge();
    }

    //POST请求

    /**不带参数的post请求
     *
     */
    @PostMapping("v1/post")
    public String postTest(){
        return "post without params";
    }

    /**带参数的post请求
     *
     */
    @PostMapping("v2/post")
    public String postTest(@RequestBody User user){
        return "post with params, name=" + user.getName() + ",age=" + user.getAge();
    }

}
