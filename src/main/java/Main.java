import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Shows a minimal JavaFX window.
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label helloWorld = new Label("Hello World!");
        Scene scene = new Scene(helloWorld, 400, 200);

        stage.setTitle("Duke");
        stage.setScene(scene);
        stage.show();
    }
}
