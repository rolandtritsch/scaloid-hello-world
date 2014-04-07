import org.ensime.sbt.Plugin.Settings._

import org.ensime.sbt.util.SExp._

ensimeConfig := sexp(
  key(":compile-deps"), sexp(
    "/opt/android-sdk-macosx-r22.3/platforms/android-19/android.jar",
    "/opt/android-sdk-macosx-r22.3/extras/android/support/v4/android-support-v4.jar"
  ),
  key(":test-deps"), sexp(
  ),
  key(":source-roots"), sexp(
  )
)
