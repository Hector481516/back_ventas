package com.erp.backventas.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "marcas")
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String descripcion;
}