package com.example.examenfinal_poo_jtituana.Movimiento;

import com.example.examenfinal_poo_jtituana.Modelos.Pieza;

import java.util.Set;

public class MoverRey implements Mover {

    private int curX;
    private int curY;

    public MoverRey(int curX, int cuY) {
        this.curX = curX;
        this.curY = cuY;
    }

    public int getCurX() {
        return curX;
    }

    public void setCurX(int curX) {
        this.curX = curX;
    }

    public int getCurY() {
        return curY;
    }

    public void setCurY(int curY) {
        this.curY = curY;
    }

    @Override
    public boolean mov(int x, int y, Set<Pieza> chessPieces) {
        if(Math.abs(curX-x)<=1&&Math.abs(curY-y)<=1){
            curX = x;
            curY = y;
            return true;
        }
        return false;
    }
}
