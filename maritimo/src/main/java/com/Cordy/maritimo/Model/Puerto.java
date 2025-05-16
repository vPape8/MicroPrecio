package com.Cordy.maritimo.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Puerto {
    @Getter @Setter
    private int id_Puerto;

    @Getter @Setter
    private String nombre_puerto;

    @Getter @Setter
    private int Tarifa_hora;

    @Getter @Setter
    private int Tarifa_eslora;

    @Getter @Setter
    private int disponibilidad;
}
