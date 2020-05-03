package Test1;

class Person1{
	private float weight;
	private String name;
	private String height;
	private String birthday;
	private int age;
	String company;  
    String position;
    
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	public String getHeight() {
		return height;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday() {
		return birthday;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setCompany(String company){
	        this.company=company;
	    }
	    public String getCompany(){
	        return company;
	    }
	    
	    public void setPosition(String position){
	        this. position= position;
	    }
	    public String getPosition(){
	        return position;
	    }
	    
	    public void speak(){ 
	    	
	    	System.out.println("姓名:"+name);
	        System.out.println("年龄:"+age);
	        System.out.println("身高:"+height);
	        System.out.println("体重:"+weight+"KG");
	        System.out.println("生日：" + birthday);
	        System.out.println("目前就职于:"+company);
	        System.out.println("职务:"+position);
	        
	    }
}

public class People {
	public static void main(String[] args) {
		
		Person1 p = new Person1 ();
		
		p.setName("zhangsan");
		p.setAge(20);
		p.setHeight("180");
		p.setWeight(50);
		p.setBirthday("4.30");
		p.setCompany("XX科技公司");
		p.setPosition("技术总监");
		p.speak();

	}

}
