package com.hardik.stikerdemo

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class StickerPackListFragmentArgs(val searchTerm: String = "New") : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("searchTerm", this.searchTerm)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): StickerPackListFragmentArgs {
            bundle.setClassLoader(StickerPackListFragmentArgs::class.java.classLoader)
            val __searchTerm : String?
            if (bundle.containsKey("searchTerm")) {
                __searchTerm = bundle.getString("searchTerm")
                if (__searchTerm == null) {
                    throw IllegalArgumentException("Argument \"searchTerm\" is marked as non-null but was passed a null value.")
                }
            } else {
                __searchTerm = "New"
            }
            return StickerPackListFragmentArgs(__searchTerm)
        }
    }
}
