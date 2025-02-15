package com.example.JFrog.service;

import com.example.JFrog.entity.Links;
import com.example.JFrog.repository.LinksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LinksService {

    private LinksRepository linksRepository;

    public List<Links> findAll(){
        return linksRepository.findAll();
    }
}
