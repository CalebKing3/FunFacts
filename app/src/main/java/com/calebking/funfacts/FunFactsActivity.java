package com.calebking.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String[] facts = {
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

                // The button was clicked, so update the fact label with a new fact
                String fact = "";
                // Randomly select a fact
                Random randomGenerator = new Random();  // Construct a new Random number generator
                int randomNumber = randomGenerator.nextInt(facts.length);

                /**
                 * Convert the randomNumber to a text fact
                 * 0 = Ants stretch when they wake up in the morning.
                 * 1 = Ostriches can run faster than horses.
                 * 2 = Olympic gold medals are actually made mostly of silver
                 * */

                fact = facts[randomNumber];





                // Update the label with our dynamic fact
                factLabel.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}