package com.designvault.designvault.controller;

import com.designvault.designvault.model.Asset;
import com.designvault.designvault.service.AssetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssetController {

    private final AssetService service;

    public AssetController(AssetService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("asset", new Asset());
        model.addAttribute("assets", service.getAllAssets());
        return "index";
    }

    @PostMapping("/add")
    public String addAsset(@ModelAttribute Asset asset) {
        service.saveAsset(asset);
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(@RequestParam String category, Model model) {
        model.addAttribute("assets", service.searchByCategory(category));
        model.addAttribute("asset", new Asset());
        return "index";
    }
}