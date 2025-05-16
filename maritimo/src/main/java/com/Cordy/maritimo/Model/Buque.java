package com.Cordy.maritimo.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class Buque {
    @Getter @Setter
    private String cod_Buque;

    @Getter @Setter
    private String nombre_buque;

    @Getter @Setter
    private double eslora;

    @Getter @Setter
    private Date fecha_llegada;

    @Getter @Setter
    private Date fecha_salida;
}
