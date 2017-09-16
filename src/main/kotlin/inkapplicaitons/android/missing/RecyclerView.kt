package inkapplicaitons.android.missing

import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.TypedValue

/**
 * Auto-size a recyclerview's grid layout span based on the width and a fixed item width.
 *
 * @param itemWidth The width of each span to autosize based on, in DP
 */
fun RecyclerView.autoSizeSpan(itemWidth: Int) = viewTreeObserver.addOnGlobalLayoutListener({
    val spanCount = width / TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, itemWidth.toFloat(), resources.displayMetrics)
    val manager = layoutManager as? GridLayoutManager
    manager?.spanCount = Math.max(1f, spanCount).toInt()
})
