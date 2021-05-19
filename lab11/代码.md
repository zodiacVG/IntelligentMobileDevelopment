1. 初始化首选项
```
private SharedPreferences mPreferences; //首选项
private String sharedPrefFile =
            "com.example.android.hellosharedprefs"; 
```            
2. pause时候将配置文件写入
```
SharedPreferences.Editor preferencesEditor = mPreferences.edit(); //先获取editor
preferencesEditor.putInt(COUNT_KEY, mCount); //再操作
preferencesEditor.putInt(COLOR_KEY, mColor);
preferencesEditor.apply();  //最后应用
```
3. 重新打开时读取首选项信息并配置
```
mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE); //获取首选项
//从首选项获取配置选项等
mCount = mPreferences.getInt(COUNT_KEY, 0); //另一个是默认值，如果什么都得不到的话
mShowCountTextView.setText(String.format("%s", mCount));
mColor = mPreferences.getInt(COLOR_KEY, mColor);
mShowCountTextView.setBackgroundColor(mColor);
```
4. 重置时将首选项内容全部清除
```
public void reset(View view) {
    // Reset count
    mCount = 0;
    mShowCountTextView.setText(String.format("%s", mCount));
    // Reset color
    mColor = ContextCompat.getColor(this,
            R.color.default_background);
    mShowCountTextView.setBackgroundColor(mColor);
    //重置的时候需要将首选项清除
    SharedPreferences.Editor preferencesEditor = mPreferences.edit();
    preferencesEditor.clear();
    preferencesEditor.apply();
}
```


