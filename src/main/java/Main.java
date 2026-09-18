import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Loads the styled chat interface from FXML.
 */
public class Main extends Application {
    private final Duke duke = new Duke();

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane mainLayout = loader.load();
            loader.<MainWindow>getController().setDuke(duke);

            Scene scene = new Scene(mainLayout);
            stage.setTitle("Duke");
            stage.setMinWidth(400);
            stage.setMinHeight(600);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
            throw new RuntimeException("Unable to load the main window", exception);
        }
    }
}
