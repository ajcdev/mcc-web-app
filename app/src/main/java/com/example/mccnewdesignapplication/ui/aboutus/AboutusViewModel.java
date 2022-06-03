package com.example.drawertest1.ui.aboutus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutusViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AboutusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is About Us fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}