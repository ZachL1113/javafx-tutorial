import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Builds the chat interface using Java code.
 */
public class Main extends Application {
    private final Image userImage = new Image(
            Main.class.getResourceAsStream("/images/DaUser.png"));
    private final Image dukeImage = new Image(
            Main.class.getResourceAsStream("/images/DaDuke.png"));

    @Override
    public void start(Stage stage) {
        ScrollPane scrollPane = new ScrollPane();
        VBox dialogContainer = new VBox(8);
        TextField userInput = new TextField();
        Button sendButton = new Button("Send");
        AnchorPane mainLayout = new AnchorPane();

        scrollPane.setContent(dialogContainer);
        scrollPane.setFitToWidth(true);
        dialogContainer.getChildren().addAll(
                new DialogBox("Hello! I'm the user.", userImage),
                new DialogBox("Hello! I'm Duke.", dukeImage));

        mainLayout.getChildren().addAll(scrollPane, userInput, sendButton);
        AnchorPane.setTopAnchor(scrollPane, 1.0);
        AnchorPane.setLeftAnchor(scrollPane, 1.0);
        AnchorPane.setRightAnchor(scrollPane, 1.0);
        AnchorPane.setBottomAnchor(scrollPane, 45.0);
        AnchorPane.setLeftAnchor(userInput, 1.0);
        AnchorPane.setRightAnchor(userInput, 76.0);
        AnchorPane.setBottomAnchor(userInput, 1.0);
        AnchorPane.setRightAnchor(sendButton, 1.0);
        AnchorPane.setBottomAnchor(sendButton, 1.0);
        userInput.setPrefHeight(40);
        sendButton.setPrefSize(75, 40);

        Scene scene = new Scene(mainLayout, 400, 600);
        stage.setTitle("Duke");
        stage.setScene(scene);
        stage.show();
    }
}
