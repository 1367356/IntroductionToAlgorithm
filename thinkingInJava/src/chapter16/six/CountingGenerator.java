package chapter16.six;

import java.time.chrono.JapaneseChronology;

import chapter15.three.Generator;

public class CountingGenerator {

	/**
	 * Boolean生成器
	 */
	public static class Boolean implements Generator<java.lang.Boolean>{
		private boolean value=false;
		public java.lang.Boolean next() {
			// TODO Auto-generated method stub
			value=!value;
			return value;
		}
	}
	/**
	 * Character生成器,返回一个字符
	 */
	static char[] chars=("abcdefjhijklmnopABCDEFGHIJKLMNOPQRSTUV").toCharArray();
	public static class Character implements Generator<java.lang.Character>{
		int index=-1;
		public java.lang.Character next() {
			// 实现方法
			index=(index+1)%chars.length;
			return chars[index];
		}	
	}
}
