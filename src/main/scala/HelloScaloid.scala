package org.tritsch.scaloid.hello

import android.graphics.Color
import android.os.Bundle

import org.scaloid.common._

class HelloScaloid extends SActivity {
  override implicit val loggerTag = LoggerTag("HelloScaloid")

  override def onCreate(b: Bundle): Unit = {
    super.onCreate(b)
    debug(s"Enter - onCreate")
    contentView = new SVerticalLayout {
      style {
        case b: SButton => b.textColor(Color.RED).onClick {
          info(s"Before the big bang ...")
          toast("Bang!")
          verbose(s"After the big bang ...")
        }
        case t: STextView => t textSize 10.dip
        case v => v.backgroundColor(Color.YELLOW)
      }

      STextView("I am 10 dip tall")
      STextView("Me too")
      STextView("I am taller than you") textSize 15.dip
      SEditText("Yellow input field")
      SButton(R.string.red)
    } padding 20.dip
    debug(s"Leave - onCreate")
  }
}
