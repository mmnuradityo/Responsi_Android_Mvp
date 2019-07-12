package com.responsi.mvp.view.activity;

import com.responsi.mvp.model.ResultsItem;

import java.util.ArrayList;
import java.util.List;

public class MainPresenterImpl implements MainPresenter {

    private MainView mainView;
    private List<ResultsItem> items = new ArrayList<>();

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void load() {
        mainView.onLoad(items);
    }
}
