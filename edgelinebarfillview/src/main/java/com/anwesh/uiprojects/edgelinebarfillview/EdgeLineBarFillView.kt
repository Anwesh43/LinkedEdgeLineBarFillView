package com.anwesh.uiprojects.edgelinebarfillview

/**
 * Created by anweshmishra on 04/09/20.
 */

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF

val colors : Array<Int> = arrayOf(
        "#ff4436",
        "#4caf50",
        "#3f51b5",
        "#ff5722",
        "#1565c0"
).map({Color.parseColor(it)}).toTypedArray()
val parts : Int = 2
val scGap : Float = 0.02f / parts
val strokeFactor : Int = 90
val sizeFactor : Float = 8.9f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
