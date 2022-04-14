package com.melvin.currancycanculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText value;
    TextView result;
    Button euro;
    Button dollar;
    Button pound;
    Button yen;
    Button rand;
    Button franc;
    Button riyal;
    Button rupee;
    Button yuan;
    Button kroner;
    Button bif;
    Button rwe;
    Button can$;
    Button dirham;
    Button tshs;
    Button ushs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        value = findViewById(R.id.et_value);
        result = findViewById(R.id.tv_answer);
        euro = findViewById(R.id.btn_euro);
        dollar = findViewById(R.id.btn_dollar);
        pound = findViewById(R.id.btn_pound);
        yen = findViewById(R.id.btn_yen_id);
        rand = findViewById(R.id.btn_rand_id);
        franc = findViewById(R.id.btn_franc_id);
        riyal = findViewById(R.id.btn_riyal_id);
        rupee = findViewById(R.id.btn_rupee_id);
        yuan = findViewById(R.id.yuan_id);
        kroner = findViewById(R.id.btn_kroner_id);
        bif = findViewById(R.id.btn_bif_id);
        rwe = findViewById(R.id.btn_rwe_id);
        can$ = findViewById(R.id.btn_can$_id);
        dirham = findViewById(R.id.btn_dirham_id);
        tshs = findViewById(R.id.btn_tshs_btn_id);
        ushs = findViewById(R.id.btn_ushs_id);


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Euro();


            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Dollar();

            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Pound();
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ksh2Yen();
            }

        });
        rand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Rand();

            }
        });
        franc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Franc();
            }
        });
        riyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Riyal();
            }
        });
        rupee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Rupee();
            }
        });
        yuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Yuan();
            }
        });
        kroner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Kroner();
            }
        });
        bif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Bif();
            }
        });
        rwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Rwe();
            }
        });
        can$.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2can$();
            }
        });
        dirham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Dirham();
            }
        });
        tshs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Tshs();
            }
        });
        ushs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ksh2Ushs();
            }
        });

    }


    public void ksh2Euro() {
        Double euroRate = 126.46;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = amount / euroRate;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to euro", Toast.LENGTH_SHORT).show();
    }

    public void ksh2Dollar() {
        Double dollarRate = 115.1941;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = amount / dollarRate;
        result.setText((answer + ""));
        Toast.makeText(MainActivity.this, "amount converted to dollar", Toast.LENGTH_SHORT).show();
    }

    public void ksh2Pound() {
        Double poundRate = 150.8544;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = poundRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }

    public void ksh2Yen() {
        Double poundRate = 92.9997;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = poundRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();

    }

    public void ksh2Rand() {
        Double randRate = 7.8349;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = randRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();

    }

    public void ksh2Franc() {
        Double francRate = 123.5938;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = francRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();

    }

    public void ksh2Riyal() {
        Double riyalRate = 30.7378;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = riyalRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }

    public void ksh2Rupee() {
        Double rupeeRate = 1.5171;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = rupeeRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }

    public void ksh2Yuan() {
        Double yuanRate = 18.1271;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = yuanRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }
    public void ksh2Kroner() {
        Double kronerRate = 12.1984;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = kronerRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }
    public void ksh2Bif() {
        Double bifRate = 17.7988;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = bifRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }
    public void ksh2Rwe() {
        Double rweRate =8.8258 ;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = rweRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }
    public void ksh2can$() {
        Double can$Rate = 91.8412;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = can$Rate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }
    public void ksh2Dirham() {
        Double dirhamRate = 31.3876;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = dirhamRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }
    public void ksh2Tshs() {
        Double tshsRate =20.1409;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = tshsRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }
    public void ksh2Ushs() {
        Double ushsRate = 30.7491;
        Double amount = Double.parseDouble(value.getText().toString());
        Double answer = ushsRate / amount;
        result.setText(answer + "");
        Toast.makeText(MainActivity.this, "amount converted to pound", Toast.LENGTH_SHORT).show();
    }
}




