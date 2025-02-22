package ir.frenchpastrymain.frenchpastry.ui.customView

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import ir.frenchpastrymain.frenchpastry.R
import ir.frenchpastrymain.frenchpastry.databinding.CustomButtonBinding

class CustomButton(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private val binding =
        CustomButtonBinding.inflate(LayoutInflater.from(context))

    init {

        addView(binding.root)

        initialize(attrs)

    }

    private fun initialize(attrs: AttributeSet) {

        val typeArray = context.obtainStyledAttributes(attrs, R.styleable.CustomButton)

        val text = typeArray.getString(R.styleable.CustomButton_buttonText)
        val white = typeArray.getBoolean(R.styleable.CustomButton_buttonWhite, false)

        binding.buttonCustom.text = text

        if (white) {
            binding.buttonCustom.setBackgroundResource(R.drawable.back_button_white)
            binding.buttonCustom.setTextColor(Color.parseColor("#101219"))
        }

        typeArray.recycle()

    }

    fun getView() = binding.buttonCustom

    fun enableProgress() {
        binding.loading.visibility = VISIBLE
        binding.buttonCustom.visibility = INVISIBLE
    }

    fun disableProgress() {
        binding.loading.visibility = INVISIBLE
        binding.buttonCustom.visibility = VISIBLE
    }

}