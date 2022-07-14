package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

//Hallo
@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Josephine";
        } else if (query.contains(("number"))) {
            String[] LIST = query.split(",");

            int largestInt = 0;

            for (String s : LIST
            ) {
                int a = Integer.parseInt(s);
                if (largestInt <= a){
                    largestInt = a;
                }
            }

            return largestInt + "";

        } else { // TODO extend the programm here
            return "";
        }
    }
}
