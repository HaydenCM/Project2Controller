import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    public Stage primaryStage;

    public Button nextButton;
    public Button previousButton;
    public TextField BookTitle;
    public TextField Publisher;
    public TextField Author;
    public TextField PublishDate;
    public TextField NumberVolumes;
    public Button ImportButton;

    public void initialize() {


        Manga nextManga = Manga.getNext();
        if (nextManga == null) {
            return;
        }
        BookTitle.setText(nextManga.getTitle());
        Publisher.setText(nextManga.getPublisher());
        Author.setText(nextManga.getAuthor());
        PublishDate.setText(nextManga.getPublish());
        NumberVolumes.setText(Integer.toString(nextManga.getVolumes()));

    }

    public void previousButtonPressed() {
Manga nextManga = Manga.getPrev();
        if (nextManga == null) {
            return;
        }

        BookTitle.setText(nextManga.getTitle());
        Publisher.setText(nextManga.getPublisher());
        Author.setText(nextManga.getAuthor());
        PublishDate.setText(nextManga.getPublish());
        NumberVolumes.setText(Integer.toString(nextManga.getVolumes()));
        // HELLO button got pressed!!!
    }
    public void nextButtonPressed() {
Manga nextManga = Manga.getNext();
        if (nextManga == null) {
            return;
        }

        BookTitle.setText(nextManga.getTitle());
        Publisher.setText(nextManga.getPublisher());
        Author.setText(nextManga.getAuthor());
        PublishDate.setText(nextManga.getPublish());
        NumberVolumes.setText(Integer.toString(nextManga.getVolumes()));
            // HI My button got pressed!!!

    }

   public void importButtonPressed() {
       // Bring up File chooser to choose image
       FileChooser dataChooser = new FileChooser();
       dataChooser.setTitle("Choose Data");
       File where = dataChooser.showOpenDialog(this.primaryStage);

       Manga.readManga(where);

    }
}