class Person2 {
	String name, socialnum;

	public Person2(String name, String socialnum) {
		this.name = name;
		this.socialnum = socialnum;
	}

	@Override
	public boolean equals(Object obj) {
//		Person2 person2 = (Person2)obj;
//		if(name.equals(name)&&(socialnum.equals(socialnum)))
		if(this.name == ((Person2)obj).name && this.socialnum == ((Person2)obj).socialnum)
			return true;
		else 
			return false;
	}
}