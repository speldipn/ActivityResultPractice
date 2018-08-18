package com.example.pc.doit06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
  public static final int REQUEST_CODE = 5025;

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    if(resultCode == RESULT_OK) {
      String prevActName = data.getExtras().get("goto").toString();
      String name = data.getExtras().get("name").toString();
      if(prevActName != null && prevActName.length() > 0) {
        if(prevActName.equals("menu")) {
          Toast.makeText(this, name, Toast.LENGTH_SHORT)
            .show();
        }
        else if(prevActName.equals("login")) {
          setResult(RESULT_OK, data);
          finish();
        }
      }
    }
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu);
    Button buttonCustomer = (Button) findViewById(R.id.buttonCustomer);
    buttonCustomer.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), CustomerActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
      }
    });

    Button buttonSell = (Button) findViewById(R.id.buttonSell);
    buttonSell.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), SellActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
      }
    });

    Button buttonProduct = (Button) findViewById(R.id.buttonProduct);
    buttonProduct.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), ProductActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
      }
    });
  }
}
