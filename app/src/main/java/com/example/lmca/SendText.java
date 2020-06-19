package com.example.lmca;

import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.SmsManager;

public class SendText {

    public void SentText (String phoneNumber){
        String defaultMessage = "";
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, defaultMessage, null, null);
        }
}
