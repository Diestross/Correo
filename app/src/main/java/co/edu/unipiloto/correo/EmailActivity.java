package co.edu.unipiloto.correo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EmailActivity extends AppCompatActivity {

    private EditText toField, subjectField, messageField;
    private Button sendButton, goToProjectForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        toField = findViewById(R.id.toField);
        subjectField = findViewById(R.id.subjectField);
        messageField = findViewById(R.id.messageField);
        sendButton = findViewById(R.id.sendButton);
        goToProjectForm = findViewById(R.id.goToProjectForm);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = toField.getText().toString();
                String subject = subjectField.getText().toString();
                String message = messageField.getText().toString();
            }
        });


        goToProjectForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmailActivity.this, ProjectActivity.class);
                startActivity(intent);
            }
        });
    }
}