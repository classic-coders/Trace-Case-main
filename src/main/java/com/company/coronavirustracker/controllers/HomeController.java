package com.company.coronavirustracker.controllers;

import com.company.coronavirustracker.models.LocationStats;
import com.company.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    private final CoronaVirusDataService coronaVirusDataService;

    @Autowired
    public HomeController(CoronaVirusDataService coronaVirusDataService) {
        this.coronaVirusDataService = coronaVirusDataService;
    }

    @GetMapping("/")
    public String home(Model model) {
        // Fetch all location stats from the service
        List<LocationStats> locationStats = coronaVirusDataService.getAllStats();

        // Extract countries and total cases
        List<String> countries = locationStats.stream()
                .map(LocationStats::getCountry)
                .collect(Collectors.toList());

        List<Integer> totalCases = locationStats.stream()
                .map(LocationStats::getLatestTotalCases)
                .collect(Collectors.toList());

        model.addAttribute("countries", countries);
        model.addAttribute("totalCases", totalCases);
        model.addAttribute("locationStats", locationStats);

        return "home";
    }
}
