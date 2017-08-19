package me.fleka.mvpwithdagger.di.main;

/**
 * Created by Mladen Rakonjac on 8/19/17.
 */

class PresenterImpl implements MainContract.Presenter {

    private MainContract.View view;

    public PresenterImpl(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void subscribe() {
        view.showNewText("Presenter is injected and subscribed");
    }

    @Override
    public void unsubscribe() {

    }
}
