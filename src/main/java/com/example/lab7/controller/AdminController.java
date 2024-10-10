package com.example.lab7.controller;

import com.example.lab7.repository.MovieProjectionRepository;
import com.example.lab7.repository.MovieRepository;
import com.example.lab7.repository.RoomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {


    final RoomRepository roomRepository;
    final MovieProjectionRepository movieProjectionRepository;
    final MovieRepository movieRepository;

    public AdminController(RoomRepository roomRepository, MovieProjectionRepository movieProjectionRepository, MovieRepository movieRepository) {
        this.roomRepository = roomRepository;
        this.movieProjectionRepository = movieProjectionRepository;
        this.movieRepository = movieRepository;
    }


    @GetMapping("/salas")
    public String showSalas(Model model) {
        model.addAttribute("roomList",roomRepository.findAll());
        return "admin/listaSalas";
    }
    @GetMapping("/proyecciones")
    public String showProyecciones(Model model) {
        model.addAttribute("projectionList",movieProjectionRepository.findAll());
        return "admin/listaProyecciones";
    }
    @GetMapping("/peliculas")
    public String showPeliculas(Model model) {
        model.addAttribute("movieList",movieRepository.findAll());
        return "admin/listaPeliculas";
    }
}
