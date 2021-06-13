package assignment2.ex39.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex39 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, people> map = new HashMap<>();
        people john = new people;
        john.firstName = "John";
        john.lastName = "Johnson";
        john.position = "Manager";
        john.date = "2016-12-31";

        people tou = new people;
        tou.firstName = "Tou";
        tou.lastName = "Xiong";
        tou.position = "Software Engineer";
        tou.date = "2016-10-05";

        people michaela = new people;
        michaela.firstName = "Michaela";
        michaela.lastName = "Michaelson";
        michaela.position = "District Manager";
        michaela.date = "2015-12-19";

        people jake = new people;
        jake.firstName = "Jake";
        jake.lastName = "Jacobson";
        jake.position = "Programmer";
        jake.date = "";

        people jacquelyn = new people;
        jacquelyn.firstName = "Jacquelyn";
        jacquelyn.lastName = "Jackson";
        jacquelyn.position = "DBA";
        jacquelyn.date = "";

        people sally = new people;
        sally.firstName = "Sally";
        sally.lastName = "Webber";
        sally.position = "Web Developer";
        sally.date = "2015-12-18";

        map.put("Johnson", john);
        map.put("Xiong", tou);
        map.put("Michaelson", michaela);
        map.put("Jacobson", jake);
        map.put("Jackson", jacquelyn);
        map.put("Webber", sally);



    }
}
