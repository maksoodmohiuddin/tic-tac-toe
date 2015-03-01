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
	private String player2 = "Player 2";
	private String player1Mark = "O";
	private String player2Mark = "X";
	private boolean player1Active = true;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        
        changeButtonStates(false);
    	startResetStates(true);
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
    	Button buttonClickedState = (Button) findViewById(R.id.quitButton);
    	
    	switch(view.getId()) {
			case R.id.leftUpButton:
				buttonClickedState = (Button) findViewById(R.id.leftUpButton);
				break;
				
			case R.id.centerUpButton:
				buttonClickedState = (Button) findViewById(R.id.centerUpButton);
				break;
				
			case R.id.rightUpButton:
				buttonClickedState = (Button) findViewById(R.id.rightUpButton);
				break;
				
			case R.id.leftMiddleButton:
				buttonClickedState = (Button) findViewById(R.id.leftMiddleButton);
				break;
				
			case R.id.centerMiddleButton:
				buttonClickedState = (Button) findViewById(R.id.centerMiddleButton);
				break;
				
			case R.id.rightMiddleButton:
				buttonClickedState = (Button) findViewById(R.id.rightMiddleButton);
				break;
		
			case R.id.leftDownButton:
				buttonClickedState = (Button) findViewById(R.id.leftDownButton);
				break;
				
			case R.id.centerDownButton:
				buttonClickedState = (Button) findViewById(R.id.centerDownButton);
				break;
				
			case R.id.rightDownButton:
				buttonClickedState = (Button) findViewById(R.id.rightDownButton);
				break;	
			
    	}
    	
    	if(player1Active){
    		setActivePlayerText(player1);
    		player1Active = false;
    		buttonClickedState.setText(player1Mark);
    	}
    	else {
    		setActivePlayerText(player2);
    		player1Active = true;
    		buttonClickedState.setText(player2Mark);
    	}	
    	
    	buttonClickedState.setClickable(false);
	}
    
    public void start(View view) {
    	setActivePlayerText(player1);
    	changeButtonStates(false);
    	startResetStates(true);
    }
    
    public void reset(View view) {
    	setActivePlayerText(player1);
    	changeButtonStates(true);
    	startResetStates(false);
    }
    
    
    private void startResetStates(boolean state){
    	Button startButtonState = (Button) findViewById(R.id.startButton);
    	startButtonState.setClickable(state);
    	startButtonState.setEnabled(state);
    	
    	Button resetButtonState = (Button) findViewById(R.id.resetButton);
    	resetButtonState.setClickable(!state);
    	resetButtonState.setEnabled(!state);
    }
    
    
    private void changeButtonStates(boolean state){
        Button leftUpButtonState = (Button) findViewById(R.id.leftUpButton);
        leftUpButtonState.setClickable(state);
        leftUpButtonState.setEnabled(state);
        
        Button centerUpButtonState = (Button) findViewById(R.id.centerUpButton);
        centerUpButtonState.setClickable(state);
        centerUpButtonState.setEnabled(state);
    	
        Button rightUpButtonState = (Button) findViewById(R.id.rightUpButton);
        rightUpButtonState.setClickable(state);
        rightUpButtonState.setEnabled(state);
        
        Button leftMiddleButtonState = (Button) findViewById(R.id.leftMiddleButton);
        leftMiddleButtonState.setClickable(state);
        leftMiddleButtonState.setEnabled(state);
        
        Button centerMiddleButtonState = (Button) findViewById(R.id.centerMiddleButton);
        centerMiddleButtonState.setClickable(state);
        centerMiddleButtonState.setEnabled(state);
    	
        Button rightMiddleButtonState = (Button) findViewById(R.id.rightMiddleButton);
        rightMiddleButtonState.setClickable(state);
        rightMiddleButtonState.setEnabled(state);
        
        Button leftDownButtonState = (Button) findViewById(R.id.leftDownButton);
        leftDownButtonState.setClickable(state);
        leftDownButtonState.setEnabled(state);
        
        Button centerDownButtonState = (Button) findViewById(R.id.centerDownButton);
        centerDownButtonState.setClickable(state);
        centerDownButtonState.setEnabled(state);
    	
        Button rightDownButtonState = (Button) findViewById(R.id.rightDownButton);
        rightDownButtonState.setClickable(state);
        rightDownButtonState.setEnabled(state);
        
    }
    
 	public void quit(View view) {
 	
 	}
 	
 	private void setActivePlayerText(String input) {
		TextView displayCalculationsTextView = (TextView) findViewById(R.id.activePlayerText);
		displayCalculationsTextView.setText(input);
	}
 	
 	private boolean checkWin(){
 		return false;
 	}
 	
 	}
 	
  
}
