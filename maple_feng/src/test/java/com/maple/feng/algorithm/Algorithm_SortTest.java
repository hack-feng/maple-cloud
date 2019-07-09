package com.maple.feng.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class Algorithm_SortTest {

	@Test
	public void testInsertArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testChooseArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testEfferArray() {
		/**
			移动次数:21
			循环总次数:105
			3,5,8,12,33,45,77,84,89,98,213,456,654,878,897
		 */
		int a = 0;
		int num = 0;
		int all = 0;
		//冒泡排序
		Integer in [] = {8, 89, 5, 84, 3, 45, 12, 33, 77, 98, 456, 878, 654, 213, 897};
		for(int i = 0; i < in.length; i++) {
			for(int j = i+1 ; j < in.length; j++) {
				all ++;
				if(in[i] > in[j]) {
					num ++;
					a = in[j];
					in[j] = in[i];
					in[i] = a;
				}
			}
		}
		System.out.println("移动次数:" + num);
		System.out.println("循环总次数:" + all);
		for(int i = 0; i < in.length; i++) {
			System.out.print(in[i]);
			if(i != in.length-1) {
				System.out.print(",");
			}
		}
	}

	@Test
	public void testPrintMulti() {
		//打印乘法口诀编写
		
		for(int x = 1; x <= 9; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print(y + "*" + x + "=" + y*x + "\t");
			}
			System.out.print("\n");
		}
		
		/**
		  	1*1=1	
			1*2=2	2*2=4	
			1*3=3	2*3=6	3*3=9	
			1*4=4	2*4=8	3*4=12	4*4=16	
			1*5=5	2*5=10	3*5=15	4*5=20	5*5=25	
			1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36	
			1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49	
			1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64	
			1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81	
		 */
		System.out.println("********************************" + "今晚不加班"+ "********************************");
		System.out.println("********************************" + "今晚不加班"+ "********************************");
		for(int x = 9; x > 0; x--) {
			for(int y = 1; y <= x; y++) {
				System.out.print(y + "*" + x + "=" + y*x + "\t");
			}
			System.out.print("\n");
		}
		/**
		    1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81	
			1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64	
			1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49	
			1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36	
			1*5=5	2*5=10	3*5=15	4*5=20	5*5=25	
			1*4=4	2*4=8	3*4=12	4*4=16	
			1*3=3	2*3=6	3*3=9	
			1*2=2	2*2=4	
			1*1=1
		 */
		
	}

	@Test
	public void testPrintNumAssemble() {
		fail("Not yet implemented");
	}

}
