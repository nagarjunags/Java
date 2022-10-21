

class eg {

	public static void main(String[] args) {
		String s="malayalam";
		char []ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i++) 
        {
			for(int j=0;j<s.length()-2;j++)
             {
				String ss=s.substring(i,j); 
				//if(ss.length()>=2) {
				System.out.println(/*s.substring(j,i)*/" "+i+" "+j+" "+(s.length()-1));
				//}
				
			}
		}
		//System.out.println(s.substring(0,4));
		// TODO Auto-generated method stub

	}

}