package tictactoe.com.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameScreen extends AppCompatActivity implements View.OnClickListener {

    private static final String player1Symbol="X",player2Symbol="0";
    private int turn=1;
    private Button firstcell,secondcell,thirdcell,fourthcell,fifthcell,sixthcell,seventhcell,eigthcell,ninethcell;
    private String player1Seq="",player2Seq="";
    private TextView playerturn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        initialiseviews();
        playerturn.setText("Player 1 turn");



    }

    public void initialiseviews(){

        firstcell=(Button)findViewById(R.id.first);
        secondcell=(Button)findViewById(R.id.second);
        thirdcell=(Button)findViewById(R.id.third);
        fourthcell=(Button)findViewById(R.id.fourth);
        fifthcell=(Button)findViewById(R.id.fifth);
        sixthcell=(Button)findViewById(R.id.sixth);
        seventhcell=(Button)findViewById(R.id.seventh);
        eigthcell=(Button)findViewById(R.id.eigth);
        ninethcell=(Button)findViewById(R.id.nineth);
        playerturn=(TextView)findViewById(R.id.playerturn);
        firstcell.setOnClickListener(this);
        secondcell.setOnClickListener(this);
        thirdcell.setOnClickListener(this);
        fourthcell.setOnClickListener(this);
        fifthcell.setOnClickListener(this);
        sixthcell.setOnClickListener(this);
        seventhcell.setOnClickListener(this);
        eigthcell.setOnClickListener(this);
        ninethcell.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v==firstcell){

            if(turn == 1){

                firstcell.setText(player1Symbol);
                firstcell.setEnabled(false);
                player1Seq=player1Seq+"1";
                checkstate(player1Seq,turn);
                turn = 2;
                playerturn.setText("Player 2 turn");


            }
            else if(turn == 2){

                firstcell.setText(player2Symbol);
                firstcell.setEnabled(false);
                player2Seq=player2Seq+"1";
                checkstate(player2Seq,turn);
                turn = 1;
                playerturn.setText("Player 1 turn");


            }
        }
        if(v==secondcell){

            if(turn == 1){

                secondcell.setText(player1Symbol);
                secondcell.setEnabled(false);
                player1Seq=player1Seq+"2";
                checkstate(player1Seq,turn);
                turn = 2;
                playerturn.setText("Player 2 turn");




            }
            else if(turn == 2){

                secondcell.setText(player2Symbol);
                secondcell.setEnabled(false);
                player2Seq=player2Seq+"2";
                checkstate(player2Seq,turn);
                turn = 1;
                playerturn.setText("Player 1 turn");

            }
        }
        if(v==thirdcell){

            if(turn == 1){

                thirdcell.setText(player1Symbol);
                thirdcell.setEnabled(false);
                player1Seq=player1Seq+"3";
                checkstate(player1Seq,turn);
                turn = 2;
                playerturn.setText("Player 2 turn");




            }
            else if(turn == 2){

                thirdcell.setText(player2Symbol);
                thirdcell.setEnabled(false);
                player2Seq=player2Seq+"3";
                checkstate(player2Seq,turn);
                turn = 1;
                playerturn.setText("Player 1 turn");


            }
        }
        if(v==fourthcell){

            if(turn == 1){

                fourthcell.setText(player1Symbol);
                fourthcell.setEnabled(false);
                player1Seq=player1Seq+"4";
                checkstate(player1Seq,turn);
                turn = 2;
                playerturn.setText("Player 2 turn");




            }
            else if(turn == 2){

                fourthcell.setText(player2Symbol);
                fourthcell.setEnabled(false);
                player2Seq=player2Seq+"4";
                checkstate(player2Seq,turn);
                turn = 1;
                playerturn.setText("Player 1 turn");


            }
        }
        if(v==fifthcell){

            if(turn == 1){

                fifthcell.setText(player1Symbol);
                fifthcell.setEnabled(false);
                player1Seq=player1Seq+"5";
                checkstate(player1Seq,turn);
                turn = 2;
                playerturn.setText("Player 2 turn");




            }
            else if(turn == 2){

                fifthcell.setText(player2Symbol);
                fifthcell.setEnabled(false);
                player2Seq=player2Seq+"5";
                checkstate(player2Seq,turn);
                turn = 1;
                playerturn.setText("Player 1 turn");


            }
        }
        if(v==sixthcell){

            if(turn == 1){

                sixthcell.setText(player1Symbol);
                sixthcell.setEnabled(false);
                player1Seq=player1Seq+"6";
                checkstate(player1Seq,turn);
                turn = 2;
                playerturn.setText("Player 2 turn");




            }
            else if(turn == 2){

                sixthcell.setText(player2Symbol);
                sixthcell.setEnabled(false);
                player2Seq=player2Seq+"6";
                checkstate(player2Seq,turn);
                turn = 1;
                playerturn.setText("Player 1 turn");


            }
        }
        if(v==seventhcell){

            if(turn == 1){

                seventhcell.setText(player1Symbol);
                seventhcell.setEnabled(false);
                player1Seq=player1Seq+"7";
                checkstate(player1Seq,turn);
                turn = 2;
                playerturn.setText("Player 2 turn");




            }
            else if(turn == 2){

                seventhcell.setText(player2Symbol);
                seventhcell.setEnabled(false);
                player2Seq=player2Seq+"7";
                checkstate(player2Seq,turn);
                turn = 1;
                playerturn.setText("Player 1 turn");


            }
        }
        if(v==eigthcell){

            if(turn == 1){

                eigthcell.setText(player1Symbol);
                eigthcell.setEnabled(false);
                player1Seq=player1Seq+"8";
                checkstate(player1Seq,turn);
                turn = 2;
                playerturn.setText("Player 2 turn");




            }
            else if(turn == 2){

                eigthcell.setText(player2Symbol);
                eigthcell.setEnabled(false);
                player2Seq=player2Seq+"8";
                checkstate(player2Seq,turn);
                turn = 1;
                playerturn.setText("Player 1 turn");


            }
        }
        if(v==ninethcell){

            if(turn == 1){

                ninethcell.setText(player1Symbol);
                ninethcell.setEnabled(false);
                player1Seq=player1Seq+"9";
                checkstate(player1Seq,turn);
                turn = 2;
                playerturn.setText("Player 2 turn");




            }
            else if(turn == 2){

                ninethcell.setText(player2Symbol);
                ninethcell.setEnabled(false);
                player2Seq=player2Seq+"9";
                checkstate(player2Seq,turn);
                turn = 1;
                playerturn.setText("Player 1 turn");


            }
        }

    }

    public void checkstate(String seq,int playerturn){

        if((seq.contains("1") && seq.contains("5") && seq.contains("9"))  || (seq.contains("1") && seq.contains("4") && seq.contains("7"))

                || (seq.contains("1") && seq.contains("2") && seq.contains("3")) || (seq.contains("9") && seq.contains("5") && seq.contains("1")) ||
                (seq.contains("3") && seq.contains("5") && seq.contains("7")) || (seq.equals("2") && seq.contains("5") && seq.contains("8")) ||

                (seq.contains("4") && seq.contains("5") && seq.contains("6")) || (seq.equals("7") && seq.contains("8") && seq.contains("9")) ||

                (seq.equals("3") && seq.contains("6") && seq.contains("9")) || (seq.equals("7") && seq.contains("5") && seq.contains("3"))){


            Intent intent= new Intent(GameScreen.this,ResultScreen.class);
            intent.putExtra("player",playerturn);
            startActivity(intent);

        }


    }
}
