package com.example.examenfinal_poo_jtituana.Movimiento;

import com.example.examenfinal_poo_jtituana.Modelos.Pieza;

import java.util.Set;

public interface Mover {
    boolean mov(int x, int y, Set<Pieza> chessPieces);
}
