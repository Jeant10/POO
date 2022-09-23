package com.example.examenfinal_poo_jtituana.Modelos;

import com.example.examenfinal_poo_jtituana.Piezas;

public class Pieza {
    Piezas tipo;
    int fila;
    int colum;

    public Pieza(Piezas tipo, int fila, int colum) {
        this.tipo = tipo;
        this.fila = fila;
        this.colum = colum;
    }

    public Piezas getTipo() {
        return tipo;
    }

    public void setTipo(Piezas tipo) {
        this.tipo = tipo;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public char getSide() {
        return 0;
    }
}
