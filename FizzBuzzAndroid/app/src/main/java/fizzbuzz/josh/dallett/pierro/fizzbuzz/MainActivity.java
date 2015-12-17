package fizzbuzz.josh.dallett.pierro.fizzbuzz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView output = (TextView)  findViewById(R.id.output_text);

        StringBuilder outputText = new StringBuilder();

        int i;
        for(i=1;i<=100;i++){

            if((i%3)==0 && (i%5)==0){
                outputText.append("FizzBuzz");
            }else if((i%3)==0){
                outputText.append("Fizz");
            }else if((i%5)==0){
                outputText.append("Buzz");
            }else{
                outputText.append(Integer.toString(i));
            }

            outputText.append("\n");
        }


            output.setText(outputText);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
