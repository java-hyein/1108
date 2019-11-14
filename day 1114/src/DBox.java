

class DBox<L, R>{
	private L left;
	private R right;
	
	void set(L o, R r) {
		left = o;
		right = r;
	}
	@Override
	public String toString() {
		return left + " & " + right;
	}
	
}

class DDBox<U, D>{
	private U up;
	private D down;
	
	public void set(U u, D d) {
		up = u;
		down = d;
	}
	public String toString() {
		return up.toString() + " \n " + down.toString();
	}
	
}

