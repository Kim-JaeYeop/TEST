package midterm;

class Storage {

	int max;
	int length;
	String[][] storage = new String[max][5];
	int barcord[] = new int[max];
	String sing[]= new String[max];
	String singer[] = new String[max];
	int money[] = new int[max];
	int launch[] = new int[max];
	
	
	public Storage(){
		
	}
	
	public void setStorage(int idx, int barcord, String sing,String singer, int money, int launch){
		this.setBarcord(idx, barcord);
		this.setSing(idx, sing);
		this.setSinger(idx, singer);
		this.setMoney(idx, money);
		this.setLaunch(idx, launch);
		this.length = idx;
	}

	
	public void setBarcord(int idx, int barcord) {
		
		this.barcord[idx] = barcord;
	}

	public void setSing(int idx, String sing) {
		this.sing[idx] = sing;
	}

	public void setSinger(int idx,String singer) {
		this.singer[idx] = singer;
	}

	public void setMoney(int idx, int money) {
		this.money[idx] = money;
	}

	public void setLaunch(int idx, int launch) {
		this.launch[idx] = launch;
		
	}
	
	
	
	public int getBarcord(int idx) {
		return this.barcord[idx];
	}
	
	public int getLaunch_max() {
		int max=this.launch[0];
		for(int i=0; i<this.length+1; i++) {
			if(this.launch[i]>max) {
				max =this.launch[i];
			}
		}
		return max;
	}
	
	public int getLaunch_min() {
		int min=this.launch[0];
		for(int i=0; i<this.length+1; i++) {
			if(this.launch[i]<min) {
				min = this.launch[i];
			}
		}
		return min;
	}
	
	public int getLength() {
		return this.length+1;
	}
	
	public int[] getStorage_int() {
		int[] info_034 = new int[3];
		for(int i=0; i<this.length-2; i++) {
			
			info_034[0]=this.barcord[i];
			info_034[3]=this.money[i];
			info_034[4]=this.launch[i];
			return info_034;
		}
		return null;
	}
	
	public String[] getStorage_String() {
		String[] info_12 = new String[2];
		for(int i=0; i<this.length-3; i++) {
			
			info_12[1]=this.sing[i];
			info_12[2]=this.singer[i];
			
			return info_12;
		}
		return null;
	}
	
	public int[] getStorage_2(String serial) {
		int[] info = new String[5];
		for(int i=0; i<this.length+1; i++) {
			if(this.barcord[i]==serial) {
				info[0]=this.barcord[i]; //int
				info[1]=this.sing[i];    //string
				info[2]=this.singer[i];  //string
				info[3]=this.money[i];   //int
				info[4]=this.launch[i];  //int
				return info;
			}
		}
		return null;
	}
	
	
}
