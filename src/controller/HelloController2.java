package controller;

import com.xuhh.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
@RequestMapping("/s2")
@Controller
public class HelloController2 {
    private final static String SUCCESS ="hello";
    /***
     * @auther: xuhh
     * @date: 21:59 2018/10/5
     * 由@ModelAttribute标记的方法，会在每个目标方法执行之前被springmvc调用！
     */
    @ModelAttribute
    public void getUser(@RequestParam(value = "id",required = false) Integer id,
                        Map<String,Object> map){
        System.out.println("ModelAttribute!");
        if(id != null){
            User user = new  User(1, "Tom",  "123456", "tom@xuhh.com",  12);
            System.out.println("模拟从数据库中获取对象："+user);
            map.put("user",user);
        }
    }
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute( User user){
        System.out.println("修改： user"+user);
        return SUCCESS;
    }
}
