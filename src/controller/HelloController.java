package controller;

import com.xuhh.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/s1")
@Controller
public class HelloController {
    private final static String SUCCESS ="hello";

    @RequestMapping("/testModelAndView")
    public  ModelAndView testModelAndView(){
        ModelAndView modelAndView =new ModelAndView(SUCCESS);
        modelAndView.addObject("time",new Date());
        return modelAndView;
    }

    /**
     * @Description:
     *  Spring MVC 会按照请求参数名和pojo属性名进行自动匹配
     *  自动为对象填充属性值，还支持级联属性。如dept.deptId  dept.address.tel
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request+" "+response);
        return SUCCESS;
    }

    @RequestMapping("/testPojo")
    public  String testPojo(User user){
        System.out.println("testPojo : "+user);
        return SUCCESS;
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionId){
		System.out.println("testCookieValue: sessionId：" +sessionId);
		return SUCCESS;
	}
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
