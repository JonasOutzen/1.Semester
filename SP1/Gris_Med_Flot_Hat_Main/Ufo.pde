class UFO {

  void drawUFO() {
  /* UFO */
    fill(50, 20, 80); 
    ellipse(pigX + 80, pigY + 410, 200, 50);  

    /* UFO - lightbeam */
    fill(20, 100, 100, 50);  // Transparant blue Lightbeam
    triangle(pigX + 40, pigY + 420, pigX + 120, pigY + 420, pigX + 80, pigY + 500); 
    
    /* UFO - extra detail */
    fill(50, 20, 60);  // Mørkere grå til detaljer
    ellipse(pigX + 80, pigY + 405, 190, 40); 

    /* UFO - lights */
    fill(20, 100, 80);  // Yellow
    ellipse(pigX + 40, pigY + 400, 10, 10);  // Left light
    ellipse(pigX + 80, pigY + 410, 10, 10);  // Mid Light
    ellipse(pigX + 120, pigY + 400, 10, 10);  // Right Light

  }
}
