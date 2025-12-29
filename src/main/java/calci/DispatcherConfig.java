package calci;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?> @Nullable [] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?> @Nullable [] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return  new Class[] {SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return  new String[] {"/"};
	}

}
