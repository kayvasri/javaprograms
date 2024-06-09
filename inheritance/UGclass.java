package inheritance;

public class UGclass extends Student{

	
		private String collegename,branch;
		public UGclass() {}
		public UGclass( int rollno,String name,String city,String collegename,String branch) {
			super(rollno,name,city);
			this.collegename=collegename;
			this.branch=branch;
			
			
		}
		
		public String getCollegeName() {
			return collegename;
			
		}
		public void setCollegeName(String collegename) {
			this.collegename=collegename;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public String toString() {
			return super.toString()+"\n collegename "+collegename+"\n branch "+branch;
		}

	}


