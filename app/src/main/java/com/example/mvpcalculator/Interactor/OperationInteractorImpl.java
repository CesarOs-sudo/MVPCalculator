package com.example.mvpcalculator.Interactor;

import com.example.mvpcalculator.Interfaces.Interactor;
import com.example.mvpcalculator.Interfaces.Presenter;

public class OperationInteractorImpl implements Interactor.OperationInteractor {
    private int result;
    private Presenter.OperationPresenter presenter;

    public OperationInteractorImpl(Presenter.OperationPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void add(int num1, int num2) {
        result = num1 + num2;
        System.out.println("este es el resultado  -> " + result);
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void subtract(int num1, int num2) {
        result = num1 - num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void multiply(int num1, int num2) {
        result = num1 * num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void divide(int num1, int num2) {
        if (num2 == 0){
            result = num1 / num2;
            presenter.showResult(Integer.toString(result));
        }else{
            presenter.showResult(Integer.toString(result));
        }

    }
}
