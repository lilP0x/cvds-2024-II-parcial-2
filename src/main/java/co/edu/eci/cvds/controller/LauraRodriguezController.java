package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.LauraRodriguez;
import co.edu.eci.cvds.service.LauraRodriguezService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/laura_rodriguez")
public class LauraRodriguezController {
    private final LauraRodriguezService lauraRodriguezService;
    @Autowired
    public LauraRodriguezController(LauraRodriguezService lauraRodriguezService) {
        this.lauraRodriguezService = lauraRodriguezService;
    }
    @GetMapping("")
    public String apiParcial() {
        return "index";
    }
    @GetMapping("/parcial")
    @ResponseBody
    public List<LauraRodriguez> toList() {
        return lauraRodriguezService.getAllLauraRodriguez();
    }

   }

