package pet.clinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pet.clinic.services.VetService;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets"})
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll() );

        return "/vets/listVets";
    }
}
