package org.launchcode.controllers;

import data.Planets;
import models.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.AttributedString;

@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(Model, "model") {

        model.addAttribute("planets", Planets.values());
        return "index";
    }
}
