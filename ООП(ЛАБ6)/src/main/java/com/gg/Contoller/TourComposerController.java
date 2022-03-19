package com.gg.Contoller;


import com.charginovmarsel.spring.mvc.inai.POJO.*;
import com.gg.POJO.Client;
import com.gg.POJO.EventTickets;
import com.gg.POJO.Program;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tourComposer")
public class TourComposerController {

    @RequestMapping("/menu-view")
    public String showMenu(){
        return "menu-view";
    }

    @RequestMapping("/compile-applications-view")
    public String compileApplications(Model model){
        model.addAttribute("ticket",new EventTickets());
        return "tourComposer/compile-applications-view";
    }

    @RequestMapping("/make-program-view")
    public String makeProgram(Model model){
        model.addAttribute("program",new Program());
        return "tourComposer/make-program-view";
    }

    @RequestMapping("/read-customer-review-view")
    public String readCustomerReview(Model model){
        model.addAttribute("client",new Client());
        return "tourComposer/read-customer-review-view";
    }

}
