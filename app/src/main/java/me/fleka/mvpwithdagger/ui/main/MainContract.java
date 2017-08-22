package me.fleka.mvpwithdagger.ui.main;

/**
 * Created by Mladen Rakonjac on 8/19/17.
 */

public interface MainContract {

    interface View {
       void showNewText(String newText);

    }

    interface Presenter  {
        void subscribe();
        void unsubscribe();

    }

}