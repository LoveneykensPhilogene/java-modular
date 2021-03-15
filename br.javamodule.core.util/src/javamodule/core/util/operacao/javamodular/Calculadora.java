package javamodule.core.util.operacao.javamodular;


import javamodule.core.util.operacao.javamodular.internos.*;

public class Calculadora {
    private SumHriple sumHriple;
    private SubHriple subHriple;
   private MultiHriple multiHriple;
   private DivHriple divHriple;
   private ModHriple modHriple;


    public Calculadora() {
        sumHriple = new SumHriple() ;
        subHriple =new SubHriple();
        multiHriple =new MultiHriple();
        divHriple=new DivHriple();
        modHriple=new ModHriple();

    }
public int sum(int a,int b){
    return sumHriple.execute(a, b);
    }
    public int sub(int a,int b){
        return subHriple.execute(a, b);
    }
    public int multi(int a,int b){
        return multiHriple.execute(a, b);
    }
    public int div(int a,int b){
        return divHriple.execute(a, b);
    }
    public int mod(int a,int b){
        return modHriple.execute(a, b);
    }
}