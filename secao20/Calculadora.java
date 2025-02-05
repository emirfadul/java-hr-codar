package secao20;

interface Calculadora {

    int somar(int a, int b);

    default int multiplicar(int a, int b) {
        return a * b;
    }

}
