Pig myPig = new Pig();
Background myBackground = new Background();
Grass myGrass = new Grass();
UFO myUFO = new UFO();

void setup() {
  size(700, 700);
  colorMode(RGB, 100);

  //Using an array for text:
  for (int i = 0; i < Greeting.length; i++) {
    println(Greeting[i]);
  }
}

void draw() {

  //Background display - sun and colorchanging background
  myBackground.backgroundChange();
  myBackground.drawSun();
  myGrass.drawGrass();

  // Pig and its movement
  myPig.pigMovement(); // Brug her W, A, S, D til at bevæge grisen
  myPig.drawPig();
  myUFO.drawUFO();

  // Hat and its movement
  myPig.drawHat();
  myPig.hatMovement();
}
