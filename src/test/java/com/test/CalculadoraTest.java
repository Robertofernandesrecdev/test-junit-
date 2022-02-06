package com.test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest{

    @Test
    public void testSomar(){
        calculadora calc = new calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5, soma);    // para validacao dos codigos sao usados asserts"
    }
}
