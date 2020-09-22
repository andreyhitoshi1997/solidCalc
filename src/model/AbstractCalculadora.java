package model;

public abstract class AbstractCalculadora implements Operacoes {

        private Integer a;
        private Integer b;

    @Override
    public int somar(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int subtrair(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiplicar(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public int dividir(Integer a, Integer b) {
        return a / b;
    }
}
