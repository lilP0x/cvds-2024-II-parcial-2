package co.edu.eci.cvds.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.eci.cvds.model.Parcial;
import co.edu.eci.cvds.service.ParcialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping(value = "/Parcial")
public class ParcialController {

    private final ParcialService parcialService;

    @Autowired
    public ParcialController(ParcialService parcialService) {
        this.parcialService = parcialService;
    }


    @GetMapping("/example/api")
    public String exampleApi() {
        return "example-api";
    }

    @GetMapping("/example/api/configurations")
    @ResponseBody
    public List<Parcial> exampleApiParcial() {
        return parcialService.getAllParcial();
    }

    @PostMapping("/example/api/configurations")
    @ResponseBody
    public List<Parcial> exampleApiConfigurations(@RequestBody Parcial parcial) {
        parcialService.addParcial(parcial);
        return parcialService.getAllParcial();
    }
}
