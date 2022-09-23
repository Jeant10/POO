package edu.epn.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    Calculadora calc= new Calculadora();

    @Test
    public void test_suma(){
        Assert.assertEquals( "7+5",12, calc.suma(7,5),0);
    }

    @Test
    public void test_resta(){
        Assert.assertEquals( "7-5",2, calc.resta(7,5),0);
    }

    @Test
    public void test_multiplicar(){
        Assert.assertEquals( "7*5",35, calc.multiplicar(7,5),0);
    }

    @Test
    public void test_dividir(){
        Assert.assertEquals( "7/5",1.4, calc.dividir(7,5),0);
    }

    @Test(expected = ArithmeticException.class)
    public void test_dividirparacero(){
        calc.dividir(7,0);
    }
}