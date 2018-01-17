package com.example.pc.doit06;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SellActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sell);

    Button buttonSellToMenu = (Button) findViewById(R.id.buttonSellToMenu);
    buttonSellToMenu.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        intent.putExtra("name", "매출 관리");
        intent.putExtra("goto", "menu");

        setResult(RESULT_OK, intent);
        finish();
      }
    });

    Button buttonSellToLogin = (Button) findViewById(R.id.buttonSellToLogin);
    buttonSellToLogin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("name", "매출 관리");
        intent.putExtra("goto", "login");

        setResult(RESULT_OK, intent);
        finish();
      }
    });
  }
}
