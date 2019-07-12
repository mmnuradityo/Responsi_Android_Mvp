package com.responsi.mvp.view.activity;

import com.responsi.mvp.model.ResultsItem;

import java.util.List;

public interface MainView {

    void onLoad(List<ResultsItem> items);

    void onSave();

    void onDelete();

    void onUpdate();
}