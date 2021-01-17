package com.hardik.stikerdemo

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

class StickerPackListFragmentDirections private constructor() {
    private data class ActionStickerPackListFragmentToStickerPackDetailsFragment(val identifier:
            String, val catId: Int) : NavDirections {
        override fun getActionId(): Int =
                R.id.action_stickerPackListFragment_to_stickerPackDetailsFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("identifier", this.identifier)
            result.putInt("catId", this.catId)
            return result
        }
    }

    companion object {
        fun actionStickerPackListFragmentToStickerPackDetailsFragment(identifier: String,
                catId: Int): NavDirections =
                ActionStickerPackListFragmentToStickerPackDetailsFragment(identifier, catId)
    }
}
