package com.erp.backventas.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;
import java.util.Date;

@Entity
@Table(
    name = "venta"
)
@Setter
@Getter
@NoArgsConstructor
@Builder
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date f_venta;

    @ManyToOne
    @JoinColumn(name="canal_venta_id")
    private CanalVenta canalVenta;
    
    @ManyToOne
    @JoinColumn(name="tipo_venta_id")
    private TipoVenta tipoVenta;
    
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="estatus_id")
    private Estatus estatus;
}
