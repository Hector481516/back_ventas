package com.erp.backventas.entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

@Entity
@Table(name="modelo")
@Setter
@Getter
@NoArgsConstructor
@Builder
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="marca_id")
    private Marca marca;
}
