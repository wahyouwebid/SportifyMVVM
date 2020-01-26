package com.wahyu.sportify.utilities

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.*
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import androidx.recyclerview.widget.RecyclerView
import com.wahyu.sportify.R

/**
 * Created by with love by Ujang Wahyu on 2020-01-08.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */

class EmptyRecyclerView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : RecyclerView(context, attrs, defStyle) {

    private var emptyView: View? = null
    private var textStringView: View? = null

    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.EmptyRecyclerView, 0, 0)
        val resId = a.getResourceId(R.styleable.EmptyRecyclerView_emptyView, 0)
        val resString = a.getResourceId(R.styleable.EmptyRecyclerView_emptyString,0)
        a.recycle()

        if (resId > 0)
            setEmptyView(resId)
        else
            setEmptyString(resString)
    }

    override fun onMeasure(widthSpec: Int, heightSpec: Int) {
        val view = emptyView
        if (view != null && adapter?.itemCount == 0) {
            view.measure(widthSpec, heightSpec)
            val width = view.measuredWidth
            val height = view.measuredHeight
            setMeasuredDimension(width, height)
            return
        }

        super.onMeasure(widthSpec, heightSpec)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)
        emptyView?.layout(l, t, r, b)
    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        if (adapter?.itemCount == 0) {
            emptyView?.draw(c)
        }else{
            emptyView?.visibility = View.VISIBLE
        }
    }

    /**
     * Set a view to show if the adapter is empty
     *
     * @param view [View]
     */
    @SuppressWarnings("unused")
    fun setEmptyView(view: View?) {
        emptyView = view
        emptyView?.visibility = View.GONE
        invalidate()
    }

    /**
     * Set a view to show if the adapter is empty
     *
     * @param resId empty view'Repo layout id
     */
    @SuppressWarnings("unused")
    fun setEmptyView(@LayoutRes resId: Int) {
        if (resId == 0) return

        val view = LayoutInflater.from(context).inflate(resId, null)
        setEmptyView(view)
    }


    @SuppressWarnings("unused")
    fun setEmptyString(@StringRes resId: Int) {
        if (resId == 0) return

        var gravity = Gravity.CENTER
        var params: ViewGroup.LayoutParams? = null

        @StyleRes
        var styleRes: Int = 0

        val message = context.getString(resId)

        setEmptyString(message,gravity,params,styleRes)
    }

    /**
     * Create TextView from a string resource, Gravity, LayoutParams and Style resource,
     * add to EmptyRecyclerView to show if the adapter is empty.
     *
     * @param emptyMessageResId resource id of message to show
     * @param gravity           [android.view.Gravity]
     * @param params            [ViewGroup.LayoutParams]
     * @param styleRes          resource id of view style
     */
    @SuppressWarnings("unused")
    fun setEmptyString(
            emptyMessageResId: Int,
            gravity: Int = Gravity.CENTER,
            params: ViewGroup.LayoutParams? = null,
            @StyleRes styleRes: Int = 0
    ) {
        val message = if (emptyMessageResId > 0) {
            context.getString(emptyMessageResId)
        } else {
            null
        }

        setEmptyString(message, gravity, params, styleRes)
    }

    /**
     * Create TextView from a string, Gravity, LayoutParams and Style resource,
     * add to EmptyRecyclerView to show if the adapter is empty.
     *
     * @param emptyMessage message to show
     * @param gravity      [android.view.Gravity]
     * @param params       [ViewGroup.LayoutParams]
     * @param styleRes     resource id of view style
     */
    @SuppressWarnings("unused")
    fun setEmptyString(
            emptyMessage: String?,
            gravity: Int = Gravity.CENTER,
            params: ViewGroup.LayoutParams? = null,
            @StyleRes styleRes: Int = 0
    ) {
        if (emptyMessage.isNullOrEmpty()) {
            setEmptyView(null)
            return
        }

        textStringView = TextView(ContextThemeWrapper(context, styleRes)).also {
            it.text = emptyMessage
            it.gravity = gravity
            it.visibility = View.GONE
            it.layoutParams = params ?: ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }

        setEmptyView(textStringView)
    }
}