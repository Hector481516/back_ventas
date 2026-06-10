package com.erp.backventas.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "clientes")
@Setter
@Getter
@NoArgsConstructor
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clave;
    private String nombre;
    private String a_paterno;
    private String a_materno;
    private String telefono;
    private String direccion;
    private Date f_alta;
}
