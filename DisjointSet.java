class DisjointSet{ 
  
private int[] set; 
  
public DisjointSet(int[] set){ 
 this.set = set; 
 } 
  
 
public int[] getSet(){ 
 return set; 
 }  
 
public DisjointSet(int n) { 
 set = new int [n]; 
  
for(int i = 0; i < set.length; i++){ 
 set[i] = -1; 
 } 
 }// 
  
 
public void union(int Froot, int Sroot) { 
 if(set[Sroot] < set[Froot]) 
 set[Froot] = Sroot; 
  
else{ 
 if(set[Froot] == set[Sroot]) 
 set[Froot]--; 
 set[Sroot] = Froot; 
 } 
 }// 
  
public int findKey(int key) { 
 if(set[key] < 0) 
 return key; 
  
int next = key; 
  
while(set[next] > 0) 
 next=set[next]; 
  
return next;  
}// 
  
}//end class 

 