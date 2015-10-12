package com.calebking.funfacts;

import java.util.Random;

/**
 * Created by caleb.king on 10/11/15.
 */
public class FactBook {

    // Member variable (properties about the object)
    public String[] mFacts = {
            "Ticketmaster is the world's largest ticket distribution company in the United State.",
            "The company distributes tickets for more than 10,000 clients.",
            "Tickets are sold at roughly 3,300 outlets worldwide.",
            "Ticketmaster was started by two Arizona State University students.",
            "Ticketmaster's strategy changed in 1982, when Chicago investor Jay Pritzker purchased it.",
            "In 1991 Main rival Ticketron is acquired, giving the company market dominance.",
            "In 1996 Ticketmaster goes public, launches online, travel, and magazine ventures.",
            "Ticketmaster merged with Livenation in 2010",
            "Ticketmaster is awesome!",
            "Ticketmaster was founded by Albert Leffler and Peter Gadwa and businessman Gordan Gunn"
    };

    // Method (abilities: things the object can do)

    public String getFact() {

        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact;
    }
}
