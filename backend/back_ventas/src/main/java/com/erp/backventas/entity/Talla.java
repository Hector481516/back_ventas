package com.erp.backventas.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tallas")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String descripcion;
}