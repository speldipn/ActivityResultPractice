package com.example.pc.doit06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  public static final int REQUEST_CODE = 5025;
  EditText editTextId;
  EditText editTextPassword;

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    if(resultCode == RESULT_OK) {
      String prevActName = data.getExtras().get("name").toString();
      if(prevActName != null && prevActName.length() > 0) {
        Toast.makeText(this, prevActName, Toast.LENGTH_SHORT).show();
      }
    }
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    editTextId = (EditText) findViewById(R.id.editTextId);
    editTextPassword = (EditText) findViewById(R.id.editTextPassword);

    Button button = (Button) findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if(editTextId.length() > 0 && editTextPassword.length() > 0) {
          Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
          startActivityForResult(intent, 1234);
        } else {
          Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 입력해주세요", Toast.LENGTH_LONG)
            .show();
        }
      }
    });
  }
}
