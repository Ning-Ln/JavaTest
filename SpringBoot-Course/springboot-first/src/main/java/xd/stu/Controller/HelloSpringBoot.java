package xd.stu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xd.stu.vo.Student;

import javax.annotation.Resource;

@Controller
public class HelloSpringBoot {
    @Resource
    private Student student;
    @RequestMapping("/some.do")
    @ResponseBody
    public String dosome(){
        return "欢迎使用SpringBoot！"+student;
    }

    @RequestMapping("/other.do")
    @ResponseBody
    public String doother(){
        return "不欢迎使用SpringBoot！"+student;
    }
}
