package tictactoe.com.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class OnlineGameScreen extends AppCompatActivity implements View.OnClickListener{

    private static final String player1Symbol="X",player2Symbol="0";
    private int turn=1;
    private Button firstcell,secondcell,thirdcell,fourthcell,fifthcell,sixthcell,seventhcell,eigthcell,ninethcell;
    private String player1Seq="",player2Seq="";
    private TextView playerturn;
    private FirebaseDatabase firebaseDatabase;
    private FirebaseAuth auth;
    private DatabaseReference databaseReference;
    public String id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        initialiseviews();
        Bundle bundle = getIntent().getExtras();
        int check = bundle.getInt("check");
        if(check==2) {
            DatabaseReference game = firebaseDatabase.getReference().child("online_players");
            game.setValue(auth.getCurrentUser().getUid());
            Toast.makeText(this, "wait untill new player joins", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(OnlineGameScreen.this,SelectionScreen.class));

        }else if(check==1){

            playerturn.setText("Player 1 turn");
            id =databaseReference.push().getKey();

        }

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
        auth=FirebaseAuth.getInstance();
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference().child("Games");
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
                DatabaseReference ref =databaseReference.child(id).child("player1seq");
                ref.setValue(player1Seq);
                checkdb(2);


            }
            else if(turn == 2){

                firstcell.setText(player2Symbol);
                firstcell.setEnabled(false);
                player2Seq=player2Seq+"1";
                DatabaseReference ref =databaseReference.child(id).child("player2seq");
                ref.setValue(player2Seq);
                checkdb(1);


            }
        }
        if(v==secondcell){

            if(turn == 1){

                secondcell.setText(player1Symbol);
                secondcell.setEnabled(false);
                player1Seq=player1Seq+"2";
                DatabaseReference ref =databaseReference.child(id).child("player1seq");
                ref.setValue(player1Seq);
                checkdb(2);




            }
            else if(turn == 2){

                secondcell.setText(player2Symbol);
                secondcell.setEnabled(false);
                player2Seq=player2Seq+"2";
                DatabaseReference ref =databaseReference.child(id).child("player2seq");
                ref.setValue(player2Seq);
                checkdb(1);

            }
        }
        if(v==thirdcell){

            if(turn == 1){

                thirdcell.setText(player1Symbol);
                thirdcell.setEnabled(false);
                player1Seq=player1Seq+"3";
                DatabaseReference ref =databaseReference.child(id).child("player1seq");
                ref.setValue(player1Seq);
                checkdb(2);




            }
            else if(turn == 2){

                thirdcell.setText(player2Symbol);
                thirdcell.setEnabled(false);
                player2Seq=player2Seq+"3";
                DatabaseReference ref =databaseReference.child(id).child("player2seq");
                ref.setValue(player2Seq);
                checkdb(1);


            }
        }
        if(v==fourthcell){

            if(turn == 1){

                fourthcell.setText(player1Symbol);
                fourthcell.setEnabled(false);
                player1Seq=player1Seq+"4";
                DatabaseReference ref =databaseReference.child(id).child("player1seq");
                ref.setValue(player1Seq);
                checkdb(2);




            }
            else if(turn == 2){

                fourthcell.setText(player2Symbol);
                fourthcell.setEnabled(false);
                player2Seq=player2Seq+"4";
                DatabaseReference ref =databaseReference.child(id).child("player2seq");
                ref.setValue(player2Seq);
                checkdb(1);


            }
        }
        if(v==fifthcell){

            if(turn == 1){

                fifthcell.setText(player1Symbol);
                fifthcell.setEnabled(false);
                player1Seq=player1Seq+"5";
                DatabaseReference ref =databaseReference.child(id).child("player1seq");
                ref.setValue(player1Seq);
                checkdb(2);




            }
            else if(turn == 2){

                fifthcell.setText(player2Symbol);
                fifthcell.setEnabled(false);
                player2Seq=player2Seq+"5";
                DatabaseReference ref =databaseReference.child(id).child("player2seq");
                ref.setValue(player2Seq);
                checkdb(1);


            }
        }
        if(v==sixthcell){

            if(turn == 1){

                sixthcell.setText(player1Symbol);
                sixthcell.setEnabled(false);
                player1Seq=player1Seq+"6";
                DatabaseReference ref =databaseReference.child(id).child("player1seq");
                ref.setValue(player1Seq);
                checkdb(2);




            }
            else if(turn == 2){

                sixthcell.setText(player2Symbol);
                sixthcell.setEnabled(false);
                player2Seq=player2Seq+"6";
                DatabaseReference ref =databaseReference.child(id).child("player2seq");
                ref.setValue(player2Seq);
                checkdb(1);


            }
        }
        if(v==seventhcell){

            if(turn == 1){

                seventhcell.setText(player1Symbol);
                seventhcell.setEnabled(false);
                player1Seq=player1Seq+"7";
                checkdb(2);




            }
            else if(turn == 2){

                seventhcell.setText(player2Symbol);
                seventhcell.setEnabled(false);
                player2Seq=player2Seq+"7";
                DatabaseReference ref =databaseReference.child(id).child("player2seq");
                ref.setValue(player2Seq);
                checkdb(1);


            }
        }
        if(v==eigthcell){

            if(turn == 1){

                eigthcell.setText(player1Symbol);
                eigthcell.setEnabled(false);
                player1Seq=player1Seq+"8";
                DatabaseReference ref =databaseReference.child(id).child("player1seq");
                ref.setValue(player1Seq);
                checkdb(2);




            }
            else if(turn == 2){

                eigthcell.setText(player2Symbol);
                eigthcell.setEnabled(false);
                player2Seq=player2Seq+"8";
                DatabaseReference ref =databaseReference.child(id).child("player2seq");
                ref.setValue(player2Seq);
                checkdb(1);


            }
        }
        if(v==ninethcell){

            if(turn == 1){

                ninethcell.setText(player1Symbol);
                ninethcell.setEnabled(false);
                player1Seq=player1Seq+"9";
                DatabaseReference ref =databaseReference.child(id).child("player1seq");
                ref.setValue(player1Seq);
                checkdb(2);



            }
            else if(turn == 2){

                ninethcell.setText(player2Symbol);
                ninethcell.setEnabled(false);
                player2Seq=player2Seq+"9";
                DatabaseReference ref =databaseReference.child(id).child("player2seq");
                ref.setValue(player2Seq);
                checkdb(1);


            }
        }

    }

    public void checkstate(String seq,int playerturn){

        if((seq.contains("1") && seq.contains("5") && seq.contains("9"))  || (seq.contains("1") && seq.contains("4") && seq.contains("7"))

                || (seq.contains("1") && seq.contains("2") && seq.contains("3")) || (seq.contains("9") && seq.contains("5") && seq.contains("1")) ||
                (seq.contains("3") && seq.contains("5") && seq.contains("7")) || (seq.equals("2") && seq.contains("5") && seq.contains("8")) ||

                (seq.contains("4") && seq.contains("5") && seq.contains("6")) || (seq.equals("7") && seq.contains("8") && seq.contains("9")) ||

                (seq.equals("3") && seq.contains("6") && seq.contains("9")) || (seq.equals("7") && seq.contains("5") && seq.contains("3"))){


            Intent intent= new Intent(OnlineGameScreen.this,ResultScreen.class);
            intent.putExtra("player",playerturn);
            startActivity(intent);

        }


    }
    public void checkdb(final int chance){

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){


                    String player1dbseq=dataSnapshot1.child("player1seq").toString();
                    String player2dbseq=dataSnapshot1.child("player2seq").toString();
                    char[] player1array=player1dbseq.toCharArray();
                    char[] player2array=player2dbseq.toCharArray();
                    for(int i=0;i<player1array.length;i++){

                        if(player1array[i]=='1'){

                            firstcell.setEnabled(false);

                        }

                        if(player1array[i]=='2'){

                            secondcell.setEnabled(false);

                        }

                        if(player1array[i]=='3'){

                            thirdcell.setEnabled(false);

                        }

                        if(player1array[i]=='4'){

                            fourthcell.setEnabled(false);

                        }

                        if(player1array[i]=='5'){

                            fifthcell.setEnabled(false);

                        }

                        if(player1array[i]=='6'){

                            sixthcell.setEnabled(false);

                        }

                        if(player1array[i]=='7'){

                            seventhcell.setEnabled(false);

                        }

                        if(player1array[i]=='8'){

                            eigthcell.setEnabled(false);

                        }

                        if(player1array[i]=='9'){

                            ninethcell.setEnabled(false);

                        }

                    }
                    databaseReference.removeEventListener(this);
                    checkstate(player1dbseq,turn);
                    if(chance==1) {
                        turn = chance;
                        playerturn.setText("Player 1 turn");
                    }
                    else if(chance==2){

                        turn=chance;
                        playerturn.setText("Player 2 turn");
                    }


                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


}
