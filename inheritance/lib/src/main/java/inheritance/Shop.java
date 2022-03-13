package inheritance;

import java.util.ArrayList;

public class Shop extends Review {
    private String name;
    private String description;
    private int dollarNumbers;
    private int starsNum;
    private int numOfRev = 0;
    protected ArrayList<Review> reviews = new ArrayList<>();

    public Shop(String name, String description, int dollarNumbers) {
        super(name);
        this.name = name;
        this.description = description;
        this.dollarNumbers = dollarNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDollarNumbers() {
        return dollarNumbers;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setDollarNumbers(int dollarNumbers) {
        this.dollarNumbers = dollarNumbers;
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollarNumbers=" + dollarNumbers +
                ", starsNum=" + starsNum +
                ", Reviews=" + reviews +
                '}';
    }
    public void addReview(String author  , String body ,  int starsNum) {
        Review newRev = new Review(author,body, starsNum,"I'm interested");
        this.reviews.add(newRev);
        this.numOfRev= this.numOfRev + newRev.getNumOfStars();
        this.starsNum = (this.numOfRev / this.reviews.size());
    }


}
