package pet.clinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pet.clinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/",  "/owners"})
    public String listOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "/owners/listOwner";

    }
    @RequestMapping("/find")
    public String findOwners(){
        return "notImplementedPage";
    }
}
