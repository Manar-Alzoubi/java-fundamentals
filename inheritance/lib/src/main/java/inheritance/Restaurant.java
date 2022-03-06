package inheritance;

import java.util.ArrayList;

public class Restaurant {

    private String name;
    private int numStars ;
    private double priceCategory;


    static ArrayList <Integer> numberOfStars = new ArrayList <Integer>();
    public Restaurant(String name, double priceCategory, int numStars) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.numStars=numStars;
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

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numStars=" + numStars +
                ", priceCategory=" + priceCategory +
                '}';
    }

    public double getPriceCategory() {
        return priceCategory;
    }

int AddReview(Review newRev)
    {
      int sum =0;

        numberOfStars.add(newRev.getNumOfStars());
        for (int i=0; i<numberOfStars.size();i++)
            sum=sum+newRev.getNumOfStars();

      int updateStars= sum/numberOfStars.size();
      this.numStars=updateStars;

        System.out.println("updated stars = "+this.numStars );
        return  this.numStars;
    }












}