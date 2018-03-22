package chapter18.one;

import java.io.File;
import java.io.FilenameFilter;
import java.security.KeyStore.PasswordProtection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.regex.Pattern;

//�õ��ļ���Ŀ¼��
public final class Directory {
	public static File[] local(File dir,final String regex){
		return dir.listFiles(new FilenameFilter() {
			private Pattern pattern=Pattern.compile(regex);
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(new File(name).getName()).matches();
			}
		});
	}
	
	public static File[] local(String path,String regex){
		return local(new File(path), regex);
	}
	
	//�ڲ���
	public static class TreeInfo implements Iterable<File>{

		private List<File> files=new ArrayList<File>();
		private List<File> dirs=new ArrayList<File>();
		
		public Iterator<File> iterator() {
			// TODO Auto-generated method stub
			return files.iterator();
		}
		
		void addAll(TreeInfo treeInfo){
			files.addAll(treeInfo.files);
			dirs.addAll(treeInfo.dirs);
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "dirs:+";
		}

		public void forEach(Consumer<? super File> action) {
			// TODO Auto-generated method stub
			
		}

		public Spliterator<File> spliterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}