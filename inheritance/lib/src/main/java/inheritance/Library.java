/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        Restaurant Rest1 = new Restaurant("My restaurant", "250",4);
        Review Rev1= new Review("this restaurant is perfect ", "Manar",4, "wonderfull");
        Rest1.AddReview(Rev1);
        System.out.println(Rest1);


        Shop newShop = new Shop("123Shop", "new cloth Shop",100);
        newShop.addReview("\"Toys Shop", "Sadan", 5);

        System.out.println(newShop);

        Theater theater = new Theater("Sadan Theater","new ");

        theater.addMovie("Frozen");
        theater.addReview("kids movie", "Elien",4, "nice " );
        theater.addMovie("Home Alone");
        theater.movAddReview("Home Alone", "New year movie", 5,"I like it");
        System.out.println(theater);



    }


}



