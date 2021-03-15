package javamodule.core;

import javamodule.core.util.operacao.javamodular.Calculadora;

public class Runner {
    public static void main(String[] args) {
Calculadora calculadora=new Calculadora();
        System.out.println(calculadora.mod(100,6));

    }
}
