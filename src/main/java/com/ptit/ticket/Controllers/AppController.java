package com.ptit.ticket.Controllers;

import com.ptit.ticket.Models.Category;
import com.ptit.ticket.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(path = "trangchu")
//http:localhost:8080/trang-chu
public class AppController {
    @Autowired //Inject "categoryRepository" - Dependency Injection
    private CategoryRepository categoryRepository;
    @RequestMapping(path = "trangchu",method = RequestMethod.GET)
    public  String GetAllCategory(ModelMap modelMap){
        Iterable<Category> categories = categoryRepository.findAll();
        modelMap.addAttribute("categories",categories);
        System.out.println("s");
        return "home";
    }
}
