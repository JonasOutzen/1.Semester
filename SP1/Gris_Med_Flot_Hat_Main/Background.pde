class Background {

  void backgroundChange() {
    background(30+flyingHatY-80, 20, 80-flyingHatY);
  }


  void drawSun() {
    // Sun
    ellipseMode(CENTER);
    strokeWeight(2);
    stroke(0);
    fill(100, 100, 0);
    ellipse(width, 0, 200, 200);
  }
}
