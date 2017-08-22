package me.fleka.mvpwithdagger.ui.main;

/**
 * Created by Mladen Rakonjac on 8/19/17.
 */

public class PresenterImpl implements MainContract.Presenter {

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
        //todo discard all async task
    }
}
