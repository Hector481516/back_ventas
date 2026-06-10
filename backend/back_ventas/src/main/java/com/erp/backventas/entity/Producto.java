package com.erp.backventas.entity;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date f_alta;
    @ManyToOne
    @JoinColumn(name = "talla_id")
    private Talla talla;
    @ManyToOne
    @JoinColumn(name = "modelo_detalle_id")
    private ModeloDetalle modeloDetalle;
}