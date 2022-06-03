package com.example.drawertest1.ui.bnpl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BnplViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BnplViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Buy Now Pay Later fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}