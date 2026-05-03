package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// For these exercises, you need to declare a single variable
// in each function that uses the appropriate collection type
// (Array, ArrayList, HashSet, HashMap)
//
// You do not need to populate this array or add any additional code.
// If you get stuck, refer to the java basics 4 (arrays and collections) curriculum
public class CollectionChoiceExercises {
    public void MakeColorCollection() {
        String[] colors = {"Red", "Green", "Blue"};
    }

    public void MakeStudentCollection() {
        ArrayList<String> students = new ArrayList<String>();
    }

    public void MakeLoggedInUsersCollection() {
        HashSet<String> usernames = new HashSet<String>();
    }

    public void MakeEmployeeAccessCodesCollection() {
        HashMap<String, Integer> codes = new HashMap<String, Integer>();
    }
}
