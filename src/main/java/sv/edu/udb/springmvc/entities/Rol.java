/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.udb.springmvc.entities;

import jakarta.persistence.*;
import java.util.Set;
/**
 *
 * @author Drosselmeyer
 */
@Entity
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToMany(mappedBy = "roles")
    private Set<Usuario> usuarios;

    // Getters y setters
}
