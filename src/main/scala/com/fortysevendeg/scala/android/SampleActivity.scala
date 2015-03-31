package com.fortysevendeg.scala.android

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class SampleActivity extends Activity {

  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.main)
    findViewById(R.id.textview).asInstanceOf[TextView].setText(R.string.hello_world)
  }

}
