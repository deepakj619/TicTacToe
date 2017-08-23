package tictactoe.com.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultScreen extends AppCompatActivity {

    private TextView winnertextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);
        winnertextView=(TextView)findViewById(R.id.winner);
        Bundle bundle = getIntent().getExtras();
        int winner = bundle.getInt("player");
        if(winner==1){

            winnertextView.setText("Player 1 has won");
        }
        else if(winner==2){

            winnertextView.setText("Player 2 has won");

        }


    }

    public void playagain(View view) {

        Intent intent =new Intent(ResultScreen.this,SelectionScreen.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit to main Screen?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {

                        Intent intent =new Intent(ResultScreen.this,SelectionScreen.class);
                        startActivity(intent);
                  }
                }).create().show();
    }
    }

