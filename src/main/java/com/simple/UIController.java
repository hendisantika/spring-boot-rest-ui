package com.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class UIController
{

    @Autowired
    private PlanetRepository planetRepository;

    @RequestMapping("/ui")
    public String home()
    {
        return "index";
    }

    @RequestMapping("/ui/list")
    public String list(Model model)
    {
        Iterable<Planet> planets = planetRepository.findAll();
        model.addAttribute("planets", planets);
        return "list";
    }

    @RequestMapping("/ui/readplanet")
    public String readPlanet(@RequestParam(value="id") String id, Model model)
    {
        Planet planet = planetRepository.findOne(Integer.parseInt(id));
        model.addAttribute("planet", planet);
        return "readplanet";
    }

    @RequestMapping("/ui/addplanet")
    public String addPlanet()
    {
        return "addplanet";
    }
}
