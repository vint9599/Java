
public class Operators {

	public static void main(String[] args) {
		int sec = 8371;
		
		int csec = sec;		//弄一個變數(sec)做運算
		
		int tsec = sec%60 ; //算出秒數
		
		int hour = (sec - tsec) /3600; //算出小時 
		csec = csec - hour*3600; 
		
		int minu = csec /60; // 算出分鐘
		
		System.out.println(sec + "秒=" + hour + "小時" + minu + "分" + tsec + "秒");
		System.out.printf("%d秒=%d小時%d分%d秒%n", sec, hour, minu, tsec); //用printf簡化後顯示
		
		
		int x = 3, y = 4, z;
	//	z = ++x * y; 		//x =4,y = 4,z = 16 
	//	z = x++*y; 			//x =4,y = 4,z = 12
	//	z = (x++)*y;		//x =4,y = 4,z = 12 	小括號()代表++屬於x的，不代表運算先後
	//	z = x+++y;			//x =4,y = 4,z = 7
	//	z = x+++y++;		//x =4,y = 5,z = 7
	 	z = ++x+y++; 		//x =4,y = 5,z = 8
		System.out.println("x =" + x  + ",y = " + y + ",z = " + z );
		

	}

}
