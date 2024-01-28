package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    CheckBox cb;
    private TextView mText;
    private ImageView mImage;
    private TextView mLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb=findViewById(R.id.checkBox);
        cb.setOnCheckedChangeListener(this);
        final ToggleButton tb = findViewById(R.id.toggleButton);
        tb.setOnCheckedChangeListener(this);
        mText = findViewById(R.id.text);
        mImage = findViewById(R.id.imagePolytech);
        mLabel = findViewById(R.id.label);
        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        ImageButton imageButton = findViewById(R.id.imageButton);
        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        imageButton.setOnClickListener(this);

    }
    public void onCheckedChanged(CompoundButton buttonView, boolean
            isChecked)
    {
        if (buttonView==cb){
            if (isChecked)
                cb.setText("CheckBox ON");
            else
                cb.setText("CheckBox OFF");}
        else {
            if (isChecked) {
                mText.setText("Button checked");
            } else {
                mText.setText("Button unchecked");
            }
        }
    }

    @Override
    public void onClick(View v) {
        RadioButton rb = (RadioButton)v;
        mLabel.setText("Картинка: " + rb.getText());
        int img = v.getId();
        if (img == R.id.radioButton1)
            mImage.setImageResource(R.drawable.logo);
        if (img == R.id.radioButton2)
            mImage.setImageResource(R.drawable.polytechtextlogo);
        if (img == R.id.imageButton)
            mImage.setImageResource(R.drawable.ic_launcher_background);
    }
}