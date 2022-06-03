package com.example.drawertest1.ui.contactus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactusViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ContactusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Contact Us fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}