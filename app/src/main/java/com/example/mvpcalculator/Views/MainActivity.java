package com.example.mvpcalculator.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvpcalculator.Interfaces.Presenter;
import com.example.mvpcalculator.Interfaces.View;
import com.example.mvpcalculator.Presenters.OperationPresenterImpl;
import com.example.mvpcalculator.R;

public class MainActivity extends AppCompatActivity implements View.OperationView {

    private EditText number1;
    private EditText number2;
    private TextView txtResult;
    private Button btnAdd, btnSubstrac, btnMultiply, btnDivide;
    private Presenter.OperationPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txv_result);
        number1 = findViewById(R.id.txt_numero_1);
        number2 = findViewById(R.id.txt_numero2);
        presenter = new OperationPresenterImpl(this);
        btnAdd = findViewById(R.id.btn_add);
        btnDivide = findViewById(R.id.btn_divide);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnSubstrac = findViewById(R.id.btn_substract);

        btnAdd.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                try {
                    int num1 = Integer.parseInt(number1.getText().toString());
                    int num2 = Integer.parseInt(number2.getText().toString());
                    presenter.add(num1, num2);
                }catch (Exception e){
                    invalidOperation();
                }
            }
        });

    }

    /*public void doAdd(View view){
        try {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            presenter.add(num1, num2);
        }catch (Exception e){
            invalidOperation();
        }
    }*/

    public void doSubstrac(android.view.View  view){
        try {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            presenter.subtract(num1, num2);
        }catch (Exception e){
            invalidOperation();
        }
    }

    public void doMultiply(android.view.View view){
        try {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            presenter.multiply(num1, num2);
        }catch (Exception e){
            invalidOperation();
        }
    }

    public void doDivide(android.view.View view){
        try{
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            presenter.divide(num1, num2);
        }catch (Exception e){
            invalidOperation();
        }
    }

    @Override
    public void showResult(String result) {
        txtResult.setText(result);
    }

    @Override
    public void invalidOperation() {
        Toast.makeText(this, "Invalid operation", Toast.LENGTH_SHORT).show();
    }
}
