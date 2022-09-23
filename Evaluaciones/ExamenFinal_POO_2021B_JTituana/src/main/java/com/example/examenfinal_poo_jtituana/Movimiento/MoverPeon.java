package com.example.examenfinal_poo_jtituana.Movimiento;

import com.example.examenfinal_poo_jtituana.Modelos.Pieza;

import java.util.Set;

public class MoverPeon implements Mover{
    private int curX;
    private int curY;
    private char side;
    private boolean firstMove = true;

    public MoverPeon(int curX, int curY,char side) {
        this.curX = curX;
        this.curY = curY;
        this.side = side;
    }


    public boolean isFirstMove() {
        return firstMove;
    }

    public void setFirstMove(boolean firstMove) {
        this.firstMove = firstMove;
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
        if(curY==y){
            switch (side){
                case 'B': {
                    if(isFirstMove()&&(x==curX+1||curX+2==x)){
                        setFirstMove(false);
                        curY = y;
                        curX = x;
                        return true;
                    }
                    else if(!isFirstMove()&&curX+1==x){
                        curY = y;
                        curX = x;
                        return true;
                    }
                    break;
                }

                case 'W':{
                    if(isFirstMove()&&(x==curX-1||x==curX-2)){
                        setFirstMove(false);
                        curY = y;
                        curX = x;
                        return true;
                    }
                    else if(!isFirstMove()&&curX-1==x){
                        curY = y;
                        curX = x;
                        return true;
                    }
                    break;
                }
            }
        }

        // Movimiento devorador
        for(Pieza e:chessPieces){
            if(Math.abs(e.getFila()-curY)==1){
                if(e.getColum()-curX==1&&e.getSide()=='W'||
                        curX-e.getColum()==1&& e.getSide()=='B'){
                    curY = y;
                    curX = x;
                    return true;
                }

            }
        }

        return false;
    }
}
