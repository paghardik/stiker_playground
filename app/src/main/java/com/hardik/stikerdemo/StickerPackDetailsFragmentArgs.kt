package com.hardik.stikerdemo

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

data class StickerPackDetailsFragmentArgs(val identifier: String, val catId: Int) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("identifier", this.identifier)
        result.putInt("catId", this.catId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): StickerPackDetailsFragmentArgs {
            bundle.setClassLoader(StickerPackDetailsFragmentArgs::class.java.classLoader)
            val __identifier : String?
            if (bundle.containsKey("identifier")) {
                __identifier = bundle.getString("identifier")
                if (__identifier == null) {
                    throw IllegalArgumentException("Argument \"identifier\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"identifier\" is missing and does not have an android:defaultValue")
            }
            val __catId : Int
            if (bundle.containsKey("catId")) {
                __catId = bundle.getInt("catId")
            } else {
                throw IllegalArgumentException("Required argument \"catId\" is missing and does not have an android:defaultValue")
            }
            return StickerPackDetailsFragmentArgs(__identifier, __catId)
        }
    }
}
