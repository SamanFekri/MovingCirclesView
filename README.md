Moving Circle View in android
----------
## Attention
This app read colors from colors.xml that exist in res/value
## Usage
Add CircleMove.java &amp; MovingCirclesView.java in src of you project
Add colors.xml in res/value of your project
MovingCirclesView have method of addCircle use that for adding more circle into view
```
	MovingCirclesView mcv = (MovingCirclesView) findViewById(R.id.movingCirclesView1);
    mcv.addCircle(new CircleMove(20, 80, 50, 10, 5, R.color.Red));
    mcv.addCircle(new CircleMove(40, 100, 200, -15, 5, R.color.Blue));
    mcv.addCircle(new CircleMove(30, 50, 200, -15, 15, R.color.Green));
```