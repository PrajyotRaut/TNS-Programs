package First_Package;

public class Student 
{
	int uid;
	String sname;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", sname=" + sname + "]";
	}
}
