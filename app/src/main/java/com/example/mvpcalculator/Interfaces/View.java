package com.example.mvpcalculator.Interfaces;

public class View {

    public interface OperationView{
        void showResult(String result);
        void invalidOperation();
    }
}
