import android.Keys._

android.Plugin.androidBuild

name := "scaloid-hello-world"

version := "0.1"

scalaVersion := "2.11.8"

platformTarget in Android := "android-23"

proguardCache in Android ++= Seq(
  ProguardCache("org.scaloid") % "org.scaloid"
)

proguardOptions in Android ++= Seq("-dontobfuscate", "-dontoptimize", "-keepattributes Signature", "-printseeds target/seeds.txt", "-printusage target/usage.txt", "-dontwarn scala.collection.**")

libraryDependencies += "org.scaloid" %% "scaloid" % "4.2" withSources() withJavadoc()

scalacOptions in Compile += "-feature"

run <<= run in Android

install <<= install in Android
