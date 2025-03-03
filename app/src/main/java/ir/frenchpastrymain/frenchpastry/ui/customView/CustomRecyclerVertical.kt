package ir.frenchpastrymain.frenchpastry.ui.customView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import ir.frenchpastrymain.frenchpastry.databinding.CustomRecyclerVerticalBinding

class CustomRecyclerVertical(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private val binding: CustomRecyclerVerticalBinding

    init {

        binding = CustomRecyclerVerticalBinding.inflate(LayoutInflater.from(context))

        addView(binding.root)
    }

    fun getRecycler() = binding.recyclerView

}