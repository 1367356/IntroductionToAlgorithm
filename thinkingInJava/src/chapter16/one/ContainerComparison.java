package chapter16.one;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerComparison {

	public static void main(String[] args) {
		BeryllimSphere[] spheres=new BeryllimSphere[10];  //对象数组
		for (int i = 0; i < spheres.length; i++) {
			spheres[i]=new BeryllimSphere();
		}
		System.out.println(Arrays.toString(spheres));  //将数组变为字符串
	}
}
