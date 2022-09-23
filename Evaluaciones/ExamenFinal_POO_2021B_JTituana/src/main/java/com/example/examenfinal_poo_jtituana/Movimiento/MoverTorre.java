package com.example.examenfinal_poo_jtituana.Movimiento;

import com.example.examenfinal_poo_jtituana.Modelos.Pieza;

import java.util.Set;

public class MoverTorre implements Mover{

    private int curX;
    private int curY;

    public MoverTorre() {
    }

    public MoverTorre(int curX, int curY) {
        this.curX = curX;
        this.curY = curY;
    }


    public  static boolean isOverPiece(int stX,int stY,int edX,int edY,Set<Pieza> PiezasAjedrez){
        for(Pieza e:PiezasAjedrez)
            if((e.getFila()>stY&&e.getColum()<edY)&&e.getColum()==stX||
                    (e.getColum()>stX&&e.getColum()<edX&&e.getFila()==stY))
                return true;
        return false;
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
        if(x!=curX&&y!=curY)
            return false;
        if(isOverPiece(Math.min(curX,x),Math.min(curY,y),
                Math.max(curX,x),Math.max(curY,y),chessPieces))
            return false;
        curX = x;
        curY = y;
        return true;
    }
}
