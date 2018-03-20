package com.example.tombl.alertdlog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;
    private Button showDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showDialog = (Button) findViewById(R.id.ShowdialogId);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog = new AlertDialog.Builder(MainActivity.this);


                alertDialog.setTitle(R.string.title);
                alertDialog.setIcon(android.R.drawable.btn_star);

                alertDialog.setMessage(getResources().getString(R.string.message));

                alertDialog.setCancelable(false);

                alertDialog.setPositiveButton(getResources().getString(R.string.yes),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                MainActivity.this.finish();


                            }
                        });
                alertDialog.setNegativeButton(getResources().getString(R.string.nope),
                new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.cancel();;

                    }
                });

                AlertDialog dialog = alertDialog.create();


                dialog.show();
            }
        });
    }
}
