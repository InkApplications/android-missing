package inkapplicaitons.android.missing

import android.content.SharedPreferences

/** Apply just one boolean value */
fun SharedPreferences.applyBoolean(key: String, value: Boolean) = edit().putBoolean(key, value).apply()
/** Apply just one string value */
fun SharedPreferences.applyString(key: String, value: String?) = edit().putString(key, value).apply()
/** Apply just one long value */
fun SharedPreferences.applyLong(key: String, value: Long) = edit().putLong(key, value).apply()
/** Apply just one int value */
fun SharedPreferences.applyInt(key: String, value: Int) = edit().putInt(key, value).apply()
/** Apply just one float value */
fun SharedPreferences.applyFloat(key: String, value: Float) = edit().putFloat(key, value).apply()

/** Commit just one boolean value */
fun SharedPreferences.commitBoolean(key: String, value: Boolean) = edit().putBoolean(key, value).commit()
/** Commit just one string value */
fun SharedPreferences.commitString(key: String, value: String?) = edit().putString(key, value).commit()
/** Commit just one long value */
fun SharedPreferences.commitLong(key: String, value: Long) = edit().putLong(key, value).commit()
/** Commit just one int value */
fun SharedPreferences.commitInt(key: String, value: Int) = edit().putInt(key, value).commit()
/** Commit just one float value */
fun SharedPreferences.commitFloat(key: String, value: Float) = edit().putFloat(key, value).commit()
