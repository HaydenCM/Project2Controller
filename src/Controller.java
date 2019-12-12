import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public Button nextButton;
    public Button previousButton;
    public TextField BookTitle;
    public TextField Publisher;
    public TextField Author;
    public TextField PublishDate;
    public TextField NumberVolumes;

    public void initialize() {


        Manga nextManga = Manga.getNext();
        BookTitle.setText(nextManga.getTitle());
        Publisher.setText(nextManga.getPublisher());
        Author.setText(nextManga.getAuthor());
        PublishDate.setText(nextManga.getPublish());
        NumberVolumes.setText(Integer.toString(nextManga.getVolumes()));

    }

    public void previousButtonPressed() {
Manga nextManga = Manga.getPrev();
        BookTitle.setText(nextManga.getTitle());
        Publisher.setText(nextManga.getPublisher());
        Author.setText(nextManga.getAuthor());
        PublishDate.setText(nextManga.getPublish());
        NumberVolumes.setText(Integer.toString(nextManga.getVolumes()));
        // HELLO button got pressed!!!
    }
    public void nextButtonPressed() {
Manga nextManga = Manga.getNext();
        BookTitle.setText(nextManga.getTitle());
        Publisher.setText(nextManga.getPublisher());
        Author.setText(nextManga.getAuthor());
        PublishDate.setText(nextManga.getPublish());
        NumberVolumes.setText(Integer.toString(nextManga.getVolumes()));
            // HI My button got pressed!!!

    }
}