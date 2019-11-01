package wb.wust.javaweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/") // 根目录，当什么都不输入时，默认访问此项目的index模板
    /*public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }*/
    public String index(){
        return "index";
    }
}
