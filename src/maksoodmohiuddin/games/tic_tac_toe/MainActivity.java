package maksoodmohiuddin.games.tic_tac_toe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

	private String player1 = "Player 1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button resetButtonState = (Button) findViewById(R.id.resetButton);
        resetButtonState.setClickable(false);
        resetButtonState.setEnabled(false);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void buttonClicked(View view) {
    	
    }
    
    public void start(View view) {
 
    	setActivePlayerText(player1);
    	
    	Button resetButtonState = (Button) findViewById(R.id.resetButton);
        resetButtonState.setClickable(true);
        resetButtonState.setEnabled(true);
        
        Button startButtonState = (Button) findViewById(R.id.startButton);
        startButtonState.setClickable(false);
        startButtonState.setEnabled(false);
    }
    
    public void reset(View view) {
    	setActivePlayerText(player1);
    	
    	Button resetButtonState = (Button) findViewById(R.id.resetButton);
        resetButtonState.setClickable(false);
        resetButtonState.setEnabled(false);
        
        Button startButtonState = (Button) findViewById(R.id.startButton);
        startButtonState.setClickable(true);
        startButtonState.setEnabled(true);
    	
    }
 
 	public void quit(View view) {
 	
 	}
 	
 	private void setActivePlayerText(String input) {
		TextView displayCalculationsTextView = (TextView) findViewById(R.id.activePlayerText);
		displayCalculationsTextView.setText(input);
	}
  
}
