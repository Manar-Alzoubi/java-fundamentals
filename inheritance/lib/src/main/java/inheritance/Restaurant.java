package inheritance;

import java.util.ArrayList;

public class Restaurant extends Review{


    private String name;
    private int numStars ;
    private String priceCategory;

    static ArrayList <Review> reviewArrayList = new ArrayList <>();

    public Restaurant(String name, String priceCategory, int numStars) {
        super(name);
        this.name = name;
        this.priceCategory = priceCategory;
        if (numStars >0 && numStars <=5)
            this.numStars = numStars;
        else
            System.out.println("\n invalid num of stars, please choose number from 0 to 5");

    }



    public void setName(String name) {
        this.name = name;
    }


    public void setPriceCategory() {
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public int getNumStars() {
        return numStars;
    }
    public String getPriceCategory() {
        return priceCategory;
    }

    public void setNumStars(int numStars) {

//        this.numStars = numStars;

        if (numStars>0 || numStars <=5)
            this.numStars = numStars;
        else {
            System.out.println("  invalid input : num of stars must be between 0 and 5 ");
        }

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numStars=" + numStars +
                ", priceCategory=" + priceCategory +
                ", reviews=" + reviewArrayList+
                '}';
    }

    public void AddReview(Review oneReview) {
        reviewArrayList.add(oneReview);
        int sum = 0;
        for (int i=0; i<reviewArrayList.size();i++){
           sum=sum+reviewArrayList.get(i).getNumOfStars();}
        setNumStars( sum / reviewArrayList.size());
        }




}