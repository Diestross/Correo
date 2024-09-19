package co.edu.unipiloto.correo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ProjectActivity extends AppCompatActivity {

    private EditText locationField, projectNameField, projectDescriptionField;
    private Button publishButton, goToEmailForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        locationField = findViewById(R.id.locationField);
        projectNameField = findViewById(R.id.projectNameField);
        projectDescriptionField = findViewById(R.id.projectDescriptionField);
        publishButton = findViewById(R.id.publishButton);
        goToEmailForm = findViewById(R.id.goToEmailForm);

        publishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = locationField.getText().toString();
                String projectName = projectNameField.getText().toString();
                String description = projectDescriptionField.getText().toString();
            }
        });

        goToEmailForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProjectActivity.this, EmailActivity.class);
                startActivity(intent);
            }
        });
    }
}
