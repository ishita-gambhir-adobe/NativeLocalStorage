package com.nativelocalstorage

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.adobe.marketing.mobile.Places;
import com.facebook.react.bridge.Promise;

@ReactModule(name = NativeLocalStorageModule.NAME)
class NativeLocalStorageModule(reactContext: ReactApplicationContext) :
  NativeNativeLocalStorageSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  override fun extensionVersion(promise: Promise) {
    promise.resolve(Places.extensionVersion());
  }

  companion object {
    const val NAME = "NativeLocalStorage"
  }
}
