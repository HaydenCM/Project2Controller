import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Manga extends Book {

    static private ArrayList<Manga> mangas = new ArrayList<Manga>();
static private int currentMangaNumber;
private String publisher;
private String demographic;
private int volumes;

   public Manga(String title, String author, String sales, String publish, String language, String genre, String myPublisher, String myDemographic, int myVolumes) {
        super(title, author, sales, publish, language, genre);
        publisher = myPublisher;
        demographic = myDemographic;
        volumes = myVolumes;
        currentMangaNumber = 0;
    }

    static ArrayList<Manga> readManga(File mangaDataFile) {
        try {
            // scan data file line-by-line
            Scanner scanner = new Scanner(mangaDataFile);
            int ranking = 1;
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                Scanner lineScanner = new Scanner(str);
                lineScanner.useDelimiter("#");
                // scan data files line by separating text between #

                // first 4 data values are always present in each line
                String title = lineScanner.next();
                String author = lineScanner.next();
                String publisher = lineScanner.next();
                String demographic = lineScanner.next();
                int volumes = lineScanner.nextInt();
                String serialized = lineScanner.next();
                String sales = lineScanner.next();

                Manga newAlbum = new Manga(title, author, sales, serialized, "Japanese", "Manga", publisher, demographic, volumes);
                mangas.add(newAlbum);
                ranking = ranking + 1;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mangas;

    }

static Manga getPrev() {
    if (mangas.size() == 0) {
        return null;
    }


    if (currentMangaNumber == 0) {
           currentMangaNumber = mangas.size() - 1;
       } else {
           currentMangaNumber = currentMangaNumber - 1;
       }
       return mangas.get(currentMangaNumber);
}

    static Manga getNext() {
        if (mangas.size() == 0) {
            return null;
        }

        if (currentMangaNumber ==  mangas.size()-1){
            currentMangaNumber = 0;
        } else {

            currentMangaNumber = currentMangaNumber + 1;
        }
        return mangas.get(currentMangaNumber);
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDemographic() {
        return demographic;
    }

    public void setDemographic(String demographic) {
        this.demographic = demographic;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    public void describe() {
//System.out.println(title + " is a " + genre + " book " + " by: " + author + ". Written in " + language + " and it was first published in " + publish + " and sold a total of" + sales + " copies.");

    }
}



