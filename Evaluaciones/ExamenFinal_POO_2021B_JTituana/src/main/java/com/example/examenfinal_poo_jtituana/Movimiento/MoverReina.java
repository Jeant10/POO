package com.example.examenfinal_poo_jtituana.Movimiento;

import com.example.examenfinal_poo_jtituana.Modelos.Pieza;

import java.util.Set;

public class MoverReina implements Mover{

    private int curX;
    private int curY;

    public MoverReina(int curX, int curY) {
        this.curX = curX;
        this.curY = curY;
    }


    public boolean isOverPiece (int stX,int stY,int edX,int edY,Set<Pieza> PiezasAjedrez) {
        for(Pieza e: PiezasAjedrez){
            if(e.getFila()!=stY&&e.getColum()!=stX){
                return MoverAlfil.isOverPiece(stX,stY,edX,edY,PiezasAjedrez);
            }
            else{
                return MoverTorre.isOverPiece(stX,stY,edX,edY,PiezasAjedrez);
            }
        }
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
        if(Math.abs(x-curX)==Math.abs(y-curY)||!(x!=curX&&y!=curY)){
            if(isOverPiece(Math.min(curX,x),Math.min(curY,y),
                    Math.max(curX,x),Math.max(curY,y),chessPieces))
                return false;
            curX = x;
            curY = y;
            return true;
        }
        return false;
    }
}
