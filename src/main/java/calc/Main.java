package calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Класс окна приложения
 */
public class Main extends Application {

    /**
     * Функция создания окна приложения.
     * @param primaryStage - методы запуска приложения
     * @throws Exception - выброс исключения
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
        primaryStage.setTitle("Calculation");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }

    /**
     * Главный метод
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
