package com.example.sample;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

public class MovingCirclesView extends View {

	private ArrayList<CircleMove> circleMoves;

	public MovingCirclesView(Context context) {
		this(context, null);
		// TODO Auto-generated constructor stub
	}

	public MovingCirclesView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
		// TODO Auto-generated constructor stub
	}

	public MovingCirclesView(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub

		circleMoves = new ArrayList<CircleMove>();

	}
	
	public void addCircle(CircleMove circleMove) {
		circleMoves.add(circleMove);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Paint paint = new Paint();
		paint.setStrokeWidth(1);
		paint.setStyle(Paint.Style.FILL);
		CircleMove cm;
		for (int i = 0; i < circleMoves.size(); i++) {
			cm = circleMoves.get(i);
			paint.setColor(getResources().getColor(cm.color));
			canvas.drawCircle(cm.x, cm.y, cm.r, paint);
			
			cm.x += cm.speed_x;
			cm.y += cm.speed_y;
			if (cm.x + cm.r> getWidth()) {
				cm.speed_x = -cm.speed_x;
				cm.x = getWidth() -cm.r;
			}
			if (cm.x - cm.r< 0) {
				cm.speed_x = -cm.speed_x;
				cm.x = 0 + cm.r;
			}
			if (cm.y +cm.r > getHeight()) {
				cm.speed_y = -cm.speed_y;
				cm.y = getHeight() - cm.r;
			}
			if (cm.y -cm.r < 0) {
				cm.speed_y = -cm.speed_y;
				cm.y = 0 + cm.r;
			}

		}

		new Handler().post(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				invalidate();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
