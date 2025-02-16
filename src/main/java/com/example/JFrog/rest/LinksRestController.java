package com.example.JFrog.rest;

import com.example.JFrog.entity.Links;
import com.example.JFrog.service.LinksService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api" , produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class LinksRestController {

    private LinksService linksService;

    @GetMapping("/getAllLinks")
    public ResponseEntity<List<Links>> getAllCoordinates(){
        List<Links> linksList = linksService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(linksList);
    }


}
