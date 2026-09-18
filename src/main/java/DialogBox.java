import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * A chat bubble paired with an avatar.
 */
public class DialogBox extends HBox {
    public DialogBox(String text, Image image) {
        Label dialog = new Label(text);
        ImageView displayPicture = new ImageView(image);

        dialog.setWrapText(true);
        dialog.setMaxWidth(260);
        displayPicture.setFitWidth(64);
        displayPicture.setFitHeight(64);
        displayPicture.setPreserveRatio(true);

        setAlignment(Pos.TOP_RIGHT);
        setSpacing(5);
        getChildren().addAll(dialog, displayPicture);
    }
}
