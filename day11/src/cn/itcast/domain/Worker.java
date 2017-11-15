package cn.itcast.domain;

public class Worker {
	private String name;
	private int age;
	
	public Worker(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Worker() {
		super();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		Worker w = (Worker)obj; 
		return this.name.equals(w.name) && this.age == w.age;
	}
	
	
	
}
