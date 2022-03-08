package inheritance;

public class Review {
    private String body;
    private String author;
    private int starsNum;

    public Review(String body, String author,int starsNum) {
        this.body = body;
        this.author = author;

        if (starsNum >= 0 && starsNum <= 5) {
            this.starsNum = starsNum;
        } else {
        if(starsNum > 5)
            this.starsNum = 5;
            System.out.println("\n invalid num of stars, please choose number from 0 to 5, I will take it as 5");
        }
    }


    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfStars() {
        return starsNum;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStars=" + starsNum +
                '}';
    }
}
