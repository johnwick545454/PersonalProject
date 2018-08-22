package p3;

import java.io.Serializable;

public class Camera{
	
	private int mp;

	public Camera(int mp) {
		this.mp = mp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	@Override
	public String toString() {
		return "Camera [mp=" + mp + "]";
	}
	
	
	
}
