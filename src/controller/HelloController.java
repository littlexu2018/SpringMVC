package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.portlet.ModelAndView;

@RequestMapping("/s1")
@Controller
public class HelloController {
    private final static String SUCCESS ="hello";

    @RequestMapping(value ="/testRequestParam")
    public  String testRequestParam(@RequestParam(value = "username",required = false ,defaultValue = "123") String un,
                                    @RequestParam(value = "age") int age){
        System.out.println("testRequestParam , username  "+un+"  age: "+age);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public  String testRestPUT(@PathVariable Integer id){
        System.out.println("testRest PUT:"+id);
        return SUCCESS;
    }
    @RequestMapping(value = "/testRest",method = RequestMethod.POST)
    public  String testRest(){
        System.out.println("testRest POST");
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.GET)
    public  String testRest(@PathVariable Integer id){
        System.out.println("testRest get id is:"+id);
        return SUCCESS;
    }

    @RequestMapping("/hello.action")
    public String hello(ModelMap mv) {
        mv.addAttribute("msg", "hello mvc");
        return SUCCESS;
    }
    @RequestMapping("/testPathVariable/{id}")
    public  String testPathVariable(@PathVariable("id") Integer id2){
        System.out.println("testPathVariable :"+id2);
        return SUCCESS;
    }
    @RequestMapping(value = "testParamsAndHeaders" ,params = {"username","age!=10"})
    public String testParamsAndHeaders(){
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }
@RequestMapping( value = "testMethod",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod");
        return SUCCESS;
    }

}