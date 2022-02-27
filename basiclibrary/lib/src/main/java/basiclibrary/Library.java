
package basiclibrary;

import java.util.*;

public class Library {

    public boolean someLibraryMethod() {
        return true;
    }

    public static Collection<Integer> minMax(int[][] arr) {
        int min = 100;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("High: " + max);
        System.out.println("Low: " + min);
//        int x= min;

        HashSet notSeen = new HashSet<>();
        HashSet<Integer> allelements = new HashSet<>();

        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                allelements.add(arr[i][j]);
            }
        }

        for (int i =min ;i<=max;i++){
            if (allelements.contains(i) ==false ){
                notSeen.add("Never saw temperature: "+i);
            }
        }
        return notSeen;
    }



    public static <votes> String tally(List<String> newlist)
    {
        int BushCounter =0;
        int ShrubCount =0;
       int HedgeCount =0;

       for (int i = 0; i < newlist.size(); i++)
               switch( newlist.get(i))
               {
                   case "Bush":
                   {
                       BushCounter++;
                       break;
                   }
                   case "Shrub":
                   {
                       ShrubCount++;
                       break;
                   }
                   case "Hedge":
                   {
                       HedgeCount++;
                       break;
                   }

               }
       String winner ="";
       if (BushCounter > ShrubCount && BushCounter > HedgeCount)
           winner= "Bush";
       if (ShrubCount > BushCounter && ShrubCount > HedgeCount)
            winner= "Shrub";
       if (HedgeCount > ShrubCount && HedgeCount > BushCounter)
            winner=  "Hedge";
       return winner;
    }
    public static int[]  roll(int n){
        int[] arr = new int[n];
        for(int j =0 ; j<n ; j++){
            int diceResult=(int)(Math.random()*6+1);
            arr[j]=diceResult;
        }
        return arr;
    }






    public static Boolean containsDuplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }




    public  static double CalculatingAverages(double[] arr){
        double avg=0.0;
        double sum=0.0;
        for(int i =0 ; i< arr.length ; i++){
            sum=sum+arr[i];
        }
        avg = sum/arr.length;
        return avg;
    }


    public  static int[] lowest_Average(int[][] arr) {
        double[] avg=new double[arr.length];
        double sum = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            for( int j = 0 ; j < arr[i].length ; j++){
                sum = sum + arr[i][j];
            }
            avg[i] = sum/arr[i].length;
            sum=0;
        }
        double lowest = avg[0];
        int lowestIdx = 0;
        for(int x=1 ; x<avg.length; x++){
            if(avg[x] <= lowest){
                lowest = avg[x];
                lowestIdx = x;
            }
        }

        return arr[lowestIdx];
    }

    public static void main(String[] args) {

        System.out.println("Roll Method n=4 =>");
        System.out.println(Arrays.toString(roll(4)));

        System.out.println("containsDuplicates Method arr={1, 5, 7, 7, 6} =>");
        System.out.println(containsDuplicates(new int[]{1, 5, 7, 7, 6}));
        System.out.println("containsDuplicates Method arr={1, 5, 7, 6} =>");
        System.out.println(containsDuplicates(new int[]{1, 5, 7, 6}));

        System.out.println("CalculatingAverages Method arr={1, 5, 7, 7, 6} =>");
        System.out.println(CalculatingAverages(new double[]{1, 5, 7, 7, 6}));

        System.out.println("lowest_Average Method arr={\n" +
                "                {66, 64, 58, 65, 71, 57, 60},\n" +
                "                {57, 65, 65, 70, 72, 65, 51},\n" +
                "                {55, 54, 60, 53, 59, 57, 61},\n" +
                "                {65, 56, 55, 52, 55, 62, 57}\n" +
                "        } =>");
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
       System.out.println(Arrays.toString(lowest_Average(weeklyMonthTemperatures)));

       System.out.println( minMax(weeklyMonthTemperatures));

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println("\n"+ winner + " received the most votes!");


    }


}