package ir.frenchpastrymain.frenchpastry.ui.customView.bottomNavigation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import ir.frenchpastrymain.frenchpastry.R
import ir.frenchpastrymain.frenchpastry.databinding.CustomBottomNavigationBinding

class CustomBottomNavigation(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private val binding: CustomBottomNavigationBinding

    init {

        binding = CustomBottomNavigationBinding.inflate(LayoutInflater.from(context))
        addView(binding.root)
        binding.txtShoppingCount.text = "0"

    }

    fun onClickHelper(activeFragment: ActiveFragment) {

        binding.home.setOnClickListener {
            activeHome()
            activeFragment.setFragment(FragmentType.HOME)
        }

        binding.cake.setOnClickListener {
            activeCake()
            activeFragment.setFragment(FragmentType.CAKE)
        }

        binding.shopping.setOnClickListener {
            activeShopping()
            activeFragment.setFragment(FragmentType.SHOPPING)
        }

        binding.pastry.setOnClickListener {
            activePastry()
            activeFragment.setFragment(FragmentType.PASTRY)
        }

        binding.profile.setOnClickListener {
            activeProfile()
            activeFragment.setFragment(FragmentType.PROFILE)
        }

    }

    private fun activeHome() {

        binding.home.setBackgroundResource(R.drawable.back_item_bottom_nav)
        binding.cake.background = null
        binding.shopping.background = null
        binding.pastry.background = null
        binding.profile.background = null

    }

    private fun activeCake() {

        binding.home.background = null
        binding.cake.setBackgroundResource(R.drawable.back_item_bottom_nav)
        binding.shopping.background = null
        binding.pastry.background = null
        binding.profile.background = null

    }

    private fun activeShopping() {

        binding.home.background = null
        binding.cake.background = null
        binding.shopping.setBackgroundResource(R.drawable.back_item_bottom_nav)
        binding.pastry.background = null
        binding.profile.background = null

    }

    private fun activePastry() {

        binding.home.background = null
        binding.cake.background = null
        binding.shopping.background = null
        binding.pastry.setBackgroundResource(R.drawable.back_item_bottom_nav)
        binding.profile.background = null

    }

    private fun activeProfile() {

        binding.home.background = null
        binding.cake.background = null
        binding.shopping.background = null
        binding.pastry.background = null
        binding.profile.setBackgroundResource(R.drawable.back_item_bottom_nav)

    }

    fun changeCount(count: String) {
        binding.off.visibility = VISIBLE
        binding.txtShoppingCount.text = count
    }

}