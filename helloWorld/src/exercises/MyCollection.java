package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jpmc on 9/30/2016.
 */
public class MyCollection {

    private static Random getRandom = new Random();
    private static int randomIndex;
    private static String returnItem;

    public static String myFrndLst(){

        List<String> myFriends = new ArrayList<String>();
        myFriends.add(0, "Amantz");
        myFriends.add(1, "Amigo");
        myFriends.add(2, "Bert");
        myFriends.add(3, "Jeremiah");
        myFriends.add(4, "Neil");
        myFriends.add(5, "Prend");

        randomIndex = getRandom.nextInt(myFriends.size());
        returnItem = myFriends.get(randomIndex);
        return returnItem;

        /*System.out.println(myFriends.get(3));
        System.out.println(myFriends.contains("Bert"));
        System.out.println(myFriends.equals(false));
        System.out.println(myFriends.size());*/


        /*for (int i = 0; i < myFriends.size(); i++){
            System.out.println(myFriends.get(i));
        }*/

    }

    public static String myGrlPrnds(){
        List<String> myGirlFriends = new ArrayList<String>();
        myGirlFriends.add(0, "Christy");
        myGirlFriends.add(1, "Diane");
        myGirlFriends.add(2, "Sia");
        myGirlFriends.add(3, "Tin");
        myGirlFriends.add(4, "Weng");
        myGirlFriends.add(5, "Yeng");

        randomIndex = getRandom.nextInt(myGirlFriends.size());
        returnItem = myGirlFriends.get(randomIndex);
        return returnItem;

        /*for (int t = 0; t < myFriends.size(); t++){
            System.out.println(myFriends.get(t));
        }*/
    }

    public static String derRelation(){
        List<String> relationWith = new ArrayList<String>();
        relationWith.add(0, "Love");
        relationWith.add(1, "Hate");

        randomIndex = getRandom.nextInt(relationWith.size());
        returnItem = relationWith.get(randomIndex);
        return returnItem;

        /*for (int r = 0; r < myFriends.size(); r++){
            System.out.println(myFriends.get(r));
        }*/

    }

}
