package chapter20.three;

import java.io.PrintWriter;
import java.util.ArrayList;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.MethodDeclaration;
import com.sun.mirror.declaration.Modifier;
import com.sun.mirror.declaration.ParameterDeclaration;
import com.sun.mirror.declaration.TypeDeclaration;

//实现注解处理器
public class InterfaceExtractorProcessor implements AnnotationProcessor{

	private final AnnotationProcessorEnvironment env;
	//存储接口中的方法
	private ArrayList<MethodDeclaration> interfaceMethods=new ArrayList<MethodDeclaration>();
	
	public InterfaceExtractorProcessor(AnnotationProcessorEnvironment env) {
		// TODO Auto-generated constructor stub
		this.env=env;
	}
	public void process() {
		// TODO Auto-generated method stub
		for(TypeDeclaration typeDecl:env.getSpecifiedTypeDeclarations()){
			ExtractInterface annot=typeDecl.getAnnotation(ExtractInterface.class);
			if(annot==null){
				break;
			}
			for(MethodDeclaration m:typeDecl.getMethods()){
				if(m.getModifiers().contains(Modifier.PUBLIC) && !(m.getModifiers().contains(Modifier.STATIC))){
					interfaceMethods.add(m);
				}
			}
			if(interfaceMethods.size()>0){
				try {
					PrintWriter writer=env.getFiler().createSourceFile(annot.value());
					writer.println("package"+typeDecl.getPackage().getQualifiedName()+";");
					writer.println("public interface "+annot.value()+"{");
					for(MethodDeclaration m:interfaceMethods){
						writer.println(" public ");
						writer.println(m.getReturnType()+" ");
						writer.println(m.getSimpleName()+"(");
						int i=0;
						for(ParameterDeclaration parm:m.getParameters()){
							writer.println(parm.getType()+" "+parm.getSimpleName());
							if(++i<m.getParameters().size()){
								writer.print(", ");
							}
						}
						writer.println(");");
					}
					writer.println("}");
					writer.close();
				} catch (Exception e) {
					throw new RuntimeException();
				}
			}
		}
	}

}
