package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.content.Intent;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

        public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

            }
            public void onClick(View view) {
                EditText login = findViewById(R.id.editText);
                EditText password = findViewById(R.id.editText2);
                String s1 = login.getText().toString();
                String s2 = password.getText().toString();
                if (s1.equals("NAME") && s2.equals("PASSWORD")) {
                    Intent other = new Intent(this, Main2Activity.class);
                    startActivity(other);
                } else {
                    if(s1.equals("NAME")){
                    TextView error = findViewById(R.id.textView2);
                    error.setText("wrong");}
                    if(s2.equals("PASSWORD")){
                        TextView error = findViewById(R.id.textView);
                        error.setText("wrong");}

                }
            }
        }


