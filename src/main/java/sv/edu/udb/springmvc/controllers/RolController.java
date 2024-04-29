/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.udb.springmvc.controllers;

import sv.edu.udb.springmvc.entities.Rol;
import sv.edu.udb.springmvc.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Drosselmeyer
 */
@Controller
@RequestMapping("/roles")
public class RolController {

    private final RolRepository rolRepository;

    @Autowired
    public RolController(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @GetMapping("/")
    public String listarRoles(Model model) {
        model.addAttribute("roles", rolRepository.findAll());
        return "roles";
    }

    @GetMapping("/crear")
    public String mostrarFormularioCrear(Model model) {
        model.addAttribute("rol", new Rol());
        return "formulario-rol";
    }

    @PostMapping("/guardar")
    public String guardarRol(@ModelAttribute Rol rol) {
        rolRepository.save(rol);
        return "redirect:/roles/";
    }
}