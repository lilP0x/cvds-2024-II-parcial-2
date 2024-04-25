package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.DanielAcero;
import co.edu.eci.cvds.service.DanielAceroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/laura_rodriguez")
public class DanielAceroController {
    private final DanielAceroService DanielAceroService;
    @Autowired
    public DanielAceroController(LauraRodriguezService lauraRodriguezService) {
        this.lauraRodriguezService = lauraRodriguezService;
    }
    @GetMapping("")
    public String apiParcial() {
        return "index";
    }
    @GetMapping("/parcial")
    @ResponseBody
    public List<DanielAcero> toList() {
        return DanielAceroService.getAllDanielAcero();
    }

   }
