package chapter20.three;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory{

	public AnnotationProcessor getProcessorFor(
			Set<AnnotationTypeDeclaration> arg0,
			AnnotationProcessorEnvironment env) {
		// TODO Auto-generated method stub
		return new InterfaceExtractorProcessor(env);
	}

	public Collection<String> supportedAnnotationTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<String> supportedOptionTypes() {
		// TODO Auto-generated method stub
		return Collections.singleton("annotations.ExtractInterface");
	}
	public Collection<String> supportedOptions() {
		// TODO Auto-generated method stub
		return Collections.emptySet();
	}
	

	
}
