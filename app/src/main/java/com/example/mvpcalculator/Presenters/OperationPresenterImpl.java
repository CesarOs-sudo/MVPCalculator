package com.example.mvpcalculator.Presenters;

import com.example.mvpcalculator.Interactor.OperationInteractorImpl;
import com.example.mvpcalculator.Interfaces.Interactor;
import com.example.mvpcalculator.Interfaces.Presenter;
import com.example.mvpcalculator.Interfaces.View;

public class OperationPresenterImpl implements Presenter.OperationPresenter {

    private View.OperationView view;
    private Interactor.OperationInteractor interactor;

    public OperationPresenterImpl(View.OperationView view) {
        this.view = view;
        this.interactor = new OperationInteractorImpl(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null){
            view.showResult(result);
        }
    }

    @Override
    public void invalidOperation() {

    }

    @Override
    public void add(int num1, int num2) {
        if (interactor != null){
            interactor.add(num1, num2);
        }
    }

    @Override
    public void subtract(int num1, int num2) {
        if (interactor != null){
            interactor.subtract(num1, num2);
        }
    }

    @Override
    public void multiply(int num1, int num2) {
        if (interactor != null){
            interactor.multiply(num1, num2);
        }
    }

    @Override
    public void divide(int num1, int num2) {
        if (interactor != null){
            interactor.divide(num1, num2);
        }
    }
}
