#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.Map;
import com.viddu.codegaga.component.Component;

public class SampleComponent implements Component {

    public String getViewName(String region) {
        return "sample";
    }

    public Map<String, Object> getModelMap() {
        return null;
    }

}
