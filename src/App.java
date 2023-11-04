import operacoes.Operacao;
import operacoes.Soma;
import operacoes.Subtracao;
import operacoes.Divisao;
import operacoes.Multiplicacao;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
        /*
         * Operacao soma = new Soma();
         * Operacao sub = new Subtracao();
         * Operacao mult = new Multiplicacao();
         * Operacao div = new Divisao();
         * 
         * Operacao list[] = { soma, sub, mult, div };
         * 
         * for (int i = 0; i < 4; i++) {
         * double x = 3.5, y = 7.43598374;
         * System.out.println(x + list[i].toString() + y + " = " + list[i].executar(x,
         * y));
         * System.out.println(x + list[i].toString() + y + " = " + list[i].executar(x,
         * y, 5));
         * }
         */

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = fxmlloader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}