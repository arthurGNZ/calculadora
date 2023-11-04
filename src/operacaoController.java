import operacoes.Operacao;
import operacoes.Soma;
import operacoes.Subtracao;
import operacoes.Divisao;
import operacoes.Multiplicacao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class operacaoController {

    @FXML
    private Button botaoDiv;

    @FXML
    private Button botaoMult;

    @FXML
    private Button botaoSoma;

    @FXML
    private Button botaoSub;

    @FXML
    private TextField v1;

    @FXML
    private TextField v2;

    @FXML
    private Label res;

    @FXML
    void dividir(ActionEvent event) {
        Operacao div = new Divisao();
        double valor1;
        double valor2;
        try {
            valor1 = Double.parseDouble(v1.getText());
            valor2 = Double.parseDouble(v2.getText());
            if (valor2 != 0) {
                double resultado = div.executar(valor1, valor2);
                res.setText("Resultado: " + resultado);
                System.out.println(resultado);
            } else {
                res.setText("Erro: Divisão por 0.");
                System.out.println("Divisão por 0");
            }

        } catch (NumberFormatException e) {
            res.setText("Erro: Valor inválido.");
            System.out.println("Erro: Valor inválido.");
        }
    }

    @FXML
    void multiplicar(ActionEvent event) {
        Operacao mult = new Multiplicacao();
        double valor1;
        double valor2;
        try {
            valor1 = Double.parseDouble(v1.getText());
            valor2 = Double.parseDouble(v2.getText());
            double resultado = mult.executar(valor1, valor2);
            System.out.println(resultado);
            res.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            res.setText("Erro: Valor inválido.");
            System.out.println("Erro: Valor inválido.");
        }
    }

    @FXML
    void somar(ActionEvent event) {
        Operacao soma = new Soma();
        double valor1;
        double valor2;
        try {
            valor1 = Double.parseDouble(v1.getText());
            valor2 = Double.parseDouble(v2.getText());
            double resultado = soma.executar(valor1, valor2);
            System.out.println(resultado);
            res.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            res.setText("Erro: Valor inválido.");
            System.out.println("Erro: Valor inválido.");
        }
    }

    @FXML
    void subtrair(ActionEvent event) {
        Operacao sub = new Subtracao();
        double valor1;
        double valor2;
        try {
            valor1 = Double.parseDouble(v1.getText());
            valor2 = Double.parseDouble(v2.getText());
            double resultado = sub.executar(valor1, valor2);
            System.out.println(resultado);
            res.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            res.setText("Erro: Valor inválido.");
            System.out.println("Erro: Valor inválido.");
        }
    }

}
