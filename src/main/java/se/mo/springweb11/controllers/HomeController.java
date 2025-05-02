package se.mo.springweb11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.mo.springweb11.models.HockeyPlayerRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController extends BaseController {
    @Autowired
    private HockeyPlayerRepository hockeyPlayerRepository;

    @GetMapping("/")
    public String home(Model model) {
        // Hämta saker från databas - tex en lista med HockeyPlayers

        model.addAttribute("players", hockeyPlayerRepository.findAll());
        model.addAttribute("user", "Alex");

        return "home";
    }
    @GetMapping("/profile")
    public String profile(Model model) {
        String user = getLoggedInEmail();
        model.addAttribute("user", user);

        return "profile";

    }
}
