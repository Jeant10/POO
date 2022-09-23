package edu.epn.javatests.util;
import org.junit.*;

public class StringUtilTest {

    @Test
    public void repeatStringOnce(){
        Assert.assertEquals( "hola", StringUtil.repeat("hola", 1));

    }

    @Test
    public void repeatStringMultipleTimes(){
        Assert.assertEquals( "holaholaholaholahola", StringUtil.repeat("hola", 5));

    }
    @Test
    public void repeatStringZero(){
        Assert.assertEquals( "", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegative(){
        StringUtil.repeat("hola", -1);

    }

    //Implementa esta función
    // isEmpty
    // , y crea una clase StringUtilTest añadiendo
    // tests que prueben varios escenarios:

    //1.-Probar que un string cualquiera no es vacío
    //2.-Probar que “” es un string vacío
    //3.-Probar que null también es un string vacío
    //4.-Extra: un string con espacios " " también lo queremos considerar como vacío
    // (pista: puedes usar la función trim)


    @Test
    public void test_uno(){
        Assert.assertFalse(StringUtil.isEmpty("hola"));
    }

    @Test
    public void test_dos(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void test_tres(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void test_cuatro(){
        Assert.assertTrue(StringUtil.isEmpty("  "));
    }


}