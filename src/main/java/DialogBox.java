import java.util.Collections;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * A chat bubble paired with an avatar.
 */
public class DialogBox extends HBox {
    private final Label dialog;
    private final ImageView displayPicture;

    private DialogBox(String text, Image image) {
        dialog = new Label(text);
        displayPicture = new ImageView(image);

        dialog.setWrapText(true);
        dialog.setMaxWidth(260);
        displayPicture.setFitWidth(64);
        displayPicture.setFitHeight(64);
        displayPicture.setPreserveRatio(true);

        setAlignment(Pos.TOP_RIGHT);
        setSpacing(5);
        getChildren().addAll(dialog, displayPicture);
    }

    private void flip() {
        setAlignment(Pos.TOP_LEFT);
        Collections.reverse(getChildren());
    }

    public static DialogBox getUserDialog(String text, Image image) {
        return new DialogBox(text, image);
    }

    public static DialogBox getDukeDialog(String text, Image image) {
        DialogBox dialogBox = new DialogBox(text, image);
        dialogBox.flip();
        return dialogBox;
    }
}
