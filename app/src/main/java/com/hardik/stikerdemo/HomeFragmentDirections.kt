package com.hardik.stikerdemo

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

class HomeFragmentDirections private constructor() {
    private data class ActionHomeFragmentToStickerPackDetailsFragment(val identifier: String,
            val catId: Int) : NavDirections {
        override fun getActionId(): Int = R.id.action_homeFragment_to_stickerPackDetailsFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("identifier", this.identifier)
            result.putInt("catId", this.catId)
            return result
        }
    }

    private data class ActionHomeFragmentToStickerPackListFragment(val searchTerm: String = "New") :
            NavDirections {
        override fun getActionId(): Int = R.id.action_homeFragment_to_stickerPackListFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("searchTerm", this.searchTerm)
            return result
        }
    }

    companion object {
        fun actionHomeFragmentToStickerPackDetailsFragment(identifier: String, catId: Int):
                NavDirections = ActionHomeFragmentToStickerPackDetailsFragment(identifier, catId)

        fun actionHomeFragmentToStickerPackListFragment(searchTerm: String = "New"): NavDirections =
                ActionHomeFragmentToStickerPackListFragment(searchTerm)
    }
}
