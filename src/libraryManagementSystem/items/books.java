package libraryManagementSystem.items;
import libraryManagementSystem.blueprint.item;

import java.util.Scanner;

public class books extends item {
    protected String author;
    protected int edition;
    protected int year;
    public books(String title, String author, int year, int edition){
        super(title);
        this.author =author;
        this.edition=edition;
        this.year = year;
    }

    public books() {
    }
}
