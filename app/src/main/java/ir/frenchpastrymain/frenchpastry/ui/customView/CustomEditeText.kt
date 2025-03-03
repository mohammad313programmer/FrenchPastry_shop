package ir.frenchpastrymain.frenchpastry.ui.customView

import android.annotation.SuppressLint
import android.content.Context
import android.text.Editable
import android.text.InputFilter
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.FrameLayout
import ir.frenchpastrymain.frenchpastry.R
import ir.frenchpastrymain.frenchpastry.databinding.CustomEditeTextBinding

class CustomEditeText(
    context : Context,
    attrs : AttributeSet
): FrameLayout(context, attrs) {

    private val binding =
        CustomEditeTextBinding.inflate(LayoutInflater.from(context))

    init {

        addView(binding.root)

        initialize(attrs)

    }

    @SuppressLint("CustomViewStyleable")
    private fun initialize(attrs : AttributeSet) {

        val typeArray = context.obtainStyledAttributes(attrs, R.styleable.CustomEditText)

        val hint = typeArray.getString(R.styleable.CustomEditText_hintText)

        val type = typeArray.getInteger(R.styleable.CustomEditText_type, 1)

        val rtlSupport =
            typeArray.getBoolean(R.styleable.CustomEditText_rtlSupport, false)

        val maxLength = typeArray.getInteger(R.styleable.CustomEditText_max, 0)

        val centerGravity =
            typeArray.getBoolean(R.styleable.CustomEditText_centerGravity, false)

        binding.textInputEditText.hint = hint
        binding.textInputEditText.inputType = type

        if (rtlSupport){
            binding.textInputEditText.textDirection = TEXT_DIRECTION_RTL
            binding.textInputLayout.layoutDirection = LAYOUT_DIRECTION_RTL
        }

        if (maxLength > 0)
            binding.textInputEditText.filters = arrayOf(InputFilter.LengthFilter(maxLength))

        if (centerGravity)
            binding.textInputEditText.gravity = Gravity.CENTER

        typeArray.recycle()

    }

    fun setError(errorText : String){
        binding.textInputLayout.error = errorText
    }
    fun nullError(){
        binding.textInputLayout.error = null
    }

    fun getText() = binding.textInputEditText.text.toString()

    fun setText( text : String){
        binding.textInputEditText.text = Editable.Factory().newEditable(text)
    }

    fun getEditText() = binding.textInputEditText

}