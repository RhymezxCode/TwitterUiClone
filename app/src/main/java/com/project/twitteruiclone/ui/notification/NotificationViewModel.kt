package com.project.twitteruiclone.ui.notification

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Notification Fragment"
    }
    val text: LiveData<String> = _text
}