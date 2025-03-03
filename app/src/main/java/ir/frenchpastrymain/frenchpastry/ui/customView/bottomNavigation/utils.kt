package ir.frenchpastrymain.frenchpastry.ui.customView.bottomNavigation

enum class FragmentType {

    HOME, CAKE, SHOPPING, PASTRY, PROFILE

}

interface ActiveFragment {

    fun setFragment(type: FragmentType)

}