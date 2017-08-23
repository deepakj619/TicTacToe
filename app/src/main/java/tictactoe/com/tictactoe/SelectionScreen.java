package tictactoe.com.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SelectionScreen extends AppCompatActivity {

    private Button offlinebtn,onlinebtn;
    private FirebaseDatabase firebaseDatabase;
    private FirebaseAuth auth;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);
        offlinebtn=(Button)findViewById(R.id.offline);
        onlinebtn= (Button)findViewById(R.id.online);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference().child("online_players");

        offlinebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(SelectionScreen.this,GameScreen.class);
                startActivity(intent);

            }
        });
        onlinebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    databaseReference.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {


                            try{
                            String uid = dataSnapshot.getValue().toString();
                            if (uid != null) {

                                Intent intent = new Intent(SelectionScreen.this, SigninScreen.class);
                                intent.putExtra("check", 1);
                                startActivity(intent);

                            } else {

                                Intent intent = new Intent(SelectionScreen.this, SigninScreen.class);
                                intent.putExtra("check", 2);
                                startActivity(intent);


                            }
                        }catch (NullPointerException e){

                                Intent intent = new Intent(SelectionScreen.this, SigninScreen.class);
                                intent.putExtra("check", 2);
                                startActivity(intent);


                            }
                        }


                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });

                }catch (NullPointerException e){

                    Intent intent = new Intent(SelectionScreen.this, SigninScreen.class);
                    intent.putExtra("check", 2);
                    startActivity(intent);



                }
            }
        });


    }
}
