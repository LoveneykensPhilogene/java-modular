package javamodule.core.util.operacao.javamodular.internos;

import javamodule.core.util.operacao.javamodular.Operacao;

public class ModHriple implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a%b;
    }
}
