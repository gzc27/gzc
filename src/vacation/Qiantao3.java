package vacation;

public interface Qiantao3 {
	public static void main(String[] args) {
		boolean flag=false;
		for(int i=2;i<=100;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=true;
					break;
				}
			}
			if(flag==false){
				System.out.println(i);
			}
			flag=false;
		}
	}

}
