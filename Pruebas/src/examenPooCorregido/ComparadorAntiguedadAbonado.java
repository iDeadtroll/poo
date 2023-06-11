/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenPooCorregido;

/**
 *
 * @author Deadtroll
 */
import java.util.Comparator;
public class ComparadorAntiguedadAbonado implements Comparator {
 public int compare(Object o1, Object o2) {
 Abonado a1 = (Abonado) o1;
 Abonado a2 = (Abonado) o2;
 int cmp = 0;
 if (a1.isActivo() && !a2.isActivo()) {
 cmp = -1;
 } else if (!a1.isActivo() && a2.isActivo()) {
 cmp = 1;
 } else {
 cmp = a1.getApellidos().compareToIgnoreCase(a2.getApellidos());
 if (cmp == 0) {
 cmp = a1.getNombre().compareToIgnoreCase(a2.getNombre());
 }
 }
 return cmp;
 }
}

