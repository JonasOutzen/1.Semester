class Grass {

  void drawGrass() {
    /* Grass */
    rectMode(CORNER);
    fill(0, 80, 0);
    noStroke();
    rect(0, height-2*height/5, width, height);
    stroke(0, 80, 0);
    strokeWeight(2);

    grassX = 0;
    while (grassX < width) {
      line(grassX, height-2*height/5, grassX+grassTilt, height-2*height/5-grassHeight);
      grassX = grassX + grassSpace;
    }
  }
}
