package com.project.twitteruiclone.ui.communities

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunitiesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Communities Fragment"
    }
    val text: LiveData<String> = _text
}