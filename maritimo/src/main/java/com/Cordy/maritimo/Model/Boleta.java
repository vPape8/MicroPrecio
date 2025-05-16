package com.Cordy.maritimo.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.UuidGenerator;
import java.sql.Date;

@Entity
@Table(name="boleta")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Boleta {

    @Id
    @UuidGenerator
    private String idBoleta;

    @Column(name="monto")
    private double monto;

    @Column(name="feche_emision")
    private Date fecha_emision;

    @Column(name="id_funcinoario")
    private String id_funcionario;

}
