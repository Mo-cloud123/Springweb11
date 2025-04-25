package se.mo.springweb11.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Hämta saker från databas - tex en lista med HockeyPlayers
        List<String> players = new ArrayList<>();
        players.add("Alex");
        players.add("Bob");
        players.add("Charlie");
        model.addAttribute("players", players);
        model.addAttribute("user", "Alex");

        return "home";
    }
    @GetMapping("/profile")
    public String profile(){
        return "profile";

    }
}
