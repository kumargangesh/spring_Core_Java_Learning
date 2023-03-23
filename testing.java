import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class testing{
    public static void main(String []argument){
        
        String url = "src/main/java/config.xml";        // url for the xml configuration file
        
        ApplicationContext app = new FileSystemXmlApplicationContext(url);
        method mth = app.getBean(method.class);
        mth.showName("India");
        
    }
}
      

/*
    In the above code, you have to create all the necessary files in a same package as method implementation file, main testing file and xml configuration file
    
    and put the "xml configuration file" in localtion => src/main/java/config.xml 
*/
        
        
