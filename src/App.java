

import operacoes.Operacao;
import operacoes.Soma;
import operacoes.Subtracao;
import operacoes.Divisao;
import operacoes.Multiplicacao;

public class App {
    public static void main(String[] args) throws Exception {
        Operacao soma = new Soma();
        Operacao sub = new Subtracao();
        Operacao mult = new Multiplicacao();
        Operacao div = new Divisao();
        
        Operacao list[] = {soma, sub, mult, div};

        for(int i = 0; i<4; i++){
            double x = 3.5, y = 7.43598374;
            System.out.println(x + list[i].toString() + y + " = " + list[i].executar(x, y));
            System.out.println(x + list[i].toString() + y + " = " + list[i].executar(x, y, 5));
        }
        
        
    }
}