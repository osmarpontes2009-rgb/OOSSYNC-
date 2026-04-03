package com.oossync.chat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    private EditText messageEditText;
    private Button sendButton;
    private Button emergencyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        messageEditText = findViewById(R.id.message_edit_text);
        sendButton = findViewById(R.id.send_button);
        emergencyButton = findViewById(R.id.emergency_button);

        sendButton.setOnClickListener(v -> sendMessage());
        emergencyButton.setOnClickListener(v -> handleEmergency());
    }

    private void sendMessage() {
        String message = messageEditText.getText().toString();
        if (!message.isEmpty()) {
            // Logic for mesh message sending goes here
            Toast.makeText(this, "Message sent: " + message, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please enter a message", Toast.LENGTH_SHORT).show();
        }
    }

    private void handleEmergency() {
        // Logic for handling emergency button click goes here
        Toast.makeText(this, "Emergency button pressed!", Toast.LENGTH_SHORT).show();
    }

    public static class NewMessageReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            // Logic for receiving new messages goes here
        }
    }
} 
