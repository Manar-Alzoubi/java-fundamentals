/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {

        Restaurant Rest1 = new Restaurant("My resturant", 250,4);
        System.out.println( Rest1.toString());

        Review Rev1= new Review("this resturant is perfect ", "Manar",5);
        System.out.println( Rev1.toString());
        Review Rev2= new Review("it is comfortable ", "Sadan",4);
        Review Rev3= new Review("it is comfortable ", "Sadan",2);
        Rest1.AddReview(Rev1);
        Rest1.AddReview(Rev2);
        Rest1.AddReview(Rev3);


    }


}
