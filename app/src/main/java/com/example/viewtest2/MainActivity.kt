package com.example.viewtest2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewtest2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		val customView =CustomView(this)
		binding.framLayout.addView(customView)

	}
}

class CustomView(context: Context): View(context){
	override fun onDraw(canvas: Canvas?){
		super.onDraw(canvas)

		val circle = Paint()
		circle.style = Paint.Style.STROKE
		circle.color = Color.BLUE
		canvas?.drawCircle(150f, 100f, 100f, circle)
		
		// 속이 꽉찬 반지름 100f의 붉은 색 원 그림

		val circle1 = Paint()
		circle1.style = Paint.Style.FILL
		circle1.color = Color.RED
		canvas?.drawCircle(500f, 100f, 100f, circle1)

		val rect1 = Paint()
		rect1.style = Paint.Style.FILL
		rect1.color = Color.GREEN
		canvas?.drawRect(50f, 350f, 200f, 500f, rect1)
		
		// 속이 찬 직사각형으로 푸른 계역색

		val rect2 = Paint()
		rect2.style = Paint.Style.FILL
		rect2.color = Color.GREEN
		canvas?.drawRect(50f, 700f, 200f, 500f, rect2)
	}
}