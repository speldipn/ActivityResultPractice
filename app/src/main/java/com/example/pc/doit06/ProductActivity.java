package com.example.pc.doit06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_product);

    Button buttonProductToMenu = (Button) findViewById(R.id.buttonProductToMenu);
    buttonProductToMenu.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        intent.putExtra("name", "상품 관리");
        intent.putExtra("goto", "menu");

        setResult(RESULT_OK, intent);
        finish();
      }
    });

    Button buttonProductToLogin = (Button) findViewById(R.id.buttonProductToLogin);
    buttonProductToLogin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("name", "상품 관리");
        intent.putExtra("goto", "login");

        setResult(RESULT_OK, intent);
        finish();
      }
    });
  }
}
