package com.startupforge.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // This allows your HTML file to talk to Java
public class TeamController {

    @Autowired
    private TeamRepository repository;

    @PostMapping("/submit")
    public Team submitProject(@RequestBody Team team) {
        System.out.println("Received: " + team.getTeamName()); // Print to console for debugging
        return repository.save(team);
    }
}