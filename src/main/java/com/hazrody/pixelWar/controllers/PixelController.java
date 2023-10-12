package com.hazrody.pixelWar.controllers;

import com.hazrody.pixelWar.services.PixelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/pixels")
@CrossOrigin(origins = "*")
public class PixelController {

    @Autowired
    PixelService pixelService;

    @GetMapping
    public List<Object> getAll() {
        return pixelService.getAllPixel();
    }
}





