package javamodule.core.util.operacao.javamodular.internos;

import javamodule.core.util.operacao.javamodular.Operacao;

public class SubHriple implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a-b;
    }
}
