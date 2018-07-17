package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //step1b: Create a varible for ListView
    ListView lvMovie;

    //step2:create an arraylist vriable
    ArrayList<String> alMovieList;

    //step3a:create an arrayadapter
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step1c:bind UI element to java variable
        lvMovie=findViewById(R.id.listViewMovie);


        //step2b:initialize the arraylist
        alMovieList = new ArrayList<>();

        //step2c:add data into the arraylist
        alMovieList.add("Avengers Infinity War Release Date:2018.04");
        alMovieList.add("Justice League Realease Date:2017.11");

        //step3b:initialize the arrayadapter and bind it to the arraylist (simple_list_item is for a row item)
        aaMovie= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, alMovieList);

        //step4a:bind the list view to the array adapter
        lvMovie.setAdapter(aaMovie);

    }
}
