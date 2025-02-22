package ir.frenchpastrymain.frenchpastry.ui.customView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
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

    private fun initialize(attrs : AttributeSet) {



    }

}