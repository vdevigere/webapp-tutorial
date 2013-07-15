#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.Map;

import ${package}.components.Component;

public class SampleComponent implements Component {

    public String getViewName(String region) {
        return "/WEB-INF/jsp/sample.jsp";
    }

    public Map<String, Object> getModelMap() {
        return null;
    }

}
