import android.Keys._
android.Plugin.androidBuild

name := "scaloid-hello-world"
version := "0.1"

platformTarget in Android := "android-23"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalaVersion := "2.11.8"
scalacOptions in Compile += "-feature"

updateCheck in Android := {}
proguardCache in Android ++= Seq("org.scaloid")

proguardOptions in Android ++= Seq(
  "-dontobfuscate",
  "-dontoptimize",
  "-keepattributes Signature",
  "-printseeds target/seeds.txt",
  "-printusage target/usage.txt",
  "-dontwarn scala.collection.**",
  "-dontwarn org.scaloid.**"
)

libraryDependencies += "org.scaloid" %% "scaloid" % "4.2"
