<<<<<<< Updated upstream:Pruebas/src/EjemploComparadores/Persona.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploComparadores;

/**
 *
 * @author Deadtroll
 */
public class Persona {
    private String nombre, apellido;
    private int edad;
    
=======

package examenPooCorregido;

import java.util.Objects;

public class Abonado extends Persona {

    private int numeroAbonado;
    private Fecha fechaAlta;
    private Fecha fechaBaja;
    private boolean activo;

    public Abonado(Persona p, int id) {
        super(p.getNombre(), p.getApellidos(), p.getDni());
        inicializaAbonado(id);
    }

    public Abonado(String n, String a, String d, int s) {
        super(n, a, d);
        inicializaAbonado(s);
    }

    private void inicializaAbonado(int id) {
        numeroAbonado = id;
        fechaAlta = Fecha.hoy();
        fechaBaja = null;
        activo = true;
    }

    public void baja(Fecha fechaBaja) {
        int fechaCompare = fechaBaja.compareTo(fechaAlta);
        if (isActivo()) {
            if (fechaCompare == 1) {
                this.fechaBaja = fechaBaja;
                activo = false;
            } else {
                System.out.println("ERROR: La fecha de baja debe ser posterior a la fecha de alta!");
            }
        } else {
            System.out.println("ERROR: El abonado ya estaba dado de baja");
        }
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {

        String s = "#" + numeroAbonado + " - " + super.toString() + "(Fecha alta: " + fechaAlta + ")";
        if (fechaBaja != null) {
            s = s + " - Fecha baja: " + fechaBaja;
        }
        s += ")";
        return s;

    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Abonado other = (Abonado) obj;
        if (!Objects.equals(getDni(), other.getDni())) {
            return false;
        }
        return true;
    }

>>>>>>> Stashed changes:Pruebas/src/examenPooCorregido/Abonado.java
}
