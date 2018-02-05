package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
@Controller
public class MainController {


    @Autowired

    StoreRepository storeRepository;

    @Autowired

    SnackRepository snackRepository;

    @Autowired

    CosmeticReprository cosmeticReprository;

    @Autowired

    CleaningRepository cleaningRepository;

    @RequestMapping("/")
    public String listStore(Model model) {
        model.addAttribute("Store", storeRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String storeForm(Model model) {

        model.addAttribute("Store", new Store());
        return "storeform";
    }


    @PostMapping("/process")
    public String processForm(@Valid Store store, BindingResult result){
        if (result.hasErrors()) {

            return "storeform";
        }
      storeRepository.save(store);
        return "redirect:/";

    }

    @RequestMapping("/cosmetic")
    public String listCosmetic(Model model) {
        model.addAttribute("Costemic", cosmeticReprository.findAll());
        return "costemic";
    }

    @GetMapping("/addcosmetic")
    public String shopCosmetics(Model model) {

        model.addAttribute("Costemic", new Store());
        return "cosmeticform";

    }

    @PostMapping("/processcosmetic")
    public String processForm(@Valid Cosmetic cosmetic, BindingResult result) {
        if (result.hasErrors()) {

            return "costemicform";
        }
        cosmeticReprository.save(cosmetic);
        return "redirect:/costemic";

    }



    @GetMapping("/cleaning")
    public String shopCleaning() {
        return "cleaning";
    }

    @GetMapping("/snack")
    public String shopSnacks() {
        return "snack";
    }

}
