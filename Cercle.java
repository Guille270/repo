/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author Guille
 */
public class Cercle {

 private float x;
 private float y;
 
 public Cercle () {
     this.x = 4.3f;
     this.y = 4.3f;
 }
 
 public Cercle (Cercle cercle) {
     this.x = cercle.x;
     this.y = cercle.y;
 }

 Cercle(float xx, float yy)

  {

     x=xx;

     y=yy;     

  }
 
 @Override
 public String toString() {
    String valor = "Propietat X: " + this.x + " Propietat: " + this.y;
    return valor;
 }

 public Boolean equals (Cercle objecte) {
 return this.equals(objecte);
 }
 
}