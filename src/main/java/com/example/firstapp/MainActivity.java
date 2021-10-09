package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txRes;
    Float num1=0.0f;
    Float num2=0.0f;
    int bRes=0;
    String operacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txRes = findViewById(R.id.txRes);
    }

    public void Es7(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("7");
        }else{
            txRes.setText(txRes.getText()+"7");
        }
    }
    public void Es8(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("8");
        }else{
            txRes.setText(txRes.getText()+"8");
        }
    }
    public void Es9(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("9");
        }else{
            txRes.setText(txRes.getText()+"9");
        }
    }
    public void Es0(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("0");
        }else{
            txRes.setText(txRes.getText()+"0");
        }
    }
    public void Es1(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("1");
        }else{
            txRes.setText(txRes.getText()+"1");
        }
    }
    public void Es2(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("2");
        }else{
            txRes.setText(txRes.getText()+"2");
        }
    }
    public void Es3(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("3");
        }else{
            txRes.setText(txRes.getText()+"3");
        }
    }
    public void Es4(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("4");
        }else{
            txRes.setText(txRes.getText()+"4");
        }
    }
    public void Es5(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("5");
        }else{
            txRes.setText(txRes.getText()+"5");
        }
    }
    public void Es6(View view) {
        Float valor=Float.parseFloat(txRes.getText().toString());
        if(valor == 0.0f || bRes == 1){
            bRes = 0;
            txRes.setText("6");
        }else{
            txRes.setText(txRes.getText()+"6");
        }
    }

    public void Limpiar(View view) {
        txRes.setText("0");
        num1=0.0f;
        num2=0.0f;
        operacion="";
    }

    public void OpMas(View view) {
        num1=Float.parseFloat(txRes.getText().toString());
        txRes.setText("0");
        operacion="+";
    }
    public void OpMen(View view) {
        num1=Float.parseFloat(txRes.getText().toString());
        txRes.setText("0");
        operacion="-";
    }
    public void OpPor(View view) {
        num1=Float.parseFloat(txRes.getText().toString());
        txRes.setText("0");
        operacion="x";
    }
    public void OpDiv(View view) {
        num1=Float.parseFloat(txRes.getText().toString());
        txRes.setText("0");
        operacion="/";
    }

    public void Res(View view) {
        num2=Float.parseFloat(txRes.getText().toString());
        if(operacion.equals("+")){
            float resultado= num1+num2;
            txRes.setText(resultado+"");
        }
        if(operacion.equals("/")){
            if(num2==0.0f){
                txRes.setText("0");
                Toast.makeText(this,"operacion no valida", Toast.LENGTH_LONG);
            }else{
                float resultado= num1/num2;
                txRes.setText(resultado+"");
            }
        }
        if(operacion.equals("x")){
            float resultado= num1*num2;
            txRes.setText(resultado+"");
        }
        if(operacion.equals("-")){
            float resultado= num1-num2;
            txRes.setText(resultado+"");
        }
        num1=0.0f;
        num2=0.0f;
        operacion="";
        bRes = 1;
    }

    public void EsComa(View view) {
        if( !String.valueOf(txRes.getText()).contains(".") ){
            txRes.setText(txRes.getText() + ".");
        }
    }
    public void CSig(View view) {
        float valor = Float.parseFloat(String.valueOf(txRes.getText()));
        valor = valor * -1.0f;
        txRes.setText("" + valor);
    }
}