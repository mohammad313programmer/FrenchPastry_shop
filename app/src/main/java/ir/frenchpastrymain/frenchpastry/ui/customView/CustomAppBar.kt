package ir.frenchpastrymain.frenchpastry.ui.customView

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import ir.frenchpastrymain.frenchpastry.R
import ir.frenchpastrymain.frenchpastry.databinding.CustomAppBarBinding

class CustomAppBar(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private val binding =
        CustomAppBarBinding.inflate(LayoutInflater.from(context))

    init {

        addView(binding.root)

        initialize(attrs)

    }

    private fun initialize(attrs: AttributeSet) {

        val typeArray = context.obtainStyledAttributes(attrs, R.styleable.CustomAppBar)

        val isBack = typeArray.getBoolean(R.styleable.CustomAppBar_backIcon, false)

        if (isBack) {
            binding.imgBack.visibility = VISIBLE
            binding.imgShopping.visibility = VISIBLE
            binding.imgAlert.visibility = INVISIBLE
        }

        typeArray.recycle()

    }

    fun getBackIcon() = binding.imgBack

    fun countShow() {
        binding.countGroup.visibility = VISIBLE
    }

    fun countHide() {
        binding.countGroup.visibility = INVISIBLE
    }

    fun setCount(count: String) {
        binding.txtAlertCount.text = count
    }

    fun showNavDrawer(context: Context) {

        binding.imgMenu.setOnClickListener {
            //context.startActivity(Intent(context, NavDrawerActivity::class.java))
        }

    }

}