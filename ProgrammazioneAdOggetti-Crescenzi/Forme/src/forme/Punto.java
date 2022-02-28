package forme;

public class Punto {
	
	private int x,y;
	
	public Punto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x){ 
		this.x = x; 
	}
	
	public void setY(int y){ 
		this.y = y; 
	}
	
	public int getX(){ 
		return this.x; 
	}
	
	public int getY(){ 
		return this.y; 
	}

}