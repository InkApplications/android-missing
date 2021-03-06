package inkapplicaitons.android.missing

import android.view.View
import android.view.animation.AlphaAnimation

/**
 * Animate a view visibility to Visible.
 */
fun View.fadeIn(duration: Int = 500, offset: Int = 0) {
    val fade = AlphaAnimation(0f, 1f)
    fade.duration = duration.toLong()
    fade.startOffset = offset.toLong()
    startAnimation(fade)
    visibility = View.VISIBLE
}

/**
 * Animate a view visibility to Invisible.
 */
fun View.fadeOut(duration: Int = 500, offset: Int = 0) {
    val fade = AlphaAnimation(1f, 0f)
    fade.duration = duration.toLong()
    fade.startOffset = offset.toLong()
    startAnimation(fade)
    visibility = View.INVISIBLE
}
