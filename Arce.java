class Arce implements Comparable<Arce>{ 
  
private int v1; 
 private int v2; 
 private int distance; 
  
 
public Arce(int v1, int v2, int d){ 
 this.v1=v1; 
 this.v2=v2; 
 distance=d; 
 }// 
  
//setters and getters 
 public void setV1(int v1) { 
 this.v1 = v1; 
 } 
  
public void setV2(int v2) { 
 this.v2 = v2; 
 } 
  
public void setDistance(int distance) { 
 this.distance = distance; 
  
 
} 
  
public int getV1(){ 
 return v1; 
 } 
  
public int getV2(){ 
 return v2; 
 } 
  
public int getDistance(){ 
 return distance; 
 }  
 
 
public int compareTo(Arce arce2) { 
 return this.getDistance() - arce2.getDistance(); 
 } 
  
 
public String toString() { 
 String s= "\n ------------------ \n The total distance from arce "+getV1()+" to arce "+getV2()+" is= "+getDistance(); 
 return s; 
 } 
  
 
}//end class 