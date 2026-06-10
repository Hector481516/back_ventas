package com.erp.backventas.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

@Entity
@Table(
    name = "modelo_detalle",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "clave"),
        @UniqueConstraint(columnNames = {"modelo_id", "color_id"})
    }
)
@Setter
@Getter
@NoArgsConstructor
@Builder
public class ModeloDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clave;

    @ManyToOne
    @JoinColumn(name="color_id")
    private Color color;
    
    @ManyToOne
    @JoinColumn(name="modelo_id")
    private Modelo modelo;
}
