# ActivityResultPractice
Activity Result Example code

### Activity Result

### 테스트 동작시현
![screenshot01](/screenshot/screenshot01.png)

#### 호출하는 액티비티
* 요청코드(상수값)을 사용하여 Activity를 호출한다.
````java
Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
startActivityForResult(intent, 1234); // request code
````

* 호출된 액티비티로부터 반환값을 받기 위해서는 아래 함수를 오버라이딩하여 그 결과값을 받아서 확인할 수 있다.
````java
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    if(resultCode == RESULT_OK) {
      // **goto**의 value값을 가져온다
      String prevActName = data.getExtras().get("goto").toString();
      
      // **name**의 value값을 가져온다
      String name = data.getExtras().get("name").toString();
    }
}

````

#### 호출된 액티비티
* 호출된 Activity는 종료할때 Intent를 사용하여 결과값을 반환할 수 있다.

````java
Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
// intent에 name과 value값을 넣어준다.
intent.putExtra("name", "상품 관리");
intent.putExtra("goto", "menu");
setResult(RESULT_OK, data);
finish();
````
