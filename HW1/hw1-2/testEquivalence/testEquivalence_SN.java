import java.util.Random;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testEquivalence_SN extends TestCase
{
	static public Bills getBills=new Bills();
	static public Data startData=new Data();
	static public Data endData=new Data();
	static public float[] charge;
	static public int ttemp=0;
	static String state_from;
	static String state_to;
	static Random rand = new Random();
	static public int temp,temp2,temp3,temp4;
	
	public testEquivalence_SN(String name)
	{
		super(name);
	}
	protected void setUp() throws Exception
	{
		super.setUp();
	}
	protected void tearDown() throws Exception
	{
		super.tearDown();
	}
	public void testEquivalence_SN1()
	{

		/**        
		System.out.printf("please input the test class(WN,SN,WR,SR): ");        
		Scanner input = new Scanner(System.in);
		System.out.printf("the test cases of %s is as follow:", input.next());
	    **/

		startData.year=2010;
		startData.month=3;
		startData.day=7;
		startData.hour=01;
		startData.minute=59;
		startData.second=59;
		startData.area= "Asia";
		endData.year=2010;
		endData.month=3;
		endData.day=7;
		endData.hour=3;
		endData.minute=02;
		endData.second=0;
		endData.area= "Asia";
		
		//********* 1:59 �� 3��***********
		startData.year = (int)(1+Math.random()*2247+1753);
		
		startData.month=3;
		startData.day=getBills.MarchSunday(startData.year);
		startData.hour=1;
		startData.minute=59;
		startData.second=(int)(1+Math.random()*58);
		endData.year=startData.year;
		endData.month=startData.month;
		
		 endData.day=startData.day;
        endData.hour=startData.hour;
        while(endData.minute*60+endData.second <= startData.minute*60+startData.second){
        	endData.minute = (int)(1+ Math.random()*59);
        	endData.second = (int)(1+ Math.random()*59);
        }
		//area
		 temp3 = (int)(1+Math.random()*4);
		if (temp3==0){startData.area="Asia";}
		if (temp3==1){startData.area="Africa";}
		if (temp3==2){startData.area="Americas";}
		if (temp3==3){startData.area="Europe";}
		if (temp3==4){startData.area="Oceania";}
		
		 temp4 = (int)(1+Math.random()*4);

			if (temp4==0){endData.area="Asia";}
			if (temp4==1){endData.area="Africa";}
			if (temp4==2){endData.area="Americas";}
			if (temp4==3){endData.area="Europe";}
			if (temp4==4){endData.area="Oceania";}
        System.out.print("start data:   ");
		System.out.print(startData.year+" "+"�~  ");
		System.out.print(startData.month+" "+"��  ");
		System.out.print(startData.day+" "+"��    ");
		System.out.print(startData.hour+" "+":");
		System.out.print(startData.minute+" "+":");
		System.out.print(startData.second+"     ");
		System.out.println(startData.area);
		
		System.out.print("end   data:   ");
		System.out.print(endData.year+" "+"�~  ");
		System.out.print(endData.month+" "+"��  ");
		System.out.print(endData.day+" "+"��    ");
		System.out.print(endData.hour+" "+":");
		System.out.print(endData.minute+" "+":");
		System.out.print(endData.second+"     ");
		System.out.println(endData.area);
		
		state_from=startData.area;
		state_to=endData.area;
		charge=getBills.bills(startData,endData,state_from,state_to);
		if (charge[0]==1)
			{System.out.println("Pass daylight saving time");}
		if (charge[0]==2){System.out.println("error");}else {System.out.printf("%.2f\n",charge[1]);}
		System.out.println();
		ttemp=(int)(charge[0]);
		assertEquals(1,ttemp);
		
	}
	
	public void testEquivalence_SN2()
	{
		// ************2:59��11��**************
		startData.year = (int)(1+Math.random()*2247+1753);
		
		startData.month=11;
		startData.day=getBills.NovemberSunday(startData.year);
		startData.hour= 2;
		startData.minute=59;
		startData.second=(int)(1+Math.random()*58);
		endData.year=startData.year;
		endData.month=startData.month;
		
		//�P�_��������P�}�l����P�@��OR�ߤ@��
	   temp = (int)(1+Math.random()*30);
        endData.day=startData.day;
        endData.hour=startData.hour;
        while(endData.minute*60+endData.second <= startData.minute*60+startData.second){
        	endData.minute = (int)(1+ Math.random()*59);
        	endData.second = (int)(1+ Math.random()*59);
        }

		//area
	    temp3 = (int)(1+Math.random()*4);
		if (temp3==0){startData.area="Asia";}
		if (temp3==1){startData.area="Africa";}
		if (temp3==2){startData.area="Americas";}
		if (temp3==3){startData.area="Europe";}
		if (temp3==4){startData.area="Oceania";}
		
		temp4 = (int)(1+Math.random()*4);

		if (temp4==0){endData.area="Asia";}
		if (temp4==1){endData.area="Africa";}
		if (temp4==2){endData.area="Americas";}
		if (temp4==3){endData.area="Europe";}
		if (temp4==4){endData.area="Oceania";}
        System.out.print("start data:   ");
		System.out.print(startData.year+" "+"�~  ");
		System.out.print(startData.month+" "+"��  ");
		System.out.print(startData.day+" "+"��    ");
		System.out.print(startData.hour+" "+":");
		System.out.print(startData.minute+" "+":");
		System.out.print(startData.second+"     ");
		System.out.println(startData.area);
		
		System.out.print("end   data:   ");
		System.out.print(endData.year+" "+"�~  ");
		System.out.print(endData.month+" "+"��  ");
		System.out.print(endData.day+" "+"��    ");
		System.out.print(endData.hour+" "+":");
		System.out.print(endData.minute+" "+":");
		System.out.print(endData.second+"     ");
		System.out.println(endData.area);
		
		state_from=startData.area;
		state_to=endData.area;
		charge=getBills.bills(startData,endData,state_from,state_to);
		if (charge[0]==1)
			{System.out.println("Pass daylight saving time");}
		if (charge[0]==2){System.out.println("error");}else {System.out.printf("%.2f\n",charge[1]);}
		System.out.println();
		ttemp=(int)(charge[0]);
		assertEquals(1,ttemp);
	}
	
	public void testEquivalence_SN3()
	{
		//@@@@@@@@@@@@@@@@@@@@@@@@@@others@@@@@@@@@@@@@@@@@@@@@@@@
		startData.year = (int)(1+Math.random()*2247+1753);
		//System.out.println(startData.year);
		int i = 0;
		while(i == 3||i==11||i==0){
			i = (int)(1+Math.random()* 12);
		} 
		//for( i=1;i<=9;i++){
		startData.month=i;
		
		startData.day= (int)(1+Math.random()*30);
		while(startData.hour==1 ||startData.hour==2||((startData.day==endData.day)&&endData.hour==1)||((startData.day==endData.day)&&endData.hour==2)){
		startData.hour=(int)(1+Math.random()*23);
		startData.minute=(int)(1+Math.random()*58);
		startData.second=(int)(1+Math.random()*58);
		endData.year=startData.year;
		endData.month=startData.month;
		
		//�P�_��������P�}�l����P�@��OR�ߤ@��
		
		 temp = (int)(1+Math.random()*30);

		if((startData.hour+temp)>=24)
			{endData.day=startData.day+1;
			 endData.hour=(startData.hour+temp)%24;
			} 
		else {endData.day=startData.day;
		      endData.hour=startData.hour+temp;}}
		
	 temp2=(int)(1+Math.random()*59);
		if((startData.hour==endData.hour)&&
		   (startData.minute+temp2)>=58){
 			endData.minute=startData.minute+1;}
		else {endData.minute=((int)(1+Math.random()*58));}
		
		if((startData.hour==endData.hour)&&
		   (startData.minute == endData.minute)){
		 			endData.second=startData.second+1;}
		else {endData.second=((int)(1+Math.random()*59));}
		
		//area
		temp3 = (int)(1+Math.random()*4);
		if (temp3==0){startData.area="Asia";}
		if (temp3==1){startData.area="Africa";}
		if (temp3==2){startData.area="Americas";}
		if (temp3==3){startData.area="Europe";}
		if (temp3==4){startData.area="Oceania";}
		
		 temp4 = (int)(1+Math.random()*4);

		if (temp4==0){endData.area="Asia";}
		if (temp4==1){endData.area="Africa";}
		if (temp4==2){endData.area="Americas";}
		if (temp4==3){endData.area="Europe";}
		if (temp4==4){endData.area="Oceania";}
        System.out.print("start data:   ");
		System.out.print(startData.year+" "+"�~  ");
		System.out.print(startData.month+" "+"��  ");
		System.out.print(startData.day+" "+"��    ");
		System.out.print(startData.hour+" "+":");
		System.out.print(startData.minute+" "+":");
		System.out.print(startData.second+"     ");
		System.out.println(startData.area);
		
		System.out.print("end   data:   ");
		System.out.print(endData.year+" "+"�~  ");
		System.out.print(endData.month+" "+"��  ");
		System.out.print(endData.day+" "+"��    ");
		System.out.print(endData.hour+" "+":");
		System.out.print(endData.minute+" "+":");
		System.out.print(endData.second+"     ");
		System.out.println(endData.area);
		
		state_from=startData.area;
		state_to=endData.area;
		charge=getBills.bills(startData,endData,state_from,state_to);
		if (charge[0]==1)
			{System.out.println("Pass daylight saving time");}
		if (charge[0]==2){System.out.println("error");}else {System.out.printf("%.2f\n",charge[1]);}
		System.out.println();
		ttemp=(int)(charge[0]);
		assertEquals(0,ttemp);
	}
	
	public void testEquivalence_SN4()
	{
//@@@@@@@@@@@@@@@@@others 11��@@@@@@@@@@@@@@@@@@@@@@@@@
		startData.year = (int)(1+Math.random()*2247+1753);
		//System.out.println(startData.year);
	    startData.month=11;
	    endData.year=startData.year;
		endData.month=startData.month;
		
		startData.day= (int)(1+Math.random()*30);
		int temp6=0;
		temp6=getBills.NovemberSunday(startData.year);
		while(startData.hour==1 ||startData.hour==2||((startData.day==endData.day)&&endData.hour==1)||((startData.day==endData.day)&&endData.hour==2)){
		startData.hour=(int)(1+Math.random()*23);
		
		}
		
		while((startData.day+2==temp6)||(startData.day+1==temp6)||startData.day==temp6){
			startData.day= (int)(1+Math.random()*30);
			//System.out.print(startData.day);
		}
		startData.minute=(int)(1+Math.random()*58);
		startData.second=(int)(1+Math.random()*58);
		//endData.year=startData.year;
	//	endData.month=startData.month;
		
		//�P�_��������P�}�l����P�@��OR�ߤ@��
		
		 temp = (int)(1+Math.random()*30);

		if((startData.hour+temp)>=24)
			{endData.day=startData.day+1;
			 endData.hour=(startData.hour+temp)%24;
			} 
		else {endData.day=startData.day;
		      endData.hour=startData.hour+temp;}
		
		temp2=(int)(1+Math.random()*59);
		if((startData.hour==endData.hour)&&
		   (startData.minute+temp2)>=58){
 			endData.minute=startData.minute+1;}
		else {endData.minute=((int)(1+Math.random()*58));}
		
		if((startData.hour==endData.hour)&&
		   (startData.minute == endData.minute)){
		 			endData.second=startData.second+1;}
		else {endData.second=((int)(1+Math.random()*59));}
		
		//area
	    temp3 = (int)(1+Math.random()*4);
		if (temp3==0){startData.area="Asia";}
		if (temp3==1){startData.area="Africa";}
		if (temp3==2){startData.area="Americas";}
		if (temp3==3){startData.area="Europe";}
		if (temp3==4){startData.area="Oceania";}
		
		temp4 = (int)(1+Math.random()*4);

		if (temp4==0){endData.area="Asia";}
		if (temp4==1){endData.area="Africa";}
		if (temp4==2){endData.area="Americas";}
		if (temp4==3){endData.area="Europe";}
		if (temp4==4){endData.area="Oceania";}
        System.out.print("start data:   ");
		System.out.print(startData.year+" "+"�~  ");
		System.out.print(startData.month+" "+"��  ");
		System.out.print(startData.day+" "+"��    ");
		System.out.print(startData.hour+" "+":");
		System.out.print(startData.minute+" "+":");
		System.out.print(startData.second+"     ");
		System.out.println(startData.area);
		
		System.out.print("end   data:   ");
		System.out.print(endData.year+" "+"�~  ");
		System.out.print(endData.month+" "+"��  ");
		System.out.print(endData.day+" "+"��    ");
		System.out.print(endData.hour+" "+":");
		System.out.print(endData.minute+" "+":");
		System.out.print(endData.second+"     ");
		System.out.println(endData.area);
		
		state_from=startData.area;
		state_to=endData.area;
		charge=getBills.bills(startData,endData,state_from,state_to);
		if (charge[0]==1)
			{System.out.println("Pass daylight saving time");}
		if (charge[0]==2){System.out.println("error");}else {System.out.printf("%.2f\n",charge[1]);}
		System.out.println();
		ttemp=(int)(charge[0]);
		assertEquals(0,ttemp);
	}
	
	public void testEquivalence_SN5()
	{
		//@@@@@@@@@@@@@@@@@others 3��@@@@@@@@@@@@@@@@@@@@@@@@@
		startData.year = (int)(1+Math.random()*2247+1753);
		//System.out.println(startData.year);
	    startData.month=3;
	    endData.year=startData.year;
		endData.month=startData.month;
		
		startData.day= (int)(1+Math.random()*30);
		int temp7=0;
		temp7=getBills.MarchSunday(startData.year);
		while(startData.hour==1 ||startData.hour==2||((startData.day==endData.day)&&endData.hour==1)||((startData.day==endData.day)&&endData.hour==2)){
		startData.hour=(int)(1+Math.random()*23);}
		
		while((startData.day+2==temp7)||(startData.day+1==temp7)||startData.day==temp7){
			startData.day= (int)(1+Math.random()*30);
			//System.out.print(startData.day);
		}
		startData.minute=(int)(1+Math.random()*58);
		startData.second=(int)(1+Math.random()*58);
		//endData.year=startData.year;
	//	endData.month=startData.month;
		
		//�P�_��������P�}�l����P�@��OR�ߤ@��
		
		 temp = (int)(1+Math.random()*30);

		if((startData.hour+temp)>=24)
			{endData.day=startData.day+1;
			 endData.hour=(startData.hour+temp)%24;
			} 
		else {endData.day=startData.day;
		      endData.hour=startData.hour+temp;}
		
		temp2=(int)(1+Math.random()*59);
		if((startData.hour==endData.hour)&&
		   (startData.minute+temp2)>=58){
 			endData.minute=startData.minute+1;}
		else {endData.minute=((int)(1+Math.random()*58));}
		
		if((startData.hour==endData.hour)&&
		   (startData.minute == endData.minute)){
		 			endData.second=startData.second+1;}
		else {endData.second=((int)(1+Math.random()*59));}
		
		//area
	    temp3 = (int)(1+Math.random()*4);
		if (temp3==0){startData.area="Asia";}
		if (temp3==1){startData.area="Africa";}
		if (temp3==2){startData.area="Americas";}
		if (temp3==3){startData.area="Europe";}
		if (temp3==4){startData.area="Oceania";}
		
		temp4 = (int)(1+Math.random()*4);

		if (temp4==0){endData.area="Asia";}
		if (temp4==1){endData.area="Africa";}
		if (temp4==2){endData.area="Americas";}
		if (temp4==3){endData.area="Europe";}
		if (temp4==4){endData.area="Oceania";}
        System.out.print("start data:   ");
		System.out.print(startData.year+" "+"�~  ");
		System.out.print(startData.month+" "+"��  ");
		System.out.print(startData.day+" "+"��    ");
		System.out.print(startData.hour+" "+":");
		System.out.print(startData.minute+" "+":");
		System.out.print(startData.second+"     ");
		System.out.println(startData.area);
		
		System.out.print("end   data:   ");
		System.out.print(endData.year+" "+"�~  ");
		System.out.print(endData.month+" "+"��  ");
		System.out.print(endData.day+" "+"��    ");
		System.out.print(endData.hour+" "+":");
		System.out.print(endData.minute+" "+":");
		System.out.print(endData.second+"     ");
		System.out.println(endData.area);
		
		state_from=startData.area;
		state_to=endData.area;
		charge=getBills.bills(startData,endData,state_from,state_to);
		if (charge[0]==1)
			{System.out.println("Pass daylight saving time");}
		if (charge[0]==2){System.out.println("error");}else {System.out.printf("%.2f\n",charge[1]);}
		System.out.println();
		ttemp=(int)(charge[0]);
		assertEquals(0,ttemp);
	}
	
	public void testEquivalence_SN6()
	{
		//********* 1:59 �� 11��***********
		startData.year = (int)(1+Math.random()*2247+1753);
		
		startData.month=11;
		startData.day= (int)(1+Math.random()*30);
		startData.hour=1;
		startData.minute=59;
		startData.second=(int)(1+Math.random()*58);
		endData.year=startData.year;
		endData.month=startData.month;
		
		//�P�_��������P�}�l����P�@��OR�ߤ@��
	//	int temp = (int)(1+Math.random()*30);
        endData.day=startData.day;
        endData.hour=startData.hour;
        while(endData.minute*60+endData.second <= startData.minute*60+startData.second){
        	endData.minute = (int)(1+ Math.random()*59);
        	endData.second = (int)(1+ Math.random()*59);
        }
        /*for (int j=(int)(1+Math.random()*58);startData.minute+j>=60;j--)
        {endData.minute=startData.minute+j;}

        for (int k=(int)(1+Math.random()*58);startData.second+k>=60;k--)
        {endData.second=startData.second+k;}*/

		//area
		 temp3 = (int)(1+Math.random()*4);
		if (temp3==0){startData.area="Asia";}
		if (temp3==1){startData.area="Africa";}
		if (temp3==2){startData.area="Americas";}
		if (temp3==3){startData.area="Europe";}
		if (temp3==4){startData.area="Oceania";}
		
		 temp4 = (int)(1+Math.random()*4);

			if (temp4==0){endData.area="Asia";}
			if (temp4==1){endData.area="Africa";}
			if (temp4==2){endData.area="Americas";}
			if (temp4==3){endData.area="Europe";}
			if (temp4==4){endData.area="Oceania";}
        System.out.print("start data:   ");
		System.out.print(startData.year+" "+"�~  ");
		System.out.print(startData.month+" "+"��  ");
		System.out.print(startData.day+" "+"��    ");
		System.out.print(startData.hour+" "+":");
		System.out.print(startData.minute+" "+":");
		System.out.print(startData.second+"     ");
		System.out.println(startData.area);
		
		System.out.print("end   data:   ");
		System.out.print(endData.year+" "+"�~  ");
		System.out.print(endData.month+" "+"��  ");
		System.out.print(endData.day+" "+"��    ");
		System.out.print(endData.hour+" "+":");
		System.out.print(endData.minute+" "+":");
		System.out.print(endData.second+"     ");
		System.out.println(endData.area);
		
		state_from=startData.area;
		state_to=endData.area;
		charge=getBills.bills(startData,endData,state_from,state_to);
		if (charge[0]==1)
			{System.out.println("Pass daylight saving time");}
		if (charge[0]==2){System.out.println("error");}else {System.out.printf("%.2f\n",charge[1]);}
		System.out.println();
		ttemp=(int)(charge[0]);
		assertEquals(0,ttemp);
	}
	
	public void testEquivalence_SN7()
	{
		//********* 1:59 �� others���***********
		startData.year = (int)(1+Math.random()*2247+1753);
		int i = 0;
		while(i == 3||i==11||i==0){
			i = (int)(1+Math.random()* 12);
		} 
		startData.month=i;
		startData.day= (int)(1+Math.random()*30);
		startData.hour=1;
		startData.minute=59;
		startData.second=(int)(1+Math.random()*58);
		endData.year=startData.year;
		endData.month=startData.month;
		
        endData.day=startData.day;
        endData.hour=startData.hour;
        while(endData.minute*60+endData.second <= startData.minute*60+startData.second){
        	endData.minute = (int)(1+ Math.random()*59);
        	endData.second = (int)(1+ Math.random()*59);
        }
		//area
		 temp3 = (int)(1+Math.random()*4);
		if (temp3==0){startData.area="Asia";}
		if (temp3==1){startData.area="Africa";}
		if (temp3==2){startData.area="Americas";}
		if (temp3==3){startData.area="Europe";}
		if (temp3==4){startData.area="Oceania";}
		
		 temp4 = (int)(1+Math.random()*4);

			if (temp4==0){endData.area="Asia";}
			if (temp4==1){endData.area="Africa";}
			if (temp4==2){endData.area="Americas";}
			if (temp4==3){endData.area="Europe";}
			if (temp4==4){endData.area="Oceania";}
        System.out.print("start data:   ");
		System.out.print(startData.year+" "+"�~  ");
		System.out.print(startData.month+" "+"��  ");
		System.out.print(startData.day+" "+"��    ");
		System.out.print(startData.hour+" "+":");
		System.out.print(startData.minute+" "+":");
		System.out.print(startData.second+"     ");
		System.out.println(startData.area);
		
		System.out.print("end   data:   ");
		System.out.print(endData.year+" "+"�~  ");
		System.out.print(endData.month+" "+"��  ");
		System.out.print(endData.day+" "+"��    ");
		System.out.print(endData.hour+" "+":");
		System.out.print(endData.minute+" "+":");
		System.out.print(endData.second+"     ");
		System.out.println(endData.area);
		
		state_from=startData.area;
		state_to=endData.area;
		charge=getBills.bills(startData,endData,state_from,state_to);
		if (charge[0]==1)
			{System.out.println("Pass daylight saving time");}
		if (charge[0]==2){System.out.println("error");}else {System.out.printf("%.2f\n",charge[1]);}
		System.out.println();
		ttemp=(int)(charge[0]);
		assertEquals(0,ttemp);
	}
	
	public void testEquivalence_SN8()
	{
		// ************2:59��3��**************
		startData.year = (int)(1+Math.random()*2247+1753);
		
		startData.month=3;
		startData.day= (int)(1+Math.random()*30);
		startData.hour= 2;
		startData.minute=59;
		startData.second=(int)(1+Math.random()*58);
		endData.year=startData.year;
		endData.month=startData.month;
		
		//�P�_��������P�}�l����P�@��OR�ߤ@��
	   temp = (int)(1+Math.random()*30);
        endData.day=startData.day;
        endData.hour=startData.hour;
        while(endData.minute*60+endData.second <= startData.minute*60+startData.second){
        	endData.minute = (int)(1+ Math.random()*59);
        	endData.second = (int)(1+ Math.random()*59);
        }

		//area
	    temp3 = (int)(1+Math.random()*4);
		if (temp3==0){startData.area="Asia";}
		if (temp3==1){startData.area="Africa";}
		if (temp3==2){startData.area="Americas";}
		if (temp3==3){startData.area="Europe";}
		if (temp3==4){startData.area="Oceania";}
		
		temp4 = (int)(1+Math.random()*4);

		if (temp4==0){endData.area="Asia";}
		if (temp4==1){endData.area="Africa";}
		if (temp4==2){endData.area="Americas";}
		if (temp4==3){endData.area="Europe";}
		if (temp4==4){endData.area="Oceania";}
        System.out.print("start data:   ");
		System.out.print(startData.year+" "+"�~  ");
		System.out.print(startData.month+" "+"��  ");
		System.out.print(startData.day+" "+"��    ");
		System.out.print(startData.hour+" "+":");
		System.out.print(startData.minute+" "+":");
		System.out.print(startData.second+"     ");
		System.out.println(startData.area);
		
		System.out.print("end   data:   ");
		System.out.print(endData.year+" "+"�~  ");
		System.out.print(endData.month+" "+"��  ");
		System.out.print(endData.day+" "+"��    ");
		System.out.print(endData.hour+" "+":");
		System.out.print(endData.minute+" "+":");
		System.out.print(endData.second+"     ");
		System.out.println(endData.area);
		
		state_from=startData.area;
		state_to=endData.area;
		charge=getBills.bills(startData,endData,state_from,state_to);
		if (charge[0]==1)
			{System.out.println("Pass daylight saving time");}
		if (charge[0]==2){System.out.println("error");}else {System.out.printf("%.2f\n",charge[1]);}
		System.out.println();
		ttemp=(int)(charge[0]);
		assertEquals(0,ttemp);
	}
	
	public void testEquivalence_SN9()
	{
		// ************2:59����L���**************
		startData.year = (int)(1+Math.random()*2247+1753);
		int i=0;
		while(i == 3||i==11||i==0){
			i = (int)(1+Math.random()* 12);
		} 
		startData.month=i;
		
		startData.day= (int)(1+Math.random()*30);
		startData.hour= 2;
		startData.minute=59;
		startData.second=(int)(1+Math.random()*58);
		endData.year=startData.year;
		endData.month=startData.month;
		
		//�P�_��������P�}�l����P�@��OR�ߤ@��
	   temp = (int)(1+Math.random()*30);
        endData.day=startData.day;
        endData.hour=startData.hour;
        while(endData.minute*60+endData.second <= startData.minute*60+startData.second){
        	endData.minute = (int)(1+ Math.random()*59);
        	endData.second = (int)(1+ Math.random()*59);
        }

		//area
	    temp3 = (int)(1+Math.random()*4);
		if (temp3==0){startData.area="Asia";}
		if (temp3==1){startData.area="Africa";}
		if (temp3==2){startData.area="Americas";}
		if (temp3==3){startData.area="Europe";}
		if (temp3==4){startData.area="Oceania";}
		
		temp4 = (int)(1+Math.random()*4);

		if (temp4==0){endData.area="Asia";}
		if (temp4==1){endData.area="Africa";}
		if (temp4==2){endData.area="Americas";}
		if (temp4==3){endData.area="Europe";}
		if (temp4==4){endData.area="Oceania";}
        System.out.print("start data:   ");
		System.out.print(startData.year+" "+"�~  ");
		System.out.print(startData.month+" "+"��  ");
		System.out.print(startData.day+" "+"��    ");
		System.out.print(startData.hour+" "+":");
		System.out.print(startData.minute+" "+":");
		System.out.print(startData.second+"     ");
		System.out.println(startData.area);
		
		System.out.print("end   data:   ");
		System.out.print(endData.year+" "+"�~  ");
		System.out.print(endData.month+" "+"��  ");
		System.out.print(endData.day+" "+"��    ");
		System.out.print(endData.hour+" "+":");
		System.out.print(endData.minute+" "+":");
		System.out.print(endData.second+"     ");
		System.out.println(endData.area);
		
		state_from=startData.area;
		state_to=endData.area;
		charge=getBills.bills(startData,endData,state_from,state_to);
		if (charge[0]==1)
			{System.out.println("Pass daylight saving time");}
		if (charge[0]==2){System.out.println("error");}else {System.out.printf("%.2f\n",charge[1]);}
		System.out.println();
		ttemp=(int)(charge[0]);
		assertEquals(0,ttemp);
	}
	

	
	

	public static Test suite()
	{
		TestSuite suite=new TestSuite();
		suite.addTest(new testEquivalence_SN("testEquivalence_SN1"));
		suite.addTest(new testEquivalence_SN("testEquivalence_SN2"));
		suite.addTest(new testEquivalence_SN("testEquivalence_SN3"));
		suite.addTest(new testEquivalence_SN("testEquivalence_SN4"));
		suite.addTest(new testEquivalence_SN("testEquivalence_SN5"));
		suite.addTest(new testEquivalence_SN("testEquivalence_SN6"));
		suite.addTest(new testEquivalence_SN("testEquivalence_SN7"));
		suite.addTest(new testEquivalence_SN("testEquivalence_SN8"));
		suite.addTest(new testEquivalence_SN("testEquivalence_SN9"));

		return suite;
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(testEquivalence_SN.class);
	}

}
